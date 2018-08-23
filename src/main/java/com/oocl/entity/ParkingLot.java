package com.oocl.entity;

import javax.persistence.*;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 4:13 PM 8/23/2018
 * @Modified By:
 */
@Entity
@Table(name = "parking_lot")
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int size;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "parkingBoy_id")
    private ParkingBoy parkingBoy;

    public ParkingLot() {
    }

    public ParkingLot(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void addParkingBoy(ParkingBoy parkingBoy){
        this.parkingBoy = parkingBoy;
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
