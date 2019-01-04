package assets;
/* 
 *POJO abstract class for assets. User cannot create abstract asset - only particular type of asset, but the main functionaluty is here
*
*/
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

public  abstract class Asset implements Printable{        
	protected String id;
	protected String name;
        protected String typeIndicator;
        protected String url;
        protected String expirationDate; 
	
   	public void print(){
                System.out.println(this.toString());
        }

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return this.url;
	}

	public void setExpirationDate(String expirationDate){
		this.expirationDate = expirationDate;
	}

	public String getExpirationDate(){
		return this.expirationDate;
	}

	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

	public int hashCode() {
   		return HashCodeBuilder.reflectionHashCode(this);
 	}        

	public boolean equals(Object obj) {
   		return EqualsBuilder.reflectionEquals(this, obj);
 	}
}
