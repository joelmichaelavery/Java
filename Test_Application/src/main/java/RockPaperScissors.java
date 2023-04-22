
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class RockPaperScissors {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton rockButton, paperButton, scissorsButton;
    private Random r;
    private int compChoice, userChoice;
    
    public RockPaperScissors() {
        r = new Random();
        frame = new JFrame("Rock, Paper, Scissors");
        frame.setSize(500, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        
        label = new JLabel("Select your choice:");
        panel.add(label);
        
        rockButton = new JButton("Rock");
        rockButton.addActionListener(new RockListener());
        panel.add(rockButton);
        
        paperButton = new JButton("Paper");
        paperButton.addActionListener(new PaperListener());
        panel.add(paperButton);
        
        scissorsButton = new JButton("Scissors");
        scissorsButton.addActionListener(new ScissorsListener());
        panel.add(scissorsButton);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
    class RockListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            userChoice = 1;
            compChoice = r.nextInt(3) + 1;
            if (compChoice == 1) {
                label.setText("It's a tie! You both chose Rock!");
            } else if (compChoice == 2) {
                label.setText("You lose! Paper beats Rock!");
            } else {
                label.setText("You win! Rock beats Scissors!");
            }
        }
    }
    
    class PaperListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            userChoice = 2;
            compChoice = r.nextInt(3) + 1;
            if (compChoice == 1) {
                label.setText("You win! Paper beats Rock!");
            } else if (compChoice == 2) {
                label.setText("It's a tie! You both chose Paper!");
            } else {
                label.setText("You lose! Scissors beats Paper!");
            }
        }
    }
    
    class ScissorsListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            userChoice = 3;
            compChoice = r.nextInt(3) + 1;
            if (compChoice == 1) {
                label.setText("You lose! Rock beats Scissors!");
            } else if (compChoice == 2) {
                label.setText("You win! Scissors beats Paper!");
            } else {
                label.setText("It's a tie! You both chose Scissors!");
            }
        }
    }
    
    public static void main(String[] args) {
        new RockPaperScissors();
    }
}   