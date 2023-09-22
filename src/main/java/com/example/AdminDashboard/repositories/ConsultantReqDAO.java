package com.example.AdminDashboard.repositories;

import com.example.AdminDashboard.models.ConsultantReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConsultantReqDAO implements DAO<ConsultantReq>{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(ConsultantReq record){
        return jdbcTemplate.update("INSERT INTO ConsultantReq (UserID) VALUES(?)",
                new Object[]{record.getUserID()});
    }

    @Override
    public List<ConsultantReq> read(){
        return jdbcTemplate.query("SELECT * from ConsultantReq WHERE STATUS='Pending'", BeanPropertyRowMapper.newInstance(ConsultantReq.class));
    }

    @Override
    public List<ConsultantReq> readRecord(Integer Id){
        String query = "SELECT * FROM ConsultantReq WHERE RequestID="+Id;
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(ConsultantReq.class));
    }

    public int update(Integer RequestID, String status){
        String query = "UPDATE ConsultantReq SET Status=? WHERE RequestID=?";
        return jdbcTemplate.update(query,new Object[]{status,RequestID});
    }

    @Override
    public int deleteAll(){
        String query = "DELETE FROM UserTable";
        return jdbcTemplate.update(query);
    }


    public int getUserID(Integer RequestID){
        String query="SELECT USERID FROM ConsultantReq WHERE RequestId="+RequestID;
        return jdbcTemplate.queryForObject(query,Integer.class);
    }

    @Override
    // TODO: `consider writing below logic`
    public int deleteRecord(Integer id){
        return -1;
    }
}
