create table swiggy_db.address(
   address_id BIGINT NOT NULL,
   house_number VARCHAR(250) NOT NULL,
   district VARCHAR(100) NOT NULL,
   city VARCHAR(100) NOT NULL,
   state VARCHAR(100) NOT NULL,
   PRIMARY KEY (address_id)
);