import javax.swing.JFrame;

public class GameFrame extends JFrame
{
    GameFrame()
    {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //是否可以由用户调整大小
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); //设置窗口相对于指定组件的位置
        
    }
}
