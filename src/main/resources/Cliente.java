import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private List<Cotacao> cotacoes; // Relacionamento com Cotação

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cotacoes = new ArrayList<>();
    }

    public void adicionarCotacao(Cotacao cotacao) {
        cotacoes.add(cotacao);
    }
}
