package com.oocl.service;

import com.oocl.entity.ParkingLot;
import com.oocl.respository.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 3:51 PM 8/23/2018
 * @Modified By:
 */
@Service
public class ParkingLotService {

    ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository=parkingLotRepository;
    }

    public List<ParkingLot> findParkingLots(String number) {
        ParkingLot parkingLot = parkingLotRepository.findByName("北方停车场").get(0);
        List<ParkingLot> lots= parkingLotRepository.findAll();

        return lots;
    }

    public List<ParkingLot> findByName(String name) {
        return null;
    }
}
