import java.util.Date;

public class Cotacao {
    private Date data;
    private float valor;
    private Cliente cliente; // Relacionamento com Cliente
    private Recepcionista recepcionista; // Relacionamento com Recepcionista

    public Cotacao(Date data, float valor, Cliente cliente, Recepcionista recepcionista) {
        this.data = data;
        this.valor = valor;
        this.cliente = cliente;
        this.recepcionista = recepcionista;
    }
}
