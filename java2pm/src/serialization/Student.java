package serialization;
import java.io.Serializable;

public class Student implements Serializable {

int id;
String name;
transient int refNo;
String userType = "";

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getRefNo() {
return refNo;
}

public void setRefNo(int refNo) {
this.refNo = refNo;
}

public String getUserType() {
return userType;
}

public void setUserType(String userType) {
this.userType = userType;
}

public Student(int id, String name, int refNo) {
super();
this.id = id;
this.name = name;
this.refNo = refNo;
}

}