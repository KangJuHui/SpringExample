package hello.core.member;

public class MemberServiceImpl implements MemberService {
//인터페이스의 구현체가 하나면 관례상 구현체 이름 뒤에 "Impl"으로 붙임.

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
