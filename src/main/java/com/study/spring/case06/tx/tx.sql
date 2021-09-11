-- 交易 Demo 所需的資料表

CREATE TABLE if not exists book (
    bid INTEGER NOT NULL auto_increment, -- 主鍵序號
    bname varchar(20) not null, -- 書名
    price INTEGER, -- 價格 
    ct timestamp default current_timestamp, -- 建檔時間
    PRIMARY KEY (bid)
);

CREATE TABLE if not exists stock (
    sid INTEGER NOT NULL auto_increment, -- 主鍵序號
    bid INTEGER NOT NULL,
    amount INTEGER, -- 數量 
    PRIMARY KEY (sid)
);

CREATE TABLE if not exists wallet (
    wid INTEGER NOT NULL auto_increment, -- 主鍵序號
    money INTEGER, -- 數量 
    PRIMARY KEY (wid)
);

insert into wallet(money) values(100);
insert into book(bname, price) values("java", 80);
insert into stock(bid, amount) values(1,3);


