
class Course {
    ArrayList<Student> students;

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int index) {
        ArrayList<Student> studentsNew = this.students;
        studentsNew.remove(index);
        this.students = studentsNew;
    }

    public List<Integer> getPointsFromStudent(int index) {
        Student stu = students.get(index);
        return stu.getLabPoints();
    }

    public double getAverageFromAll() {
        //TODO
        double avg = 0.0;
        for (Student student : students) {
            avg += student.getLabPoints().stream().mapToDouble(a -> a).average().orElse(0.0);
        }
        return avg / students.size();
    }

    public void getAllPoints() {
        for (Student stu : students) {
            System.out.println(stu.getFirstName() + " " + stu.getLastName() + " " + stu.getLabPoints());
        }
    }

}