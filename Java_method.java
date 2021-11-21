import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.Label;
import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.Button;

 public class Java_method extends Applet implements ActionListener{
      TextField text1,text2,text3,text4,text5,text6,text7,text8,output;
      Label label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,title;
      Button button1,button2,button3,clear;
      
   public void init(){
    setLayout(null);
    title = new Label("string method demonstration");
    title.setBounds(80,10,240,20);
    add(title);
    title.setAlignment(title.CENTER);

        label1 = new Label("enter original string to cancatinate");
        label1.setBounds(20,50,200,20);
        add(label1);

        text1 = new TextField(20);
        text1.setBounds(250,50,200,20);
        add(text1);

        label2 = new Label("Enter to cocat with original string");
        label2.setBounds(20,90,200,20);
        add(label2);

        text2 = new TextField(20);
        text2.setBounds(250,90,200,20);
        add(text2);
        
           label3 = new Label("Enter original string for replacement");
        label3.setBounds(20,130,200,20);
        add(label3);

        text3 = new TextField(20);
        text3.setBounds(250,130,200,20);
        add(text3);
        
           label4 = new Label("Enter substring that to be replaced");
        label4.setBounds(20,170,200,20);
        add(label4);

        text4 = new TextField(20);
        text4.setBounds(250,170,200,20);
        add(text4);
        
           label5 = new Label("Enter subsring what to be replaced");
        label5.setBounds(20,210,200,20);
        add(label5);

        text5 = new TextField(20);
        text5.setBounds(250,210,200,20);
        add(text5);
        
        label6 = new Label("Enter string for substing illustration");
        label6.setBounds(20,250,200,20);
        add(label6);

        text6 = new TextField(20);
        text6.setBounds(250,250,200,20);
        add(text6);
        
        label7 = new Label("Enter start index of substring");
        label7.setBounds(20,290,200,20);
        add(label7);

        text7 = new TextField(20);
        text7.setBounds(250,290,200,20);
        add(text7);
        
        label8 = new Label("Enter last index of substring");
        label8.setBounds(20,330,200,20);
        add(label8);

        text8 = new TextField(20);
        text8.setBounds(250,330,200,20);
        add(text8);

        label10 = new Label("output : ");
        label10.setBounds(20,370,130,20);
        add(label10);
        
    

        output = new TextField(5);
        output.setBounds(150,410,200,20);
        add(output);

        button1 = new Button ("concat");
        button1.setBounds(50,450,200,20);
        add(button1);
        
        button2 = new Button("replace");
        button2.setBounds(50,490,200,20);
        add(button2);
        
        button3 = new Button("substring");
        button3.setBounds(50,530,200,20);
        add(button3);

        clear = new Button("Clear");
        clear.setBounds(280,570,100,20);
        add(clear);

        button1.addActionListener(this);
         button2.addActionListener(this);
         button3.addActionListener(this);
        clear.addActionListener(this);


        }
        public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== button1)
        {
            text1.requestFocus();
            String str1,str2;
            str1=text1.getText();
            text2.requestFocus();
            str2=text2.getText();
            String concat;
            concat=str1.concat(str2);
           output.setText(concat);
        }
        if(ae.getSource()== button2)
        {
            text3.requestFocus();
            String orig,str1,str2;
            orig=text3.getText();
            text4.requestFocus();
            str1=text4.getText();
            text5.requestFocus();
            str2=text5.getText();
            String replace;
            replace=orig.replace(str1,str2);
           output.setText(replace);
        }
        if(ae.getSource()== button3)
        {
            text6.requestFocus();
            String orig;
            int i,j;
            orig=text6.getText();
            text7.requestFocus();
            i=Integer.parseInt(text7.getText());
            text8.requestFocus();
            j=Integer.parseInt(text8.getText());
            String o;
            o=orig.substring(i,j);
           output.setText(o);
        }
   if(ae.getSource() == clear)
   {
     text1.setText(" ");
     text2.setText(" ");
     text3.setText(" ");
     text4.setText(" ");
     text5.setText(" ");
     text6.setText(" ");
     text7.setText(" ");
     text8.setText(" ");
      output.setText(" ");
      text1.requestFocus();
    }
  }
      
}
