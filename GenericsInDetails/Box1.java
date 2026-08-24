package GenericsInDetails;

public class Box1 <Object>
{
    private Object item;

    public Box1()
    {

    }

    public Box1(Object item)
    {
        this.item=item;
    }

    public void setItem(Object item)
    {
        this.item=item;
    }

    public Object getItem()
    {
        return item;
    }
}
