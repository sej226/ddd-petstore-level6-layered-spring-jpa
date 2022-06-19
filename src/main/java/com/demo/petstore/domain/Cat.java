package com.demo.petstore.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("cat")
public class Cat extends Pet{

    @Override
    public String speak() {
        return "냥냥";
    }

    @Override
	public void sleep(){
		energy = energy + 1;
        appearance = appearance + 1;
	}

}
