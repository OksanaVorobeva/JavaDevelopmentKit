package seminar3.HWLesson;


import java.util.ArrayList;
import java.util.List;

//* Есть классы Fruit -> Apple, Orange; (больше не надо);
//* Класс Box в который можно складывать фрукты, коробки условно сортируются по
//типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины; Для хра-
//нения фруктов внутри коробки можете использовать ArrayList;
//* Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного
// фрукта(вес яблока – 1.0f, апельсина – 1.5f, не важно в ка-
//ких единицах);
//* Внутри класса коробки сделать метод compare(), который позволяет сравнить те-
//кущую коробку с той, которую подадут в compare() в качестве параметра, true – если их веса равны,
// false в противном случае (коробки с яблоками возможно срав- нивать с коробками с апельсинами);
//* Написать метод, который позволяет пересыпать фрукты из текущей коробки в дру- гую коробку
// (при этом, нельзя яблоки высыпать в коробку с апельсинами), соответ- ственно, в текущей коробке
// фруктов не остается, а в другую перекидываются объ- екты, которые были в этой коробке.
public class Task2 {
    private interface Fruit{
        float getWeight();
    }

    private  static class Orange implements Fruit{
        static  final float weight=1.5f;

        @Override
        public float getWeight() {
            return weight;
        }
    }

    public static  class Box<T extends Fruit>{
        private final List<T> container;

        Box(T[] init){
            container=new ArrayList<>();
            for (T f: init) {
                add(f);
            }
        }

        void  add(T fruit){
            container.add(fruit);
        }

        void  print(){
            System.out.println();
        }

        float getWeight(){
            return (container.isEmpty())
                    ? 0
                    : container.get(0).getWeight()*container.size();
        }

        boolean compare(Box<?> with){
            return  this.getWeight()-with.getWeight()<0.0001;
        }

        void  transferTo(Box<? super T> dest){
            dest.container.addAll(container);
            container.clear();
        }
    }
}
