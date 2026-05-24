package edu.sdccd.cisc191;

public class Student {
    private String name;
    private double gpa;
    private int id;

    public Student(String name, double gpa, int id) {
        setName(name);
        setGpa(gpa);
        setId(id);
    }

    public String getName() { return name; }
    public double getGpa()  { return gpa; }
    public int getId()      { return id; }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name.trim();
    }

    private void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
        }
        this.gpa = gpa;
    }

    private void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be a positive integer.");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', gpa=%.2f}", id, name, gpa);
    }
}
