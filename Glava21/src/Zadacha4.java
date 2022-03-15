public class Zadacha4 {

    // public String toString()
    //Returns a string representation of the object. In general, the toString method returns a string that "textually represents" this object. The result should be a concise but informative representation that is easy for a person to read. It is recommended that all subclasses override this method.
    //The toString method for class Object returns a string consisting of the name of the class of which the object is an instance, the at-sign character `@', and the unsigned hexadecimal representation of the hash code of the object. In other words, this method returns a string equal to the value of:
    //
    // getClass().getName() + '@' + Integer.toHexString(hashCode())
    //
    //Returns:
    //a string representation of the object.

    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}

  // JavaBeans - getters and setters
  // They should be public
 // Setter method should be prefixed with set(setName). The return-type should be void
 // It should take some argument.

 // Getter method should be prefixed with get(getName). The return-type should not be void.
// It should not take any argument.,