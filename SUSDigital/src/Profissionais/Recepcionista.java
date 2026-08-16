package Profissionais;

import Prontuario.Profissional;

public class Recepcionista extends Profissional {

    private String unidadeAtendimento;
    private String numeroGuichê;

    public Recepcionista(String nome, String CPF, String dataDeNascimento, String telefone, String email, String cargo, String setor, String status, String unidadeAtendimento, String numeroGuichê) {
        super(nome, CPF, dataDeNascimento, telefone, email, cargo, setor, status);
        this.unidadeAtendimento = unidadeAtendimento;
        this.numeroGuichê = numeroGuichê;
    }

    public String getUnidadeAtendimento() {
        return unidadeAtendimento;
    }

    public void setUnidadeAtendimento(String unidadeAtendimento) {
        this.unidadeAtendimento = unidadeAtendimento;
    }

    public String getNumeroGuichê() {
        return numeroGuichê;
    }

    public void setNumeroGuichê(String numeroGuichê) {
        this.numeroGuichê = numeroGuichê;
    }

}