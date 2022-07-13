CREATE DATABASE NBAPlayers;

USE NBAPlayers;

CREATE TABLE leadPlayers (
		player_id int(2) NOT NULL AUTO_INCREMENT,
			player_name varchar(30) NOT NULL,
			player_team varchar(50) NOT NULL,
			player_position varchar(2) NOT NULL,
            all_star varchar(1) NOT NULL,
            primary key (player_id)
			);