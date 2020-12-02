import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_plane=new JLabel();
    int CELL=64;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==e.VK_UP){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()-CELL,CELL,CELL);
                }else if (e.getKeyCode()==e.VK_DOWN){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()+CELL,CELL,CELL);
                }else if (e.getKeyCode()==e.VK_LEFT){
                    label_plane.setBounds(label_plane.getX()-CELL,label_plane.getY(),CELL,CELL);
                }else if (e.getKeyCode()==e.VK_RIGHT){
                    label_plane.setBounds(label_plane.getX()+CELL,label_plane.getY(),CELL,CELL);
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);
        java.net.URL imgURL = App.class.getResource("img/plane.png");
        label_plane.setIcon(new ImageIcon(imgURL));
        label_plane.setBounds(100,100,CELL,CELL);
        myPanel.add(label_plane);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);

        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
