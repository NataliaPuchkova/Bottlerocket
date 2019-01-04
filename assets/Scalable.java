package assets;
/**
*	Interface allows to add a new asset
*/

import java.util.*;

interface  Scalable{
	// add Image	
        public Container add(String typeIndicator, String id, String name, String  url, String expirationDate);
	
	// add Video
	public Container add(String typeIndicator, String id, String name, String  url, String expirationDate, boolean isClip);
	
	// add Ad
	public Container add(String typeIndicator, String id, String name, String  url, String expirationDate, boolean isClip, String description);
}
