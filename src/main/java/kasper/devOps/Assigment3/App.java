package kasper.devOps.Assigment3;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        FacebookFriendsFetcher fetcher = new FacebookFriendsFetcher();
        String[] friends = fetcher.getFriendsList("https://www.facebook.com/john");

        System.out.println("John's friends:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
