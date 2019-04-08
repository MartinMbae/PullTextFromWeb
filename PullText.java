package pulltext;

import java.io.*;
import java.net.*;

public class PullText {

  
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        URL ir = new URL("https://searchnetworking.techtarget.com/tip/Security-and-the-TCP-IP-stack");
        URLConnection con = ir.openConnection();
        InputStream in = con.getInputStream();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        
        String line = null;
        
        while((line=br.readLine()) != null){
            System.out.println(line);
        }
        
        
        
    }
    
}
