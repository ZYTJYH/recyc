-- Positions表测试数据
INSERT INTO Positions(employee_id,time,longitude,latitude,work_status,boss_id,information,kind) VALUES("0000000001","2018-01-02 00:00:00",114.980,32.7435,'on',"1000000001","一号先生 18756929625",'car');
INSERT INTO Positions(employee_id,time,longitude,latitude,work_status,boss_id,information,kind) VALUES("0000000002","2018-01-02 00:00:00",114.987,32.754,'on',"1000000001","二号先生 18756929625",'bin');
INSERT INTO Positions(employee_id,time,longitude,latitude,work_status,boss_id,information,kind) VALUES("0000000003","2018-01-02 00:00:00",114.974,32.7435,'on',"1000000001","三号先生 18756929625",'person');


-- Bosses表测试数据
INSERT INTO Bosses(boss_id,`name`,phone) VALUES("1000000001","王总","12233334444")

-- Users表测试数据
INSERT INTO Users(username,password) VALUES("root2","123456");
INSERT INTO Users(username,password) VALUES("root3","123456");
