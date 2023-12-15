public class Gerente {
    private String nome;
    private int id;
    private Agenda agenda; // Relacionamento com Agenda
    private List<Fatura> faturas; // Relacionamento com Fatura

    public Gerente(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.faturas = new ArrayList<>();
    }

    public void adicionarFatura(Fatura fatura) {
        faturas.add(fatura);
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
}
