public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> example1 = new GenericStack<>(new Integer[]{5, 7, 10, 15});
        GenericStack<String> example2 = new GenericStack<>(new String[]{"Да","Нет","Вероятно","Невозможно"});

           for (Object elem: example1) {
               System.out.println(elem);
           }

           System.out.println("-------------------------------------------------");

           example1.push(25);

           for (Object elem: example1) {
               System.out.println(elem);
           }

           System.out.println("-------------------------------------------------");

           System.out.println(example1.pop());

           System.out.println("-------------------------------------------------");

           for (Object elem: example1) {
               System.out.println(elem);
           }

           System.out.println("-------------------------------------------------");

           for (Object elem: example2) {
               System.out.println(elem);
           }

           System.out.println("-------------------------------------------------");

           example2.push("Новое слово");

           for (Object elem: example2) {
               System.out.println(elem);
           }

           System.out.println("-------------------------------------------------");

           System.out.println(example2.pop());

           System.out.println("-------------------------------------------------");

           for (Object elem: example2) {
               System.out.println(elem);
           }

           System.out.println("-------------------------------------------------");

        Pair<Integer, String> example3 = new Pair<Integer, String>(15, "Первый пример");
        Pair<String, Integer> example4 = new Pair<String, Integer>("Второй пример", 25);

           System.out.println(example3.getFirst());
           System.out.println(example3.getSecond());

           System.out.println("-------------------------------------------------");

           System.out.println(example4.getFirst());
           System.out.println(example4.getSecond());

           System.out.println("-------------------------------------------------");

        Analize<Integer> analize1 = new Analize<>(15, 35);
           System.out.println(analize1.compare());
           System.out.println("-------------------------------------------------");
        Analize<Integer> analize2 = new Analize<>(15, 15);
           System.out.println(analize2.compare());
           System.out.println("-------------------------------------------------");
        Analize<String> analize3 = new Analize<>("Привет", "Пока");
           System.out.println(analize3.compare());
           System.out.println("-------------------------------------------------");
        Analize<String> analize4 = new Analize<>("Привет", "Привет");
           System.out.println(analize4.compare());
           System.out.println("-------------------------------------------------");


    }
}
        


