package com.oocl.controller;

import com.oocl.entity.ParkingLot;
import com.oocl.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 3:54 PM 8/23/2018
 * @Modified By:
 */
@RestController
@RequestMapping("/parkingLots")
public class ParkingLotController {
    @Autowired
    ParkingLotService service;

    @Transactional
    @GetMapping(path= "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ParkingLot> findParkingLots(@RequestParam(value = "number", required = false) String number ) {
        List<ParkingLot> lots = service.findParkingLots(number);
        return lots;
    }




    /*
    * @Transactional
	@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getAllParkingLots(@RequestParam(value = "id", required = false) Long id,
	                                        @RequestParam(value = "name", required = false) String name,
	                                        @RequestParam(value = "eq", required = false) Integer eq,
	                                        @RequestParam(value = "gt", required = false) Integer gt,
	                                        @RequestParam(value = "lt", required = false) Integer lt,
	                                        @RequestParam(value = "noParkingBoy", required = false) boolean noParkingBoy) {
		if (noParkingBoy) {
			// 返回所有未安排小弟的停车场，并且未停车的停车场
			return new ResponseEntity<>(parkingLotsService.findAll().stream()
					.filter(parkingLot -> parkingLot.getParkingBoy() == null && parkingLot.getCarNum() == 0)
					.map(ParkingLotTinyDTO::new)
					.collect(Collectors.toList()), HttpStatus.OK);
		}
            List<ParkingLotTinyDTO> parkingLotTinyDTOS = new ArrayList<>();

            if (id != null) {
                // 根据ID查找
                return new ResponseEntity<>(parkingLotsService.findParkingLotById(id), HttpStatus.OK);
            }
            // TODO:组合查询
            if (name != null && eq != null) {
                parkingLotTinyDTOS = parkingLotsService.findAllParkingLotsByNameAndSize(name, eq);
            } else if (name != null) {
//            System.out.println(name);
                // TODO:根据名字查询
                parkingLotTinyDTOS = parkingLotsService.findAllParkingLotsByName(name);
            } else if (gt != null && lt != null) {
                // 根据大小范围查找
                parkingLotTinyDTOS = parkingLotsService.findAllParkingLotsBySizeBetween(gt, lt);
            } else if (gt != null) {
                // 大于等于
                parkingLotTinyDTOS = parkingLotsService.findAllParkingLotsBySizeGreaterThanEqual(gt);
            } else if (lt != null) {
                // TODO: 小于等于
                parkingLotTinyDTOS = parkingLotsService.findAllParkingLotsBySizeLessThanEqual(lt);
            } else {
                parkingLotTinyDTOS = parkingLotsService.getAllParkingLots();
            }

            return new ResponseEntity<>(parkingLotTinyDTOS, HttpStatus.OK);


        }*/
}
