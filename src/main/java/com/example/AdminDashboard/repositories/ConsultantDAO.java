package com.example.AdminDashboard.repositories;

import com.example.AdminDashboard.models.Consultant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConsultantDAO implements DAO<Consultant>{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Consultant record){
        return jdbcTemplate.update("INSERT INTO Consultant (UserID) VALUES(?)", record.getUserID());
    }

    public  int createConsultant(Integer UserID){
        return jdbcTemplate.update("INSERT INTO Consultant (UserID) VALUES(?)",UserID);
    }

    @Override
    public List<Consultant> read(){
        String query = "SELECT * from Consultant";
        return jdbcTemplate.query( query, BeanPropertyRowMapper.newInstance(Consultant.class));
    }

    @Override
    public List<Consultant> readRecord(Integer Id){
        String query = "SELECT * from Consultant WHERE ConsultantID="+Id;
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Consultant.class));
    }
    // TODO: `consider writing below logic`
    public int update(Integer Id, String Status){
        String query = "UPDATE Consultant SET ConsultantID=? WHERE ConsultantID=? VALUES(?,?)";
        return jdbcTemplate.update(query,new Object[]{});
    }

    @Override
    public int deleteAll(){
        String query = "DELETE FROM Consultant";
        return jdbcTemplate.update(query);
    }

    @Override
    // TODO: `consider writing below logic`
    public int deleteRecord(Integer id){
        return -1;
    }
}
