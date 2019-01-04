package assets;
/**
* Class Container allows create a container, print and add an asset (realized the minimum of requirements - no getters/setters, no additional classes like remove an asset
*/
import java.util.*;

public class Container implements Printable, Addable{
	private ArrayList<Asset> assets = new ArrayList<Asset>();
	private int id;
	private String name;
	private String description;	

	public Container(int id, String name, String description){
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public void print(){
		StringBuilder str = new StringBuilder("Container ");
		str.append("id:").append(id).append(", ").
		    append("name:").append(name).append(", ").
		    append("description:").append(description).append(", ").
		    append("Assets:");
				
		System.out.println(str.toString());
		if (assets.size()==0) System.out.println("No assets");
                else	assets.stream()
			.forEach(x->x.print());
		System.out.println("-----------------------------");
	}

	public Container add(String name, String id, String type, String  url, String expirationDate, String productDescription){
        	if (type==null) assets.add(new Image( name, id, url, expirationDate));
		else if (type.equals("ad")) assets.add(new Ad(id, name,  url, expirationDate, productDescription));
		else if (type.equals("full") || type.equals("clip")) assets.add(new Video(id, name, type, url, expirationDate));
		return this;
	}

	
}
