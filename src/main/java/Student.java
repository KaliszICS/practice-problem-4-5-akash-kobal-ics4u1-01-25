public class Student {
    String name;
    int age;
    String studentNumber;
    
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return this.name;
    }
     
    public int getAge() {
        return this.age;
    }
    public String getStudentNumber() {
        return this.studentNumber;
    }
    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

	@Override
	public boolean equals(Object obj) { 
		if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
    	Student other = (Student)obj;
        return this.studentNumber.equals(other.studentNumber);
	}
}
