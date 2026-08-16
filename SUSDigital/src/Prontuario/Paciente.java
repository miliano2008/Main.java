package Prontuario;

public class Paciente extends Pessoa{

    private String CNS;
    private String Peso;
    private String Altura;
    private String numeroDeProntuario;
    private String Alergia;


    public Paciente(String nome, String CPF, String dataDeNascimento, String telefone, String email) {
        super(nome, CPF, dataDeNascimento, telefone, email);
    }
    @Override
    public String toString(){
        return "Nome:" + getNome() +
                "\nCPF: " + getCPF() +
                "\nTelefone:" + getTelefone();
    }
}
