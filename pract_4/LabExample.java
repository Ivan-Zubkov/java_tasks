package pract_4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LabExample extends JFrame
{
    JButton buttonMilan = new JButton("AC Milan");
    JButton buttonMadrid = new JButton("Real Madrid");

    JLabel labelResult = new JLabel("Result: 0 X 0");
    JLabel labelLast = new JLabel("Last Scorer: N/A");
    Label labelWinner = new Label("Winner: DRAW");

    public int scoreMilan = 0;
    public int scoreMadrid = 0;

    JPanel[] pnl = new JPanel[9];

    LabExample()
    {
        super("Example");// конструктор класса JFrame - название заголовка
        setLayout(new GridLayout(3,3));
        setSize(500,200);

        setVisible(true);

        for(int i = 0 ; i < pnl.length ; i++)
        {
            int r = 178;
            int g = 255;
            int b = 102;
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }

        pnl[4].setBackground(new Color(153,255,51));

        pnl[1].add(labelLast);
        pnl[4].add(labelResult);
        pnl[5].add(buttonMilan);
        pnl[3].add(buttonMadrid);
        pnl[7].add(labelWinner);

        buttonMadrid.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                scoreMadrid += 1;
                String txt = "Result: " + scoreMadrid + " X " + scoreMilan;
                labelResult.setText(txt);
                labelLast.setText("Last Scorer: Real Madrid");
                if (scoreMadrid > scoreMilan){
                    labelWinner.setText("Winner: Real Madrid");
                }
                else if (scoreMilan > scoreMadrid){
                    labelWinner.setText("Winner: AC Milan");
                }
                else {
                    labelWinner.setText("DRAW");
                }
            }
        });

        buttonMilan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                scoreMilan += 1;
                String txt = "Result: " + scoreMadrid + " X " + scoreMilan;
                labelResult.setText(txt);
                labelLast.setText("Last Scorer: AC Milan");
                if (scoreMadrid > scoreMilan){
                    labelWinner.setText("Winner: Real Madrid");
                }
                else if (scoreMilan > scoreMadrid){
                    labelWinner.setText("Winner: AC Milan");
                }
                else {
                    labelWinner.setText("DRAW");
                }
            }
        });
    }
    public static void main(String[]args)
    {
        new LabExample();
    }
}
