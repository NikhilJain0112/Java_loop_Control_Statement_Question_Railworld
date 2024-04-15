 class Return1
 {
    public static void main(String[] args)
	{
        int age = 12;
        System.out.println("Using Return");
        if (age<18)
		{
            return;
		}			
        System.out.println("Will not get executed!");
    }
}