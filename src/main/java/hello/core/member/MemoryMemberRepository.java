package hello.core.member;

import java.util.HashMap;
import java.util.Map;


//인터페이스와 구현체는 다른 패키지에 넣은 것이 좋음.
public class MemoryMemberRepository implements MemberRepository{
    //동시성 이슈(여러 코드에서 동시에 접근가능)으로 concurrentHashMap 사용 권장
    private static Map<Long, Member> store = new HashMap();

    @Override
    public void save(Member member) {
        //예제이니 예외처리 생략
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
