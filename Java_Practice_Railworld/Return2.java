class Return2  
{  
   
    public int CompareNum()   
    {   
        int x = 3;  
        int y = 8;  
        System.out.println("x = " + x + "\ny = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  
    }  
      
    
    public static void main(String ar[])   
    {  
       Return2 obj = new Return2();  
        int result = obj.CompareNum();  
        System.out.println("The greater number among x and y is: " + result);  
    }  
}  