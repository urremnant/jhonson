package kkkim.com.jhonson;

/**
 * 아래 선언한게 무엇인지 애매하시겠지만
 * 대충 남이 만든 소스 가져다 쓰는 행위라고 생각하시면 됨다.
 * 만약에 지금 만들고 있는 소스를 다른 사람이 쓴다고 하면
 * import kkkim.com.juhee.~~~ 로 불러서 제가 만든 함수를 쓰겠쥬?
 * 패키지를 불러오는 행위고
 * 우리는 패키지를 만드는 행위를 하고 있는겁니다.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Springboot의 기본 설정을 선언해줌
 * https://github.com/ityouknow/spring-boot-examples
 * 를 참조했슴다
 * @author 존슨
 *
 */
@SpringBootApplication


/***
 * extends의 의미 
 * 저희가 위에서  
 * import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
 *로 남이 맨든 소스를 불러왔죠?
 *그거를 가져다가 JuheeApplication
 * @author 존슨
 *
 */
public class JhonsonApplication extends SpringBootServletInitializer {
	
	/** overriding
	 * 옷 물려받기 개념
	 * 다른 함수에서 이 함수에 있는 애를 물려받아서 쓸수 있다.
	 * 물려받은 옷은 하위함수가 입맛대로 커스터 마이즈 가능하다.
	 * 옷 물려받기 이기 때문에 부모 함수에 해당 옷(메소드or class등 instance)가 정의 되어야한다.
	 * */ 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JhonsonApplication.class);
    }
    /**static 알박기
     * 한번 선언하면 이건 내땅이라고 선언하는 것
     * 꺼질때까지 메모리상에 영역을 선언한다는 의미
     * @param args
     */
    
    /**
     *  void 뱉어내는게 없다는걸 선언한것 => return이 없어요
     *  보통 함수(or 메소드)
     *  return할 type을 선언해줌 하지만 void는 넣어도 return하는거 없이 그냥 행위만함
     * @param args
     */
	public static void main(String[] args) {
		SpringApplication.run(JhonsonApplication.class, args);
	}
}
