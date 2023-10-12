package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);     //id로 회원을 찾는 기능, Optional은 값이 Null일 때 Optional로 감싸서 내보냄
    Optional<Member> findByName(String name);
    List<Member> findAll();     //지금까지 저장된 모든 회원 리스트 반환

}
