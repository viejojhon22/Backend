package ec.mil.issfa.demo1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.mil.issfa.demo1.models.Proveedor;
import ec.mil.issfa.demo1.repositories.ProveedorRepository;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;

    public Proveedor guardar(Proveedor proveedor){
        return proveedorRepository.save(proveedor);
    }

    public Proveedor actualizar(Proveedor proveedor, Proveedor proveedornuevo){
        proveedor.setNombre(proveedornuevo.getNombre());
        proveedor.setRuc(proveedornuevo.getRuc());
        proveedor.setTelefono(proveedornuevo.getTelefono());
        return proveedorRepository.save(proveedor);
    }
    public void eliminar (Proveedor proveedor){
        proveedorRepository.delete(proveedor);

    }
}