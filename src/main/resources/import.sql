-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
 insert into TB_VEICULO (vehicleId,vehicle_name,vehicle_brand,vehicle_year,vehicle_description,vehicle_saled,vehicle_created,vehicle_updated)
 values(1, '2008', 'Peugeot', 2022, 'Vehicle description', true, '2019-03-27T10:15:30', '2019-03-27T10:15:30');

 insert into TB_VEICULO (vehicleId,vehicle_name,vehicle_brand,vehicle_year,vehicle_description,vehicle_saled,vehicle_created,vehicle_updated)
 values(2, 'Cullinan', 'Rolls Royce', 2022, 'Vehicle description', false, '2019-03-27T10:15:30', '2019-03-27T10:15:30');


 alter sequence vehicle_seq restart with 3;