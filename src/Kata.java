public class Kata {
    public static int sum(int[] numeros) {
        if (numeros != null) {
            int min = numeros[0], max = numeros[0];
            int suma = 0;
            for (int n : numeros) {
                if (min > n) min = n;
                if (max < n) max = n;

                suma += n;
            }
            return (suma - min) - max;
        }
        return 0;
    }
}
