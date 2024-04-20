public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.unshift(0);
        list.push(10);
        list.pop();

        for (int i = 0; i < list.len(); i++) {
            list.print(i);
        }
    }
}