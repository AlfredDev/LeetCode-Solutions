
public class AddDigits
{
       static int addDigits(int num) {
        int root = 0;
        System.out.println(num % 9);
        while(num > 0 ){
            root += num % 10;
            num = num / 10;
            System.out.println("This is root :"+root+"this is num "+num);
            if(num == 0 && root > 9){
                num = root;
                root = 0;
            }
        }
        return root;
    }
    
     static int addDigitss(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
    
    static int digits(int num){
        return num == 0 ? 0 : num % 9;
    }
}
