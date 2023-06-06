package com.demo.changge.three.modle;

import com.demo.changge.four.modle.Person;

public class Girl extends Person {
    public Girl() {
        this.setSex("Female");
    }

    public Girl(String name,Integer age) {
        this.setSex("Female");
        this.setAge(age);
        this.setName(name);
    }
}
