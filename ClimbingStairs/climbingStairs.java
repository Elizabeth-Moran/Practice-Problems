class Solution {
    public int climbStairs(int n) {
        
      int firstNum = 1, secondNum = 2; curNum = 0;
                         
      if(n <= 2) return n;
      for(int i = 3;i <= n; i++)
      {
          curNum = firstNum + secondNum;
          firstNum = secondNum;
          secondNum = curNum;
      }
      return curNum;
    }
}

//Fibonacci Approach
// O(n) Time Complexity
// O(1) Space Complexity
