package ec.mil.issfa.demo1.repositories;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import ec.mil.issfa.demo1.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    /**Cliente findByCedula(String cedula);
    List<Cliente> finByNombre(String nombre);
    
    @Query("SELECT c FROM Cliente WHERE c.id =1")
    Cliente getByCedula(String cedula);*/
}
