CREATE TABLE parking_boy (
    id bigint auto_increment primary key,
    name    VARCHAR(50)     NOT NULL,
    phone    VARCHAR(20)     NOT NULL
);

CREATE TABLE parking_lot (
    id bigint auto_increment primary key,
    name    VARCHAR(20)     NOT NULL,
    size    INT     NOT NULL,
    parking_boy_id  BIGINT,
    FOREIGN KEY (parking_boy_id) REFERENCES parking_boy(id)
);