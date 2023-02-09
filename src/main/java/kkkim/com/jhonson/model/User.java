package kkkim.com.jhonson.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * 
 * jpa 개념이기때문에 추후에 시간나면 찾아보세요
 * 
 * db에서 관리하는 테이블과 매핑 시켜주기 위해서
 * jpa한테 개념을 정의 시켜주는 행위라고 생각하면되여 
 * 
 *  DB테이블하고 - 매핑하겠습니다.
 * */

/**
 * 
 * 접근 제어자가 public 혹은 protected 인 기본 생성자가 필수입니다.
 * 구현체에 따라 되는 것도 있으나, 스펙상 사용하지 못하도록 해두었기 때문에 사용하지 않는 것이 좋습니다.
 * final 클래스, enum, interface, inner 클래스에는 사용이 불가능합니다
 * https://ttl-blog.tistory.com/112 참조
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