public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[8];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");

        for (int i = 0; i < num.length - 1; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
            min = num[i] < min ? num[i]:min;
            max = num[i] > max ? num[i]:max;
        }

        System.out.println();

        for (int numero : num) {
            System.out.print(numero);
            System.out.print(numero == max ? " maximo" : "");
            System.out.print(numero == min ? " minimo" : "");
            System.out.println();
        }
    }
}
