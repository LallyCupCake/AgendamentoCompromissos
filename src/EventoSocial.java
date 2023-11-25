import javax.swing.*;

public class EventoSocial extends Compromisso {
    public String local;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public void Mensagem() {
        JOptionPane.showMessageDialog(null, "Seu evento: " + getDescricao() + " às " + getHora() + " do dia " + getData() + " com os participantes: " + getLocal());
        super.Mensagem();
    }
}
