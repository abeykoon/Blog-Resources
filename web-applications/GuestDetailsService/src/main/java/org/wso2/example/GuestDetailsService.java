package org.wso2.example;

import java.util.HashMap;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType; 

import org.wso2.example.Guest;

@Path("/guestDetailService")
public class GuestDetailsService {
	
	private HashMap<String, Guest> guests;
	
	public GuestDetailsService() {
		guests = new HashMap<String, Guest>(5);
		init();
	}
 
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Path("/guestInfo/{id}/")
	public Guest getGuestDetial(@PathParam("id") String id) {
		Guest guest = guests.get(id);
		return guest;
	}
	 
	 private final void init() {
		Guest g1 = new Guest();
		g1.setGender("male");
		g1.setGuestID("tom");
		g1.setRoomNumber("200");
		g1.setTpNumber("1312434554");
		
		guests.put("tom", g1);
		
		Guest g2 = new Guest();
		g2.setGender("female");
		g2.setGuestID("alice");
		g2.setRoomNumber("300");
		g2.setTpNumber("4578183845");
		
		guests.put("alice", g2);
		
		Guest g3 = new Guest();
		g3.setGender("male");
		g3.setGuestID("bob");
		g3.setRoomNumber("142");
		g3.setTpNumber("4556499200");
		
		guests.put("bob", g3);
		
		Guest g4 = new Guest();
		g4.setGender("female");
		g4.setGuestID("nalatia");
		g4.setRoomNumber("432");
		g4.setTpNumber("97065903145");
		
		guests.put("nalatia", g4);
		
		
		Guest g5 = new Guest();
		g5.setGender("male");
		g5.setGuestID("smith");
		g5.setRoomNumber("123");
		g5.setTpNumber("450948313182");
		
		guests.put("smith", g5);
		
		
	 }

}

