import java.net.*;
import java.io.*;
import java.lang.Exception;

public class Whois {
    public static void main(String[] args) throws Exception{
        int c;

        Socket s=new Socket("Whois.internic.net",43);
        InputStream in=s.getInputStream();
        OutputStream out=s.getOutputStream();

        String str=(args.length==0 ?"codeandhire.com":args[0])+"\n";
        byte buf[]=str.getBytes();
        out.write(buf);

        while((c=in.read())!=-1){
            System.out.print((char) c);
        }
        s.close();
    }
}