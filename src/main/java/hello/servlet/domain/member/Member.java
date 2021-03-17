package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by sskim on 2021/03/17
 * Github : http://github.com/sskim91
 */
@Getter
@Setter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member() {
    }

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}