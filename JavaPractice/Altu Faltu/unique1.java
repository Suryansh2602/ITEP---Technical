class Student implements Comparable {
    private int Id, age;
    private String name;

    @Override
    public String toString() {
        hashCode();
        return "{" +
                " Id='" + Id + "'" +
                ", age='" + age + "'" +
                ", name='" + name + "'" +
                "}\n";
    }

    public Student(int Id, int age, String name) {
        this.Id = Id;
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public int hashCode() {
        return Id;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return (this.Id == s.Id);

    }

    @Override
    public int compareTo(Object o) {
        
        int diff = 
        return diff;
    }

}