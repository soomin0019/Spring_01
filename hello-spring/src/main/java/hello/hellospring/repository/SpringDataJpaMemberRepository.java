package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    //interface 상속할 때는 extends 사용, JpaRepository<키(클래스명), id(타입)>

    @Override
    Optional<Member> findByName(String name);
}
