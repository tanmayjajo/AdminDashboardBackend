package com.example.AdminDashboard.services;
import com.example.AdminDashboard.models.UserTable;
import com.example.AdminDashboard.repositories.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    @Autowired
    UserDAO userDAO;
    public List<UserTable> getConsultantDetails(){
        return userDAO.readAllConsultants();
    }
    public int countByRole(String role) {
        return userDAO.countByRole(role);
    }
    public int updateField(Integer UserId, String Column, Object value){
        return userDAO.updateField(UserId,Column,value);
    }
}
