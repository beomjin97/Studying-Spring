package helllo.hellospring.service;

import helllo.hellospring.domain.Member;
import helllo.hellospring.repository.MemberRepository;
import helllo.hellospring.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    public Long join(Member member) {
        Optional<Member> result =  memberRepository.findByName(member.getName());

        memberRepository.save(member);
        return member.getId();
    }
}
