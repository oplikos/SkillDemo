public class SkillDemo1 {
    // number^power 
    public static int power(int number , int power){
        int sum = 1;
        for (int i = 0 ; i < power ; i++){
            sum = sum * number ;  
        }
        return sum;
    }
}