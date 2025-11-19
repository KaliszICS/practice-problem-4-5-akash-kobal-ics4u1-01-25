/**
 * Represents a student with a name, age, and student number.
 */
public class Student {
    String name;
    int age;
    String studentNumber;

    /**
     * Creates a new Student with the given name, age, and student number.
     *
     * @param name           the student's name
     * @param age            the student's age
     * @param studentNumber  the student's unique student number
     */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * Returns the student's name.
     *
     * @return the name of the student
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the student's age.
     *
     * @return the age of the student
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Returns the student's student number.
     *
     * @return the student number
     */
    public String getStudentNumber() {
        return this.studentNumber;
    }

    /**
     * Returns a string representation of the student in the format:
     * "name, age - studentNumber".
     *
     * @return a formatted string describing the student
     */
    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

    /**
     * Determines whether this student is equal to another object.
     * Two students are considered equal when their student numbers match.
     *
     * @param obj the object to compare with
     * @return true if the student numbers are the same; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return this.studentNumber.equals(other.studentNumber);
    }
}
