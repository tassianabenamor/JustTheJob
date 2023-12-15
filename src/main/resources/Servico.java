public class Servico {
    private String descricao;
    private float preco;
    private Faxineiro faxineiro; // Relacionamento com Faxineiro

    public Servico(String descricao, float preco, Faxineiro faxineiro) {
