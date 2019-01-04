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
		int containerId = 1;
		containers.add(containerId, "This is container",  "Container1")
				.add("Movie 1", "1", "clip", "url1", "2012.02.01", null)
				.add("Movie 3", "2", "full", "url2", "2012.02.01", null)
				.add("Image 1", "3",  null,  "url3", "2012.02.01", null)
				.add("Image 2", "4",  null,  "url4", "2012.02.01", null)
				.add("Ad 1",    "5",  "ad",  "url5", "2012.02.01", "description 1")
				.add("Ad 2",    "6",  "ad",  "url6", "2012.02.01", "description 2");
		containers.print();		 
	}

}
