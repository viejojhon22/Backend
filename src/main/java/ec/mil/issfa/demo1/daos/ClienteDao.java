package ec.mil.issfa.demo1.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import ec.mil.issfa.demo1.mappers.ClienteMapper;
import ec.mil.issfa.demo1.models.Cliente;

public class ClienteDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Cliente getById(long id){
        String query ="SELECT id, nombre FROM Cliente where id="+id;
        Cliente cliente = jdbcTemplate.queryForObject(query, new ClienteMapper());
        return cliente;
    }

    
}
