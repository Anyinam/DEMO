public class Person{ 
    public String name; // private = restricted access

  // Getter
    public String getName() {
        return name;
    }

  // Setter
    public void setName(String newName) {
        this.name = newName;
    }
 
}

//Instead, we use the getName() and setName() methods to access and update the variable: