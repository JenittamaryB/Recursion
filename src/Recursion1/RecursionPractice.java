package Recursion1;
public class RecursionPractice //recursion means method call itself
{
	public static void main(String[] args) 
	{
		RecursionPractice r=new RecursionPractice();
        int arr[]={2,3,4,5,2,7};
        int currentIndex = 0;
        //findDuplicate(arr,currentIndex);
        //display(1);
        //System.out.println(r.fact(5));
        //prime(4,2);
        r.maxMin(1,2);
        
	}
       
public static void display(int num)
{
	System.out.println(num);
     num++;
	if(num<=5) 
	{
	display(num);
	}
}
public  int fact(int no)
{
	if(no==0)
	{
		return 1;
	}
	else
	{
		return no*fact(no-1);
	}
}
public static void prime(int num,int div) 
{
	num++;
	if(num>div) 
	{
	if(num%div==0)
	{
		System.out.println(num+" is not a prime ");
	}
	else
	{
		System.out.println(num+" is prime number ");
	}
	 if(num<=15)	 //1<=15
	 {
		prime(num,div);
	}
}
}
public void maxMin(int a,int b)
{
	a++;
	b++;
	if(a<=b)
	{
		System.out.println("maximum is: "+b);
		System.out.println("minimum is: "+a);
		System.out.println();
	}
	 if(a<=10) //1<=10
	 {
		 maxMin(a,b);
	 }
}
    


public static void findDuplicate(int[]arr,int currentIndex) 
{
        if (currentIndex == arr.length-1) { //0==5
            return;
        }

        int nextIndex = currentIndex+1;  //nextIndex==1
        
        if (arr[currentIndex] == arr[nextIndex]) { // 2==3
            System.out.println("Duplicate number: " + arr[currentIndex]); 
        }
        findDuplicate(arr, nextIndex);  
    }
}
