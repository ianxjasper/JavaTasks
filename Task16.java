public class Task16 {
    public static void main(String[] args) {

    }

    interface Animal {
        boolean feed(boolean timeToEat);

        void groom();

        void pet();
    }

    class Gorilla implements Animal {
        public boolean feed(boolean timeToEat) {
            return timeToEat;
            // put gorilla food into cage
        }

        @Override
        public void groom() {
            // lather, rinse, repeat
        }

        @Override
        public void pet() {
            // pet at your own risk
        }
    }
}