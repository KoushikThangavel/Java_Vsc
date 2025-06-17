package Stack;

public class Rough2 {
    public static void main(String[] args){
    int[] nums = {20,100,10,12,5};
    int n = nums.length;
        int c=1;
        int first =0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i] < nums[i+1] && nums[i]>first)
            {
                c=3;
            }
        }
        if(c==3)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}
