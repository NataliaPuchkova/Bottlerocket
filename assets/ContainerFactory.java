package assets;
/** 
* Factory class allows to create list of containeers and do all needed manipulations with containers according to requirements
* Factory allows to create new container and to print information about all containers
*/
import java.util.HashMap;

public class ContainerFactory implements Printable, ContainersManagable{

	private HashMap<Integer, Container> containers = new HashMap<Integer, Container>();

	public Container add(int id, String description, String name){
		Container c = new Container(id, name, description);
		containers.put(id, c);
		return c;
	}

	public void print(){
		containers.forEach((x,y)->y.print());
	}
	
}
