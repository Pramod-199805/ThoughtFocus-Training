package com.thoughtfocus.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.thoughtfocus.jdbc.dto.StationaryDTO;
import com.thoughtfocus.jdbc.exception.InvalidSerialNumberException;

public class StationaryDAO {
	StationaryDTO dto = new StationaryDTO();

	public boolean add(StationaryDTO dto) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		String insertData = "INSERT INTO Stationary VALUES(?,?,?,?,?,?)";
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StationaryShop", "root",
					"Pramodtf@1998");
			preparedStatement = connection.prepareStatement(insertData);
			preparedStatement.setInt(1, dto.getSerialNumber());
			preparedStatement.setString(2, dto.getType());
			preparedStatement.setString(3, dto.getName());
			preparedStatement.setString(4, dto.getBrandName());
			preparedStatement.setDouble(5, dto.getPrice());
			preparedStatement.setDouble(6, dto.getQuantity());
			preparedStatement.execute();
			System.out.println("Data Inserted");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public StationaryDTO deleteBySerialNumber(int serialNumber) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		String deleteBySerialNumber = "DELETE FROM Stationary WHERE serialnumber=?";
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StationaryShop", "root",
					"Pramodtf@1998");
			preparedStatement = connection.prepareStatement(deleteBySerialNumber);
			preparedStatement.setInt(1, serialNumber);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		throw new InvalidSerialNumberException();
		
	}

	public StationaryDTO updatePriceByBrandName(double price, String brandName) {

		PreparedStatement preparedStatement = null;
		Connection connection = null;
		String updatePrice = "UPDATE Stationary SET price=? WHERE brandname=?";
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StationaryShop", "root",
					"Pramodtf@1998");
			preparedStatement = connection.prepareStatement(updatePrice);
			preparedStatement.setDouble(1, price);
			preparedStatement.setString(2, brandName);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		throw new InvalidBrandNameException();

	}

	public void getAll() {

		PreparedStatement preparedStatement = null;
		Connection connection = null;
		ResultSet resultSet = null;
		String getAllData = "SELECT * FROM Stationary";
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StationaryShop", "root",
					"Pramodtf@1998");
			preparedStatement = connection.prepareStatement(getAllData);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("Serial Number:" + resultSet.getInt("serialnumber"));
				System.out.println("Type:" + resultSet.getString("type"));
				System.out.println("Name:" + resultSet.getString("name"));
				System.out.println("Brand Name:" + resultSet.getString("brandname"));
				System.out.println("Price:" + resultSet.getDouble("price"));
				System.out.println("Quantity:" + resultSet.getDouble("quantity"));
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (connection != null)
					connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
