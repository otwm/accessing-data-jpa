package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by kdo on 2015-11-25.
 *
 * �Һ��� �������丮 �������̽�
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    /**
     * �̸����� ã��
     *
     * @param lastName �̸�
     * @return
     */
    List<Customer> findByLastName(String lastName);
}
