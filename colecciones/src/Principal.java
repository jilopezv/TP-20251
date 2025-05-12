import java.math.BigDecimal;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        /*BigDecimal a = BigDecimal.valueOf(5);
        for (int i = 0; i < 100; i++) {
            a = a.multiply(BigDecimal.valueOf(10));
            System.out.println(a);
        }*/

        System.out.println("---- COLLECTION ----");
        // <> es un operador de diamante -> generics
        Collection<Integer> collection = new ArrayList<>();
        collection.add(3);
        collection.add(4);
        collection.add(1);
        for (Integer i : collection) {
            System.out.println(i);
        }

        System.out.println("---- LIST ----");
        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(3); // se añade porque es una lista
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println("Número de elementos: " + list.size());
        // System.out.println(list.get(2));

        System.out.println("---- QUEUE ----"); //queue es una estructura tipo FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(1);
        for (Integer i : queue) {
            System.out.println(i);
        }
        System.out.println("Desencolar " + queue.poll()); //equivalente a remove
        System.out.println("Consultar: " + queue.peek());


        System.out.println("---- STACK ----"); //stack es una estructura tipo LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(4);
        stack.push(1);
        for (Integer i : stack) {
            System.out.println(i);
        }
        System.out.println("Desapilar " + stack.pop()); //equivalente a remove
        System.out.println("Consultar: " + stack.peek());

        System.out.println("---- SET ----");
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(3); // no se añade porque ya existe
        for (Integer i : set) {
            System.out.println(i);
        }
        set.remove(5); // no se lanza excepción, simplemente no hace nada
        System.out.println("Número de elementos: " + set.size());

        System.out.println("---- MAP ----");
        Map<String, Integer> map = new HashMap<>();
        map.put("uno", 1);
        map.put("dos", 2);
        map.put("tres", 3);

        for(String key : map.keySet()) {
            System.out.println(key);
        }

        for(Integer value : map.values()) {
            System.out.println(value);
        }

        System.out.println(map.get("tres"));

    }
}
