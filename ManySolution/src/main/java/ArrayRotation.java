public class ArrayRotation {

    static int[] circularArrayRotation(int[] a, int k, int[] queries){
        k = 1;
        for (int i=0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }

        for (int i=0; i < k; i++){
            int j, last;
            last = a[a.length-1];
            for (j=a.length-1; j > 0; j--){
                a[j] = a[j-1];
            }
            a[0] = last;
        }
        System.out.println();
        System.out.println("After: ");
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]+" ");
        }
        return circularArrayRotation(a, k, queries);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = {2,3,1};
         circularArrayRotation(arr, 1, arr2);
    }
}
