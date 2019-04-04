/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
  public static int sum;
  public static void main (String[]args)
  {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 6, 7, 8, 9, 1 };
    int[] arr3 = { 2, 3, 1, 5, 6 };
    sum = 9;
    Main m = new Main ();
    m.ThreeDigitGeneration (arr1, arr2, arr3);
    m.ThreeDigitGeneration (arr1, arr1, arr1);
    m.ThreeDigitGeneration (arr2, arr2, arr2);
    m.ThreeDigitGeneration (arr3, arr3, arr3);
  }
  public void ThreeDigitGeneration (int[]arr1, int[]arr2, int[]arr3)
  {
    for (int i = 0; i < 5; i++)
      {
	for (int j = 0; j < 5; j++)
	  {
	    for (int k = 0; k < 5; k++)
	      {
		if (arr1[i] + arr2[j] + arr3[k] == sum)
		  {
		    System.out.print (arr1[i]);
		    System.out.print (arr2[j]);
		    System.out.print (arr3[k]);
		    System.out.println ();
		  }
	      }
	  }
      }
  }
}
