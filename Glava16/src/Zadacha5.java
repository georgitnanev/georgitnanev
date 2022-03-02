import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Zadacha5 {
    public static int[] bubbleSort(int[] list) {
        for (int i = (list.length - 1); i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (list[j - 1] > list[j]) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) throws Exception
    {
        String list="";
        int i=0,n=0;

        BubbleSort s= new BubbleSort();
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.println("List of elements and then write 'stop' : ");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        while(!(list=bf.readLine()).equalsIgnoreCase("stop")){
            int index =Integer.parseInt(list);
            arrayList.add(index);

        }

        int[] elementList = new int[arrayList.size()];
        Iterator<Integer> iteratorOne = arrayList.iterator();
        for (int j=0;iteratorOne.hasNext();j++) {
            elementList[j] = iteratorOne.next();
        }

        bubbleSort(elementList);
        System.out.println(" ");
        System.out.println("After Bubble Sort : ");
        for (int k : elementList) {
            System.out.println(k + " ");
        }
    }
}