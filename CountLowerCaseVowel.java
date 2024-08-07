package Strings;

public class CountLowerCaseVowel {
    
    public static int countLowerCaseVowel(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str="Hello Java, How are u!!";
        System.out.println(countLowerCaseVowel(str));
        String str2="harsh",str3="Yadav";
        System.out.println(str2.equals(str3));
        // 
        // second question answer is 
            String str1001 = "ShradhaDidi";
            String str1002 = "ApnaCollege";
            String str1003 = "ShradhaDidi";
            String str1004= new String("ShradhaDidii");

            System.out.println(str1001.equals(str1002) + " " + str1001.equals(str1004));
            System.out.println(str1001.replace('h','H'));
            }
            
    }


