import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        // Descuento por volumen
        if (total > 3000) {
            total *= 0.95;
        }

        return total;
    }
}
