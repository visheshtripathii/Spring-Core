package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
    private List<String> myFriends;
    private Map<String,Integer> feeStructure;
    private Set<Integer> randomSet;
    private Properties props;

    public List<String> getMyFriends() {
        return myFriends;
    }

    public void setMyFriends(List<String> myFriends) {
        this.myFriends = myFriends;
    }

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    public Set<Integer> getRandomSet() {
        return randomSet;
    }

    public void setRandomSet(Set<Integer> randomSet) {
        this.randomSet = randomSet;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Person{" +
                "myFriends=" + myFriends +
                ", feeStructure=" + feeStructure +
                ", randomSet=" + randomSet +
                ", props=" + props +
                '}';
    }
}
