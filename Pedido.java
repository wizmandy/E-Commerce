package classes;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private String codigo;
    private LocalDate data;
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(String codigo, LocalDate data){
        this.codigo = codigo;
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}