package localTest;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HTMLDemo extends JFrame{
	private JLabel jLabel;
	  private JButton jButton;

	 public HTMLDemo(String title){
		    super(title);
		   
		   jLabel = new JLabel("<html><b><i>Hello World!</i></b></html>");
		   //�ٶ�go.jpg�ļ���HTMLDemo.class�ļ�λ��ͬһ��Ŀ¼��
		   jButton = new JButton(
		"<html><img src=\""+this.getClass().getResource("/go.jpg")+"\"></html>");
		    //��������ƶ�����Buttonʱ����ʾ��Ϣ
		    jButton.setToolTipText("��ʼ");
		  
		    Container contentPane=getContentPane();
		    contentPane.setLayout(new GridLayout(2, 1));
		    contentPane.add(jLabel) ;    contentPane.add(jButton);

		    pack();    setVisible(true);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  }
		  public static void main(String[] args) {   new HTMLDemo("Hello");  }
		}

	

