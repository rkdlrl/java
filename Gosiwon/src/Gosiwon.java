import java.util.ArrayList;
import java.util.List;

public class Gosiwon {
	private List<Room>rooms = new ArrayList<Room>();
	
	public Gosiwon() {
		System.out.println("��ÿ� ����");
		int i;
		for(i=1;i<=10;i++)
			rooms.add(new Room(i));
		System.out.println("room "+--i+"�� ����");
	}
	
	public List<Room> getRooms() {

		return rooms;
	}

}
