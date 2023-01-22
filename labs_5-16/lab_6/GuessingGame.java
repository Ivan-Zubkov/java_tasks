package lab_6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GuessingGame extends JFrame
{
    JButton button = new JButton("Check");

    JTextField enterNumber = new JTextField(10);

    JLabel labelResult = new JLabel("Enter the number:");

    public int hiddenNumber = (int)(Math.random()*100%20);
    //public int hiddenNumber = 9;
    public int countGuess = 0;

    JPanel[] pnl = new JPanel[3];

    GuessingGame()
    {

        super("GuessingGame");// конструктор класса JFrame - название заголовка
        setLayout(new GridLayout(3,1));
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        System.out.println(hiddenNumber);

        for(int i = 0 ; i < pnl.length ; i++)
        {
            int r = 255;
            int g = 214;
            int b = 142;
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }

        pnl[0].add(labelResult);
        pnl[1].add(enterNumber);
        pnl[2].add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                countGuess+=1;

                int number = Integer.parseInt(enterNumber.getText());
                if (hiddenNumber == number) {
                    labelResult.setText("You guessed right!");
                    button.setVisible(false);
                    enterNumber.setVisible(false);
                    countGuess = 0;
                }
                else if (hiddenNumber > number) {
                    labelResult.setText("The number is greater");
                }
                else if (hiddenNumber < number) {
                    labelResult.setText("The number is less");
                }
                if (countGuess>=3) {
                    button.setVisible(false);
                    enterNumber.setVisible(false);
                    labelResult.setText("You lose! hidden number = " + Integer.toString(hiddenNumber));
                }
            }
        });


    }
    public static void main(String[]args)
    {
        new GuessingGame();
    }
}
