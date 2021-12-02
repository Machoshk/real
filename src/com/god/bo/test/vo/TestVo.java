package com.god.bo.test.vo;

import java.util.Objects;

public class TestVo {
    private String id;
    private String name;

    public TestVo(){
    }

    public TestVo(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public  String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        TestVo testVo = (TestVo) o;
        return Objects.equals(id, testVo.id) &&
                Objects.equals(name, testVo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    @Override
    public String toString() {
        return "TestVo{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }
}

