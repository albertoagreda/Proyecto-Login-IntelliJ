import javax.swing.*;

public class LoginClassic {
    private JLabel Login;
    private JPasswordField passwordField1;
    private JCheckBox aceptarTerminosYCondicionesCheckBox;
    private JButton accederButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginClassic");
        frame.setContentPane(new LoginClassic().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
}
