package classes.classes;

import classes.classes.Cliente;
import classes.classes.Pedido;
import classes.classes.Produto;

import java.time.LocalDate;
import java.util.List;

public class PedidoRetiradaLocal extends Pedido {
    public PedidoRetiradaLocal(String codigo, LocalDate data, Cliente cliente, List<Produto> produtos){
        super(codigo, data, cliente, produtos);
    }

    @Override
    public Double calcularTotal(){
        return super.calcularTotal();
    }
}