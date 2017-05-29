
public class Person {
	int myRoomNumber;
	
	public Person() {
		System.out.println("사람 생성");
	}
	public void findMyRoom(Owner owner) {
		Room room = owner.showEmptyRoom();
		while(true) {
			if(room.getRoomNumber() == 105) {
				myRoomNumber = room.getRoomNumber();
				break;
			}
			else
				room = owner.showNextEmptyRoom();
		}
	}
	public void contract(Owner owner) {
		owner.contractRoom(myRoomNumber);
	}
}
