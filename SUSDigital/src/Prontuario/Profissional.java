package Prontuario;

public class Profissional extends Pessoa {

    private String Cargo;
    private String Setor;
    private String Status;

    public Profissional(String nome, String CPF, String dataDeNascimento, String telefone, String email, String cargo, String setor, String status) {
        super(nome, CPF, dataDeNascimento, telefone, email);
        Cargo = cargo;
        Setor = setor;
        Status = status;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String setor) {
        Setor = setor;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

}
