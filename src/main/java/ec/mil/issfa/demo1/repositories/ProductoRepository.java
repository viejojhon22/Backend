package ec.mil.issfa.demo1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.issfa.demo1.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
    List<Producto> findByDescripcion(String descripcion);
    
}
