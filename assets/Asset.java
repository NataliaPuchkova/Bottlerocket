package assets;
/* 
 *POJO abstract class for assets. User cannot create abstract asset - only particular type of asset, but the main functionaluty is here
*
*/
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.time.format.*;
import java.time.*;

public  abstract class Asset implements Printable{        
	private String id;
	private String name;
        private String typeIndicator;
        private String url;
        private LocalDate expirationDate; 

	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	
   	public void print(){
                System.out.println(this.toString());
        }

	protected Asset setId(String id){
		this.id = id;
		return this;
	}

	protected String getId(){
		return this.id;
	}

	protected Asset setName(String name){
		this.name = name;
		return this;
	}

	protected String getName(){
		return this.name;
	}

	protected Asset setTypeIndicator(String typeIndicator){
                this.typeIndicator = typeIndicator;
		return this;
        }

        protected  String getTypeIndicator(){
                return this.typeIndicator;
        }

	protected Asset setUrl(String url){
		this.url = url;
		return this;
	}

	protected String getUrl(){
		return this.url;
	}

	protected Asset setExpirationDate(String expirationDate){
		try{
			this.expirationDate = LocalDate.parse(expirationDate, formatter);
		} catch (Exception ex){
			System.out.println("Couldn't parse the date");
		}
		return this;
	}

	protected String getExpirationDate(){
		if (this.expirationDate==null) return "";
                return	this.expirationDate.format(formatter);
        }

	@Override
        public String toString(){
                StringBuilder str = new StringBuilder(typeIndicator);
                return
		    str.
			append(": id=").append(id).append(", ").
                        append("name=").append(name).append(", ").
			append("url=").append(url).append(", "). 
                       	append("expirationDate=").append(getExpirationDate()).
                        toString();
        }

	public int hashCode() {
   		return HashCodeBuilder.reflectionHashCode(this);
 	}        

	public boolean equals(Object obj) {
   		return EqualsBuilder.reflectionEquals(this, obj);
 	}
}
