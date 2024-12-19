import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Poderia fazer um prompt para o usuário inserir seu próprio array e suas mudanças.

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int shifts = 4;

        for (int i = 0; i < shifts; i++) {
            rotateOnce(array);
        }

        System.out.println("Output list: " + Arrays.toString(array));
    }

    public static void rotateOnce(int[] array) {
        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last;
    }
}