import javax.swing.*;
import java.awt.*;

public class LoginCreative {


    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JLabel icono;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JCheckBox aceptarTerminosCheckBox;
    private JButton accederButton;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField2;
    private JButton registrarButton;
    private JLabel icono2;
    private JProgressBar progressBar1;

        public LoginCreative() {
            // Crear el panel de fondo
            FondoPanel fondo = new FondoPanel();
            fondo.setLayout(new BorderLayout());

            // Hacer el panel original transparente para que se vea el fondo
            panel1.setOpaque(false);

            // Agregar el panel original (que contiene los componentes) al FondoPanel
            fondo.add(panel1, BorderLayout.CENTER);

            // Asignar el FondoPanel como el panel principal
            panel1 = fondo;
        }

        private static class FondoPanel extends JPanel {
            private final Image imagen;

            public FondoPanel() {
                // Cargar la imagen desde los recursos
                imagen = new ImageIcon(getClass().getResource("Image/lines-4496.gif")).getImage();
                // Verificar si la imagen se cargó correctamente
                if (imagen == null) {
                    System.err.println("No se pudo cargar la imagen: /image/fondo_cielo.jpg");
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen escalada al tamaño del panel
                if (imagen != null) {
                    g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
                }
            }
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("LoginCreative");
            frame.setContentPane(new LoginCreative().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(575, 567);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }
