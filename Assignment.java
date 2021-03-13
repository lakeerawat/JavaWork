import java.util.Scanner;

class Assignment
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------WELCOME TO APPLICATION----------");
        boolean go = true;
        while(go){
            System.out.println("Press 1 for Continue");
            System.out.println("Press 2 for Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                
                    System.out.println("Enter the value of n : ");
                    int n = sc.nextInt();
                    int sumarr=0;
                    int[] arr = new int[n-1];
                    System.out.println("Enter "+ (n-1) + " numbers between 1 to " +n);
                    for(int i=0; i<n-1; i++){
                        arr[i]=sc.nextInt();
                    }
                    int sum = (n*(n+1))/2;

                    for(int i=0; i<arr.length; i++) {
                    sumarr= sumarr + arr[i];
                    }
                    System.out.println("Missing Value: " +(sum-sumarr));
                    break;   
                case 2:
                    go = false;
                    break;
            }
            
        }
    System.out.print("Thank you!!");
    }
}