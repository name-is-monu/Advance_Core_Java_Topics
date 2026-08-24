package GenericsInDetails;

public class GenericDetails
{
}
/*Generic =>
   -Java Generics ko JDK 5 me introduce kiya gaya tha.
   -Yeh ek aisi mechanism hai jiske through hum classes,
    interfaces, aur methods me data types ko as a parameter pass kar sakte hain.
   -Simple shabdon me kahein toh Generics aapko "Types (Classes/Interfaces) ko parameterize"
   karne ki azaadi deta hai, taaki aap ek hi code ko alag-alag
    data types ke sath safely use kar saken.

 2. Generics Ki Zaroorat Kyu Padi? (Why)
    -Type Safety Nahi Thi: Aap ArrayList me kuch bhi daal sakte the (String, Integer,
    Custom Object). Runtime par ClassCastException aane ke pure chances hote the.
   -Explicit Type Casting Required: Jab aap collection se item nikalte the, toh use bar-bar
   explicit cast karna padta tha (e.g., String s = (String) list.get(0);).

Generics ke Fayde:
-Compile-Time Type Safety: Galti runtime par nahi, balki code compile hote hi pakdi jaati hai.
-No Type Casting: Bar-bar type cast karne ki jaroorat nahi padti, code clean aur readable rehta hai.
-Code Reusability: Ek hi generic class ya method ko aap Integer, String, ya kisi
 bhi custom object ke liye reuse kar sakte hain.

 Common Type Parameters (Naming Conventions):
->T - Type
->E - Element (Collections me use hota hai)
->K - Key (Maps me)
->V - Value (Maps me)
->N - Number


*/