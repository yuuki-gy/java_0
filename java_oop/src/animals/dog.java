package animals;

public class dog {
    String name;
    int age;
    String color;
    public void bark(){
        System.out.println("Bark bark,my name is" + name);
    }


    public dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
