public class ClientThread extends Thread {
    private final Restaurant restaurant;
    private final String clientName;
    public ClientThread(Restaurant restaurant, String clientName) {
        this.restaurant = restaurant;
        this.clientName = clientName;
    }
    @Override
    public void run() {
        restaurant.reserveTable(clientName);
    }
}