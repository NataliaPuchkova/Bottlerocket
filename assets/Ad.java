package assets;
/**
* Class of Ads 
*/
class Ad extends Video{

	private String productDescription;	
	
	protected Ad setProductDescription (String productDescription){
		this.productDescription = productDescription;
		return this;
	}

	private String getProductDescription(){	
		return this.productDescription;
	}

	@Override
	public String toString(){
                StringBuilder str = new StringBuilder(getTypeIndicator());
		return str.append(": id=").append(getId()).append(", ").
                        append("name=").append(getName()).append(", ").
			append("url=").append(getUrl()).append(", ").
                        append("expirationDate=").append(getExpirationDate()).append(", ").
			append(getIsClip()).append(", ").
			append("productDescription=").append(getProductDescription()).toString();
        }

}
