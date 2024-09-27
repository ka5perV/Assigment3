package kasper.devOps.Assigment3;

public class FacebookFriendsFetcher {

    public String[] getFriendsList(String facebookProfileLink) {
    	
        if (facebookProfileLink.equals("https://www.facebook.com/john")) {
           
        	return new String[]{"Alice", "Bob", "Charlie"};
            
        } else if (facebookProfileLink.equals("https://www.facebook.com/jane")) {
            
        	return new String[]{"David", "Emily", "Frank"};
            
        } else {
            
        	return new String[0]; 
        }
    }
}
