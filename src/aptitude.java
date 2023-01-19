public class aptitude {
    public static void main(String[] args) {
        int[]arr={9,4,54,56,34,6,4};
       int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
