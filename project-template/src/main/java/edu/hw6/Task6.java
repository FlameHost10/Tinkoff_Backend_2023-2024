package edu.hw6;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6 {

    private static final Map<Integer, String> portsInfo = Map.of(
        137, "NBNS",
        138, "NetBIOS",
        500, "isakmp",
        1900, "SSDP",
        3702, "ws-discovery",
        5353, "mdns",
        5355, "llmnr"

    );

    private static final List<Integer> ports = List.of(137, 138, 500, 1900, 3702, 5353, 5355, 4500, 2372, 2221);


    public static ArrayList<String[]> portAnalysis(){
        ArrayList<String[]> info = new ArrayList<>();

        DatagramSocket datagramSocket;

        for(var port:ports){
            String[] portInfo = new String[2];
            portInfo[0] = String.valueOf(port);

            try {
                datagramSocket = new DatagramSocket(port);
                portInfo[1] = "Port open";
                datagramSocket.close();

            } catch (SocketException e) {
                portInfo[1] = portsInfo.getOrDefault(port, "");
            }
            info.add(portInfo);
        }

        return info;
    }
}
