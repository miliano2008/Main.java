package Prontuario;

import java.util.ArrayList;
import java.util.List;

public class Prontuario {
    private String numeroProntuario;
    private Paciente paciente;
    private List<Consulta> consultas;
    private List<String> medicamentosEmUso;
    private List<String> exames;
    private List<String> internacoes;
    private List<String> alergias;

    public Prontuario(String numeroProntuario, Paciente paciente) {
        this.numeroProntuario = numeroProntuario;
        this.paciente = paciente;

        consultas = new ArrayList<>();
        medicamentosEmUso = new ArrayList<>();
        exames = new ArrayList<>();
        internacoes = new ArrayList<>();
        alergias = new ArrayList<>();
    }


    public String getNumeroProntuario() {
        return numeroProntuario;
    }

    public void setNumeroProntuario(String numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<String> getMedicamentosEmUso() {
        return medicamentosEmUso;
    }

    public void setMedicamentosEmUso(List<String> medicamentosEmUso) {
        this.medicamentosEmUso = medicamentosEmUso;
    }

    public List<String> getExames() {
        return exames;
    }

    public void setExames(List<String> exames) {
        this.exames = exames;
    }

    public List<String> getInternacoes() {
        return internacoes;
    }

    public void setInternacoes(List<String> internacoes) {
        this.internacoes = internacoes;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);

    }

    public void adicionarMedicamento(String medicamento){
        medicamentosEmUso.add(medicamento);
    }

    public void adicionarExame(String exame){
        exames.add(exame);

    }

    public void adicionarInternacao(String internacao){
        internacoes.add(internacao);

    }

    public void adicionarAlergias(String alergia){
        alergias.add(alergia);
    }

@Override
public String toString() {

    return "========================================" +
            "\nPRONTUÁRIO Nº " + numeroProntuario +
            "\n========================================" +

            "\n\nPaciente:\n" + paciente +

            "\n\nMedicamentos:\n- " +
            String.join("\n- ", medicamentosEmUso) +

            "\n\nExames:\n- " +
            String.join("\n- ", exames) +

            "\n\nInternações:\n- " +
            String.join("\n- ", internacoes) +

            "\n\nAlergias:\n- " +
            String.join("\n- ", alergias) +

            "\n\nConsultas:\n" + consultas;
}
}


