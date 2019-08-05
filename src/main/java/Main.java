import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
public class Main {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();
        v1.setNombre("Juan");
        v1.setApellido("Perez");
        v1.setEdad(10);
        Vendedor v2 = new Vendedor();
        v2.setNombre("Carlos");
        v2.setApellido("san eusebio");
        v2.setEdad(55);
        Vendedor v3 = new Vendedor();
        v3.setNombre("leonardo");
        v3.setApellido("dicaprio");
        v3.setEdad(60);


        Cliente c1 = new Cliente();
        c1.setNombre("HIVYMAR");
        c1.setDireccion("Victor Emilio Estrada 204");
        c1.setTelefono("5020800");
        Cliente c2 = new Cliente();
        c2.setNombre("PROMESA");
        c2.setDireccion("Via. Daule KM 5.5");
        c2.setTelefono("5013604");
        Cliente c3 = new Cliente();
        c3.setNombre("BIMBO");
        c3.setDireccion("MELANY ZAPATA");
        c3.setTelefono("32105486");
        Cliente c4 = new Cliente();
        c4.setNombre("RAMO");
        c4.setDireccion("Armando Casas");
        c4.setTelefono("50684205");
        Cliente c5 = new Cliente();
        c5.setNombre("SALTIN");
        c5.setDireccion("SARA MARTINEZ");
        c5.setTelefono("311111112");
        Cliente c6 = new Cliente();
        c6.setNombre("NATIPAN");
        c6.setDireccion("JHON TRAVOLTA");
        c6.setTelefono("350159151");

        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);



//CREAMOS EL OBJETO JSON
        JSONObject objVendedor = new JSONObject(v1);
        JSONArray objClientes = new JSONArray();
        try {
            //vendedor 1
            for (Cliente cliente : clientes) {
                JSONObject objCliente = new JSONObject();
                objCliente.put("nombre", cliente.getNombre());
                objCliente.put("direccion", cliente.getDireccion());
                objCliente.put("telefono", cliente.getTelefono());
                objClientes.put(objCliente);
            }
            JSONObject objVendedor1Clientes = new JSONObject();
            objVendedor1Clientes.put("vendedor 1", objVendedor);
            objVendedor1Clientes.put("clientes", objClientes);
            System.out.println(objVendedor1Clientes);

            JSONObject objVendedor2Clientes = new JSONObject();
            objVendedor2Clientes.put("vendedor 2", objVendedor);
            objVendedor2Clientes.put("clientes", objClientes);
            System.out.println(objVendedor2Clientes);

            JSONObject objVendedor3Clientes = new JSONObject();
            objVendedor3Clientes.put("vendedor 3", objVendedor);
            objVendedor3Clientes.put("clientes", objClientes);
            System.out.println(objVendedor3Clientes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
