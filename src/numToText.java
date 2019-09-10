public class numToText
{
    int num;

    public numToText(int num)
    {
        this.num = num;
    }//end constructor

    public String changeNumToText()
    {
        String output = "";

        if (num == 1)
            output = "one";
        else if (num == 2)
            output = "two";
        else if (num == 3)
            output = "three";
        else if (num == 4)
            output = "four";
        else if (num == 5)
            output = "five";
        else if (num == 6)
            output = "six";
        else if (num == 7)
            output = "seven";
        else if (num == 8)
            output = "eight";
        else if (num == 9)
            output = "nine";
        else if (num == 0)
            output = "zero";

        return output;

    }//end brain method to change a number to text

}//end class numtoText
