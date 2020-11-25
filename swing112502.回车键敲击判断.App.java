import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    if (textArea_A.getText().equals("诗诗")){
                        textArea_B.append("正确\n");
                    }else{
                        textArea_B.append("错误\n");
                    }
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        textArea_A.setBounds(50,100,400,200);
        textArea_B.setBounds(50,400,400,200);
        textArea_A.setBackground(Color.magenta);
        textArea_B.setBackground(Color.red);
        textArea_A.setForeground(Color.white);
        textArea_B.setForeground(Color.white);

        textArea_A.setText("魔镜魔镜，谁是世界上最好看的人？");
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
