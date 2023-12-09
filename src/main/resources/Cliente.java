public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    // Considerando que Histórico de Limpeza e Serviços Contratados são listas de strings
    private List<String> historicoDeLimpeza;
    private List<String> servicosContratados;


    // Construtor, getters e setters
    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.historicoDeLimpeza = new ArrayList<>();
        this.servicosContratados = new ArrayList<>();
    }

    // Método para adicionar serviços e histórico de limpeza
    public void adicionarServicoContratado(String servico) {
        servicosContratados.add(servico);
    }

    public void adicionarHistoricoDeLimpeza(String historico) {
        historicoDeLimpeza.add(historico);
    }
}
