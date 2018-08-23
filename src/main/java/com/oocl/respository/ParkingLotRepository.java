package com.oocl.respository;

import com.oocl.entity.ParkingBoy;
import com.oocl.entity.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

    @Query("SELECT lot FROM ParkingLot lot where lot.name like %:name%")
    List<ParkingLot> findAllByName(@Param("name")String name);


    List<ParkingLot> findByName(String name);

}
