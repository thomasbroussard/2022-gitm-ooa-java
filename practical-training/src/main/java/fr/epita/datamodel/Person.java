package fr.epita.datamodel;

public class Person {
    private String name;
    private String sex;
    private Integer age;
    private Integer weight;
    private Integer height;



    public Person(String name, String sex, Integer age, Integer weight, Integer height) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=\"" + name + "\"" +
                ", weight=\"" + weight+"\""+
                ']';
    }
}
