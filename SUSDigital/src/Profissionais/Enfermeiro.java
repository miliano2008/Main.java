package Profissionais;

import Prontuario.Profissional;

public class Enfermeiro extends Profissional {

    private String coren;
    private String especialidade;
    private String turno;

    public Enfermeiro(String nome, String CPF, String dataDeNascimento, String telefone, String email, String cargo, String setor, String status, String coren, String especialidade, String turno) {
        super(nome, CPF, dataDeNascimento, telefone, email, cargo, setor, status);
        this.coren = coren;
        this.especialidade = especialidade;
        this.turno = turno;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}


