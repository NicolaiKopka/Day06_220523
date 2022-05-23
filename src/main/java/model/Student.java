package model;

class Student {
    private String name;
    private int id;
    private String email;

    Student (String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    String getEmail() {
        return email;
    }

    public String toString() {
        return name + " " + id + " " + email;
    }


}
