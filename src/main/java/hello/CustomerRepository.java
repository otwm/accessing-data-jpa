package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by kdo on 2015-11-25.
 *
 * 소비자 레포지토리 인터페이스
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    /**
     * 이름으로 찾기
     *
     * @param lastName 이름
     * @return
     */
    List<Customer> findByLastName(String lastName);
}
