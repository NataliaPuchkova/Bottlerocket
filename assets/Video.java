package assets;
/**
* Class of Videos, type of videos checked and setup in the factory class
*/
class Video extends Asset{

	private boolean isClip = false;
	private final String CLIP = "Clip";
	private final String FULL_EPISODE = "Full episode";
	
	protected Video setIsClip(boolean isClip){
		this.isClip = isClip;
		return this;
	}

	protected String getIsClip(){
		if (isClip) return CLIP; else return FULL_EPISODE;
	}

	@Override
	public String toString(){
                StringBuilder str = new StringBuilder(getTypeIndicator());
                return  str.append(": id=").append(getId()).append(", ").
                        append("name=").append(getName()).append(", ").
			append("url=").append(getUrl()).append(", ").
                        append("expirationDate=").append(getExpirationDate()).append(", type=").
			append(getIsClip()).
			toString();
        }


}
