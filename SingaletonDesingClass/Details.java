package SingaletonDesingClass;

public class Details
{
}
/*Singleton Class:-

   1. Singleton Class क्या है? (What is a Singleton Class?)
      -परिभाषा:
         Singleton एक ऐसा डिज़ाइन पैटर्न है जो यह गारंटी देता है कि पूरी एप्लीकेशन (JVM) में उस क्लास का
         केवल और केवल एक ही ऑब्जेक्ट (Instance) बनेगा, और वही सिंगल ऑब्जेक्ट पूरी एप्लीकेशन में
         शेयर किया जाएगा।
     -सरल शब्दों में:
        कल्पना कीजिए कि आपके घर का मेन बिजली का मीटर या प्रिंटर एक ही है
        घर के सभी लोग उसी एक प्रिंटर का इस्तेमाल करते हैं
        ऐसा नहीं होता कि हर कमरे के लिए अलग प्रिंटर खरीद लाया जाए। इसी तरह, जब आप चाहते हैं
        कि किसी खास क्लास (जैसे Database Connection Pool, Configuration Manager, या Logger)
        का बार-बार नया ऑब्जेक्ट न बने बल्कि एक ही ऑब्जेक्ट बार-बार इस्तेमाल हो,
        तब हम Singleton Class बनाते हैं।

2. Singleton Class बनाने के 3 मुख्य नियम (Golden Rules)
   किसी भी क्लास को Singleton बनाने के लिए आपको 3 बुनियादी कदम उठाने होते हैं:
      1. Private Constructor:
          क्लास का कंस्ट्रक्टर हमेशा private होना चाहिए। इससे बाहर कोई भी क्लास new कीवर्ड का
          उपयोग करके नया ऑब्जेक्ट नहीं बना सकती (new MyClass() लिखते ही कंपाइलर एरर दे देगा)।
      2.Private Static Instance:
         क्लास के अंदर उसी क्लास का एक private static
         वेरिएबल होना जो उस इकलौते ऑब्जेक्ट को अपने अंदर होल्ड करके रखे।
      3.Public Static getInstance Method:
         एक public static मेथड (अक्सर जिसे getInstance() कहा जाता है) बनानी होती है
         जो बाहर वालों को वह इकलौता ऑब्जेक्ट रिटर्न करती है।

  4. Singleton क्लास को तोड़ा (Break) कैसे जा सकता है? (Interview Special)
     -यह इंटरव्यू का सबसे पसंदीदा सवाल है कि क्या कोई Singleton क्लास के नियमों को तोड़ सकता है?
      ->हाँ, इसे 3 तरीकों से तोड़ा जा सकता है:
       1.Reflection API: अगर कोई डेवलपर Reflection का इस्तेमाल करके प्राइवेट कंस्ट्रक्टर को एक्सेस
         कर ले (setAccessible(true)), तो वह एक से ज्यादा ऑब्जेक्ट बना सकता है।
       2.Serialization & Deserialization: अगर आपकी Singleton क्लास Serializable है, और आप
        उसे बाइट्स में बदलकर वापस ऑब्जेक्ट बनाते हैं (Deserialization), तो जावा हर बार एक नया ऑब्जेक्ट
        बना देगा।
       3.Cloning: अगर क्लास Cloneable है, तो clone() मेथड से भी नया ऑब्जेक्ट बन सकता है।

       5. इन समस्याओं से बचने का अल्टीमेट उपाय: Enum Singleton
       जावा के निर्माता Joshua Bloch ने अपनी किताब Effective Java में बताया कि अगर आपको दुनिया का सबसे
       सेफ और परफेक्ट Singleton बनाना है, तो आपको सामान्य क्लास की बजाय enum का उपयोग करना चाहिए।
    ->   Enum Singleton का कोड:

    public enum AppConfigSingleton
    {
         INSTANCE; // यही इकलौता ऑब्जेक्ट है

         // आप इसमें अपने मेथड्स लिख सकते हैं
        public void doSomething()
        {
           System.out.println("Singleton working perfectly!");
        }
    }


यह सबसे बेस्ट क्यों है?
  -इसे कोई Reflection या Serialization से तोड़ नहीं सकता।
   जावा खुद इसकी गारंटी लेता है कि एनम का सिर्फ एक ही इंस्टेंस बनेगा।
   -इसमें थ्रेड-सेफ्टी की कोई झंझट नहीं होती।
*/