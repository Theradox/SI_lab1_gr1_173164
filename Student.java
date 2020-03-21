class Student {
    String index;
    String firstName;
    String lastName;
    List<Integer> labPoints;

    //TODO constructor

    public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.labPoints = labPoints;
    }


    //TODO seters & getters


    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getLabPoints() {
        return labPoints;
    }

    public void setLabPoints(List<Integer> labPoints) {
        this.labPoints = labPoints;
    }

    public double getAverage() {
        //TODO
        return this.labPoints.stream().mapToDouble(a -> a).average().orElse(0.0);
    }

    public boolean hasSignature() {
        //TODO
        return this.labPoints.stream().mapToInt(a -> a).count() > 8;
    }
}
