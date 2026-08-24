package JavaInterface.MultipleInheritance;

public class Boy implements Runner , Swimmer , Dancer
{
    @Override
    public void dance()
    {
        System.out.println("Boy can Dance ");
    }

    @Override
    public void running()
    {
        System.out.println("Boy can running ");
    }

    @Override
    public void swim()
    {
        System.out.println("Boy can swim ");
    }

    public void read()
    {
        System.out.println("Boy Love Reading ..");
    }
}


/*Multiple inheritance :-
    -> Ek Boy hai o Runner bhi ho skta hai , O Swimmer bhi ho skat hai , and Dancer
       Bhi ho skta hai.
     ->Yah To Boy sir Dancer and Swimmer ho skta hai ,
     -> Ya to Boy sirf Runner ho skta hai .
     -> Ya to Boy Sirf Dancer ho skta hai.

     Kahne ka malatab ye hai ki Ham Interface bana dege jo boy jise tailents ko
     layak hoga use interface ko implments karega ek ya ek se adhik
     fir uske andar ke method ko implements karega apne hisab se .


     -> Boy ke andar ye methods common hai kuchh eske bhi methoids ho skte hai.
 */