package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw_p32 {

	public static void main(String[] args)throws IOException
	{
		
		System.out.println("請輸入要在第幾次處理迴圈呢?(1~10)");
		
		BufferedReader br = 
	            new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for(int i = 1;i <= 10;i++)
        {
        	System.out.println("第"+i+"次的迴圈。");
        	if(i == res)
        		break;
        }
        
	}   
	
}
