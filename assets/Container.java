package assets;
/**
* Class Container allows create a container, print and add an asset, realized the minimum of requirements - no getters/setters, no additional classes like remove an asset
*/
import java.util.ArrayList;

public class Container implements Printable, Scalable{
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

	public Container add(String typeIndicator, String id, String name, String  url, String expirationDate){
                assets.add((new Image()).
				setTypeIndicator(typeIndicator).
				setId(id).
				setName(name).
				setUrl(url).
				setExpirationDate(expirationDate));
                return this;
        }

 	public Container add(String typeIndicator, String id, String name, String  url, String expirationDate, boolean isClip){
		assets.add(((Video)  (new Video()).
					setTypeIndicator(typeIndicator).
					setId(id).setName(name).
					setUrl(url).
					setExpirationDate(expirationDate)).
					setIsClip(isClip));
                return this;
        }

	public Container add(String typeIndicator, String id, String name, String  url, String expirationDate, boolean isClip,  String description){
                assets.add(((Ad) ((Video) (new Ad()).
					setTypeIndicator(typeIndicator).
					setId(id).
					setName(name).
					setUrl(url).
					setExpirationDate(expirationDate)).
					setIsClip(isClip)).
					setProductDescription(description));
                return this;
        }

}
