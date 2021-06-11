public class Person {
    String fullname;
    Integer Age;


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }


    public Person(){

    }


    public Integer displayAge(){

       return Age;
    }


    public String displayName(){

        return fullname;
    }


}
