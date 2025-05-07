class Courses{
    int[] sub = new int[3];

    Courses(int[] sub) {
        this.sub = sub;
    }

    public void getMarks(){
        for(int i=0; i<sub.length; i++){
            if(sub[i] <= 40){
                System.out.println("Subject " + (i+1) + ": " + sub[i]);
            }
        }
    }
}

public class Student {
    String name, program, course;
    int sem;
    
    Student(String name, String program, int sem) {
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
        Student student1 = new Student("Bharat", "Computer Science", 2);
        student1.display();

        Courses courses1 = new Courses(new int[]{45, 30, 50});
        System.out.println("Marks in subjects below 40:");
        courses1.getMarks();
    }
}