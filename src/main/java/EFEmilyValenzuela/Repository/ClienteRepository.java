package EFEmilyValenzuela.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFEmilyValenzuela.Model.Cliente;
@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {

}
