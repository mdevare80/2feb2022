import java.awt.*;
import java.awt.event.*;
class FirstUI extends Frame implements WindowListener, ActionListener
{
    Button b1;
    GridLayout g1;  
    Label l1, l2;
    TextField tf;
    FirstUI()
    {
        setTitle("First UI Interface WIndow");
        setSize(500,500);
        g1=new GridLayout(2,2);  //2 rows 2 columns
        setLayout(g1);
        l1=new Label("Enter your name");
        add(l1);
        tf=new TextField();
        add(tf);
        b1=new Button("OK");
        add(b1);
        l2=new Label();
        add(l2);
        b1.addActionListener(this); //this means the window
        addWindowListener(this); //to connect FirstUI to WindowListener
        show();
    }
    public void actionPerformed(ActionEvent e1)
    {
        System.out.println("You clicked on the button");
        String str=tf.getText();
        l2.setText(str); 
        System.out.println(str);
    }
    public static void main(String args[])
    {
        FirstUI f=new FirstUI();
    }
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Window Deactivated");
    }
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Window Activated");
    }
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Window Deiconified");
    }
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Window Iconified");
    }
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Window Opened");
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Window Closed");
    }
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window Closing");
        System.exit(0);
    }
}