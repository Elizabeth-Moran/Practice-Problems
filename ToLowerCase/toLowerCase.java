class Solution {
    public String toLowerCase(String str) {
    char[] charArray = str.toCharArray();
        
    for (int i = 0; i < str.length(); i++) { 
      int asciiChar = charArray[i];
      if(asciiChar > 64 && asciiChar < 91)
      {
          charArray[i] = (char) (asciiChar + 32);
      }
        
    }
        str = String.valueOf(charArray);
        return str;
  }
}

//Check if letter is uppercase (ASCII is between 65 and 90)
//If so, add 32 and convert that int to a char
//Convert charArray to String, and return it
//O(n) space complexity
//O(n) time complexity
