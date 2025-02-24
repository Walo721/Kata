public class Kata {

    private int[] num;
    private int max = 0;
    private int min = 0;
    private int sum = 0;

    public Kata() {
    }
    
    public int sum(int[] numeros) {
        num = numeros;
        for (int numero : num) {
            if (max < num[i]) max = num[i];
            if (min > num[i]) min = num[i];
        }
        for (int numero : num) {
            if (numero != max && numero != min) sum += numero;
        }
        
        return sum;
    }
}
