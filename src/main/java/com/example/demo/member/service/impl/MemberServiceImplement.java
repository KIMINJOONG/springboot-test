package com.example.demo.member.service.impl;

import com.example.demo.member.mapper.MemberMapper;
import com.example.demo.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MemberServiceImplement implements MemberService {
    private MemberMapper memberMapper;

    @Autowired
    MemberServiceImplement(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<Map<String, Object>> getMember() {
        return memberMapper.getMember();
    }
}
