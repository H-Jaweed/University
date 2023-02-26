public class Teacher {
    private int ID;
    private String name;
    private String surname;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        return ID++;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
