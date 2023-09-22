package com.example.AdminDashboard.controllers;
import com.example.AdminDashboard.models.ConsultantReq;
import com.example.AdminDashboard.services.ConsultantReqService;
import com.example.AdminDashboard.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class AdminController {
    @Autowired
    ConsultantReqService consultantReqService ;
    @Autowired
    UserService userService;
    @GetMapping("/getConsultantsReq")
    public ResponseEntity<List<ConsultantReq>> getAllRequests(){
        try{
            List<ConsultantReq> consultantReqs = new ArrayList<ConsultantReq>();
            consultantReqs = consultantReqService.getAllRequests();
            return new ResponseEntity<>(consultantReqs, HttpStatus.OK);
        } catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/approveConsultantRequest")
    public ResponseEntity<String> approveConsultantRequest(@RequestParam Integer RequestId, @RequestParam Boolean approval){
        try{
            return new ResponseEntity<>(consultantReqService.approveRequest(RequestId,approval),HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/getConsultantDetails/all")
    public ResponseEntity<List<User>> getConsultantDetails(){
        try{
            List<User> users = new ArrayList<>();
            userService.getConsultantDetails();
            return new ResponseEntity<>(users, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getConsultantDetails/")
    public ResponseEntity<List<User>> getConsultantDetailsByRole(@RequestParam String jobrole){
        try{
            List<User> users = new ArrayList<>();

            userService.getConsultantDetailsByRole(jobrole);
            return new ResponseEntity<>(users, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/getStats")
    public ResponseEntity<Map<String,Integer>> getStats(){
       try {
           int no_of_consultants = userService.countByRole("Consultant");
           int no_of_clients = userService.countByRole("Client");
           int no_of_sessions_booked = Math.min(no_of_clients, no_of_consultants);
           Map<String, Integer> dataMap = new HashMap<>();
           dataMap.put("No of Consultants", no_of_consultants);
           dataMap.put("No of Clients", no_of_clients);
           dataMap.put("No of Sessions Booked", no_of_sessions_booked);

           return new ResponseEntity<>(dataMap,HttpStatus.OK);
       }catch (Exception e){
           System.out.println(e);
           return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
    @PutMapping("/updateField")
    public ResponseEntity<String> updateField(@RequestParam Integer UserId, @RequestParam String FieldName, @RequestParam Object value){
        try{
            userService.updateField(UserId,FieldName,value);
            return new ResponseEntity<>(FieldName+" Updated successfully", HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
