public class VicePresident extends Manager {
    // Interitance/ child class >> turunan class dari parent class dari Manager
    
    // Method overriding : mendkelarasikan ulang method dari parent class ke clid class dengan param dan return yang harus sama dengan parent class.
    // dapat memberikan output yang berbeda.
    void sayHello(String name){
        System.out.println("Hallo "+ name + ",nama saya Vice President " + this.name);
    }
}
