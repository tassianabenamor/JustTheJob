import java.util.List;
import java.util.ArrayList;

public class Faxineiro {
    private String nome;
    private int id;
    private int horasTrabalhadas;
    private List<Servico> servicos; // Relacionamento com Serviço

    public Faxineiro(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.horasTrabalhadas = 0;
        this.servicos = new ArrayList<>();
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }
}
