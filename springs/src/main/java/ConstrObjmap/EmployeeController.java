package ConstrObjmap;

import java.util.Map;
import java.util.Map.Entry;

public class EmployeeController{

//instance varible
Map<String,Config> map1;
private Map<String, Config> props;


//constr
public EmployeeController(Map<String, Config> props) {
this.map1 = props;
}

public void process() {

//iterate the map
for(Entry<String, Config> entry : map1.entrySet()){
System.out.println(entry.getKey());
Config c = entry.getValue();
System.out.println(c.path);
}
}

}


