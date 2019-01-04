package assets;
/**
* Class of Images 

*/
class Image extends Asset{
	protected  Image(String name, String id, String url, String expirationDate){
                this.id = id;
                this.name = name;
                this.url = url;
                this.expirationDate = expirationDate;
        }	

	@Override
	public String toString(){
		StringBuilder str = new StringBuilder("Image: ");
		str.append("id=").append(id).append(", ").
			append("url=").append(url).append(", ").
			append("name=").append(name).append(", ").
			append("expirationDate=").append(expirationDate);
		return str.toString();	
	}


}
