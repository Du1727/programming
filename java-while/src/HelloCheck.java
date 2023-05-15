import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)  //어노테이션이 유지되는 기간 ( 런타임 : 항상 살아있음)
@Target({ElementType.METHOD, ElementType.TYPE})// 어노테이션이 붙을 수 있는 위치 (타입에 붙여야지~, 메소드에도 붙여야지~)
public @interface HelloCheck {
    // 어노테이션은 필드가 하나면 value라고 보통 사용한다.
    String value();


}
