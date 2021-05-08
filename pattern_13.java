class pattern_13
{
 public static void main(String []args)
{
 
 for(int i=1; i<=5; i++)
 {
  for(int j=1; j<=5; j++)
  {
    if(j<i)
   System.out.print(" ");
    else
   System.out.print("*");
  
  }
 System.out.println();
 }
 for(int k=2; k<=5; k++)
 {
  for(int l=5; l>=1; l--)
  {
    if(k<l)
   System.out.print(" ");
    else
   System.out.print("*");
  
  }
 System.out.println();
}
}
}
