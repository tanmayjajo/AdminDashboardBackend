package com.example.AdminDashboard.repositories;

import com.example.AdminDashboard.models.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO implements DAO<UserTable>{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int create(UserTable record){
        return jdbcTemplate.update("INSERT INTO UserTable (Name) VALUES(?)",
                new Object[]{record.getName()});
    }
    public List<UserTable> read(){
        return jdbcTemplate.query("SELECT * from UserTable", BeanPropertyRowMapper.newInstance(UserTable.class));
    }
    public List<UserTable> readRecord(Integer Id){
        String query = "SELECT * FROM UserTable WHERE UserID="+Id;
        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(UserTable.class));
    }
    public List<UserTable> readAllConsultants(){
        String query = "SELECT * FROM UserTable WHERE role='Approved'";
        return jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(UserTable.class));
    }
    public int countByRole(String role){
        String query = "SELECT COUNT(*) FROM UserTable WHERE role='"+role+"'";
        return jdbcTemplate.queryForObject(query,Integer.class);
    }
    public List<UserTable> findByRole(String Role){
        String query = "SELECT * FROM UserTable WHERE Role="+Role;
        return jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(UserTable.class));
    }
    public int update(Integer Id, String Role){
        String query = "UPDATE UserTable SET Role=? WHERE USERID=?";
        return jdbcTemplate.update(query,new Object[]{Role,Id});
    }

    public int updateField(Integer Id, String column, Object value){
        String query = "UPDATE USERTABLE SET "+column+"=? WHERE USERID=?";
        return jdbcTemplate.update(query,new Object[]{value,Id});
    }
    public int deleteAll(){
        String query = "DELETE FROM UserTable";
        return jdbcTemplate.update(query);
    }

    // TODO: `consider writing below logic`
    public int deleteRecord(Integer id){
        return -1;
    }
}
