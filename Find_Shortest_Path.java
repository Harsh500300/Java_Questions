package Strings;

public class Find_Shortest_Path {

    public static double getShortesPath(String str){// for given path
        int x=0,y=0;
        int x1=0,y1=0;// origin coordinates
        
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=(x-x1)*(x-x1);
        int y2=(y-y1)*(y-y1);
        return Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(getShortesPath(str));
    }
    
}
