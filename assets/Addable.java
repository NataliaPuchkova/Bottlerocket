package assets;
/**
*	Interface allows to add a new asset
*/

import java.util.*;

interface  Addable{
	
	public Container add(String name, String id, String type, String  url, String expirationDate, String productDescription);

}
