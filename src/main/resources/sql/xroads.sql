-- table definition

CREATE TABLE IF NOT EXISTS `user` (
  `id` SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(128),
  `user_name` VARCHAR(15),
  `user_mobile` VARCHAR(15) NOT NULL,
  `password` VARCHAR(128),
  `is_registered` boolean not null DEFAULT 0,
  `created_at` timestamp,
  `updated_at` timestamp,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_mobile_email` (`user_mobile`,`email`)
);

CREATE TABLE IF NOT EXISTS `trip` (
  `id` SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `trip_name` VARCHAR(128) NOT NULL,
  `trip_destination` VARCHAR(128) NOT NULL,
  `trip_champion` SMALLINT UNSIGNED,  
  `has_trip_started` BOOLEAN DEFAULT 0,
  `start_time` timestamp,
  `end_time` timestamp,
  `created_at` timestamp,
  `updated_at` timestamp,
  PRIMARY KEY (`id`),  
  CONSTRAINT `trip_champion_fk` FOREIGN KEY (`trip_champion`) REFERENCES `user` (`id`)
);

CREATE TABLE IF NOT EXISTS `trip_members` (
  `id` SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `trip_id` SMALLINT UNSIGNED,
  `member_id` SMALLINT UNSIGNED,  
  `has_member_joined` boolean not null DEFAULT 0,
  `member_starting_location` VARCHAR(128),
   PRIMARY KEY (`id`),
   CONSTRAINT `trip_member_fk` FOREIGN KEY (`member_id`) REFERENCES `user` (`id`),
   CONSTRAINT `trip_fk` FOREIGN KEY (`trip_id`) REFERENCES `trip` (`id`)
);

CREATE TABLE IF NOT EXISTS `trip_member_location` (
  `trip_member_id` SMALLINT UNSIGNED,
  `distance_to_destination` double,
  `current_location` VARCHAR(45),  
  `created_at` timestamp,
  `updated_at` timestamp
);

-- insert users
insert into user(`email`,`user_name`,`user_mobile`,`password`,`is_registered`,`created_at`,`updated_at`) values('abc1@gmail.com','abc1','9840198222','passwd',1, now(), now());
insert into user(`email`,`user_name`,`user_mobile`,`password`,`is_registered`,`created_at`,`updated_at`) values('abc2@gmail.com','abc2','9840198412','passwd',1, now(), now());
insert into user(`email`,`user_name`,`user_mobile`,`password`,`is_registered`,`created_at`,`updated_at`) values('ab3@gmail.com','abc3','9840198111','passwd',1, now(), now());
insert into user(`email`,`user_name`,`user_mobile`,`password`,`is_registered`,`created_at`,`updated_at`) values('abc4@gmail.com','abc4','9840198409','passwd',1, now(), now());
insert into user(`email`,`user_name`,`user_mobile`,`password`,`is_registered`,`created_at`,`updated_at`) values('abc5@gmail.com','abc5','9840198402','passwd',1, now(), now());
insert into user(`user_mobile`,`created_at`,`updated_at`) values('9884098840',now(),now());

-- insert trips
insert into trip(`trip_name`,`trip_destination`,`trip_champion`,`has_trip_started`,`start_time`,`end_time`,`created_at`,`updated_at`) values ('Trip1','sample trip_destination 1',1,'false',now(),now(),now(),now());
insert into trip(`trip_name`,`trip_destination`,`trip_champion`,`has_trip_started`,`start_time`,`end_time`,`created_at`,`updated_at`) values ('Trip2','sample trip_destination 2',2,'false',now(),now(),now(),now());
insert into trip(`trip_name`,`trip_start`,`trip_destination`,`trip_champion`) values ('Trip2','sample trip_start 2','sample trip_destination 2',2);

-- insert members
insert into trip_members(`trip_id`,`member_id`) values (1, 3);
insert into trip_members(`trip_id`,`member_id`,`member_starting_location`) values (1, 4,'chennai');
insert into trip_members(`trip_id`,`member_id`,`member_starting_location`) values (1, 5,'vellore');
insert into trip_members(`trip_id`,`member_id`,`member_starting_location`) values (2, 6,'nellore');