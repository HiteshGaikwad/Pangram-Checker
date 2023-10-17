import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        boolean check= checkPangram(str);
        if(check){
            System.out.println("This sentence is a Pangram.");
        } else{
            System.out.println("This sentence is not a Pangram.");
        }
    }
    public static boolean checkPangram(String str){
        //convert all characters to lower letter
        str= str.toLowerCase();
        int n=str.length();

        //if length of the string is less than 26 then that means
        //sentence is not having all the alphabets.
        if(n<26){
            return false;
        }
        int ch[]= new int[26];

        //filling the frequencies of the characters
        for(int i=0; i<n; i++){
            int val= str.charAt(i)-'a';
            ch[val]++;
        }
        //checking if any character is having zero frequency that means this is not a pangram
        for(int i: ch){
            if(i==0){
                return false;
            }
        }
        return true;
    }
}