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
		   //假定go.jpg文件与HTMLDemo.class文件位于同一个目录下
		   jButton = new JButton(
		"<html><img src=\""+this.getClass().getResource("/go.jpg")+"\"></html>");
		    //设置鼠标移动到该Button时的提示信息
		    jButton.setToolTipText("开始");
		  
		    Container contentPane=getContentPane();
		    contentPane.setLayout(new GridLayout(2, 1));
		    contentPane.add(jLabel) ;    contentPane.add(jButton);

		    pack();    setVisible(true);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  }
		  public static void main(String[] args) {   new HTMLDemo("Hello");  }
		}

	

