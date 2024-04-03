import java.util.Arrays;

public class MatrixSum {
    public static int matrixSum(int[][] nums) {
        for(int i=0; i<nums.length; i++){
            Arrays.sort(nums[i]);
        }
        int out = 0;
        int k = nums[0].length-1;
        for(int i=0; i<nums[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<nums.length; j++){
                if(nums[j][k] > max){
                    max = nums[j][k];
                }
            }
            out += max;
            k--;
        }
        return out;
    }

    public static void main(String[] args) {
        int[][] nums = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
        System.out.println(matrixSum(nums));
    }
}
