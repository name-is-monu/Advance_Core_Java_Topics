package GenericsInDetails;

public class Box <T>
{
    private T item;

    public Box()
    {

    }

    public Box(T item)
    {
        this.item=item;
    }

    public void setItem(T item)
    {
        this.item=item;
    }

    public T getItem()
    {
        return item;
    }

}
/*generic class banae ki vajah se ham Class ka Object banate time Deside kar skte hai ki ye
 Class Kis type ke data par kam karegi .. primitive data type ke Wrapper class par ya
 Non - Primitive ke Data type par (Class , interface )
 Eska sabse bada fayada ye hai ki ni explicit casting karne ki jarurat hota hai aur yr type
 safty bhi provide karta hai jisse ClassCastException nhi aata hai ye Compile time par hi
 Error de deta hai jo ki bahut achha hoat hai.
 -> Note Box1 ek class bannate hai usko Object type ka banaye ge Dekhte hai kya problem
 aati thi....
 */