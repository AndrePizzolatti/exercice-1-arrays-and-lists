package entities;

public class Rent {
    private String name;
    private String email;
    private int room;

    public Rent(java.lang.String name, java.lang.String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return room + ": " + name + ", " + email;
    }
}
