public class Main {


        abstract static class HolaMon {
            public String frase;

            public abstract void setFrase();

            public void saludar(){
                setFrase();
                System.out.println(frase);
            }
        }

        public void ferSalutacio(){
             new HolaMon(){
                @Override
                public void setFrase() {
                    frase = "Salut tout le monde";
                }

            }.saludar();

            System.out.println();
            System.out.println("Ahora en ingles");
            HolamonAngles holamonAngles = new HolamonAngles() {
                @Override
                public void setFrase() {
                }
            };
            holamonAngles.saludar();
            System.out.println();
            System.out.println("Ahora en español");
            System.out.println();

            var holaMonespañol = new HolaMon() {
                @Override
                public void setFrase() {
                    frase = "Hola Mundo";
                }

            };
            holaMonespañol.saludar();
        }

        abstract static class HolamonAngles extends HolaMon {
            private String frase = "HelloWorld";
            public abstract void setFrase();

            public void saludar(){
                setFrase();
                System.out.println(frase);
            }
        }

        public static void main(String... args) {
            Main myApp = new Main();
            myApp.ferSalutacio();


        }
}
