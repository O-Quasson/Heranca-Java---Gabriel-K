public class HerancaMultipla {
    
    interface Animal {
        void emitirSom();
    }
    
    interface Mamifero {
        void amamentar();
    }
    
    class Cachorro implements Animal, Mamifero {
        @Override
        public void emitirSom() {
            System.out.println("O cachorro faz au au.");
        }
    
        @Override
        public void amamentar() {
            System.out.println("O cachorro amamenta seus filhotes.");
        }
    }
    
}
