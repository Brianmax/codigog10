package statics;

public class Main {
    public static void main(String[] args) {
        User u = new User(
                "george",
                "1234",
                "george@gmail.com");

        User u2 = new User(
                "george",
                "1234",
                "george@gmail.com");

        User.counter++;
        u.counter++;

        System.out.println(u2.counter);

        User.suma(5, 6);
        u.suma(2,3);

    }
}
