/*import java.io.*;
import java.net.*;
public class MyClient
{
public static void main(String[] args)
{
try
{
Socket s=new Socket("localhost",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF("Hello Server");
dout.flush();
dout.close();
s.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}*/


/*import java.io.*;
import java.net.*;
public class MyClient
{
public static void main(String[] args)
{
try
{
Socket s=new Socket("localhost",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
DataInputStream dis=new DataInputStream(s.getInputStream());
dout.writeUTF("Hello Server");
String str=(String)dis.readUTF();
System.out.println("String Echo from Server= "+str);
dout.flush();
dout.close();
s.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}*/


/*import java.io.*;
import java.net.*;
public class MyClient
{
public static void main(String[] args)
{
try
{
Socket s=new Socket("localhost",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
int a=6;
int b=4 ;
dout.writeInt(a); 
dout.writeInt(b) ;
dout.flush();
DataInputStream dis=new DataInputStream(s.getInputStream());
int sum=(int)dis.readInt();
System.out.println(sum);
dout.close();
s.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}*/



import java.io.*;
import java.net.*;
public class MyClient
{
public static void main(String[] args)
{
try
{
Socket s=new Socket("localhost",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
int a=6;
dout.writeInt(a);
dout.flush();
DataInputStream dis=new DataInputStream(s.getInputStream());
int fact=(int)dis.readInt();
System.out.println(fact);
dout.close();
s.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
