import java.lang.Math;

public class ReimannSum{
    public static double a=0,b=1,n=80000;
    public static double d = (b-a)/n;
    // PLEASE ENTER YOUR FUNCTION BELOW AND YOUR SUMM SPECIFICATIONS ABOVE
    public static double function(double x){
        return x;//x*x*x+3*x*x+4*x+2;//Math.log(8+Math.exp(x));
    }
    public static void main(String[] args){
        System.out.println("simpson "+simpson());
        System.out.println("mid point "+midPoint());
        System.out.println("trapezoid "+trapezoid() );
    }

    public static double simpson(){
        double result =function(g(0))+function(g(n));
        for(int i = 1;  i<=n-1; i++){
            if(i%2==1){
                result += 4*function(g(i));
            }else{
                result += 2*function(g(i));
            }
        }
        return (d/3)*(result);
    }
 
    public static double midPoint(){
        double result=0;
        for(int i = 1; i <= n;i++){
            result += function((g(i-1)+g(i))/2);
        }
        return d*result;
    }

    public static double trapezoid(){
        double result=0;
        for(int i = 1; i <= n;i++){
            result += (function(g(i-1)) + function(g(i)))/2;
        }
        return d*result;
    }


    public static double g(double x){
        return a+(d*x);
    }

    


}