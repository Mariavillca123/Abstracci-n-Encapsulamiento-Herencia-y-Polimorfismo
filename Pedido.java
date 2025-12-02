public abstract class Pedido implements OperacionesPedido {

    private String cliente;
    private String direccion;
    private double precioBase;
    private TipoComida tipo;
    private boolean delivery;

    public Pedido(String cliente, String direccion, double precioBase,
                  TipoComida tipo, boolean delivery) {
        this.cliente = cliente;
        this.direccion = direccion;
        this.precioBase = precioBase;
        this.tipo = tipo;
        this.delivery = delivery;
    }

    // Getters
    public String getCliente() { return cliente; }
    public String getDireccion() { return direccion; }
    public double getPrecioBase() { return precioBase; }
    public TipoComida getTipo() { return tipo; }
    public boolean isDelivery() { return delivery; }

    // Setters
    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public void setTipo(TipoComida tipo) { this.tipo = tipo; }
    public void setDelivery(boolean delivery) { this.delivery = delivery; }

    public abstract void mostrarDetallesEspeciales();
}
