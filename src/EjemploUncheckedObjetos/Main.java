package EjemploUncheckedObjetos;

public class Main {
    public static void main(String[] args){
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.addCliente(new Cliente(1, "Pepe"));
        clienteRepository.addCliente(new Cliente(2, "Martin"));
        clienteRepository.addCliente(new Cliente(3, "Mary"));
        try{
            clienteRepository.findClienteById(0);
        }catch ( IdNoCeroException idNoCeroException ){
            System.out.println(idNoCeroException.getMessage());
        }
    }
}
