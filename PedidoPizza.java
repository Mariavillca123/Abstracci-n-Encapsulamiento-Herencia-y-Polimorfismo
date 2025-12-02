public class PedidoPizza extends Pedido {

    private String tamanio;
    private String[] ingredientesExtras;

    public PedidoPizza(String cliente, String direccion, double precioBase,
                       TipoComida tipo, boolean delivery,
                       String tamanio, String[] ingredientesExtras) {
        super(cliente, direccion, precioBase, tipo, delivery);
        this.tamanio = tamanio;
        this.ingredientesExtras = ingredientesExtras;
    }

    @Override
    public void mostrarDetallesEspeciales() {
        System.out.println("Pedido Pizza");
        System.out.println("Tamaño: " + tamanio);
        System.out.print("Extras: ");
        for(String ing : ingredientesExtras){
            System.out.print(ing + " ");
        }
        System.out.println();
    }

    @Override
    public void mostrarResumenPedido() {
        System.out.println("Cliente: " + getCliente());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Tipo: " + getTipo());
    }

    @Override
    public double calcularCostoTotal() {
        double total = getPrecioBase();
        total += ingredientesExtras.length * 0.75;
        if (isDelivery()) total += 3.50;
        return total;
    }

    @Override
    public int estimarTiempoEntrega() {
        return isDelivery() ? 35 : 25;
    }
}