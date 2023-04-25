package pe.edu.unmsm.backend.account;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.unmsm.backend.customer.CustomerEntity;

import java.util.List;

public interface AccountRepo extends JpaRepository<AccountEntity, Long> {

    List<AccountEntity> findByCustomer(CustomerEntity customer);
}
