public class CodeWordChecker implements StringChecker
{
    private int min;
    private int max;
    private String not;
    public CodeWordChecker(int min, int max, String not)
    {
        this.min = min;
        this.max = max;
        this.not = not;
    }
    public CodeWordChecker(String not)
    {
        this.min = 6;
        this.max = 20;
        this.not = not;
    }
    public boolean isValid(String str1)
    {
        boolean contains = false;
        for (int i = 0; i < str1.length();i++)
        {
            String checking = str1.substring(i,i+not.length());
            if(checking.equals(str1))
            {
                contains = true;
                break;
            }
        }
        if (contains == false && str1.length() > min && str1.length() < max)
        {
            return true;
        }
        else {return false;}
    }
}
