public class Student {
    private String name;
    private int id;
    private int grade;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {

        if (grade < 0 && grade > 20) {
            throw new IllegalArgumentException("Le grade doit être comprise en 0 et 20");
        }
        this.grade = grade;
    }

    public boolean isPassing() {
        if (grade >= 10) {
            return true;
        } else {
            return false;

        }
    }
}



