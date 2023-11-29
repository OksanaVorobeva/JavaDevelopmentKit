package lesson2.interface2;

public class Main {

    public interface MouseListener {
        void mouseUp();
        void mouseDown();
    }

    private static class MouseAdapter implements MouseListener {
        private static void addMouserListener(MouseListener l){
            l.mouseDown();
            l.mouseUp();
        }
        @Override
        public void mouseUp() {
        }

        @Override
        public void mouseDown() {
        }

        public static void main(String[] args){
            MouseAdapter m = new MouseAdapter();
            addMouserListener(m);

            addMouserListener(new MouseAdapter());
            MouseAdapter l= new MouseAdapter() {
                @Override
                public void mouseUp() {

                }

                @Override
                public void mouseDown() {

                }
            };
            addMouserListener(l);

            addMouserListener(new MouseAdapter() {
                @Override
                public void mouseUp() {

                }

                @Override
                public void mouseDown() {

                }
            });
        }

    }

    public static void main(String[] args) {
        MouseAdapter m=new MouseAdapter();
        m.mouseDown();
        m.mouseUp();
    }
}
