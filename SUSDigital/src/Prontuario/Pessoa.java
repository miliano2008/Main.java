package Prontuario;

public class Pessoa {
    private String Nome;
    private String CPF;
    private String DataDeNascimento;
    private String Telefone;
    private String Email;

    public Pessoa(String nome, String CPF, String dataDeNascimento, String telefone, String email) {
        Nome = nome;
        this.CPF = CPF;
        DataDeNascimento = dataDeNascimento;
        Telefone = telefone;
        Email = email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nCPF: " + getCPF() +
                "\nTelefone: " + getTelefone();
    }
}
