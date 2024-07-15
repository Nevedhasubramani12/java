public class patternprogram {
    public static void main(String[] args) {
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(i==0 || j==0 || i==6 || j==6)
                {
                    System.out.print("4"+" ");
                }
                else if(i==1 || j==1 || j==5 || i==5)
                {
                    System.out.print("3"+" ");
                }
                else if(i==2 || j==2 || i==4 || j==4)
                {
                    System.out.print("2"+" ");
                }
                else{
                    System.out.print("1"+" ");
                }
                
            }
            System.out.println();
            
        }
    }
}
