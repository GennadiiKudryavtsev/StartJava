public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf("female", "Barbara", 50, 5, "grey");   
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();

        wolf.setGender("male");
        wolf.setNickname("Boris");
        wolf.setWeight(60);
        wolf.setAge(12);
        wolf.setColor("white");

        wolf.getGender();
        wolf.getNickname();
        wolf.getWeight();
        wolf.getAge();
        wolf.getColor();
        System.out.println(wolf.getGender() + ", " + wolf.getNickname() + ", " 
                + wolf.getWeight() + ", " + wolf.getAge() + ", " + wolf.getColor());
    }
}