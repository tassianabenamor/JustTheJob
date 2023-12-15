import java.util.Date;

public class Agenda {
    private Date data;
    private String atividades;
    private Gerente gerente; // Relacionamento com Gerente

    public Agenda(Date data, String atividades, Gerente gerente) {
        this.data = data;
        this.atividades = atividades;
        this.gerente = gerente;
    }
}
