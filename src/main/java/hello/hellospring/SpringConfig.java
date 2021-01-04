package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

//    private final DataSource datasource;
//
//    public SpringConfig(DataSource datasource) {
//        this.datasource = datasource;
//    }
    private final MemberRepository memberRepository;
    //private EntityManager em;

    @Autowired
    public SpringConfig(MemberRepository memberRepository, EntityManager em) {
        this.memberRepository = memberRepository;
        //this.em = em;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }
//    @Bean
//    public MemberRepository memberRepository(){

        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(datasource);
//        return new JdbcTemplateMemberRepository(datasource);
//        return new JpaMemberRepository(em);

//    }
}
