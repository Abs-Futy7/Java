package properties.encapsulation;

public class Person {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Public getter and setter methods (control access to data)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {  // Validate age before setting
            this.age = age;
        }
    }
}

/*
 * In this example, the Person class encapsulates the name and age variables.
 * Direct access to them is prevented by making them private, and controlled access is provided
 * through the getter and setter methods.
 */
