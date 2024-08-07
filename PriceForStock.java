import java.util.*;

public class PriceForStock {

    public static int ProfitInStock(int price[]){
        int BuyPrice=Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<price.length;i++){
            if(BuyPrice<price[i]){
                int profit=price[i]-BuyPrice;
                MaxProfit=Math.max(MaxProfit, profit);
            }
            else{
                BuyPrice=price[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,6,4,3,1};
        System.out.println(ProfitInStock(price));
    }
    
}
