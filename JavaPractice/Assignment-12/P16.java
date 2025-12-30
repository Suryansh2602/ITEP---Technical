//  Student Management System

// You are fetching student data from a database. If the record is not found:

// Will you return null or throw a RecordNotFoundException?

// Which approach is better and why?

class RecordNotFoundException extends Exception {
    public RecordNotFoundException(String msg) {
        super(msg);
    }
}

class Student {
    private int Id;
    private String name;

    public Student(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String toString() {
        return "Student{id=" + Id + ", name='" + name + "'}";
    }
}

class StudentDatabase {
    private static Student[] students = {
            new Student(1, "Suryansh"),
            new Student(0, null)
    };

    public static Student getStudentById(int id) throws RecordNotFoundException {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new RecordNotFoundException("Student with id " + id + " not found.");
    }
}

class StudentManagementException {
    public static void main(String[] args) {
        try {
            Student student = StudentDatabase.getStudentById(3);
            System.out.println(student);
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}