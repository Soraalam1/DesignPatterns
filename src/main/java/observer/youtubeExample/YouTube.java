package observer.youtubeExample;

public class YouTube {
    public static void main(String[] args) {
        Channel soraalam1 = new Channel("soraalam1");

        Subscriber sub1 = new Subscriber("John");
        Subscriber sub2 = new Subscriber("Samantha");
        Subscriber sub3 = new Subscriber("Kevin");
        Subscriber sub4 = new Subscriber("Naomi");

       sub1.subscribeChannel(soraalam1);
       sub2.subscribeChannel(soraalam1);
       sub3.subscribeChannel(soraalam1);
       sub4.subscribeChannel(soraalam1);

       soraalam1.uploadVideo("Ultima Weapon Guide");

       sub1.unsubscribeChannel(soraalam1);

       soraalam1.uploadVideo("Drive Form Guide");
    }
}
