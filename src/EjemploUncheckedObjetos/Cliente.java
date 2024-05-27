package EjemploUncheckedObjetos;

public class Cliente {
    private Integer id;
    private String nombreCliente;

    public Cliente(Integer id, String nombreCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}
