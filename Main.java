import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new PedidoPizza("Carlos", "Av. Sol 123", 8.50,
                TipoComida.PIZZA, true, "Grande",
                new String[]{"Pepperoni", "Queso Extra"}));

        pedidos.add(new PedidoHamburguesa("Ana", "Calle Luna 45", 6.00,
                TipoComida.HAMBURGUESA, false, true, 3));

        for (Pedido p : pedidos) {
            System.out.println("============================================");
            p.mostrarDetallesEspeciales();
            p.mostrarResumenPedido();
            System.out.println("Total: $" + p.calcularCostoTotal());
            System.out.println("Tiempo: " + p.estimarTiempoEntrega() + " min");
        }
    }
}