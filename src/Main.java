// Projeto 14: Sistema de Agendamento de Compromissos
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Reuniao R = new Reuniao();
        EventoSocial eS = new EventoSocial();

        int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Insira aqui qual evento você deseja realizar \n" +
                "1 - Reunião \n" +
                "2 - EventoSocial \n"));

        switch (opcao) {
            case (1):
                R.setData(JOptionPane.showInputDialog("Insira aqui a data da reunião"));
                R.setHora(JOptionPane.showInputDialog("Insira aqui a hora da reunião"));
                R.setDescricao(JOptionPane.showInputDialog("Insira aqui a descrição de sua reunião"));
                R.setParticipantes(JOptionPane.showInputDialog("Insira aqui o nome dos participantes"));
                R.Mensagem();
                break;
            case (2):
                eS.setData(JOptionPane.showInputDialog("Insira aqui a data do Evento"));
                eS.setHora(JOptionPane.showInputDialog("Insira aqui a hora do Evento"));
                eS.setDescricao(JOptionPane.showInputDialog("Insira aqui a descrição do evento"));
                eS.setLocal(JOptionPane.showInputDialog("Insira aqui o local do evento"));
                eS.Mensagem();
                break;
        }
    }
}