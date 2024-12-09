public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(3);
        Thread client1 = new ClientThread(restaurant, "Клієнт 1");
        Thread client2 = new ClientThread(restaurant, "Клієнт 2");
        Thread client3 = new ClientThread(restaurant, "Клієнт 3");
        Thread client4 = new ClientThread(restaurant, "Клієнт 4");

        client1.start();
        client2.start();
        client3.start();
        client4.start();
    }
}

