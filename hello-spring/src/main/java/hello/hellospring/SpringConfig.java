package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    /*private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/

    /*private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {        //인터페이스만 있으면 스프링 JPA가 알아서 구현체로 만들어 Bean에 등록 해놓음
        this.memberRepository = memberRepository;
    }


    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);         //MemberService가 SpringBean에 등록 됨.
    }

//    @Bean
//    public TimeTraceAop timeTraceAop() {                  //AOP사용하는 부분
//        return new TimeTraceAop();
//    }


//    @Bean
//    public MemberRepository memberRepository() {
//        //return new MemoryMemberRepository();                   //MemberRepository가 SpringBean에 등록 됨.
////        return new JdbcMemberRepository(dataSource);
////        return new JdbcMemberRepository(dataSource);
////        return new JpaMemberRepository(em);
//    }
}
