import java.io.*; 
  
class Break 
{ 
    public static void main(String[] args) 
    { 
        int n = 10; 
        for (int i = 0; i < n; i++)
		{ 
            if (i == 6)
			{ 
			break; 
			}
            System.out.println(i); 
        } 
    } 
}