DROP TABLE IF EXISTS Positions;
DROP TABLE IF EXISTS Bosses;
DROP TABLE IF EXISTS Users;
DROP TABLE IF EXISTS Bins;
DROP TABLE IF EXISTS Persons;
DROP TABLE IF EXISTS Cars;
-- DROP TABLE IF EXISTS Store;
CREATE TABLE Positions
(
  id int PRIMARY key auto_increment,
  employee_id char(11) not null,
  update_time datetime not null,
  longitude double not null,
  latitude double not null,
  work_status varchar(32) not null,
  kind varchar(32) not null
) default charset=utf8;
-- CREATE TABLE Store
-- (
--   id int PRIMARY key auto_increment,
--   employee_id char(11) not null,
--   update_time datetime not null,
--   longitude double not null,
--   latitude double not null,
--   work_status varchar(32) not null,
--   kind varchar(32) not null
-- ) default charset=utf8;
CREATE TABLE Bosses
(
  id int PRIMARY key auto_increment,
  boss_id char(11) not null,
  boss_name varchar(20) not null,
  phone varchar(11) not null,
  kind varchar(255) not null,
  gender varchar(255) not null,
  age int not null,
  area varchar(255) not null
) default charset=utf8;
CREATE TABLE Users
(
  id int PRIMARY key auto_increment,
  username varchar(255) not null,
  password varchar(255) not null
) default charset=utf8;
CREATE TABLE Bins
(
  id int PRIMARY key auto_increment,
  employee_id char(11) not null,
  bin_name varchar(255) not null,
  current_v int not null,
  max_v int not null,
  area varchar(255) not null,
  temperature double not null,
  boss_id char(11) not null
) default charset=utf8;
CREATE TABLE Persons
(
  id int PRIMARY key auto_increment,
  employee_id char(11) not null,
  person_name varchar(20) not null,
  phone varchar(11) not null,
  job varchar(255) not null,
  kind varchar(255) not null,
  gender varchar(255) not null,
  age int not null,
  area varchar(255) not null,
  boss_id char(11) not null
) default charset=utf8;
CREATE TABLE Cars
(
  id int PRIMARY key auto_increment,
  employee_id char(11) not null,
  car_name varchar(20) not null,
  phone varchar(11) not null,
  car_number varchar(255) not null,
  car_type varchar(255) not null,
  kind varchar(255) not null,
  gender varchar(255) not null,
  age int not null,
  area varchar(255) not null,
  boss_id char(11) not null
) default charset=utf8;
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000001","2018-12-03 00:00:00",114.909284,32.715798,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000002","2018-12-03 00:00:00",114.888883,32.70902,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000003","2018-12-03 00:00:00",114.894476,32.733951,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000004","2018-12-03 00:00:00",115.000519,32.883651,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000005","2018-12-03 00:00:00",115.005382,32.872618,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000006","2018-12-03 00:00:00",114.970512,32.903133,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000007","2018-12-03 00:00:00",114.983779,32.902745,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000008","2018-12-03 00:00:00",115.009184,32.897207,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000009","2018-12-03 00:00:00",115.027232,32.88676,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000010","2018-12-03 00:00:00",115.033834,32.904585,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000011","2018-12-03 00:00:00",115.028437,32.918556,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000012","2018-12-03 00:00:00",115.031246,32.930501,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000013","2018-12-03 00:00:00",115.125507,32.771492,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000014","2018-12-03 00:00:00",115.114446,32.770946,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000015","2018-12-03 00:00:00",115.022071,32.768945,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000016","2018-12-03 00:00:00",115.092442,32.749107,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000017","2018-12-03 00:00:00",115.080958,32.744763,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000018","2018-12-03 00:00:00",115.046383,32.75466,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000019","2018-12-03 00:00:00",115.069976,32.771442"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000020","2018-12-03 00:00:00",115.073783,32.7675636,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000021","2018-12-03 00:00:00",115.083816,32.791938,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000022","2018-12-03 00:00:00",115.050547,32.84689,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000023","2018-12-03 00:00:00",114.72381,32.823063,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000024","2018-12-03 00:00:00",114.749656,32.846173,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000025","2018-12-03 00:00:00",114.723201,32.874361,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000026","2018-12-03 00:00:00",114.720774,32.838557,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000027","2018-12-03 00:00:00",114.749453,32.814946,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000028","2018-12-03 00:00:00",114.772158,32.837846,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000029","2018-12-03 00:00:00",114.787227,32.880546 ,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000030","2018-12-03 00:00:00",115.15282,32.747985,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000031","2018-12-03 00:00:00",115.164865,  32.789258,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000032","2018-12-03 00:00:00", 115.192993,  32.805196,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000033","2018-12-03 00:00:00",115.187115,  32.800962,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000034","2018-12-03 00:00:00",115.174969, 32.792171,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000035","2018-12-03 00:00:00", 115.179997,  32.772954,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000036","2018-12-03 00:00:00",115.189636,32.771159,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000037","2018-12-03 00:00:00",115.17523,32.7658,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000038","2018-12-03 00:00:00",115.181285,32.7551,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000039","2018-12-03 00:00:00",115.173277,32.725756,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000040","2018-12-03 00:00:00",115.152086,32.727545,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000041","2018-12-03 00:00:00",115.136113,32.764293,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000042","2018-12-03 00:00:00",115.144856,32.77805,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000043","2018-12-03 00:00:00",115.156254,32.740402,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000044","2018-12-03 00:00:00",115.056744,32.834519,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000045","2018-12-03 00:00:00",115.047869,32.847255,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000046","2018-12-03 00:00:00",115.03394,32.860186,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000047","2018-12-03 00:00:00",115.013196,32.856805,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000048","2018-12-03 00:00:00",114.999619,32.853948,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000049","2018-12-03 00:00:00",114.997516,32.828764,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000101","2018-12-03 00:00:00",115.012525,32.8295,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000102","2018-12-03 00:00:00",115.026805,32.809063,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000116","2018-12-03 00:00:00",115.052735,32.801739,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000103","2018-12-03 00:00:00",114.998369,32.799765,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000104","2018-12-03 00:00:00",115.004436,32.776783,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000105","2018-12-03 00:00:00",115.109353,32.668613,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000106","2018-12-03 00:00:00",115.141157,32.648596,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000107","2018-12-03 00:00:00",115.158484,32.655048,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000108","2018-12-03 00:00:00",115.129693,32.614363,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000109","2018-12-03 00:00:00",115.169529,32.6294,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000110","2018-12-03 00:00:00",115.176401,32.621234,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000111","2018-12-03 00:00:00",115.161072,32.633925,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000112","2018-12-03 00:00:00",115.156961,32.656729,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000113","2018-12-03 00:00:00",115.16062,32.660113,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000114","2018-12-03 00:00:00",115.16062,32.660113,"on","bin");
INSERT INTO Positions(employee_id,update_time,longitude,latitude,work_status,kind) VALUES("00000000115","2018-12-03 00:00:00",115.16062,32.660113,"on","bin");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000001","河坞001",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000002","河坞002",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000003","河坞003",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000004","韩集001-3",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000005","韩集002-3",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000006","韩集003-1",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000007","韩集004-1",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000008","韩集005-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000009","韩集006-1",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000010","韩集007-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000011","韩集008-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000012","韩集009-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000013","涧头001-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000014","涧头002-4",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000015","涧头003-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000016","涧头004-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000017","涧头005-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000018","涧头006-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000019","涧头007-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000020","涧头008-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000021","涧头009-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000022","涧头010-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000023","黄楼001-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000024","黄楼002-3",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000025","黄楼003-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000026","黄楼004-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000027","黄楼005-4",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000028","黄楼006-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000029","黄楼008-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000030","杨庄户001-4",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000031","杨庄户002-1",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000032","杨庄户003",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000033","杨庄户004-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000034","杨庄户005-1",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000035","杨庄户006-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000036","杨庄户007-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000037","杨庄户8-1",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000038","杨庄户009-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000039","杨庄户010-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000040","杨庄户011-1",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000041","杨庄户012-1",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000042","杨庄户013-1",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000043","杨庄户014-1",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000044","栎城001-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000045","栎城002-4",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000046","栎城003-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000047","栎城004-1",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000048","栎城005-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000049","栎城006-3",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000101","栎城007-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000102","栎城008-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000116","栎城009-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000103","栎城010-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000104","栎城011-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000105","练村001-4",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000106","练村002-3",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000107","练村003-3",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000108","练村004-3",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000109","练村005-3",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000110","练村006-1",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000111","练村007-3",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000112","练村008-3",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000113","栎城009-2",0,100,"河坞","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000114","练村010-2",0,100,"河坞","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("00000000115","练村011-3",0,100,"河坞","6","10000000002");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039170","候兴贺","13939641526","豫SZ7729","4吨洒水车","运输","男",40,"化庄","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000030998","张褔","15938088813","豫S.Z5776","吊装车","运输","男",40,"化庄","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039901","李艳辉","15139659900","豫SZ9587","4吨洒水车","运输","男",40,"韩集","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039877","刘高峰","13507644479","豫SZ5810","5吨洗扫车","运输","男",40,"韩集","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000040005","李志杰","15103810798","豫SZ6652","吊装车","运输","男",40,"韩集","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000040001","王苏华","13525313178","豫SZ1759","4吨洒水车","运输","男",40,"弥陀寺","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039969","曹小孬","15290109618","豫SZ7699","吊装车","运输","男",40,"弥陀寺","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039862","卓军营","13513959513","豫SZ1868","8吨洒水车","运输","男",40,"砖店","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039958","王凯","17752560581","豫SZ6005","5吨洗扫车","运输","男",40,"砖店","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039995","杨宁","13526395945","关津01","4吨洒水车","运输","男",40,"关津","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039858","李党勇","18272973966","豫SZ9551","8吨洒水车","运输","男",40,"龙口","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039900","马俊峰","13783325822","豫SZ7211","吊装车","运输","男",40,"龙口","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039899","梁立新","18339632466","豫sz7795","5吨洗扫车","运输","男",40,"龙口","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039938","李海滨","15539600385","豫sz6063","5吨洗扫车","运输","男",40,"李桥","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039999","李大同","19939625560","豫SZ8557","4吨洒水车","运输","男",40,"李桥","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("1400003984","马爱国","17719189353","豫sz8003","4吨洒水车","运输","男",40,"杨庄户","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039931","吴全红","18272923195","豫sz7500","4吨洒水车","运输","男",40,"涧头","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039928","王建","13603807511","豫sz2773","5吨洗扫车","运输","男",40,"涧头","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039947","张健","13513955360","豫sz1822","吊装车","运输","男",40,"涧头","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039997","闫胜利","13839641068","豫sz1890","4吨洒水车","运输","男",40,"宋岗","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("00000000000","闫胜利","13839641068","宋岗01","5吨洒水车","运输","男",40,"宋岗","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039898","待定","","豫SZ1887","吊装车","运输","男",40,"宋岗","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000040000","杨国法","15517632086","豫PJ1209","8吨洒水车","运输","男",40,"练村","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039892","杨国法","15517632086","豫SZ1377","吊装车","运输","男",40,"练村","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039926","杨正亮","13673960001","顿岗01","4吨洒水车","运输","男",40,"顿岗","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("11111111111","杨利智","13213466869","顿岗02","吊装车","运输","男",40,"顿岗","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039998","杨树杰","","顿岗03","扫地车","运输","男",40,"顿岗","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039942","张国旗","13033853783","棠村01","8吨洒水车","运输","男",40,"棠村","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039913","李运良","15093583388","豫SZ7791","8吨洒水车","运输","男",40,"孙召","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039940","赵伟","13723059738","孙召01","5吨洗扫车","运输","男",40,"孙召","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000040006","马建国","13752061566","豫SZ3158","吊装车","运输","男",40,"孙召","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039846","黄国顺","16639619575","黄楼01","8吨洒水车","运输","男",40,"黄楼","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039972","黄卫华","13513971675","黄楼02","5吨洗扫车","运输","男",40,"黄楼","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039896","魏军","13783967261","陈店01","4吨洗扫车","运输","男",40,"陈店","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039914","展卫民","17335963590","豫sz1833","5吨洗扫车","运输","男",40,"陈店","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("22222222222","待定"," ","河坞02","4吨洒水车","运输","男",40,"河坞","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039963","石党红","13137281864","豫SZ3100","吊装车","运输","男",40,"河坞","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039961","管小武","15239649158","河坞01","4吨洒水车","运输","男",40,"河坞","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("33333333333","待定"," ","佛阁寺2","4吨洒水车","运输","男",40,"佛阁寺","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039888","黄东东"," ","佛阁寺1","8吨洒水车","运输","男",40,"佛阁寺","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039894","待定"," ","0-25","8吨洒水车","运输","男",40,"余店","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039914","待定"," ","0-25","8吨洗扫车","运输","男",40,"余店","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039919","张佳旭","18137563288","豫sz6637","8吨洒水车","运输","男",40,"栎城","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039797","段世雷","13223826711","豫sz7569","5吨洗扫车","运输","男",40,"栎城","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039889","卢鹏飞","17339665366","0-25","4吨洒水车","运输","男",40,"栎城","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039800","待定","","豫SZ8000","8吨洒水车","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000040004","待定","","豫SZ8066","5吨洗扫车","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039842","何培露","13849767999","豫SH9K69","五菱宏光","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039954","王接","13323977737","豫SK3K01","五菱宏光","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039880","程本华","15357172478","豫SB3V23","江铃皮卡","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000037039","朱总","","豫SM7Q28","桑塔纳","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039944","楚修","152367114985","豫SL7X71","五菱宏光","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039793","任学伟","17737022276","豫SM7J93","江铃皮卡","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000040002","待定","","皖AD2300","5吨洗扫车","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039994","谢本军","17730893090"," 豫SL6S39","江铃皮卡","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039841","李涛","15357434011","豫SH1V23","皮卡","运输","男",40,"","10000000001");
INSERT INTO Cars(employee_id,car_name,phone,car_number,car_type,kind,gender,age,area,boss_id) VALUES("14000039796","张飞","15893969818","豫SM3J53","皮卡","运输","男",40,"","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703154863","周峰","15839639932","主管","扫地","女",35,"关津","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155452","梅正友","13653966668","队长","装卸","女",35,"关津","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155549","扬玉芳","13783962363","队长","装卸","女",35,"关津","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155657","王汉友","15136555706","队长","装卸","女",35,"关津","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155741","刘振","13223964566","主管","装卸","女",35,"孙召","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703156025","孙燕华","17339668982","队长","装卸","女",35,"孙召","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703152430","李伟","15839636368","队长","巡视","女",35,"孙召","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703070715","王小响","15136591753","队长","巡视","女",35,"孙召","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703156074","刘洋","13938371803","主管","扫地","女",35,"涧头","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155200","杨心想","15839668070","队长","扫地","女",35,"涧头","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155769","李伟伟","13303963445","队长","扫地","女",35,"涧头","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155736","邹辉","13839637853","队长","扫地","女",35,"涧头","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703071129","余文海","13939615017","队长","扫地","女",35,"涧头","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155227","谢广清","15290154809","主管","扫地","女",35,"陈店","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703140348","刘海华","13783344816","队长","扫地","女",35,"陈店","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703071457","刘磊磊","13461430988","队长","扫地","女",35,"陈店","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703071324","谢耀","15236982953","队长","扫地","女",35,"陈店","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703140608","李勇","18336180888","主管","扫地","女",35,"宋岗","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703140124","陈志明","15517658579","队长","扫地","女",35,"宋岗","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703156092","陈华","15565748028","队长","扫地","女",35,"宋岗","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155078","李大同","19939625560","主管","扫地","女",35,"李桥","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703059961","邱小松","15539600385","队长","扫地","女",35,"李桥","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703071460","邱凡金","15516857618","队长","扫地","女",35,"李桥","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703164627","李光领","13783397768","主管","扫地","女",35,"砖店","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155326","李芳民","13939681563","队长","扫地","女",35,"砖店","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703154789","杜秀民","13949588800","队长","扫地","女",35,"砖店","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703070979","闫清新","13507646708","主管","扫地","女",35,"练村","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01704074524","杨利俭","13783383953","队长","扫地","女",35,"练村","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155409","林辉","15978460954","队长","扫地","女",35,"练村","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155454","闫清亮","17602656073","队长","扫地","女",35,"练村","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703074610","闫泽礼","15939652201","队长","扫地","女",35,"练村","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703074825","郑海华","18739646000","队长","扫地","女",35,"练村","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703071367","李乐","13723053002","主管","扫地","女",35,"黄楼","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155847","张银臣","18539604345","主管","扫地","女",35,"黄楼","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703103312","褚继红","13598928428","队长","扫地","女",35,"黄楼","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703074558","时红军","13137251085","队长","扫地","女",35,"黄楼","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703155772","赵学文","13087087890","队长","扫地","女",35,"黄楼","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("01703156084","王小超","18339672377","队长","扫地","女",35,"黄楼","10000000001");

INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13223964566","刘振","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17339668982","孙艳华","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15839636368","李伟","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15136591753","王小响","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15836666646","徐杰","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17067106789","时刚","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15093570111","徐亚豪","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15939689777","王振华","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18239637888","韩进军","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13938371803","刘洋","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13939615017","余文海","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15839668070","杨心想","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13303963445","李伟伟","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13839637853","邹辉","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15290154809","谢广清","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13783344816","刘海华","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13461430988","刘磊磊","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15236982953","谢耀","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17133832888","高团结","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15893921011","王乐峰","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15239655000","杜振杰","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15346361231","陈伟","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13513860726","任东","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18336180888","李勇","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15517658579","陈志明","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15565748028","陈华","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15839639932","周峰","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13653966668","梅正友","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13783962363","扬玉芳","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15136555706","王汉友","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13903968325","杨杰","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13223867729","杨公升","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15893120285","王平治","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15346343999","尹亮亮","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18939695927","韩陈真","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15836602018","龚卫东","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13839946018","李敬珍","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("19939625560","李大同","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15539600385","邱小松","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15516857618","邱凡金","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15839632836","李斌斌","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15036932300","李顺民","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17739537816","何守保","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13938384032","王振华","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18300740795","高卫萍","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13513963779","李胜利","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15938088628","王怀成","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15836726728","王小伟","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18338538026","王勋华","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13783397768","李光领","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13939681563","李芳民","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13949588800","杜秀民","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15236977767","李满义","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13783333914","宏振伟","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17339669371","曹强","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13123797787","马磊","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17639659090","周新尧","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13839643796","杨涛 ","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15939637638","李飞虎","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13723057999","孔晓","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13598933713","郑方","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13839641918","王秀德","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13783368640","李铁路","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13507646708","闫清新","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13783383953","杨利俭","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15978460954","林辉","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17602656073","闫清亮","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15939652201","闫泽礼","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18739646000","郑海华","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13683870855","李云山","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15836703800","赵伟 ","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13598927960","赵新华","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15346382288","李飞飞","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18300779083","周永明","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13723053002","李乐","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18339672377","王小超","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13598928428","褚继红","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13137251085","时红军","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13087087890","赵学文","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18137533899","梅希海","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18338509627","王保见","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18037539654","李志民","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15836773551","尤磊磊","未知","未知","未知","未知",0,"未知","10000000001");

INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15236714985","楚金修","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18956460111","朱辉","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13323977737","王接","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15357434011","李涛","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13849767999","何培露","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15893969818","张飞","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17737022276","任学伟","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("'17730893090","谢本军","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15357172478","程本华","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13155644024","张志凯","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18726467617","杨萌","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13939739299","张柏峰","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18240543918","王国安","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17719182399","杜勇","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13525305077","陈相君","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13514983690","经廷军","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15517633999","杨辉","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17719178003","杨秋汉","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15605146961","程传华","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18326280678","方保国","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15544492285","曹俊涛","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15139764684","刘畅","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("18272939250","田金鹏","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("17633861008","胡晨宇","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("13513963967","高永宏","未知","未知","未知","未知",0,"未知","10000000001");
INSERT INTO Persons(employee_id,person_name,phone,job,kind,gender,age,area,boss_id) VALUES("15514225262","李良霞","未知","未知","未知","未知",0,"未知","10000000001");

INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000049","1区",0,100,"关津乡","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000050","2区",0,100,"关津乡","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000051","3区",0,100,"关津乡","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000052","4区",0,100,"孙召乡","7","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000053","5区",0,100,"孙召乡","7.1","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000054","6区",0,100,"孙召乡","7.8","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000055","7区",0,100,"孙召乡","11","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000056","8区",0,100,"孙召乡","11","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000057","1区",0,100,"孙召乡","12","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000058","2区",0,100,"涧头乡","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000059","3区",0,100,"涧头乡","6.1","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000060","4区",0,100,"涧头乡","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000061","5区",0,100,"陈店镇","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000062","6区",0,100,"陈店镇","6.9","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000063","7区",0,100,"陈店镇","7.5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000064","8区",0,100,"宋岗乡","7.8","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000065","1区",0,100,"宋岗乡","7.1","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000066","2区",0,100,"宋岗乡","7.2","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000067","3区",0,100,"李桥回族镇","7.8","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000068","4区",0,100,"李桥回族镇","8.4","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000069","5区",0,100,"李桥回族镇","8.8","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000070","6区",0,100,"砖店镇","8.1","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000071","7区",0,100,"砖店镇","9.2","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000072","8区",0,100,"砖店镇","9.3","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000073","1区",0,100,"练村镇","9.5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000074","2区",0,100,"练村镇","7","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000075","3区",0,100,"练村镇","7","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000076","4区",0,100,"黄楼镇","7","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000077","5区",0,100,"黄楼镇","7","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000078","6区",0,100,"黄楼镇","7","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000079","7区",0,100,"黄楼镇","8","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000080","8区",0,100,"黄楼镇","8.5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000081","1区",0,100,"河坞乡","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000082","2区",0,100,"河坞乡","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000083","3区",0,100,"河坞乡","5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000084","4区",0,100,"龙口镇","7","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000085","5区",0,100,"龙口镇","7.1","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000086","6区",0,100,"龙口镇","7.8","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000087","7区",0,100,"顿岗乡","11","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000088","8区",0,100,"顿岗乡","11","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000089","1区",0,100,"顿岗乡","12","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000090","2区",0,100,"韩集镇","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000091","3区",0,100,"韩集镇","6.1","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000092","4区",0,100,"韩集镇","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000093","5区",0,100,"化庄乡","6","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000094","6区",0,100,"化庄乡","6.9","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000095","7区",0,100,"化庄乡","7.5","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000096","8区",0,100,"杨庄户乡","7.8","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000097","1区",0,100,"杨庄户乡","7.1","10000000002");
INSERT INTO Bins(employee_id,bin_name,current_v,max_v,area,temperature,boss_id) VALUES("0000000098","2区",0,100,"杨庄户乡","7.2","10000000002");

INSERT INTO Bosses(boss_id,boss_name,phone,kind,gender,age,area) VALUES("10000000001","陈总","15855187755","人员管理","男",40,"市中心区");
INSERT INTO Bosses(boss_id,boss_name,phone,kind,gender,age,area) VALUES("10000000002","田总","11122223333","设备管理","男",40,"市中心区");
INSERT INTO Users(username,password) VALUES("root1","123456");
INSERT INTO Users(username,password) VALUES("root2","123456");
INSERT INTO Users(username,password) VALUES("root3","123456");






