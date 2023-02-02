package Users.gennadykudryavtsev.Desktop.MyCode.StartJava.src.com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger mark1 = new Jaeger();
        Jaeger mark2 = new Jaeger("Альфа", "Mark2", "RUS", 85.34, 2.412, "Ракетой");

        mark1.setNickname("Бродяга");
        mark1.setMark("Mark1");
        mark1.setOrigin("USA");
        mark1.setHeight(79.25);
        mark1.setWeight(1.98);
        mark1.setTypeWeapon("Бластером");
        
        mark1.shoot();
        mark1.run();
        mark1.handStrike();
        mark1.jump();
        mark1.kick();
        System.out.println();
        mark2.jump();
        mark2.shoot();
        mark2.kick();
        mark2.run();
        mark2.handStrike();
        mark2.setTypeWeapon("Из пулемета");
        mark2.shoot();
    } 
}