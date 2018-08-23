package com.oocl.service;

import com.oocl.entity.ParkingBoy;
import com.oocl.respository.ParkingBoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Leon
 * @Description:
 * @Date: Create in 9:08 PM 8/23/2018
 * @Modified By:
 */
@Service
public class ParkingBoyService {

    @Autowired
    ParkingBoyRepository parkingBoyRepository;

    public ParkingBoy findByPhone(String number) {
        ParkingBoy parkingBoy = parkingBoyRepository.findByPhone(number);
        return parkingBoy;
    }
}
