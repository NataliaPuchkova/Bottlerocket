package assets;
/**
* Class of Videos, type of videos checked and setup in the factory class
*/
class Video extends Asset{
	public Video(String id, String name, String typeIndicator, String url, String expirationDate){
		this.id = id;
		this.name  = name;
		this.typeIndicator = typeIndicator;
		this.url = url;
		this.expirationDate = expirationDate;
	}

	@Override
	 public String toString(){
                StringBuilder str = new StringBuilder("Video: ");
                str.append("id=").append(id).append(", ").
                        append("url=").append(url).append(", ").
                        append("name=").append(name).append(", ").
			append("typeIndicator=").append(typeIndicator).append(", ").
                        append("expirationDate=").append(expirationDate);
		return str.toString();
        }


}
