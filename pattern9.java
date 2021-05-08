class pattern9
{
 public static void main(String args[])
 { 
  int alpha=64;
  for(int i=1; i<=5 ;i++) //row
   { 
    
    for(int j=4; j>=i; j--) //space
   {
    System.out.print(" ");
   }
 for(int k=1;k<=i;k++) //column
  { 
  System.out.print((char)(alpha+k)+" ");
  }
  System.out.println();
  }
  
}
}