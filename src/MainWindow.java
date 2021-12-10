import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow window = new MainWindow();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }
    public MainWindow() throws HeadlessException {
        this("Logowanie");
    }
    public MainWindow(String title) throws HeadlessException{
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 650, 600);

        JPanel background = new JPanel();

        background.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(background);
        background.setLayout(null);

        Panel panel = new Panel();
        panel.setBounds(10, 10, 20, 20);
        background.add(panel);

        //Napis login
        JLabel loginTxt = new JLabel("Login:");
        background.add(loginTxt);
        loginTxt.setBounds(100, 70, 90, 23);

        //Pole tekstowe na login
        JTextField login = new JTextField();
        background.add(login);
        login.setBounds(100,100,90,23);

        //Napis Hasło
        JLabel hasloTxt = new JLabel("Hasło:");
        background.add(hasloTxt);
        hasloTxt.setBounds(100, 170, 90, 23);

        //Pole tekstowe na haslo
        JPasswordField haslo = new JPasswordField();
        background.add(haslo);
        haslo.setBounds(100, 200, 90, 23);

        JLabel sukces = new JLabel("Powodzenie logowania!");
        sukces.setBounds(300, 150, 300, 23);
        background.add(sukces);
        sukces.setVisible(false);

        JLabel failure = new JLabel();
        failure.setBounds(300, 150, 300, 23);
        background.add(failure);
        failure.setVisible(false);

        //Przycisk do logowania
        JButton loginBtn = new JButton("Zaloguj");
        background.add(loginBtn);
        loginBtn.setBounds(150, 400, 90, 23);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //dodać jeszcze tylko baze danych na uzytkownikow i jakies ify zeby robilo sie czerwone jak beda zle passy (np. mapa<Login, Hasło>)
                panel.setBackground(Color.GREEN);
                loginBtn.setToolTipText("Logowanie zakończone powodzeniem");
                sukces.setVisible(true);
            }
        });

        //Przycisk czyszczący
        JButton clearBtn = new JButton("Wyczyść");
        background.add(clearBtn);
        clearBtn.setBounds(300,400,90,23);
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.white);
                clearBtn.setToolTipText("Wyczyść zmiany");
                sukces.setVisible(false);
                failure.setVisible(false);
                login.setText("");
                haslo.setText("");
            }
        });
    }
}
