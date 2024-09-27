package kasper.devOps.Assigment3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FacebookFriendsFetcherTest {

    private final FacebookFriendsFetcher facebookFriendsFetcher = new FacebookFriendsFetcher();

    // positive

    @Test
    public void testGetFriendsList_JohnProfile() {
        String[] expected = {"Alice", "Bob", "Charlie"};
        
        assertArrayEquals(expected, facebookFriendsFetcher.getFriendsList("https://www.facebook.com/john"),
                "john profile return Alice, Bob, Charlie");
    }

  
    @Test
    public void testGetFriendsList_JaneProfile() {
        
    	String[] expected = {"David", "Emily", "Frank"};
        assertArrayEquals(expected, facebookFriendsFetcher.getFriendsList("https://www.facebook.com/jane"),
                "jane profile return David, Emily, Frank");
    }

    // negative

    @Test
    public void testGetFriendsList_UnknownProfile() {
        String[] expected = {};
        assertArrayEquals(expected, facebookFriendsFetcher.getFriendsList("https://www.facebook.com/unknown"),
                "unknown profile return an empty array");
    }

    // test empty
    @Test
    public void testGetFriendsList_EmptyString() {
        String[] expected = {};
        assertArrayEquals(expected, facebookFriendsFetcher.getFriendsList(""),
                "empty profile link return empty array");
    }

    // test null
    @Test
    public void testGetFriendsList_NullProfile() {
        assertThrows(NullPointerException.class, () -> {
            facebookFriendsFetcher.getFriendsList(null);
        }, " null should throw null");
    }
}
