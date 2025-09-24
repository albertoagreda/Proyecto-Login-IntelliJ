import javax.swing.*;

public class LoginExtended {
    private JPanel Acceso;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JComboBox comboBox1;
    private JRadioButton recordarUsuarioRadioButton;
    private JButton accederButton;
    private JLabel icono;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginExtended");
        frame.setContentPane(new LoginExtended().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
}
