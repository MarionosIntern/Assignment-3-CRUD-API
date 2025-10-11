package CSC._0.Assignment3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cats")

public class Cat{
    @Id
    @GeneratedValue(stategy = GenerationType.IDENTITY)
    private Long catId;

    @Column(nullable = false)
    private String name;
    
    private String sex;
    private String description;
    private String breed; 

    @Column(nullable = false)
    private int age;
    private double weight;

    public Cat(){
    }

    public Cat(Long catId, String name, String sex, String description, String breed, int age, double weight){
        this.catId = catId;
        this.name = name;
        this.sex = sex;
        this.description = description;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, String sex, String description, String breed, int age, double weight){
        this.name = name;
        this.sex = sex;
        this.description = description;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public Long getCatId(){
        return catId;
    }

    public void setCatId(Long id){
        this.catId = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

}

