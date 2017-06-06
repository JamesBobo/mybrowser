package localTest;

import java.net.*;
import java.sql.Date;
import java.io.*; 
 public class LocalTest { 
     public static void main(String[] args) throws Exception { 
     int c;
     try
     {
     URL url=new URL("http://www.baidu.com");
     try{
     URLConnection urlcon=url.openConnection();
     System.out.println("content length:"+urlcon.getContentLength());
     System.out.println("content type:"+urlcon.getContentType());
     System.out.println("the date is:"+new Date(urlcon.getDate()));
     System.out.println("the lastmodified date is:"+new Date(urlcon.getLastModified()));
     InputStream in = urlcon.getInputStream();
     while (((c=in.read())!=-1))
     {
     System.out.print((char)c);
     }
     }
     catch(IOException e)
     {
     e.printStackTrace();}
     }
     catch(MalformedURLException e)
     {
     e.printStackTrace();}
     }
 
     } 
