package com.oocl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oocl.controller.ParkingLotController;
import com.oocl.entity.ParkingLot;
import com.oocl.service.ParkingLotService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 3:49 PM 8/23/2018
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ParkingLotController.class)
public class ParkingLotControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ParkingLotService parkingLotService;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void should_return_parkingLot1_given_a_parkingBoy_phone_number_1352546585_when_call_findParkingLots() throws Exception {

        ParkingLot parkingLot1=new ParkingLot(1L,"北方停车场",10);
        given(parkingLotService.findParkingLots()).willReturn(parkingLot1);
        mockMvc.perform(get("/parkingLots/{0}","1352546585"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(1L))
                .andExpect(jsonPath("$[0].name").value("北方停车场"))
                .andExpect(jsonPath("$[0].size").value(10));

    }



}
