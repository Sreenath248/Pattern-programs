class A 
{
	public static void main(String[] args) 
	{
		int star=-1,space=4;
		for(int i=1;i<=4;i++){
			star+=2;
			space--;

			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			int ch=1;
			for(int j=1;j<=star;j++){
				if(j<(star/2)+1){
					System.out.print(ch++);
				}
				else{
					System.out.print(ch--);
				}
			}
			System.out.println();
			
		}
		
	}
}
/*D:\>cd gecm24

D:\gecm24>cd patterns

D:\gecm24\patterns>javac A.java

D:\gecm24\patterns>java A

   1
  121
 12321
1234321*/