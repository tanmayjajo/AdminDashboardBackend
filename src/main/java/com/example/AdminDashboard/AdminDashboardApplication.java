package com.example.AdminDashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminDashboardApplication {
	@Autowired
	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(AdminDashboardApplication.class);
		sa.setBannerMode(Banner.Mode.OFF);
		sa.run(args);
	}
}
