package hello;

import javax.persistence.*;

/**
 * Created by kdo on 2015-11-25.
 *
 * 소비자
 */
@Entity
public class Customer {

    /**
     * 아이디
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * 성
     */
    private String firstName;

    /**
     * 이름
     */
    private String lastName;

    /**
     * 기본 생성자
     * <pre>
     *     JPA를 위해서 만들어 졌으며, 실제로는 public Customer(String firstName, String lastName) 메서드를
     *     이용하여 객체를 생성하라. 이 생성자 메서드의 호출을 막기 위해 protected로서 설정되었다.
     * </pre>
     */
    protected Customer() {
    }

    /**
     * 기본 생성자
     *
     * @param firstName 성
     * @param lastName  이름
     */
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * toString
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}