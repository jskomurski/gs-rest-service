package resources;


//@Entity
public class Data {
    // Model
    // { resourceType:Person, id : string, name : string,
    // age : integer, locale : string}

    private String resourceType;

    //@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private Integer age;
    private String locale;

    protected Data(){ }

    public Data(String resourceType,  String name, Integer age, String locale) {
        this.resourceType = resourceType;
        this.name = name;
        this.age = age;
        this.locale = locale;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString(){
        return String.format(
                "Data[resource='%s',id=%d, name='%s', age='%s', locale='%s']",
                resourceType, id, name, age, locale);
    }
}
