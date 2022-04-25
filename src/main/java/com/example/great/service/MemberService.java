package com.example.great.service;

import com.example.great.repository.MemberRepository;
import com.example.great.repository.MemoryMemberRepository;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();




}
