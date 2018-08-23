package com.oocl.service;

import com.oocl.entity.Conditions;
import com.oocl.entity.ParkingLot;
import com.oocl.respository.ParkingLotRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

/**
 * @Author: Leon
 * @Description:
 * @Date: Create in 4:45 PM 8/23/2018
 * @Modified By:
 */
@ExtendWith(MockitoExtension.class)
class ParkingLotServiceTest {
    @Mock
    ParkingLotRepository parkingLotRepository;

//    @Test
//    public void should_return_right_parkingLotList_when_find_by_phone_number_1352546585() {
//        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
//        List<ParkingLot> parkingLots = new ArrayList<>();
//        parkingLots.add(new ParkingLot(1L,"北方停车场",10));
//        given(parkingLotRepository.findByConditions(anyString())).willReturn(parkingLots);
//
//        List<ParkingLot> parkingLotList = parkingLotService.findParkingLots("1352546585");
//
//        assertThat(parkingLotList,is(parkingLots));
//
//    }


    @Test
    public void should_return_parkingLot1_when_name_is_not_null(){
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
        ParkingLot parkingLot = new ParkingLot("南方停车场",10);
        when(parkingLotRepository.findAllByName(any())).thenReturn(Arrays.asList(parkingLot));
        Conditions conditions = new Conditions();
        conditions.setName("南方");
        List<ParkingLot> lots = parkingLotService.findByConditions(conditions);
        assertThat(lots,is(Arrays.asList(parkingLot)));
    }

    @Test
    public void should_return_parkingLot1_when_size_is_10(){
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
        ParkingLot parkingLot = new ParkingLot("南方停车场",10);
        when(parkingLotRepository.findAllBySize(any())).thenReturn(Arrays.asList(parkingLot));
        Conditions conditions = new Conditions();
        conditions.setSize(10);
        List<ParkingLot> lots = parkingLotService.findByConditions(conditions);
        assertThat(lots,is(Arrays.asList(parkingLot)));
    }
}