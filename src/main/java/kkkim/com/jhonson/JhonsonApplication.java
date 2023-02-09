package kkkim.com.jhonson;

/**
 * �Ʒ� �����Ѱ� �������� �ָ��Ͻð�����
 * ���� ���� ���� �ҽ� ������ ���� ������� �����Ͻø� �ʴ�.
 * ���࿡ ���� ����� �ִ� �ҽ��� �ٸ� ����� ���ٰ� �ϸ�
 * import kkkim.com.jhonson.~~~ �� �ҷ��� ���� ���� �Լ��� ������?
 * ��Ű���� �ҷ����� ������
 * �츮�� ��Ű���� ����� ������ �ϰ� �ִ°̴ϴ�.
 * ���⼭�� ���� ���ظ� ���� jhonson�̶�� package�� ȭ��Ƿ� �����ϰڽ���.
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
 *�װŸ� �����ٰ� JhonsonApplication�� �����մϴ�.
 * 
 *
 * public�� �ǹ�
 * public�� �������� ����ϰڴٴ� �����Դϴ�.
 * �ٸ����� �ҷ��ͼ� ����� ��������.
 * �� ������ ��� �����̳� ȭ����� ���� ȭ��Ƿ� ����� ������� ���Ͻø� �˴ϴ�.
 * @author ����
 * https://github.com/ityouknow/spring-boot-examples/blob/master/spring-boot-jpa-thymeleaf-curd/src/main/java/com/neo/model/User.java
 */
public class JhonsonApplication extends SpringBootServletInitializer {
	
	/** overriding�� �ǹ�
	 * 	�� �����ޱ� ����
	 * 	�ٸ� �Լ����� �� �Լ��� �ִ� �ָ� �����޾Ƽ� ���� �ֽ���.
	 * 
	 * 	�������� ���� �����Լ��� �Ը���� Ŀ���� ������ �����մϴ�
	 * 	�� �����ޱ� �̱� ������ �ϴ� �������� ���������� �ش� ��(�޼ҵ�or class�� instance)�� ���� ���־���մϴ�.
	 *  ȭ��Ƿ� ���� ���ڸ� ����ȭ����� ���鶧 �� ���Ǽ����� ȭ��� ���鵵�� �����ٰ� ���� ������� �Ҽ� �ֽ���.
	 *  ���鵵�� �״�� �����Դ��ؼ� ���Ǽ����� ȭ��ǰ� �Ȱ��� ������ ����
	 *  ���� ��ũ�� ȭ����� ���ϸ� ���ڴ�� ��ũ�� ������ �ٲܼ� �ֽ���
	 * 
	 *  protected�� �ǹ�
	 *  �����ϱ� ���� �� ��Ű�� �������� ����Ҽ� �ִٴ� ���� ��� �ǹ��մϴ�.
	 *  �����̳� ȭ��Ǿȿ��� �ִ� ��,Ȥ�� �Ҽ� �ִ� �������� �ڵ�� �����Ѵٰ� �Ҷ� protected�� ����մϴ�.
	 *  
	 *  
	 */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JhonsonApplication.class);
    }
    /**static�� �ǹ�
     *  �˹ڱ� �Դϴ�.
     *  �ѹ� �����ϸ� �̰� �����̶�� �����ϴ� ��
     *  ���������� �޸𸮻� ������ �����Ѵٴ� �ǹ�
     *  �������ǰ���ȭ��ǿ� ���⸦ ��ġ�ϸ�
     *  �ڿ����ذ� �Ͼ�� �ʴ� �̻� ����� �׻� ���ڸ��� �ְ���?
     *  ��ó�� �׻� ���ڸ��� �ְڴٰ� �����Ҷ� static�̶�� �մϴ�. 
     * 
     * void�� �ǹ�
     *  void ���°� ���ٴ°� �����Ѱ� => return�� �����
     *  ���� �Լ�(or �޼ҵ�)
     *  return�� type�� �������� ������ void�� �־ return�ϴ°� ���� �׳� �������ϴ°� �ǹ��մϴ�.
     *  ���� ȭ��ǰ��� ������ ���� ������� �����ϸ� �˴ϴ�.
     *  ���� ȭ��ǿ��� ������ ���� ���ö� ���� ���⹰�� ������� �ʴ°�ó��
     *  void�� ���� ������ ���� ���� ���� ���� �����ϴ�.
     * 
     */
	public static void main(String[] args) {
		/**
		 * run�� �����̶�� �����Ͻø�˴ϴ�. �����̳� ȭ��ǿ��� �������ұ�?
		 * arg�� ����� �ɼ� �ְ���?
		 * ���� �����̳� ȭ��ǿ� ������ �ִ°Ű�
		 * �������� ������ �ִ°Ű�
		 * ���� ���� ���� ������ �ִ°ű��� [] =>�迭 
		 */
		SpringApplication.run(JhonsonApplication.class, args);
	}
}
