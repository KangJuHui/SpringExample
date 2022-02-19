package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    OrderService orderService = new OrderServiceImpl();
    MemberService memberService = new MemberServiceImpl();

    @Test
    void createOrderVip() {
        //Given
        /**
         * Primitive type(기본형) vs Reference Type(참조형)
         * Primitive Type(ex. int, long)은 값이 없으면 0을 반환/Null 가질 수 없음.
         * Reference Type(ex. Integer, Long)은 실제 값이 아닌 객체의 주소를 저장/Null 가질 수 있음.
         * 결론 : null은 Object 데이터 유형만 null 일 수 있다.
         */
        Long memberId = 1L;
        Member member = new Member(memberId, "TestMan01", Grade.VIP);

        //when
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 5000);

        //Then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

    @Test
    void createOrderBasic() {
        //Given
        Long memberId = 1L;
        Member member = new Member(memberId, "TestMan02", Grade.BASIC);

        //when
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 5000);

        //Then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(0);

    }
}