import assets.ContainerFactory;
/**
 * Main class of the application creates at least one Container using ContainerFactory class, 
 * add each of types of objects and print information about each container
 * <p>
 * This app using list of gessing 
 *  -"Show" equals "print"; 
 * - don't create additional methods like removeContainer or removeAsset except methods we need to use (except getters/setters) 
 * - don't create tests
 * - don't use additional libraries, frameworks, technologies : if needed can create app with unit/integration tests - restful webservice whish will return informatiuon as aPI using Spring boot 
 */
class Main{
	public static void main(String...arg){
		ContainerFactory containers = new ContainerFactory();
		containers.add(1, "Wonderful show",  "Show 1")
                                .add("Video", "1", "Movie 1",  "url1", "01/01/2012", true)
                                .add("Video", "2", "Movie 3",  "url2", "01/10/2012", false)
                                .add("Image", "3", "Image 1",  "url3", "01/20/2012")
                                .add("Image", "4", "Image 2",  "url4", "01/02/2012")
                                .add("Ad",    "5", "Ad 1",     "url5", "03/09/2012", true, "description 1")
                                .add("Ad",    "6", "Ad 2",     "url6", "06/05/08/2012", false,  "description 2") ;
		containers.print();		 
	}

}
