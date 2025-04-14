
        // Superclasse
    class Veiculo {

        String marca = "Ford";
        void buzinar() {
            System.out.println("Biiip! Biiip!");
        }

    }

    // Subclasse
    class Carro extends Veiculo {

        String modelo = "Mustang";

    }

    public class Veiculos {

        public static void main(String[] args) {

            Carro meuCarro = new Carro();
            System.out.println(meuCarro.marca); // Herdado de Veiculo
            System.out.println(meuCarro.modelo); // Definido na classe Carro
            meuCarro.buzinar(); // Herdado de Veiculo
            
        }
    }