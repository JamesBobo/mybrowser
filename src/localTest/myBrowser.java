package localTest;

import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.ActionListener;

import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class myBrowser implements ActionListener, HyperlinkListener {
	JLabel msgLbl;
	JTextField urlText;  //给用户输入URL
	JEditorPane content;  //显示网页内容
	JScrollPane JSPanel;
	JPanel panel;
	Container con;
	JFrame mainJframe;
	public myBrowser(){
		mainJframe=new JFrame("我的浏览器");
		mainJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con=mainJframe.getContentPane();
		msgLbl=new JLabel("输入地址：");
		urlText=new JTextField();
		urlText.setColumns(20);
		urlText.addActionListener(this);
		panel=new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(msgLbl);
		panel.add(urlText);

		content=new JEditorPane();
		content.setEditable(false);
		//为content添加超链接事件监听器
		content.addHyperlinkListener(this);
		JSPanel=new JScrollPane(content);

		con.add(panel,BorderLayout.NORTH);
		con.add(JSPanel,BorderLayout.CENTER);
		mainJframe.setSize(800,600);
		mainJframe.setVisible(true);
		mainJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		//当用户按下回车键后，调用此方法
		public void actionPerformed(ActionEvent e){
		try{
		//根据用户输入构造URL对象
		URL url=new URL(urlText.getText());
		//获取网页内容并显示
		content.setPage(url);
		}catch (MalformedURLException el){
		System.out.println(e.toString());
		}catch(IOException el){
		JOptionPane.showMessageDialog(mainJframe,"连接错误");
		}
		}
	@Override
	public void hyperlinkUpdate(HyperlinkEvent e) {
		// TODO 自动生成的方法存根
		if(e.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
			try{
			URL url=e.getURL();         //获取用户点击的URL
			content.setPage(url);      //跳转到新页面
			urlText.setText(e.getURL().toString()); //更新用户输入框中的URL
			}catch (MalformedURLException el){
			System.out.println(e.toString());
			}catch(IOException el){
			JOptionPane.showMessageDialog(mainJframe,"连接错误");
	}

		}
		}	
		public static void main(String[] args) {
			new myBrowser();
			}
}
