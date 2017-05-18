import java.util.ArrayList;
import java.util.List;

public class Gosiwon {
	private List<Room>rooms = new ArrayList<Room>();
	
	public Gosiwon() {
		System.out.println("绊矫盔 积己");
		int i;
		for(i=1;i<=10;i++)
			rooms.add(new Room(i));
		System.out.println("room "+--i+"俺 积己");
	}
	
	public List<Room> getRooms() {

		return rooms;
	}

}
