public class sharedDigit
{
    public static boolean hasSharedDigit(int number, int number1)
    {
        if((number <10) || (number >99))
        {
            return false;
        }
        if((number1 <10) || (number1 >99))
        {
            return false;
        }
        int firstDigit = 0;
        int lastDigit = 0;

        int firstDigit1 = 0;
        int lastDigit1 = 0;

        int same = number;
        int same1 = number1;

        while((same >= 10) &&(same1 >=10))
        {
            firstDigit = same % 10;
            same /= 10;

            firstDigit1 = same1 % 10;
            same1 /= 10;
        }
        if(same < 10)
        {
            lastDigit = same;
        }
        if(same1 < 10)
        {
            lastDigit1 = same1;
        }

        if((firstDigit == firstDigit1) || (firstDigit == lastDigit1) ||
                (lastDigit == firstDigit1) || (lastDigit == lastDigit1))
        {
            return true;
        }
        return false;
    }
}