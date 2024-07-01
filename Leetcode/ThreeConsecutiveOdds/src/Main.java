public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 2; i++){
            if(arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1){
                return true;
            }
        }

        return false;
    }
}