package Constrmap;

import java.util.Map;
import java.util.Map.Entry;

public class EmployeeController{

//instance varible
Map<String,String> map1;
private Map<String, String> props;


//constr
public EmployeeController(Map<String, String> props) {
this.props = props;
}

public void process() {

//iterate the map
for(Entry<String,String> entry : map1.entrySet()){
System.out.println(entry.getKey());
System.out.println(entry.getValue());
}
}

}

