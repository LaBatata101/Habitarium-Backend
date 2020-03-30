package main.java.entity;

import main.java.enuns.Gender;

import javax.persistence.*;

@Entity
@Table (name = "lessor")
public class Lessor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String rg;
    private String cpf;
    private String telOne;
    private String telTwo;
    private Gender gender;

    @OneToOne
    private Property property;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelOne() {
        return telOne;
    }

    public void setTelOne(String telOne) {
        this.telOne = telOne;
    }

    public String getTelTwo() {
        return telTwo;
    }

    public void setTelTwo(String telTwo) {
        this.telTwo = telTwo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
