public class Students {
    String name, program, course;
    int sem;
    
    Students(String name, String program, int sem) {
        this.name = name;
        this.program = program;
        this.sem = sem;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + sem);
    }

    public static void main(String[] args) {
        Students student1 = new Students("Bharat", "Computer Science", 2);
        student1.display();
    }
}