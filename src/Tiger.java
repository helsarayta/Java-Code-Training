public class Tiger {

    Animal animal;

    public Tiger(){}

    public Tiger(Animal animal) {
        this.animal = animal;
    }

    public String getFeet(int feet) {
        return animal.getFeet(feet);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger(new Animal());
        System.out.println(tiger.getFeet(4));
    }
}
