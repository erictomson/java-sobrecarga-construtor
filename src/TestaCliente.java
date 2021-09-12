import javax.swing.JOptionPane;

public class TestaCliente {

    public static void main(String[] args) {

        // Criamos aqui os atributos a serem lidos
        // referente ao cliente 1 e cliente 2
        int codigo;
        String nome;
        String cpf;
        String endereco;

        // Aqui lemos os valores dos atributos pelo usuário
        // referente ao primeiro cliente
        codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o código do primeiro cliente:"));
        nome=JOptionPane.showInputDialog("Digite o nome do primeiro cliente:");
        cpf=JOptionPane.showInputDialog("Digite o CPF do primeiro cliente:");
        endereco=JOptionPane.showInputDialog("Digite o endereço do primeiro cliente:");

        // Criamos um objeto do tipo cliente e usamos um
        // construtor vazio, passamos os valores para
        // os atributos depois dele instanciado
        Cliente c1 = new Cliente();
        c1.codigo=codigo;
        c1.nome=nome;
        c1.cpf=cpf;
        c1.endereco=endereco;

        // Aqui lemos os valores dos atributos pelo usuário
        // referente ao segundo cliente
        codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o código do segundo cliente:"));
        nome=JOptionPane.showInputDialog("Digite o nome do segundo cliente:");
        cpf=JOptionPane.showInputDialog("Digite o CPF do segundo cliente:");
        endereco=JOptionPane.showInputDialog("Digite o endereço do segundo cliente:");

        // Aqui então instanciamos o objeto passando para
        // o construtor os valores dos atributos já neste
        // momento
        Cliente c2 = new Cliente(codigo,nome,cpf,endereco);
    }
}
