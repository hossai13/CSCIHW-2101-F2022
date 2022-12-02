package HW1;

public class Replace {
    public String str = "";
   
    public Replace(String str) {
        this.str = str;
    }
    
    public static String charReplace(String str, int numnew, char b) { {
        int index = str.length();
        String substr1= str.substring(0, numnew);
        String substr2 = str.substring(numnew+1, index);
        System.err.println(str = substr1 + b + substr2);
        return str; 
    }
}
}
