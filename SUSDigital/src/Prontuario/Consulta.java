package Prontuario;

import Profissionais.Médico;

public class Consulta {
    private String data;
    private String horario;
    private String diagnostico;
    private String local;
    private Médico medico;
    private Paciente paciente;

    public Consulta(String data, String horario, String diagnostico, String local, Médico medico, Paciente paciente) {
        this.data = data;
        this.horario = horario;
        this.diagnostico = diagnostico;
        this.local = local;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Médico getMedico() {
        return medico;
    }

    public void setMedico(Médico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

 @Override
 public String toString() {
     return "----------------------------" +
             "\nData: " + data +
             "\nHorário: " + horario +
             "\nDiagnóstico: " + diagnostico +
             "\nLocal: " + local +
             "\nMédico: " + medico.getNome();
     }


}
