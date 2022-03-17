create table schedule
( schedule_id number primary key,
 train_id number references train(train_id),
departure_from number references station(station_id),  departur_time timestamp,
  arrival_at number references station(station_id),
   arrival_time timestamp,
 reservation_date date);

create table compartment
  (comp_id number primary key,
    bogie_id number references bogie(bogie_id));

create table seats
  (
   seat_id number primary key,
   comp_id number references compartment(comp_id),
  reservation_date date,
   user_id number references users(user_id));

 create table passengers
  (
  passenger_id number primary key,
  user_id number references users(user_id),
  seat_id number references seats(seat_id),
   phone_no varchar2(20),
  cnic varchar2(20),
  schedule_id number references schedule(schedule_id));
  
  create table admin
  (Admin_id number primary key,
admin_username varchar(100),
admin_pass varchar(100));

  create table agent
  (Agent_id number primary key,
  agent_city varchar(100),
agent_username varchar(100),
agent_pass varchar(100));

  create table city
  (city_code varchar(3) primary key,
city_name varchar(100));

create table bus
(bus_id number primary key,
bus_name varchar2(20));

   create table bookings
  (booking_id number primary key,
  user_id number(38),
agent_id number(38),
train_id number(38),
departure_time timestamp
);


Alter table bogie add constraint fk_train train_id number references train(train_id);

