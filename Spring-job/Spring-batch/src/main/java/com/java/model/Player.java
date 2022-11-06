package com.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Player {

    @Id
    private Integer id;
    private String name;
    private String order;
    private Integer runs;
    private Date time;

    public Player(Integer id, String name, String order, Integer runs, Date time) {
        this.id = id;
        this.name = name;
        this.order = order;
        this.runs = runs;
        this.time = time;
    }

    public Player() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Integer getSalary() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", order='").append(order).append('\'');
        sb.append(", runs=").append(runs);
        sb.append('}');
        return sb.toString();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
