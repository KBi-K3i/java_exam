package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.MemberDomain;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberService {
    
    @Autowired
    MemberRepository repository;

    public List<MemberDomain> getAllData(){
        return repository.getAllData();
    }

}
