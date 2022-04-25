package com.example.great.repository;

import com.example.great.domain.Member;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() { // 테스트 마다 마지막에 실행됨
        repository.clearStore(); // 메모리 저장소 초기화
    }

    @Test
    public void save() {

        Member member = new Member();
        member.setName("홍길동");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        Assertions.assertThat(result).isEqualTo(member);

    }

    @Test
    public void findByName() {

        Member member1 = new Member();
        member1.setName("홍길동");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("김길동");
        repository.save(member2);

        Member result = repository.findByName("홍길동").get();
        Assertions.assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("홍길동");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("김길동");
        repository.save(member2);

        List<Member> result = repository.findAll();
        Assertions.assertThat(result.size()).isEqualTo(2);

    }



}
