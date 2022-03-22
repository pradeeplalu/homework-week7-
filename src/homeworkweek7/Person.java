package homeworkweek7;

public class Person {
    //instance variables
    String firstName;
    String lastName;
    int age;

    //instance method - With return no parameters

    public String getFirstName() {
        return firstName;
    }
    //With return no parameters

    public String getLastName() {
        return lastName;
    }
    //With return no parameters

    public int getAge() {
        return age;
    }
    //No return with parameters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //No return with parameters

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //No return with parameters

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    //without parameters

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }
    //without parameters

    public String getFullName() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else {
            return firstName + " " + lastName;
        }
    }
    //main method

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}



