public class Main {
    public static void main(String[] args) {
        //even numbers using for loop
        for(int even = 0; even <= 100; even++){
            if( even%2 == 0)
                System.out.println(even);
        }

        //odd numbers using while loop
        int odd = 1;
        while(odd<=100){
            if(odd%2!=0);
            System.out.println(odd);
            odd+=2;
        }
    }
}