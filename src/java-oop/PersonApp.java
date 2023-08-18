public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Dimas A Yudhana", "Bandung");
        // person1.name = "Dimas A Yudhana";
        // person1.address = "Bandung";
        // person1.country = "tidak dapat diubah"; // cannot assign a value to final variable 
        Person person2 = new Person();
        person2.name = "Nyoman";
        Person person3;
        // karena da 3 pilihan constructor yang berbeda maka dapat digunakan.
        person3 = new Person("Wayan");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Zalai"); // Hello Zalai, My name is Dimas A Yudhana

        System.out.println(person2.name);

        System.out.println(person3);
        person3.sayHello("Made"); // Hello Made, My name is null
        // setelah param diisi secara paksa oleh constructor maka hasilnya 
        // Hello Made, My name is Wayan
    }
}
