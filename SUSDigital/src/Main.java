
import Prontuario.*;
import Profissionais.*;
public static void main (String[] args) {

    Paciente paciente = new Paciente( "Mariana Souza Lima","425.654.321-11" , "14/05/1988" , "(11) 91234-5678" , "mariana.lima@gmail.com");

    Médico medico = new Médico("Felipe Shikaru" , "514.654.123-77" , "15/05/1980" , "(11) 98845-4789" , "felipe@hosp.com" , "Médico" , "Clinico Geral" , "Ativo" , "CRM-SP 123456" , "Clinico Geral" , "Manhã");

    Consulta consulta = new Consulta("20/08/2026" , "14:30" , "Hipertensão" , "Hospital das Clinicas FMUSP" , medico , paciente);

    Prontuario prontuario = new Prontuario("849203-SP", paciente);

    prontuario.adicionarMedicamento("Losartana 50mg");

    prontuario.adicionarExame("Hemograma Completo");

    prontuario.adicionarInternacao("10/05/2026 - Pneumonia (Alta em 18/05/2026)");

    prontuario.adicionarAlergias("Amoxicilina");

    prontuario.adicionarConsulta(consulta);

    System.out.println(prontuario);





}