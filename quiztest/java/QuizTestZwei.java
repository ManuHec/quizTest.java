package quiztest.java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
//import javax.meinJDialog;

public class QuizTestZwei implements ActionListener, KeyListener {

    private JFrame jFrame;
    private Container contentPane;
    int punkte = 0;

    // Komponenten
    private JLabel userLabel;
    private JTextField userJTextField;
    private JLabel userLabel1;
    private JLabel userLabel2;
    private JLabel userJLabel3;
    private static JLabel userJLabel4;
    private JLabel userLabel5;
    private JLabel userJLabel6;
    private JLabel userJLabel7;
    private JLabel userJLabel8;
    private JRadioButton userJRadioButton1;
    private JRadioButton userJRadioButton2;
    private JRadioButton userJRadioButton3;
    private JRadioButton userJRadioButton4;
    private JRadioButton userJRadioButton5;
    private JRadioButton userJRadioButton6;

    public QuizTestZwei() {
        initUI(); // Fenster erstellt

        createComponent(); // Komponenten erstellt

        addComponentsToContentPane(); // komponenten hinzugefügt

        setLayoutManager(); // setze das Layout für Container

        setLocationAndSizeOfComponent(); // setz größe und position

    }

    // Fenster erstellen
    private void initUI() {
        jFrame = new JFrame("Quiz");
        jFrame.setSize(1000, 1000);
        ;
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = jFrame.getContentPane();
        jFrame.setResizable(false);
        jFrame.setVisible(true);

    }

    // Komponenenten erstellen
    private void createComponent() {

        userLabel = new JLabel("Username: ");
        userLabel.setFont(new Font("Serif", Font.BOLD, 20));
        userLabel.setForeground(Color.decode("#893101"));

        userJTextField = new JTextField();
        userJTextField.addActionListener(this);

        userJLabel4 = new JLabel("Zeit");
        userJLabel4.setFont(new Font("Serif", Font.BOLD, 20));
        userJLabel4.setForeground(Color.decode("#FF99CC"));

        userLabel1 = new JLabel("Hallo und Willkommen in Level 1!");
        userLabel1.setFont(new Font("Arial Black", Font.BOLD, 22));
        userLabel1.setForeground(Color.decode("#990000"));

        userLabel2 = new JLabel("Frage 1: ");
        userLabel2.setFont(new Font("Serif", Font.BOLD, 16));
        userLabel2.setForeground(Color.decode("#893101"));

        userJLabel3 = new JLabel("Wie lautet die Hauptstadt von Deutschland?");
        userJLabel3.setFont(new Font("Serif", Font.BOLD, 16));
        userJLabel3.setForeground(Color.decode("#666600"));

        userJRadioButton1 = new JRadioButton("Hamburg");
        userJRadioButton1.addActionListener(this);
        userJRadioButton2 = new JRadioButton("Berlin");
        userJRadioButton2.addActionListener(this);
        userJRadioButton3 = new JRadioButton("Schwerin");
        userJRadioButton3.addActionListener(this);

        userLabel5 = new JLabel("Frage 2: ");
        userLabel5.setFont(new Font("Serif", Font.BOLD, 16));
        userLabel5.setForeground(Color.decode("#893101"));

        userJLabel6 = new JLabel("Wie viele Bundesländer hat Deutschland?");
        userJLabel6.setFont(new Font("Serif", Font.BOLD, 16));
        userJLabel6.setForeground(Color.decode("#666600"));

        userJRadioButton4 = new JRadioButton("10");
        userJRadioButton4.addActionListener(this);
        userJRadioButton5 = new JRadioButton("8");
        userJRadioButton5.addActionListener(this);
        userJRadioButton6 = new JRadioButton("16");
        userJRadioButton6.addActionListener(this);

        userJLabel7 = new JLabel("Frage 3: ");
        userJLabel7.setFont(new Font("Serif", Font.BOLD, 16));
        userJLabel7.setForeground(Color.decode("#893101"));

        userJLabel8 = new JLabel("Wie viele Monate haben 31 Tage?");
        userJLabel8.setFont(new Font("Serif", Font.BOLD, 13));
        userJLabel8.setForeground(Color.decode("#666600"));

    }

    // Komponenten hinzufügen
    private void addComponentsToContentPane() {
        contentPane.add(userLabel);
        contentPane.add(userJTextField);
        contentPane.add(userLabel1);
        contentPane.add(userLabel2);
        contentPane.add(userJLabel3);
        contentPane.add(userJRadioButton1);
        contentPane.add(userJRadioButton2);
        contentPane.add(userJRadioButton3);
        contentPane.add(userJLabel4);

        contentPane.add(userLabel5);
        contentPane.add(userJLabel6);
        contentPane.add(userJRadioButton4);
        contentPane.add(userJRadioButton5);
        contentPane.add(userJRadioButton6);

        contentPane.add(userJLabel7);
        contentPane.add(userJLabel8);

    }

    private void setLocationAndSizeOfComponent() {
        userLabel.setBounds(650, 80, 100, 30);
        userJTextField.setBounds(750, 80, 150, 30);
        userLabel1.setBounds(220, 10, 400, 30);

        userLabel2.setBounds(20, 150, 200, 30);
        userJLabel3.setBounds(80, 150, 300, 30);
        userJLabel4.setBounds(20, 50, 300, 30);
        userJRadioButton1.setBounds(150, 200, 150, 30);
        userJRadioButton2.setBounds(150, 240, 150, 30);
        userJRadioButton3.setBounds(150, 280, 150, 30);

        userLabel5.setBounds(390, 150, 200, 30);
        userJLabel6.setBounds(450, 150, 300, 30);
        userJRadioButton4.setBounds(500, 200, 150, 30);
        userJRadioButton5.setBounds(500, 240, 150, 30);
        userJRadioButton6.setBounds(500, 280, 150, 30);

        userJLabel7.setBounds(20, 450, 200, 30);
        userJLabel8.setBounds(80, 450, 200, 30);

    }

    // Layout setzen
    private void setLayoutManager() {
        contentPane.setLayout(null);
        contentPane.setBackground(Color.BLACK);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuizTestZwei();

                Timer timer = new Timer();

                timer.scheduleAtFixedRate(new TimerTask() {
                    int i = 20;

                    public void run() {

                        userJLabel4.setText("Time left: " + i);
                        i--;

                        if (i < 0) {
                            timer.cancel();
                            userJLabel4.setText("Game Over");
                            userJLabel4.setForeground(Color.decode("#FF0000"));
                        }
                    }
                }, 0, 1000);

            }

        });
    }

    // Event Handling
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.userJRadioButton1) {
            JOptionPane.showMessageDialog(contentPane, this, "Hamburg ist leider falsch!", JOptionPane.ERROR_MESSAGE);
        } else if (e.getSource() == this.userJRadioButton2) {
            JOptionPane.showMessageDialog(contentPane, this, "Berlin ist richtig!",
                    JOptionPane.WIDTH);

        } else if (e.getSource() == this.userJRadioButton3) {
            JOptionPane.showMessageDialog(contentPane, this, "Schwerin ist leider falsch!", JOptionPane.ERROR_MESSAGE);
        }

        if (e.getSource() == this.userJRadioButton4) {
            JOptionPane.showMessageDialog(contentPane, this, "10 ist leider falsch!",
                    JOptionPane.ERROR_MESSAGE);
        } else if (e.getSource() == this.userJRadioButton5) {
            JOptionPane.showMessageDialog(contentPane, this, "8 ist leider falsch!",
                    JOptionPane.ERROR_MESSAGE);
        } else if (e.getSource() == this.userJRadioButton6) {
            JOptionPane.showMessageDialog(contentPane, this, "16 ist richtig!", JOptionPane.WIDTH);

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
