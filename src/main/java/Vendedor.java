import java.util.List;
public class Vendedor {
    private int edad;
    private String nombre;
    private String apellido;
    private List<Cliente> Clientes;

    public int getEdad() {return edad;}
    public void setEdad(int edad){this.edad=edad;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido=apellido;}
    public List<Cliente> getClientes(){return Clientes;}
    public void setClientes(List<Cliente> Clientes){this.Clientes = Clientes;}
}