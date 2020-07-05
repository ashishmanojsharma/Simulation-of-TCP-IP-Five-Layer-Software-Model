
package cnassignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CNASSIGNMENT {

    public static void main(String[] args) {
        Flow f=new Flow();
    }
    
}

class Flow
{
    JFrame f=new JFrame("CN ASSIGNMENT");
    JLabel title,mes,app_s,tran_s,net_s,dat_s,py_s,app_d,tran_d,net_d,dat_d,py_d;
    JLabel app_hs,tran_hs,net_hs,dat_hs,py_hs,app_hd,tran_hd,net_hd,dat_hd,py_hd;
    JLabel app_sm,tran_sm,net_sm,dat_sm,py_sm,app_hsm,tran_hsm,net_hsm,dat_hsm,py_hsm;
    JLabel app_sm1,tran_sm1,net_sm1,dat_sm1,py_sm1,app_hsm1,tran_hsm1,net_hsm1,dat_hsm1,py_hsm1;
    JTextField t;
    JButton btn;
    JPanel p1,p2,p3; 
    String s="";
    public Flow()
    {
        title =new JLabel("5 Layer Internet Model");
        p1=new JPanel(new FlowLayout());
        p2=new JPanel(new FlowLayout());
        p3=new JPanel(new GridLayout(10,4));
        p1.add(title);
        mes=new JLabel("Enter message: ");
        p2.add(mes);
        t=new JTextField(20);
        p2.add(t);
        btn=new JButton("START");
        p2.add(btn);
        app_s=new JLabel("");
        tran_s=new JLabel("");
        net_s=new JLabel("");
        dat_s=new JLabel("");
        py_s=new JLabel("");
        app_d=new JLabel("");
        tran_d=new JLabel("");
        net_d=new JLabel("");
        dat_d=new JLabel("");
        py_d=new JLabel("");
        
        app_sm=new JLabel("");
        tran_sm=new JLabel("");
        net_sm=new JLabel("");
        dat_sm=new JLabel("");
        py_sm=new JLabel("");
        app_hsm=new JLabel("");
        tran_hsm=new JLabel("");
        net_hsm=new JLabel("");
        dat_hsm=new JLabel("");
        py_hsm=new JLabel("");
        
        app_sm1=new JLabel("");
        tran_sm1=new JLabel("");
        net_sm1=new JLabel("");
        dat_sm1=new JLabel("");
        py_sm1=new JLabel("");
        app_hsm1=new JLabel("");
        tran_hsm1=new JLabel("");
        net_hsm1=new JLabel("");
        dat_hsm1=new JLabel("");
        py_hsm1=new JLabel("");
        
        app_hs=new JLabel("");
        tran_hs=new JLabel("");
        net_hs=new JLabel("");
        dat_hs=new JLabel("");
        py_hs=new JLabel("");
        app_hd=new JLabel("");
        tran_hd=new JLabel("");
        net_hd=new JLabel("");
        dat_hd=new JLabel("");
        py_hd=new JLabel("");
        p3.add(app_s);
        p3.add(app_sm);
        p3.add(app_sm1);
        p3.add(app_d);
        p3.add(app_hs);
        p3.add(app_hsm);
        p3.add(app_hsm1);
        p3.add(app_hd);
        
        p3.add(tran_s);
        p3.add(tran_sm);
        p3.add(tran_sm1);
        p3.add(tran_d);
        p3.add(tran_hs);
        p3.add(tran_hsm);
        p3.add(tran_hsm1);
        p3.add(tran_hd);
        
        p3.add(net_s);
        p3.add(net_sm);
        p3.add(net_sm1);
        p3.add(net_d);
        p3.add(net_hs);
        p3.add(net_hsm);
        p3.add(net_hsm1);
        p3.add(net_hd);
        
        p3.add(dat_s);
        p3.add(dat_sm);
        p3.add(dat_sm1);
        p3.add(dat_d);
        p3.add(dat_hs);
        p3.add(dat_hsm);
        p3.add(dat_hsm1);
        p3.add(dat_hd);
        
        p3.add(py_s);
        p3.add(py_sm);
        p3.add(py_sm1);
        p3.add(py_d);
        p3.add(py_hs);
        p3.add(py_hsm);
        p3.add(py_hsm1);
        p3.add(py_hd);
        
        f.add(p1);
        f.add(p2);
        f.add(p3);
        
        btn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                p3.setBackground(Color.black);
                s="";
                app_s.setText("");
                        
                app_hs.setText("");
                
                
                
                tran_s.setText("");
                
                tran_hs.setText("");
                
                net_s.setText("");
                net_hs.setText("");
                
                dat_s.setText("");
                dat_hs.setText("");
                
                py_s.setText("");
                py_hs.setText("");
                
                py_sm.setText("");
                py_sm1.setText("");
                
                py_hsm.setText("");
                py_hsm1.setText("");
                
                py_d.setText("");
                py_hd.setText(""); 
                
                dat_d.setText("");
                dat_hd.setText("");
                
                net_d.setText("");
                net_hd.setText("");
                
                tran_d.setText("");
                tran_hd.setText("");
                
                app_d.setText("");
                app_hd.setText("");
                
                String str=t.getText();
                char ch[]=str.toCharArray();
                
                //String q[]=new String[str.length()];
                for(int i=0;i<str.length();i++)
                {
                    s=s+Integer.toBinaryString((int)ch[i]);
                    
                }
                String app_t=str;
                String tran_t="H4 "+str;
                String net_t="H3 H4 "+str;
                String dat_t="H2 H3 H4 "+str+" T2";
                String py_t="Message converted ";
                
                new Thread(new Runnable(){
                    public void run(){
                        
                        app_s.setText("Application Layer");
                        app_s.setForeground(Color.red);
                app_hs.setText(app_t);
                app_hs.setForeground(Color.green);
                try{Thread.sleep(1000);}catch(Exception e){};
                
                tran_s.setText("Transport Layer");
                
                tran_hs.setText(tran_t);
                tran_s.setForeground(Color.red);
                tran_hs.setForeground(Color.green);
                try{Thread.sleep(1000);}catch(Exception e){};
                net_s.setText("Network Layer");
                net_hs.setText(net_t);
                net_s.setForeground(Color.red);
                net_hs.setForeground(Color.green);
                try{Thread.sleep(1000);}catch(Exception e){};
                dat_s.setText("Datalink Layer");
                dat_hs.setText(dat_t);
                dat_s.setForeground(Color.red);
                dat_hs.setForeground(Color.green);
                try{Thread.sleep(1000);}catch(Exception e){};
                py_s.setText("Physical Layer");
                py_hs.setText(py_t+"to bits"+"  ~~~~>");
                py_s.setForeground(Color.red);
                py_hs.setForeground(Color.green);
                try{Thread.sleep(1500);}catch(Exception e){};
                
                py_sm.setText("Transition Medium");
                try{Thread.sleep(1000);}catch(Exception e){};
                py_hsm.setText(s+"  ~~~~>");
                py_hsm.setForeground(Color.green);
               
                try{Thread.sleep(1500);}catch(Exception e){};
                
                py_sm1.setText("Transition Medium");
                try{Thread.sleep(1000);}catch(Exception e){};
                py_hsm1.setText(s+"  ~~~~>");
                py_hsm1.setForeground(Color.green);
               
                try{Thread.sleep(1500);}catch(Exception e){};
                
                py_d.setText("Physical Layer");
                py_hd.setText(py_t+"from bit to string"); 
                py_d.setForeground(Color.red);
                py_hd.setForeground(Color.green);
                try{Thread.sleep(1000);}catch(Exception e){};
                dat_d.setText("Datalink Layer");
                dat_hd.setText(dat_t);
                dat_d.setForeground(Color.red);
                dat_hd.setForeground(Color.green);
                try{Thread.sleep(1000);}catch(Exception e){};
                net_d.setText("Network Layer");
                net_hd.setText(net_t);
                net_d.setForeground(Color.red);
                net_hd.setForeground(Color.green);
                try{Thread.sleep(1000);}catch(Exception e){};
                tran_d.setText("Transport Layer");
                tran_hd.setText(tran_t);
                tran_d.setForeground(Color.red);
                tran_hd.setForeground(Color.green);
                try{Thread.sleep(1000);}catch(Exception e){};
                app_d.setText("Application Layer");
                app_hd.setText(app_t);
                app_d.setForeground(Color.red);
                app_hd.setForeground(Color.green);
                        
                        
                    }
                }).start();
                     
            }
        }
        
        
        );
        
        f.setLayout(new GridLayout(3,1));
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        
    }
    
}
