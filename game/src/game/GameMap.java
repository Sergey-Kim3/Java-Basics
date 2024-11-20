package game;

public class GameMap {
    private int roomArray[][];
    private int arraySizeOne;
    private Room room;
    GameMap(int sizeOne)
    {
        this.arraySizeOne = sizeOne;
        roomArray = new int[sizeOne][sizeOne];
    }
}
