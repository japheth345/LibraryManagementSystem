/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import static java.awt.Font.BOLD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Prof.Japheth Nyarand
 */
public class About extends JFrame{
     JFrame jf;
     JButton b1=new JButton("GO HOME");
    public About()
    {
        b1.setFont(new Font("BOLD", BOLD, 35));
       b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
                                       jf.setVisible(false);   
					//SteganographyProject window = new SteganographyProject();
                                    Login window = new Login();
                                        
					window.setVisible(true);
                                        
				} catch (Exception ex) {
					ex.printStackTrace();
				}    
                
			}
		});
        JPanel panel=new JPanel(new BorderLayout());
        panel.add(new Text_Animation(),BorderLayout.CENTER);
         panel.add(b1,BorderLayout.SOUTH);
        jf=new JFrame();
         jf.setSize(800, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(panel);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);   
    }
    
  public class Text_Animation extends JPanel{

    int x=0;
    int y=100;
    int a=400;
    int b=200;
     public void paint(Graphics gp)
    {
        super.paint(gp);
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.BLUE);
        g2d.setFont(new Font("BOLD", BOLD, 35));
             
        g2d.drawString("LIBRARY MANAGEMENT SYSTEM ", x, y);
        g2d.drawString("designed and build by ", x, b);
       g2d.drawString("JAPHETH NYARANDI", x, 300);
        g2d.drawString("MMUST",x, 400);
       
                try {
            Thread.sleep(200);
            x+=20;
            a-=20;
            
            if(x>getWidth())
        {
        
            x=0;
        }
            if(a<0)
        {
        
            a=500;
        }
        repaint();
         
                      
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    
        
        
    }
      
}
}
