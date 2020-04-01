package clases;

public class transaccion {
    
    
    public cliente cliente;
    public producto producto;
    public cajero cajero;
    public Double precio;
    public Double monto;

    public transaccion(cliente cliente, producto producto, cajero cajero, Double precio, Double monto) {
        this.cliente = cliente;
        this.producto = producto;
        this.cajero = cajero;
        this.precio = precio;
        this.monto = monto;
    }

    public transaccion(cliente cliente,producto producto) {
    this.cliente = cliente; 
    }
    
    
    
    
}
