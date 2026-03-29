public class Main {
    static void main(String[] args) {
        // instancier un chien
        Dog abu = new Dog("abu", 60);
        Dog abdul = new Dog("abdul", 7);
        Cat chat =  new Cat();


        //appeler la méthode
        abu.bark();
        abdul.bark();
        chat.meow();

    }
}
