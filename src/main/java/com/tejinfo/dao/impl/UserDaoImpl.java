package com.tejinfo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tejinfo.dao.UserDAO;
import com.tejinfo.model.User;


@Repository
public class UserDaoImpl implements UserDAO {

	@Autowired
	private DataSource dataSource;	

	
	@Override
	public void insert(User user) {
		String sql = "INSERT INTO USER(firstName,lastName,middleName,birthDate,bloodGroup,gender,email,mobileNo) " +
				"VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getMiddleName());
			ps.setLong(4, user.getBirthDate());
			ps.setString(5, user.getBloodGroup());
			ps.setString(6, user.getGender());
			ps.setString(7, user.getEmail());
			ps.setString(8, user.getMobileNo());			
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}

	}

	@Override
	public User getUser(long userId) {
		String sql = "SELECT * FROM USER WHERE ID = ?";
				
				Connection conn = null;
				
				try {
					conn = dataSource.getConnection();
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setLong(1, userId);
					User user = null;
					ResultSet rs = ps.executeQuery();
					if (rs.next()) {
						user = new User(
							rs.getLong("ID"),
							rs.getString("firstName"),
							rs.getString("lastName"),
							rs.getString("middleName"),
							rs.getLong("birthDate"),
							rs.getString("mobileNo"),
							rs.getString("phoneNo"),
							rs.getString("gender"),
							rs.getString("email"),
							rs.getString("bloodGroup"),
							rs.getString("photoUrl"), 
							rs.getString("userType")
						);
					}
					rs.close();
					ps.close();
					return user;
				} catch (SQLException e) {
					throw new RuntimeException(e);
				} finally {
					if (conn != null) {
						try {
						conn.close();
						} catch (SQLException e) {}
					}
				}
	}

	@Override
	public List<User> getUserList() {

		String sql = "SELECT * FROM USER ";
		List<User> userList=new ArrayList<User>();
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User(
					rs.getLong("ID"),
					rs.getString("firstName"),
					rs.getString("lastName"),
					rs.getString("middleName"),
					rs.getLong("birthDate"),
					rs.getString("mobileNo"),
					rs.getString("phoneNo"),
					rs.getString("gender"),
					rs.getString("email"),
					rs.getString("bloodGroup"),
					rs.getString("photoUrl"), 
					rs.getString("userType")
				);
				userList.add(user);
			}
			rs.close();
			ps.close();
			return userList;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}

}
