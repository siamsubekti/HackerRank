class PlusMinus {

    static void plusMinus(int[] arr){
        double positive = 0;
        double negative = 0;
        double zero = 0;
        double arrCount = arr.length;

        for(int i=0; i < arr.length; i++){
            if (arr[i] > 0){
                positive++;
            } if (arr[i] < 0){
                negative++;
            } if (arr[i] == 0){
                zero++;
            }
        }
        System.out.println(positive/arrCount);
        System.out.println(negative/arrCount);
        System.out.println(zero/arrCount);
    }
    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};

        plusMinus(arr);
    }
}
