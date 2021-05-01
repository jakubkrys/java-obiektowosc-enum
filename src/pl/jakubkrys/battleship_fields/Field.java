package pl.jakubkrys.battleship_fields;

public class Field {

    private int x;
    private int y;
    private Status status;

    public Field(int x, int y, Status status) {
        this.x = x;
        this.y = y;
        this.status = status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
