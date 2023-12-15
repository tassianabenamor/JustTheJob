import java.util.Date;

public class Fatura {
    private Date dataEmissao;
    private float valorTotal;
    private Gerente gerente; // Relacionamento com Gerente

    public Fatura(Date dataEmissao, float valorTotal, Gerente gerente) {
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
        this.gerente = gerente;
    }
}
