class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor
    Person(String name, String address) {
        // daripada kedepnannya akan muncul duplikasi code jika dibiasakan seperti ini, 
        // maka gunakan keyword this untuk memanggil constructor lain.
        // name = paramName;
        // address = paramAddress;
        this.name = name;
        this.address = address;
    }

    // membuat constructor overloading
    // variable param shadowing, menutupi field yang ada di class tersebut.
    Person(String paramName) {
        // name = paramName;
        // constructor 2 manggil constructor ke 1
        
        // note : shadowing >> name pada param == name pada class
        // how to solve : dengan menggunakan keyword this untu capture field pada class.
        this(paramName, null);
    }
    
    Person() {
        // constructor 3 manggil constructor ke 2
        this(null);
    }

    // method
    void sayHello(String name) {
        System.out.println("Hello "+ name + ", My name is " + this.name);
    }
}
