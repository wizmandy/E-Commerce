package classes.classes;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    protected String codigo;
    protected LocalDate data;
    protected Cliente cliente;
    protected List<Produto> produtos;

    public Pedido(String codigo, LocalDate data, Cliente cliente, List<Produto> produtos){
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public Double calcularTotal(){
        Double total = 0.0;

        for(Produto p : produtos){
            total += p.getSubtotal();
        }

        return total;
    }

    public void exibirPedido(){
        System.out.println("Código:"+codigo);
        System.out.println("Data:"+data);
        System.out.println("Cliente:"+cliente.getNome());
        System.out.println("Endereço:"+cliente.getEndereco());

        System.out.println("Produtos:");
        for(Produto p : produtos){
            System.out.println("- "+p.getNome()+
                    " | Quantidade:"+p.getQuantidade()+
                    " | Subtotal:"+p.getSubtotal());
        }

        System.out.println("Total:"+calcularTotal());
    }
}