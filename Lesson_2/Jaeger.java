public class Jaeger {

    private String nickname;
    private String mark;
    private String origin;
    private String typeWeapon;
    private double height;
    private double weight;

    public Jaeger(String nickname, String mark, String origin, double height, double weight, 
                String typeWeapon) {
        this.nickname = nickname;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.typeWeapon = typeWeapon;
    }
    public Jaeger() {}

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void shoot() {
        System.out.println("Робот стреляет " + getTypeWeapon());
    }

    public void go() {
        System.out.println("Идти");
    }

    public void run() {
        System.out.println("Бежать");
    }

    public void jump() {
        System.out.println("Прыжок");
    }

    public void handStrike() {
        System.out.println(getNickname() + " наносит удар рукой");
    }

    public void kick() {
        System.out.println(getNickname() + " бьет ногой");
    }

    public void take() {
        System.out.println("Взять");
    }
}