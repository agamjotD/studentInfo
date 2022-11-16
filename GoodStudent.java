public class GoodStudent {
    private String firstName;
    private String lastName;
    private int idNum;
    private double gpaNum;
    boolean cssStudent;

    //constructor
    public GoodStudent(String firstName, String lastName, int idNum, double gpaNum, boolean cssStudent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.gpaNum = gpaNum;
        this.cssStudent = cssStudent;
    }

    //Overload Constructor
    public GoodStudent()
    {
        firstName = "First Name Goes Here";
        lastName = "Last Name Goes Here";
        idNum = 0;
        gpaNum = 0.0;
        cssStudent = true;
    }

    public String createID() {
        String newFirst = firstName.toLowerCase();
        int lastThree = idNum % 1000;
        return newFirst.charAt(0) + lastName.toLowerCase() + lastThree;

    }

    public double CSGPA() {
        double updateGPA = gpaNum + .60;
        if (cssStudent)
            return  + updateGPA;
        else
            return gpaNum;

    }

    //Setters & Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public double getUpdatedGPA() {
        return gpaNum;
    }
    public int getID() {
        return idNum;
    }

    public void setNewGPA(double updateGPA) {
        this.gpaNum = updateGPA;
        System.out.println("UPDATED GPA: " + gpaNum);

    }

    public void setNewID(int newID) {
        this.idNum = newID;
        System.out.println("UPDATED ID: " + idNum);

    }
    public double getGPA() {
        return gpaNum;
    }

    public boolean getStudent() {
        return cssStudent;
    }

    public String toString() {
        String output = "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nID Number: " + idNum +
                "\nGPA: " + gpaNum +
                "\nCS Student: " + cssStudent;

        return output;
    }
}

