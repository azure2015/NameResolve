package com.flipfrogsoftware;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String host;
        Scanner hostname = new Scanner(System.in);
        System.out.println("\nPlease enter host name : ");

        host = hostname.nextLine();
        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println("IP Address : " + address.getHostAddress());
            System.out.println("Host Name : " + address.getHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
