package com.oocl.service;

import com.oocl.entity.ParkingLot;
import com.oocl.respository.ParkingLotRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

/**
 * @Author: Leon
 * @Description:
 * @Date: Create in 4:45 PM 8/23/2018
 * @Modified By:
 */
@RunWith(SpringRunner.class)
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


//    @Test
//    public void should_return_company_when_addCompany(){
//        CompanyService companyService=new CompanyService(companyRepository,employeesRepository);
//        Company company=new Company(1,"ad");
//        given(companyRepository.save(company)).willReturn(company);
//        companyService.addCompany(company);
//        verify(companyRepository).save(company);
//    }
}