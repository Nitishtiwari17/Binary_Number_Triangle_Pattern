package com.in;

public class Main {

    public static void main(String[] args) {

        int n = 5;
        for(int i=1;i<=n;i++)
        {
            if(i%2 == 0)
            {
                for(int j=0;j<i;j++)
                {
                    if(j%2 ==0)
                    {
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                }
                System.out.println();
            }
            else
            {
                for(int j=0;j<i;j++)
                {
                    if(j%2 ==0)
                    {
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }

        }
    }
}
