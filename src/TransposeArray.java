public class TransposeArray
{
    public static void main(String args[])
    {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};//2d array set as predefined values.

        System.out.println("before transposed matrix is");

        for(int i=0;i<3;i++)
        {
            for(int k=0;k<3;k++)
            {
            System.out.print(array[i][k]);//transpose the matrix
            }
            System.out.println();
        }


        System.out.println("After transposed matrix is");

        for(int i=0;i<3;i++)
        {
            for(int k=0;k<3;k++)
            {
                System.out.print(array[k][i]);
            }
            System.out.println();
        }





    }
}
