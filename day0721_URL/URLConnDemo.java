package day0721_URL;

import java.net.*;
import java.io.*;

public class URLConnDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://vip.zgxmall.com/login/login");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            if (urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("Please enter an HTTP URL.");
                return;
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String urlString = "";
            String current;
            while ((current = in.readLine()) != null){
                urlString += current;
            }
            System.out.println(urlString);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
