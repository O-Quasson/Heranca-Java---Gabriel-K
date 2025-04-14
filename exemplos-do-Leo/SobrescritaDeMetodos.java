public class SobrescritaDeMetodos {
    
    class Animal {
        void emitirSom() {
            System.out.println("O animal faz um som.");
        }
    }
    
    class Gato extends Animal {
        @Override
        void emitirSom() {
            System.out.println("O gato mia.");
        }
    }
    
}
