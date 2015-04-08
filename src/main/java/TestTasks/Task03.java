package TestTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Student on 4/8/2015.
 * Составить регулярное выражение, определяющее является ли заданная
 строка IP адресом, записанным в десятичном виде(255.255.255.0).
 */
public class Task03 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input text (IP address):");
        String inputString = "";
        try{
            inputString = reader.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        String validIpAddressRegex = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
        if (inputString.matches(validIpAddressRegex)) {
            System.out.println("Looks like IP address");
        }
        else System.out.println("It is not IP address");
    }
}
