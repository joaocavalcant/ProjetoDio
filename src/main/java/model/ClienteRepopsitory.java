package model;

import feign.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepopsitory extends CrudRepository<Cliente, Long> {
}
