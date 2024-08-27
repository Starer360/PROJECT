import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener
{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_Panel = new JPanel();
    JPanel button_Panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50)); //获取 JFrame 的内容面板 (ContentPane)
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }

    public void firstTurn()
    {

    }

    public void check()
    {

    }

    public void xWins(int a, int b, int c)
    {

    }

    public void oWins(int a, int b, int c)
    {

    }

}
