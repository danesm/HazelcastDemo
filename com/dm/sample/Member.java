/*
 * This is Member App which will be running on 10 nodes. 
 * It will also configure hazelcast instance for Mancenter so all nodes can be managed via Hazelcast management center.
 */

package com.dm.sample;

import java.util.Map;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class Member {
	
	
	
public static void main(String[] args) {
		
		try { 
		
		
		Config config = new Config();		
		config.getManagementCenterConfig()
		      .setEnabled(true)
		      .setUrl("http://localhost:8080/hazelcast-mancenter");
		      
		
		HazelcastInstance hzi = Hazelcast.newHazelcastInstance(config);
		
		Map<Integer, String> membermap = hzi.getMap("MemberMap");
		
		
		if (membermap.size()<1) {	
		
		  System.out.println("!!!!!!!!!!!!!!!!We are started!!!!!!!!!!!!!!!!");
		  membermap.put(1,"Starting Member");		  
		  //Sleep for 2 seconds.
		  //Thread.sleep(2000);
		  }
		else
			{System.out.println("!!!!!!!!!!!!!!!!I have joined!!!!!!!!!!!!!!!!!");		
			
			}
		} 
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}		

}
