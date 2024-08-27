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

        textfield.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0)); // 设置上边距为 20 像素
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);


        title_Panel.setLayout(new BorderLayout());
        title_Panel.setBounds(0,100,800,100);

        button_Panel.setLayout(new GridLayout(3, 3));
        button_Panel.setBackground(new Color(150, 150, 155));

        for (int i = 0;i < 9; i++)
        {
            buttons[i] = new JButton();
            button_Panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_Panel.add(textfield);
        frame.add(title_Panel,BorderLayout.NORTH);
        frame.add(button_Panel);
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
