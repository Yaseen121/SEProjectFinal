package roomallocationprototype;

public class Guest extends NonAdmin {
	
	public Guest(int id) {
		//Same as staff or student?
		super(id, 1);
	}
	
	public void requestBooking(String startDateTime, int roomid) {
		this.getDB().execute("INSERT INTO bookingrequests (ID, ROOMID, USERID, startTime, OPEN) VALUES (NULL, \'" + roomid + "\', \'"+this.getID() + "\', \'"+startDateTime+"\', \'1\')");
	}

	public void joinQueue() {
		// TODO Auto-generated method stub
		
	}

	public void manageQueues() {
		// TODO Auto-generated method stub
		
	}

	public void leaveQueue() {
		// TODO Auto-generated method stub
		
	}
}
