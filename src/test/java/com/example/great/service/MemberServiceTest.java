package com.example.great.service;

import com.example.great.domain.Member;
import com.example.great.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }


    @AfterEach
    public void afterEach() { // 테스트 마다 마지막에 실행됨
        memberRepository.clearStore(); // 메모리 저장소 초기화
    }

    @Test
    void join() {
        // given
        Member member = new Member();
        member.setName("홍길동");

        // when
        Long id = memberService.join(member);

        // then
        Member findMember = memberService.findOne(id).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());

    }

    // 중복 회원 예외
    @Test
    void join_duplicateMember() {
        // given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        // when
        // ToDo: 중복 회원 예외를 발생시키는 테스트 코드를 작성하세요.
        memberService.join(member1);
        // ToDo: 중복 회원 예외를 발생시키는 테스트 코드를 작성하세요.
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        // then

    }



    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}