import java.util.List;
import java.util.ArrayList;

public class Recepcionista {
    private String nome;
    private int id;
    private List<Cotacao> cotacoes; // Relacionamento com Cotação

    public Recepcionista(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.cotacoes = new ArrayList<>();
    }

    public void adicionarCotacao(Cotacao cotacao) {
        cotacoes.add(cotacao);
    }
}