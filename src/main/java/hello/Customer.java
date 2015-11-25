package hello;

import javax.persistence.*;

/**
 * Created by kdo on 2015-11-25.
 *
 * �Һ���
 */
@Entity
public class Customer {

    /**
     * ���̵�
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * ��
     */
    private String firstName;

    /**
     * �̸�
     */
    private String lastName;

    /**
     * �⺻ ������
     * <pre>
     *     JPA�� ���ؼ� ����� ������, �����δ� public Customer(String firstName, String lastName) �޼��带
     *     �̿��Ͽ� ��ü�� �����϶�. �� ������ �޼����� ȣ���� ���� ���� protected�μ� �����Ǿ���.
     * </pre>
     */
    protected Customer() {
    }

    /**
     * �⺻ ������
     *
     * @param firstName ��
     * @param lastName  �̸�
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