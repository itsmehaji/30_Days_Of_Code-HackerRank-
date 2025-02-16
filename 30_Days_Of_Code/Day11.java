import java.util.*;
class Day11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0; j<6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0, max=Integer.MIN_VALUE;
        if(arr.length<3 || arr[0].length<3){
            System.out.print(0);
        }
        for(int i=0; i<arr.length-2; i++){
            for(int j=0; j<arr[0].length-2; j++){
                 sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                
                max = Math.max(sum,max);
            }
        }
        System.out.print(max);
    }
}