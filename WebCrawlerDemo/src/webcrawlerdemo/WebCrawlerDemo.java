/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcrawlerdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author rahul
 */
public class WebCrawlerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
			URL my_url = new URL("http://www.showmelocal.com/profile.aspx?bid=22223213");
			BufferedReader br = new BufferedReader(new InputStreamReader(my_url.openStream()));
			String strTemp = "";
			while(null != (strTemp = br.readLine())){
			System.out.println(strTemp);
		}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
    }
    
}
