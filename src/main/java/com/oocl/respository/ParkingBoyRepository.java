package com.oocl.respository;

import com.oocl.entity.ParkingBoy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Leon
 * @Description:
 * @Date: Create in 8:59 PM 8/23/2018
 * @Modified By:
 */
@Repository
public interface ParkingBoyRepository extends JpaRepository<ParkingBoy,Long> {
    ParkingBoy findByPhone(String number);
}
