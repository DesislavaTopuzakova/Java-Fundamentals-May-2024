package Methods;

public class Demo4 {
  /*  public static void main(String[] args) {
        int num = 5;
        increment(num, 15);
        System.out.println(num);
    }

    public static void increment(int num, int value) {
        num += value;
    }*/

    public static void main(String[] args) {
        int[] nums = { 5, 4 };
        increment(nums, 15);
        System.out.println(nums[0]);
    }

    public static void increment(int[] nums, int value) {
        nums[0] += value;
    }


}
