package Profissionais;

import Prontuario.Profissional;

public class Médico extends Profissional {

    private String crm;
    private String especialidade;
    private String turno;

    public Médico(String nome, String CPF, String dataDeNascimento, String telefone, String email, String cargo, String setor, String status, String crm, String especialidade, String turno) {
        super(nome, CPF, dataDeNascimento, telefone, email, cargo, setor, status);
        this.crm = crm;
        this.especialidade = especialidade;
        this.turno = turno;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
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