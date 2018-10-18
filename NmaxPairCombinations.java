public class NmaxPairCombinations {
    public static void main(String[] args) {
        int [] a = {1,4,2,3};
        int [] b = {2,5,1,6};
        System.out.println(Nmax(a,b));
    }
    public static int[] Nmax(int [] a , int [] b ){
        int sum1 = 0 , sum2 = 0;
        int temp[] = new int[2];
        for (int i = 0 ; i < a.length; i++){
            if(a[i] > sum1){
                sum1 = a[i];
                temp[0] = sum1;
            }
        }
        for (int j = 0 ; j < b.length; j++) {
            if (a[j] > sum2) {
                sum2 = a[j];
                temp[1] = sum2;
            }
        }
        return temp;
    }

}
