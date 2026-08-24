package JavaNewFeatures;

public class VarKeyword
{
  public static void main(String[] args)
  {

    var name="Monu Kumar";
     // name=10; //Ham yese nhi kar sket hai kyu ki ye statucally typed hao jo complie time par ho pata kar leta hai ki ham kis data type par kaam karne vale hai agar JavaScript hota to ye allow hota
      System.out.println(name);
      System.out.println(name instanceof String); //true
    }
}

/*var java me keyword hai jo ki 10 me aaya hai . eko ham class neme nhi bana
skte hai na hi instance instace variable bana sket hai
but sesko ham local variable ke aaye as ye DataType use karsket hai
Note: variable ke aage data Type ki tarai use karte hai but esse Dynamic
programming nhi suru hota hai abhi bhi java statically typed language hi hota hai
kyu ki compile time par ho java compiler detect kar leta hai ki ham kis datat tyoe
ke sang kaam karne vale hai JavaScript ki tarah hi nhi ki run time par deside
hota hai ki hamm kis data type ke variable par kaam karne vale hai..*/