public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf("female", "Barbara", 50, 5, "grey");
        System.out.println(wolf.gender + ", " + wolf.nickname + ", "
                + wolf.weight + ", " + wolf.age + ", " + wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}