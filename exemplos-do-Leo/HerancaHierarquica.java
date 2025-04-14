public class HerancaHierarquica {
    
    class Animal {
        void respirar() {
            System.out.println("O animal está respirando.");
        }
    }
    
    class Mamifero extends Animal {
        void amamentar() {
            System.out.println("O mamífero amamenta seus filhotes.");
        }
    }
    
    class Ave extends Animal {
        void voar() {
            System.out.println("A ave está voando.");
        }
    }
    
}