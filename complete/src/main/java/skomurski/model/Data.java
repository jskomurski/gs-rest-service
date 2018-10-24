package skomurski.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
    // Model
    // { resourceType:Person, id : string, name : string,
    // age : integer, locale : string}
    @Id
    @GeneratedValue
    private Long id;
    private String resourceType;
    private String name;
    private Integer age;
    private String locale;

    public Data(){ }

    /*
    public Data(String resourceType,  String name, Integer age, String locale) {
        this.resourceType = resourceType;
        this.name = name;
        this.age = age;
        this.locale = locale;
    }
    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }


    public String toString(){
        return String.format(
                "Data[resource='%s',id=%d, name='%s', age='%s', locale='%s']",
                resourceType, id, name, age, locale);
    }

}
