package com.oocl.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Leon
 * @Description:
 * @Date: Create in 5:10 PM 8/23/2018
 * @Modified By:
 */
@Entity
public class ParkingBoy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;

    @OneToMany(mappedBy = "parkingBoy", fetch= FetchType.LAZY)
    private List<ParkingLot> lots=new ArrayList<>();

    public ParkingBoy() {
    }

    public ParkingBoy( String name, String phone) {
//        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void addParkingLot(ParkingLot parkingLot){
        lots.add(parkingLot);
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<ParkingLot> getLots() {
        return lots;
    }

    public void setLots(List<ParkingLot> lots) {
        this.lots = lots;
    }
}
