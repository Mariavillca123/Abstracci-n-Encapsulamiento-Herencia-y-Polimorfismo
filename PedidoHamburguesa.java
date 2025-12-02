public class PedidoHamburguesa extends Pedido {

    private boolean comboCompleto;
    private int nivelPicante;

    public PedidoHamburguesa(String cliente, String direccion, double precioBase,
                             TipoComida tipo, boolean delivery,
                             boolean comboCompleto, int nivelPicante) {
        super(cliente, direccion, precioBase, tipo, delivery);
        this.comboCompleto = comboCompleto;
        this.nivelPicante = nivelPicante;
    }

    @Override
    public void mostrarDetallesEspeciales() {
        System.out.println("Pedido Hamburguesa");
        System.out.println("Combo completo: " + comboCompleto);
        System.out.println("Picante nivel: " + nivelPicante);
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
        if (comboCompleto) total += 2.00;
        if (isDelivery()) total += 2.80;
        return total;
    }

    @Override
    public int estimarTiempoEntrega() {
        return isDelivery() ? 25 : 15;
    }
}