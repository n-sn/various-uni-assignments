package program1;

public class Program1Driver {

    public static void main(String[] args) {
        
        int[] nums = {3,2,7,5,4,6,1};
        System.out.println("Sum (iterative): " + 
                Program1.sumIterative(nums));
        System.out.println("Sum (recursive): " + 
                Program1.sumRecursive(nums, 0));
        
        int[] numsOrdered = {2,4,10,15,50,72,89};
        int key = 10;
        System.out.println(key + " position: " + 
          Program1.binarySearch(numsOrdered, key, 0, numsOrdered.length-1));
        key = 100;
        System.out.println(key + " position: " + 
          Program1.binarySearch(numsOrdered, key, 0, numsOrdered.length-1));
        
        int n = 10;
        System.out.println("fibonacci of " + n +
                ": " + Program1.fib(n));
    }
}