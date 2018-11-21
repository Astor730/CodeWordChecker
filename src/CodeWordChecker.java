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
    @Override
    public boolean isValid(String str1)
    {
        if (str1.indexOf(this.not) == -1 && str1.length() >= min && str1.length() <= max)
        {
            return true;
        }
        else {return false;}
    }
}
