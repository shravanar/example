package com.github.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

@Component
public class DemoService {

    @PostConstruct
    public void init(){
        try {
            System.out.println(InetAddress.getLocalHost());
            System.out.println(InetAddress.getLoopbackAddress());
            Enumeration<NetworkInterface> networkInterface = NetworkInterface.getNetworkInterfaces();
            while (networkInterface.hasMoreElements()) {
                System.out.println(networkInterface.nextElement());
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
}
