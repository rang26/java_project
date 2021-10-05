package interfaceTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Click2 implements ActionListener {

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
      JOptionPane.showMessageDialog(null, "오후입니다");
      
   }

}