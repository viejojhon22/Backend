package ec.mil.issfa.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.issfa.demo1.models.DetallePedido;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
    
}
