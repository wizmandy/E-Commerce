import classes.Pedido;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("2E4A", LocalDate.of(2026, 4, 17));

        System.out.println(p1.getCodigo());
        System.out.println(p1.getData());
    }
}