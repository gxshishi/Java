import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_son=new JLabel();
    JLabel label_background=new JLabel();
    JLabel label_mother=new JLabel();
    int CELL=64;
    Random random;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==e.VK_UP){
                    label_son.setBounds(label_son.getX(),label_son.getY()-CELL,CELL,CELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    label_son.setBounds(label_son.getX(),label_son.getY()+CELL,CELL,CELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    label_son.setBounds(label_son.getX()-CELL,label_son.getY(),CELL,CELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    label_son.setBounds(label_son.getX()+CELL,label_son.getY(),CELL,CELL);

                }
                if (label_son.getX()==label_mother.getX()&&label_son.getY()==label_mother.getY()){
                    JOptionPane.showMessageDialog(null,"妈妈找到了！");
                    System.exit(0);
                }
            }
        });
    }

    //显示窗体方法
    void go(){
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);
        java.net.URL imgURL = App.class.getResource("img/son.png");
        label_son.setIcon(new ImageIcon(imgURL));
        label_son.setBounds(0,0,CELL,CELL);
        myPanel.add(label_son);
        java.net.URL imgURL2 = App.class.getResource("img/mother.png");
        label_mother.setIcon(new ImageIcon(imgURL2));
        label_mother.setBounds(128,128,CELL,CELL);
        myPanel.add(label_mother);
        java.net.URL imgURL1 = App.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(imgURL1));
        label_background.setBounds(0,0,1024,768);
        myPanel.add(label_background);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("小蝌蚪找妈妈");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,768);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
