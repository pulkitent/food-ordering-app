create table swiggy_db.user(
   user_id BIGINT NOT NULL,
   name_id BIGINT NOT NULL,
   address_id BIGINT NOT NULL,
   email_id VARCHAR(100) NOT NULL,
   PRIMARY KEY (user_id)
);