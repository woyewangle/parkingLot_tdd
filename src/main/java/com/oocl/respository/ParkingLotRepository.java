package com.oocl.respository;

import com.oocl.entity.ParkingBoy;
import com.oocl.entity.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.temporal.TemporalAmount;
import java.util.List;

/**
 * @Author: Leon
 * @Description:
 * @Date: Create in 4:59 PM 8/23/2018
 * @Modified By:
 */
@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot,Long> {

    List<ParkingLot> findByParkingBoy(ParkingBoy parkingBoy);


    List<ParkingLot> findByName(String name);

}
