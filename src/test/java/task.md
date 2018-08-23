##Story 1
 作为经理
 我可以按照停车员的电话号码、停车场的名字、停车场的容量进行组合查询
 ###Controller
 ```java

 1.Given parkingBoy phone number 1352546585
   When call findParkingLots
   Then return List is parkingLot1
 2.Given parkingLot name '南方'
   When call findParkingLots
   Then return List is parkingLot1
 3.Given parkingLot size 10
   When call findParkingLots
   Then return List is parkingLot1

 4.Given parkingLot name is 南方 and size is 10
   When call findParkingLots
   Then return List is parkingLot1
```
 ###Service
 ```java
 1.Given parkingBoy phone number 1352546585
   When call findByConditions
   Then return List is parkingLot1
 2.Given parkingLot name '南方'
   When call findByConditions
   Then return List is parkingLot1
 3.Given parkingLot size 10
   When call findByConditions
   Then return List is parkingLot1
```

