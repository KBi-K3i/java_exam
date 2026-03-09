package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.MemberDomain;

@Repository
public class MemberRepository {
    
    @Autowired
    private NamedParameterJdbcTemplate template;

    private final RowMapper<MemberDomain> MEMBER_MAPPER = 
        (rs, i) -> {
            MemberDomain member = new MemberDomain();
            member.setName(rs.getString("name"));
            member.setAge(rs.getInt("aged"));
            return member;
        };

    public List<MemberDomain> getAllData(){
        String sql =
            "SELECT * FROM members;";
        
        List<MemberDomain> member = template.query(sql, MEMBER_MAPPER);
        return member;
    }
    
}
