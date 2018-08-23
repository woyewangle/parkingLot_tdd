##Story 1
 作为经理
 我可以按照停车员的电话号码、停车场的名字、停车场的容量进行组合查询
 ###Controller
 ```java 
 1.Given parkingBoy phone number 1352546585
   When call findParkingLots(String phone) 
   Then return List is parkingLot1
 2.Given parkingLot name '南方'
   When call findParkingLots(String name)
   Then return List is parkingLot1
```
 ###Service
 ```java
 1.Given parkingBoy phone number 1352546585
   When call findParkingLots(String phone)
   Then return List is parkingLot1
```

