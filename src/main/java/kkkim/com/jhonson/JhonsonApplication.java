package kkkim.com.jhonson;

/**
 * 아래 선언한게 무엇인지 애매하시겠지만
 * 대충 남이 만든 소스 가져다 쓰는 행위라고 생각하시면 됨다.
 * 만약에 지금 만들고 있는 소스를 다른 사람이 쓴다고 하면
 * import kkkim.com.jhonson.~~~ 로 불러서 제가 만든 함수를 쓰겠쥬?
 * 패키지를 불러오는 행위고
 * 우리는 패키지를 만드는 행위를 하고 있는겁니다.
 * 여기서는 쉬운 이해를 위해 jhonson이라는 package를 화장실로 비유하겠슴다.
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
 *그거를 가져다가 JhonsonApplication에 적용합니다.
 * 
 *
 * public의 의미
 * public은 공용으로 사용하겠다는 개념입니다.
 * 다른데서 불러와서 사용이 가능하죠.
 * 음 비유를 들면 존슨이네 화장실을 공공 화장실로 만드는 행위라고 각하시면 됩니다.
 * @author 존슨
 * https://github.com/ityouknow/spring-boot-examples/blob/master/spring-boot-jpa-thymeleaf-curd/src/main/java/com/neo/model/User.java
 */
public class JhonsonApplication extends SpringBootServletInitializer {
	
	/** overriding의 의미
	 * 	옷 물려받기 개념
	 * 	다른 함수에서 이 함수에 있는 애를 물려받아서 쓸수 있슴다.
	 * 
	 * 	물려받은 옷은 하위함수가 입맛대로 커스터 마이즈 가능합니당
	 * 	옷 물려받기 이기 때문에 일단 무슨옷을 물려받을지 해당 옷(메소드or class등 instance)가 정의 되있어야합니다.
	 *  화장실로 예를 들자면 공공화장실을 만들때 음 대우건설사의 화장실 도면도를 가져다가 쓰는 행위라고 할수 있슴다.
	 *  도면도를 그대로 가져왔다해서 대우건설사의 화장실과 똑같이 만들지 않죠
	 *  제가 핑크색 화장실을 원하면 제멋대로 핑크색 벽지로 바꿀수 있슴다
	 * 
	 *  protected의 의미
	 *  설명하기 어려운데 이 패키지 내에서만 사용할수 있다는 접근 제어를 의미합니다.
	 *  존슨이네 화장실안에서 있는 것,혹은 할수 있는 행위들을 코드로 정의한다고 할때 protected를 사용합니다.
	 *  
	 *  
	 */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JhonsonApplication.class);
    }
    /**static의 의미
     *  알박기 입니다.
     *  한번 선언하면 이건 내땅이라고 선언하는 것
     *  꺼질때까지 메모리상에 영역을 선언한다는 의미
     *  존슨이의공공화장실에 변기를 설치하면
     *  자연재해가 일어나지 않는 이상 변기는 항상 그자리에 있겠죠?
     *  이처럼 항상 그자리에 있겠다고 선언할때 static이라고 합니다. 
     * 
     * void의 의미
     *  void 뱉어내는게 없다는걸 선언한것 => return이 없어요
     *  보통 함수(or 메소드)
     *  return할 type을 선언해줌 하지만 void는 넣어도 return하는거 없이 그냥 행위만하는걸 의미합니다.
     *  저희가 화장실가서 볼일을 보는 행위라고 생각하면 됩니다.
     *  저희가 화장실에서 볼일을 보고 나올때 나온 배출물을 들고나오지 않는것처럼
     *  void도 무언가 행위만 하지 돌아 오는 것은 없습니다.
     * 
     */
	public static void main(String[] args) {
		/**
		 * run은 실행이라고 생각하시면됩니다. 존슨이네 화장실에서 무엇을할까?
		 * arg는 사람이 될수 있겟죠?
		 * 제가 존슨이네 화장실에 들어갈수도 있는거고
		 * 윤오님이 들어갈수도 있는거고
		 * 저희 둘이 같이 들어갈수도 있는거구요 [] =>배열 
		 */
		SpringApplication.run(JhonsonApplication.class, args);
	}
}
