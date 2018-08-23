package com.oocl.entity;

import javax.persistence.Entity;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 4:13 PM 8/23/2018
 * @Modified By:
 */
@Entity
public class ParkingLot {
    private Long id;
    private String name;
    private int size;

    public ParkingLot() {
    }

    public ParkingLot(Long id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
