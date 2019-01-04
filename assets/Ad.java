package assets;
/**
* Class of Ads 
*/
class Ad extends Asset{
	private String productDescription;	

	public Ad(String id, String name, String url, String expirationDate, String productDescription){
		this.id = id;
		this.name = name;
		this.url = url;
		this.expirationDate = expirationDate;
		this.productDescription = productDescription;
	}

	public void setProductDescription (String productDescription){
		this.productDescription = productDescription;
	}

	public String getProductDescription(){	
		return this.productDescription;
	}

	@Override
	public String toString(){
                StringBuilder str = new StringBuilder("Ad: ");
                str.append("id=").append(id).append(", ").
                        append("url=").append(url).append(", ").
                        append("name=").append(name).append(", ").
                        append("productDescription=").append(productDescription).append(", ").
                        append("expirationDate=").append(expirationDate);
		return str.toString();
        }

}
