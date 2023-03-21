public class App {
    public static void main(String[] args)  {
        Application a1 = new Application("Xshot", "GameDee", 5);
        Application a2 = new Application("Tales runner", "GameGood", 10);
        Os o1 = new Os("TOT", 20);
        o1.addApplication(a1);
        o1.addApplication(a2);
        System.out.println(o1.getUsedStorage());
        System.out.println(o1.getApplicationByName("Tales runner"));
        System.out.println(o1);
        System.out.println(o1.removeApplication(1));
        System.out.println(o1);
        System.out.println(o1.getUsedStorage());
    }
}
