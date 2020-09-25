package uaslp.enginering.exam.model;

public class Room {
    private int number;
    private String algo;
    private RoomStatus roomStatus;

    public Room(int number,String algo,RoomStatus roomStatus){
        this.number = number;
        this.algo = algo;
        this.roomStatus  = roomStatus;
    }

    public int getNumber(){
        return number;
    }

    public RoomStatus getStatus(){
        return roomStatus;
    }
}
