package HW1;
// Make a method that accepts a string and an integer and a char and will return the string with the char
// replaced at the integer given
// charReplace("I MAKE BREAD",2,T)
// EX: I MAKE BREAD, 2, T
//     I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
// Hint1: The objects name is Replace and you require a string, int, and char
// Hint2: You will need to return a string. You can concat the variables and the strings together
// Hint3: You will need to use the substring method to get the first part of the string and the last part of the string
//        and then concat them together with the char in the middle
// Hint4: You will need to use the charAt method to get the char at the given index
// Hint5: You will need to use the length method to get the length of the string


public class Replace {
    public String str = "I don't understand this";
    public int index = str.length();
    public char c = str.charAt(1); 
    public String substr1 = str.substring(0,c);
    public String substr2 = str.substring(c,str.length());

    public Replace(String str, int index, char c) {
        this.str = str;
        this.index = index;
        this.c = c;
    }
    public String charReplace(String str, char c) { { 
        return substr1 + c + substr2 ;
    }
}
}
