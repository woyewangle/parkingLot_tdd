package com.oocl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oocl.controller.ParkingLotController;
import com.oocl.entity.ParkingBoy;
import com.oocl.entity.ParkingLot;
import com.oocl.service.ParkingBoyService;
import com.oocl.service.ParkingLotService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
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

    @MockBean
    private ParkingBoyService parkingBoyService;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void should_return_parkingLot1_given_a_parkingBoy_phone_number_1352546585_when_call_findParkingLots() throws Exception {

        ParkingLot parkingLot1=new ParkingLot("北方停车场",10);
        ParkingBoy parkingBoy = new ParkingBoy("小北","13525465855",Arrays.asList(parkingLot1));
        given(parkingBoyService.findByPhone(anyString())).willReturn(parkingBoy);
        mockMvc.perform(get("/parkingLots?number=:"+"13525465855"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("北方停车场"))
                .andExpect(jsonPath("$[0].size").value(10));

    }

    @Test
    public void should_return_parkingLot1_given_condition_is_parkingLot_name_when_call_findParkingLots() throws  Exception{
        ParkingLot parkingLot1=new ParkingLot("南方停车场",10);
        given(parkingLotService.findByConditions(any())).willReturn(Arrays.asList(parkingLot1));
        mockMvc.perform(get("/parkingLots?name=南方"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("南方停车场"))
                .andExpect(jsonPath("$[0].size").value(10));
    }


    @Test
    public void should_return_parkingLot1_given_condition_is_parkingLot_size_is_10_when_call_findParkingLots() throws  Exception{
        ParkingLot parkingLot1=new ParkingLot("南方停车场",10);
        given(parkingLotService.findByConditions(any())).willReturn(Arrays.asList(parkingLot1));
        mockMvc.perform(get("/parkingLots?size=10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("南方停车场"))
                .andExpect(jsonPath("$[0].size").value(10));
    }

    @Test
    public void should_return_parkingLot1_given_condition_is_parkingLot_name_and_size_when_call_findParkingLots() throws  Exception{
        ParkingLot parkingLot1=new ParkingLot("南方停车场",10);
        given(parkingLotService.findByConditions(any())).willReturn(Arrays.asList(parkingLot1));
        mockMvc.perform(get("/parkingLots?name=南方&&size=10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("南方停车场"))
                .andExpect(jsonPath("$[0].size").value(10));
    }



}
