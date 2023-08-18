public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Made";
        manager.sayHello("Nyoman");

        // pewarisan : deklarasi dilakukan di parent class dan clild class 
        // dapat mengakses semua field dan method yang dimiliki oleh parent class
        var vp = new VicePresident();
        vp.name = "Nyoman";
        vp.sayHello("Made");
    }
}
