public class HerancaMultinivel {
    class Animal {
        void dormir() {
            System.out.println("O animal está dormindo.");
        }
    }
    
    class Mamifero extends Animal {
        void amamentar() {
            System.out.println("O mamífero amamenta seus filhotes.");
        }
    }
    
    class Cachorro extends Mamifero {
        void latir() {
            System.out.println("O cachorro late.");
        }
    }
    
}
