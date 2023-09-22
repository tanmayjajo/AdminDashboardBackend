package com.example.AdminDashboard.services;

import com.example.AdminDashboard.models.Consultant;
import com.example.AdminDashboard.models.ConsultantReq;
import com.example.AdminDashboard.repositories.ConsultantDAO;
import com.example.AdminDashboard.repositories.ConsultantReqDAO;
import com.example.AdminDashboard.repositories.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConsultantReqService {

    @Autowired
    ConsultantReqDAO consultantReqDAO;
    @Autowired
    ConsultantDAO consultantDAO;
    @Autowired
    UserDAO userDAO;
    public List<ConsultantReq> getAllRequests(){
        return consultantReqDAO.read();
    }

    public String approveRequest(Integer RequestId, Boolean approval) {
        if (approval == true) {
            consultantReqDAO.update(RequestId, "Verified");
            int UserId = consultantReqDAO.getUserID(RequestId);
            Consultant consultant = new Consultant();
            consultant.setUserID(UserId);
            consultantDAO.createConsultant(UserId);
            userDAO.update(UserId, "Consultant");
            return "Consultant status Verified";
        } else {
            consultantReqDAO.update(RequestId, "Rejected");
            return "Consultant Request Declined";
        }
    }

}
