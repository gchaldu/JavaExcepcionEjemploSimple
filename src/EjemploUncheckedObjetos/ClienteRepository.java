package EjemploUncheckedObjetos;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private List<Cliente> listaClientes;

    public ClienteRepository() {
        this.listaClientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente){
        this.listaClientes.add(cliente);
    }
    public Cliente findClienteById(Integer id) throws IdNoCeroException{
        for (Cliente cliente: listaClientes) {
            if(id==0){
                throw new IdNoCeroException("El cliente no puede tener un id cero");
            } else if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }
}
