package com.oocl.service;

import com.oocl.entity.Conditions;
import com.oocl.entity.ParkingLot;
import com.oocl.respository.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 3:51 PM 8/23/2018
 * @Modified By:
 */
@Service
public class ParkingLotService {

    @Autowired
    ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository=parkingLotRepository;
    }

    public List<ParkingLot> findByConditions(Conditions conditions) {
        List<ParkingLot> lots= new ArrayList<>();
        if(conditions.getName()!=null&&conditions.getSize()!=null){
            lots=parkingLotRepository.findAllByNameAndSize(conditions.getName(),conditions.getSize());
        }
        if(conditions.getName()!=null){
            lots=parkingLotRepository.findAllByName(conditions.getName());
        }
        if(conditions.getSize()!=null){
            lots=parkingLotRepository.findAllBySize(conditions.getSize());
        }
        return lots;
    }
}
