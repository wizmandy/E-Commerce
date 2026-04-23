package classes.classes;

import java.time.LocalDate;
import java.util.List;

public class PedidoExpresso extends Pedido {
    public PedidoExpresso(String codigo, LocalDate data, Cliente cliente, List<Produto> produtos){
        super(codigo, data, cliente, produtos);
    }

    @Override
    public Double calcularTotal(){
        Double total = super.calcularTotal();

        Double pesoTotal = 0.0;
        for(Produto p : produtos){
            pesoTotal += p.getPesoTotal();
        }

        Double frete = pesoTotal * 10;

        return total + frete;
    }
}