class crome1	
{
	public static void main(String[] args) 
	{
		int space=9,star=-1;
		for(int i=1;i<=9;i++){
			space--;
			star+=2;
			
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				//if(i==9||j==1||j==star){<!--  -->
					System.out.print("*");
				//}
				//else{
					//System.out.print(" ");
				//}
				
			}
		
			
			System.out.println();
		}
	}
}

output:
        *
       ***
      *****
     *******
    *********
   ***********
  *************
 ***************
*****************



[Apply the if contitions]

        *
       * *
      *   *
     *     *
    *       *
   *         *
  *           *
 *             *
*****************

