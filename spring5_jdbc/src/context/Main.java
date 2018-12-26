package context;

public class Main {
    public static void main(String args[]) {
        int i = 0;
        String greetings[] = {" Hello world !", " Hello World !! ",
                " HELLO WORLD !!!"};
        while (i < 4) {
            try {
                System.out.println (greetings[i]);
                i++;
//                System.out.println(greetings[i]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组下标越界异常");
            } finally {
                System.out.println("--------------------------");
            }
        }
    }
}
