package com.sale.in;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DisplayMovieDetails {

	@Autowired
	@Qualifier("con")
	Connection con;
	
	public void showData() {

		try {
			PreparedStatement stm = con.prepareStatement("select * from movies");
			ResultSet result = stm.executeQuery();
			while(result.next()) {
				System.out.println(result.getString(2));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
