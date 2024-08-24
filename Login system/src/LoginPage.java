import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LoginPage implements ActionListener
{
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordJLabel = new JLabel("password:");
    JLabel messagLabel = new JLabel();

    HashMap<String, String> logininfo = new HashMap<String, String>();
    LoginPage(HashMap<String, String> logininfoOriginal)
    {
        logininfo = logininfoOriginal;

        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordJLabel.setBounds(50, 150, 75, 25);
        
        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        messagLabel.setBounds(135, 250, 250, 35);


        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(messagLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(userIDLabel);
        frame.add(userPasswordJLabel);
        frame.add(resetButton);
        frame.add(loginButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == resetButton)
        {
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if (e.getSource() == loginButton)
        {
            String userID = userIDField.getText();
            String userPassword = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userID))
            {
                if (logininfo.get(userID).equals(userPassword))
                {
                    messagLabel.setForeground(Color.green);
                    messagLabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                else 
                {
                    messagLabel.setForeground(Color.red);
                    messagLabel.setText("Wrong account or password");
                    userPasswordField.setText("");
                }
            }
            else 
            {
                messagLabel.setForeground(Color.red);
                messagLabel.setText("Wrong account or password");
                userPasswordField.setText("");
            }
            
        }

    }
}
