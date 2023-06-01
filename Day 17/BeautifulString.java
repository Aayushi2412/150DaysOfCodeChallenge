public class Solution {
    public static int makeBeautiful(String str) {
         int a=0,b=0;

        for(int i=0;i<str.length();i++)

        {

            if(i%2==0)

            {

            if(str.charAt(i)=='0')

            {

                a++;

            }

            else

            {

                b++;

            }

            }

            else

            {

                if(str.charAt(i)=='1')

                {

                    a++;

                }

                else

                {

                    b++;

                }

            }

        }

       

        return (a>b)? b:a;

 



    }
}
