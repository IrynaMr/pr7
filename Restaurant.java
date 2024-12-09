public class Restaurant {
    private int availableTables;
    public Restaurant(int tables) {
        this.availableTables = tables;
    }
    public synchronized void reserveTable(String clientName) {
        System.out.println(clientName + " намагається забронювати столик.");
        if (availableTables > 0) {
            availableTables--;
            System.out.println(clientName + " успішно забронював столик. Доступно столиків: " + availableTables);
        } else {
            System.out.println(clientName + " не вдалося забронювати столик. Всі столики зайняті.");
        }
    }
}
