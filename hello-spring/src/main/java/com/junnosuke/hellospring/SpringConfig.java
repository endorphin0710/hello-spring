package com.junnosuke.hellospring;

import com.junnosuke.hellospring.repository.MemberRepository;
import com.junnosuke.hellospring.repository.MemoryMemberRepository;
import com.junnosuke.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
