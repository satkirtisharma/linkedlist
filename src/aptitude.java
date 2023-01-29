public class aptitude {
    public static void main(String[] args) {
        int[]arr={4,6,5,9,24};
        double sum=0;
        for (int i=arr.length-1;i>=0;i--){
             sum+=arr[i];
        }
        double avg=sum/ arr.length;
        System.out.println(avg);
    }
}
