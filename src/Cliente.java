public class Cliente {
    // Criamos aqui atributos normais de uma classe Cliente
    int codigo;
    String nome;
    String cpf;
    String endereco;

    // Criamos aqui um construtor vazio para a classe
    public Cliente() {}

    // Criamos aqui outro construtor passando valores
    // de entrada para inicializar os atributos
    public Cliente(int codigo, String nome, String cpf, String endereco) {
        this.codigo=codigo;
        this.nome=nome;
        this.cpf=cpf;
        this.endereco=endereco;
    }

}
