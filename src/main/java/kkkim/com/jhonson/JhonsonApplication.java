package kkkim.com.jhonson;

/**
 * �Ʒ� �����Ѱ� �������� �ָ��Ͻð�����
 * ���� ���� ���� �ҽ� ������ ���� ������� �����Ͻø� �ʴ�.
 * ���࿡ ���� ����� �ִ� �ҽ��� �ٸ� ����� ���ٰ� �ϸ�
 * import kkkim.com.juhee.~~~ �� �ҷ��� ���� ���� �Լ��� ������?
 * ��Ű���� �ҷ����� ������
 * �츮�� ��Ű���� ����� ������ �ϰ� �ִ°̴ϴ�.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Springboot�� �⺻ ������ ��������
 * https://github.com/ityouknow/spring-boot-examples
 * �� �����߽���
 * @author ����
 *
 */
@SpringBootApplication


/***
 * extends�� �ǹ� 
 * ���� ������  
 * import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
 *�� ���� �ǵ� �ҽ��� �ҷ�����?
 *�װŸ� �����ٰ� JuheeApplication
 * @author ����
 *
 */
public class JhonsonApplication extends SpringBootServletInitializer {
	
	/** overriding
	 * �� �����ޱ� ����
	 * �ٸ� �Լ����� �� �Լ��� �ִ� �ָ� �����޾Ƽ� ���� �ִ�.
	 * �������� ���� �����Լ��� �Ը���� Ŀ���� ������ �����ϴ�.
	 * �� �����ޱ� �̱� ������ �θ� �Լ��� �ش� ��(�޼ҵ�or class�� instance)�� ���� �Ǿ���Ѵ�.
	 * */ 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JhonsonApplication.class);
    }
    /**static �˹ڱ�
     * �ѹ� �����ϸ� �̰� �����̶�� �����ϴ� ��
     * ���������� �޸𸮻� ������ �����Ѵٴ� �ǹ�
     * @param args
     */
    
    /**
     *  void ���°� ���ٴ°� �����Ѱ� => return�� �����
     *  ���� �Լ�(or �޼ҵ�)
     *  return�� type�� �������� ������ void�� �־ return�ϴ°� ���� �׳� ��������
     * @param args
     */
	public static void main(String[] args) {
		SpringApplication.run(JhonsonApplication.class, args);
	}
}
