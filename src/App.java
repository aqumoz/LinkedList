public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(20);
        list.add(254);
        list.add(8653);
        list.add(56);
        list.add(84);

        for (int i = 0; i < list.length(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---");

        // for (Integer i : list.toArray()) {
        //     System.out.println(i);
        // }

    }
}
