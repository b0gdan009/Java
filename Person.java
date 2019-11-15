public class Person {
    String name;
    int age;
    int height;
    int stamina;

    public void run(){
        stamina--;
    }
    public void sleep(){
        stamina +=12;
    }
    public boolean isMajor(){
        return age >= 18 ? true : false;
        if (age >= 18) {
            return true;
        }else  (age < 18); {
            return false;
        }
    }

    public int getAge() {
        return age;
    }

    public String whatsYoureName() {
        return name;


    }



    }
