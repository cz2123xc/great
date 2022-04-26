package com.example.great.service;

import com.example.great.domain.Member;
import com.example.great.repository.MemberRepository;
import com.example.great.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    // 구현체로 만든 레포지토리
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemoryMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // Todo: 회원가입 기능
    public Long join(Member member){

        // Todo: 회원가입 전에 회원이 존재하는지 확인
        extracted(member);

        // Todo: 회원가입 처리
        memberRepository.save(member);

        // Todo: 회원가입 처리 후 회원의 고유번호를 반환
        return member.getId();
    }

    private void extracted(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }


    public List<Member> findMembers() {
        return memberRepository.findAll();
    }


    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }








}
