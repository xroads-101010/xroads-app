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
  `trip_destination_lat` double,
  `trip_destination_long` double,
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
  `member_starting_location_lat` double,
  `member_starting_location_long` double,
   PRIMARY KEY (`id`),
   CONSTRAINT `trip_member_fk` FOREIGN KEY (`member_id`) REFERENCES `user` (`id`),
   CONSTRAINT `trip_fk` FOREIGN KEY (`trip_id`) REFERENCES `trip` (`id`)
);

CREATE TABLE IF NOT EXISTS `trip_member_location` (
  `trip_member_id` SMALLINT UNSIGNED,
  `distance_to_destination` double,
  `current_location` VARCHAR(45),  
  `current_location_lat` double,  
  `current_location_long` double,  
  `created_at` timestamp,
  `updated_at` timestamp,
  PRIMARY KEY (`trip_member_id`)
 );