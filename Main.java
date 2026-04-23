package classes.classes;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Amanda", "Rua X");

        Produto p1 = new Produto("Camisa", 0.5, 50.0, 2);
        Produto p2 = new Produto("Tênis", 1.0, 200.0, 1);

        Pedido pedido1 = new PedidoExpresso("2E4A", LocalDate.now(), c1, Arrays.asList(p1, p2));
        Pedido pedido2 = new PedidoRetiradaLocal("3F6H", LocalDate.now(), c1, Arrays.asList(p1));

        pedido1.exibirPedido();
        System.out.println("-----");
        pedido2.exibirPedido();
    }
}