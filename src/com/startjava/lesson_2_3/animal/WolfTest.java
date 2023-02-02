package Users.gennadykudryavtsev.Desktop.MyCode.StartJava.src.com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();  
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();

        wolf.setGender("male");
        wolf.setNickname("Boris");
        wolf.setWeight(60);
        wolf.setAge(7);
        wolf.setColor("white");

        System.out.println(wolf.getGender() + ", " + wolf.getNickname() + ", "
                + wolf.getWeight() + ", " + wolf.getAge() + ", " + wolf.getColor());
    }
}