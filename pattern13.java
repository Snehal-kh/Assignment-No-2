class pattern13
{
 public static void main(String args[])
 { 
  
  for(int i=1; i<=5 ;i++) //row
   {  
     int alpha=65;
    
    for(int j=4; j>=i; j--) //space
    {
     System.out.print(" ");
    }
   for(int k=1;k<=i;k++) //column
    { 
     System.out.print((char)(alpha)+" ");
   
    }
     alpha++;  
     System.out.println();
  }
  
 }
}