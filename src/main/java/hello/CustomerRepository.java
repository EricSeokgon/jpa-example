package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Project: jpa-example
 * FileName: CustomerRepository
 * Date: 2016-01-20
 * Time: 오전 12:36
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}