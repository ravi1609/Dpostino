package com.dpostino.utility;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Component
public class IpAddress {

	/**
	 * @author JDEVS
	 */
	
	// logger initialization
	
	private static final Logger logger=Logger.getLogger(IpAddress.class);
	
	
	private static HttpServletRequest request;

    @Autowired
    public  void setRequest(HttpServletRequest request) {
        this.request = request;
    }

	private static final long serialVersionUID = 1L;
//private static	 NetworkInterface network;

//private static InetAddress ip1;

	public static String getIp()
	{
		  String remoteAddr = "";

		  logger.info(request+"....."+request.getRemoteAddr()+"......"+request.getHeader("X-FORWARDED-FOR"));
	        if (request != null) {
	            remoteAddr = request.getHeader("X-FORWARDED-FOR");
	            if (remoteAddr == null || "".equals(remoteAddr)) {
	                remoteAddr = request.getRemoteAddr();
	            }
	        }
	    //    getClientIp(request);
  logger.info("the ipaddress is ..."+remoteAddr);
	        return remoteAddr;
	}
	
	
	
	/*private static String getClientIp(HttpServletRequest request1) {

        String remoteAddr = "";

        if (request1 != null) {
            remoteAddr = request1.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request1.getRemoteAddr();
            }
        }
       logger.info("second...."+remoteAddr); 
        return remoteAddr;
    }
	*/
	
	
	/*private static String mac;
	private static byte[] mac1;
		public static String getMac(){
			  StringBuilder sb = new StringBuilder();
			 
			try {
				ip1 = InetAddress.getLocalHost();
				// network = NetworkInterface.getByInetAddress(ip1);
				//   mac1 = network.getHardwareAddress(); 
				  
				
			        for (int i = 0; i < mac1.length; i++) {
			         sb.append(String.format("%02X%s", mac1[i], (i < mac1.length - 1) ? "-" : ""));        
			        }
			       mac=sb.toString();
			} catch (UnknownHostException e) 
			{
		
			}
			return mac;
	}*/
	
}


///////////////////////////
/*
InetAddress addr = InetAddress.getByName(clientIP);
NetworkInterface ni = NetworkInterface.getByInetAddress(addr);

        if (ni == null)
        {
            throw new SocketException("Cannot reach the host ##"+clientIP+"."); // Throws exception here for REMOTE Host or CLient
        }

byte[] macAddrs = ni.getHardwareAddress();

if (macAddrs == null) {
            throw new UnknownHostException("Host IP Adrress Lookup Failed...");
        }

        for (int k = 0; k < macAddrs.length; k++) {
            String macValue = String.format("%02X%s", macAddrs[k], (k < macAddrs.length - 1) ? "-" : "");
            macAddress.append(macValue);
        }
        
     */