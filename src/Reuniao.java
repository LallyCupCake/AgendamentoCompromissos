import javax.swing.*;

public class Reuniao extends Compromisso {
    public String participantes;

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    @Override
    public void Mensagem() {
        JOptionPane.showMessageDialog(null, "Sua Reunião sobre " + getDescricao() + " às " + getHora() + " do dia " + getData() + " com os participantes: " + getParticipantes());
        super.Mensagem();
    }
}
