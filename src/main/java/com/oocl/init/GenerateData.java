package com.oocl.init;

import com.oocl.entity.ParkingBoy;
import com.oocl.entity.ParkingLot;
import com.oocl.respository.ParkingBoyRepository;
import com.oocl.respository.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: Leon
 * @Description:
 * @Date: Create in 8:46 PM 8/23/2018
 * @Modified By:
 */
@Component
@Order(value = 3)
public class GenerateData implements CommandLineRunner {
    @Autowired
    private ParkingLotRepository parkingLotRepository;

    @Autowired
    private ParkingBoyRepository parkingBoyRepository;

    @Override
    public void run(String... args) throws Exception {
        ParkingBoy parkingBoy1 = new ParkingBoy("小南","13525465855");
        ParkingBoy parkingBoy2 = new ParkingBoy("小北","13544685656");

        ParkingLot parkingLot1 = new ParkingLot("东方停车场",10);
        ParkingLot parkingLot2 = new ParkingLot("南方停车场",10);
        ParkingLot parkingLot3 = new ParkingLot("北方停车场",10);

//        parkingLot1.addParkingBoy(parkingBoy1);
//        parkingLot2.addParkingBoy(parkingBoy1);
//
//
//        parkingBoy1.addParkingLot(parkingLot1);
//        parkingBoy1.addParkingLot(parkingLot2);
        parkingLotRepository.saveAll(Arrays.asList(parkingLot1,parkingLot2,parkingLot3));
        parkingBoyRepository.saveAll(Arrays.asList(parkingBoy1,parkingBoy2));

    }

}
