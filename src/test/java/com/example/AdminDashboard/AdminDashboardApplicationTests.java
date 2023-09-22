package com.example.AdminDashboard;

import com.example.AdminDashboard.controllers.AdminController;
import com.example.AdminDashboard.services.ConsultantReqService;
import com.example.AdminDashboard.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AdminDashboardApplicationTests {

	@InjectMocks
	private AdminController adminController;

	@Mock
	private ConsultantReqService consultantReqService;

	@Mock
	private UserService userService;

	@Test
	public void testApproveConsultantRequest() throws Exception {
		Integer requestId = 1;
		Boolean approval = true;
		assertEquals(HttpStatus.OK, adminController.approveConsultantRequest(requestId, approval).getStatusCode());
	}

	@Test
	public void testGetConsultantDetails() throws Exception {
		assertEquals(HttpStatus.OK, adminController.getConsultantDetails().getStatusCode());
	}

	@Test
	public void testGetStats() throws Exception {
		assertEquals(HttpStatus.OK, adminController.getStats().getStatusCode());
	}

	@Test
	public void testUpdateField() throws Exception {
		Integer userId = 1;
		String fieldName = "Age";
		Object value = 21;
		assertEquals(HttpStatus.OK, adminController.updateField(userId, fieldName, value).getStatusCode());
	}
}
