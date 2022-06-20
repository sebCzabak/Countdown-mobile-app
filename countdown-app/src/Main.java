import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        JLabel jLabel = new JLabel();
        jFrame.setLayout(new FlowLayout());
        jFrame.setBounds(500,300,400,100);
        Scanner scan = new Scanner(System.in);

        jFrame.add(jLabel);
        jFrame.setVisible(true);

        Timer timer = new Timer();
        System.out.println("Put time to countdown.");
        Integer theTime = scan.nextInt();
        timer.scheduleAtFixedRate(new TimerTask(){
            int theTime =20;
            public void run(){
                jLabel.setText("Time left: "+ theTime);
                theTime--;

                if (theTime<0){
                    timer.cancel();
                    jLabel.setText("Time's up!");
                }
            }
        },0,1000);
    }
}