package ec.mil.issfa.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.issfa.demo1.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
    
}
