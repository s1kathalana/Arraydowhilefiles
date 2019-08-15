public class CompareBetweenTwoArraysString
{
    public static void main(String args[])
    {
        String string1 []={"sk","cb"};//predefined array elements
        String string2 []={"surat","sk","nusrat"};// predefined array elements

        for(int i=0;i<string1.length;i++)//sets full span of first array in outer for loop
        {
            for(int k=0;k<string2.length;k++)//sets full span of second array inside loop
            {
                if(string1[i]==string2[k]){
                    System.out.println("common between two strings are  "+string1[i]);}//if equals then prints common values
            }
        }



    }



}
