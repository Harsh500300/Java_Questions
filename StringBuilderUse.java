package Strings;
import java.util.*;
import java.lang.StringBuilder;

public class StringBuilderUse {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        for(char chc='A';chc<='Z';chc++){
            sb.append(chc +" ");
        }
        System.out.println(sb);
    }
}
