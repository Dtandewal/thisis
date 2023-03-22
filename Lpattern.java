public class Lpattern {
    public static void main(String[] args) {
        int a=6;

        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(j==0 || i==a-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
