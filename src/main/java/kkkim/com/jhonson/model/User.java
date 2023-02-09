package kkkim.com.jhonson.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * 
 * jpa �����̱⶧���� ���Ŀ� �ð����� ã�ƺ�����
 * 
 * db���� �����ϴ� ���̺�� ���� �����ֱ� ���ؼ�
 * jpa���� ������ ���� �����ִ� ������� �����ϸ�ǿ� 
 * 
 *  DB���̺��ϰ� - �����ϰڽ��ϴ�.
 * */

/**
 * 
 * ���� �����ڰ� public Ȥ�� protected �� �⺻ �����ڰ� �ʼ��Դϴ�.
 * ����ü�� ���� �Ǵ� �͵� ������, ����� ������� ���ϵ��� �صξ��� ������ ������� �ʴ� ���� �����ϴ�.
 * final Ŭ����, enum, interface, inner Ŭ�������� ����� �Ұ����մϴ�
 * https://ttl-blog.tistory.com/112 ����
 */
@Entity
public class User {
   
	
	@Id
    @GeneratedValue
    private long id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private int age;

    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }
}