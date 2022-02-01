import java.util.Arrays;

public class Zadacha8 {
    public static void main(String[] args) {
        int[] arrayOne = {4,1,1,4,2,3,4,4,1,2,4,9};
        Arrays.sort(arrayOne);
        System.out.println(Arrays.toString(arrayOne));

        int index = 0;
        int count = 1;
        int bestIndex = 0;
        int bestCount = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            if(i == 0 || arrayOne[i] != arrayOne[i -1]){
                count = 1;
                index = i;
            }else {
                count++;
                if(count > bestCount){
                    bestIndex = index;
                    bestCount = count;
                }
            }
        }
        for (int j = bestIndex; j < bestIndex + bestCount; j++) {
            System.out.print(arrayOne[j] + " ");
        }

    }

}
