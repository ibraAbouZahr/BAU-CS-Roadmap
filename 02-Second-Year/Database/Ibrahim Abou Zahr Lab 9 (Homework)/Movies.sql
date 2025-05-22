create database Movies
use Movies

CREATE TABLE Actor ( 
 act_id int PRIMARY KEY IDENTITY(101,1), 
 act_fname VARCHAR (20) ,
 act_lname VARCHAR (20) ,
 act_gender CHAR (1)
); 

CREATE TABLE Director (
 dir_id int PRIMARY KEY IDENTITY(201,1),
 dir_fname VARCHAR (20),
 dir_lname VARCHAR (20)
);

CREATE TABLE Movie (
mov_id int PRIMARY KEY,
mov_title VARCHAR (50),
mov_year int,
mov_time int,
mov_lang VARCHAR (50),
mov_dt_rel date,
mov_rel_country VARCHAR (10)
); 

CREATE TABLE Movie_Cast ( 
act_id int, 
mov_id int,
role VARCHAR (30),
PRIMARY KEY (act_id, mov_id),
FOREIGN KEY (act_id) REFERENCES Actor (act_id) ON Delete Cascade ON Update Cascade,
FOREIGN KEY (mov_id) REFERENCES Movie (mov_id) ON Delete Cascade ON Update Cascade
); 

CREATE TABLE Reviewer ( 
rev_id int PRIMARY KEY, 
rev_name VARCHAR (30)
);
 
CREATE TABLE Rating (
 mov_id int,
 rev_id int, 
 rev_stars float,
 num_o_ratings int,
 PRIMARY KEY (mov_id,rev_id),
 FOREIGN KEY (mov_id) REFERENCES Movie (mov_id) ON Delete Cascade ON Update Cascade,
 FOREIGN KEY (rev_id) REFERENCES Reviewer (rev_id) ON Delete Cascade ON Update Cascade
);

CREATE TABLE Genres ( 
 gen_id int PRIMARY KEY, 
 gen_title VARCHAR (20)
);

CREATE TABLE Movie_Genres ( 
 mov_id int,
 gen_id int,
 PRIMARY KEY (mov_id,gen_id), 
 FOREIGN KEY (mov_id) REFERENCES Movie (mov_id) ON Delete Cascade ON Update Cascade,
 FOREIGN KEY (gen_id) REFERENCES Genres (gen_id) ON Delete Cascade ON Update Cascade
);

CREATE TABLE Movie_Direction ( 
 dir_id int,
 mov_id int,
 PRIMARY KEY (dir_id,mov_id), 
 FOREIGN KEY (mov_id) REFERENCES Movie (mov_id) ON Delete Cascade ON Update Cascade,
 FOREIGN KEY (dir_id) REFERENCES Director (dir_id) ON Delete Cascade ON Update Cascade
);




INSERT INTO Actor VALUES ('James','Stewart','M');
INSERT INTO Actor VALUES ('Deborah','Kerr','F');
INSERT INTO Actor VALUES ('Peter','OToole','M');
INSERT INTO Actor VALUES ('Robert','De Niro','M');
INSERT INTO Actor VALUES ('F. Murray','Abraham','M');
INSERT INTO Actor VALUES ('Harrison','Ford','M');
INSERT INTO Actor VALUES ('Nicole','Kidman','F');
INSERT INTO Actor VALUES ('Stephen','Baldwin','M');
INSERT INTO Actor VALUES ('Jack','Nicholson','M');
INSERT INTO Actor VALUES ('Mark','Wahlberg','M');
INSERT INTO Actor VALUES ('Woody','Allen','M');
INSERT INTO Actor VALUES ('Claire','Danes','F');
INSERT INTO Actor VALUES ('Tim','Robbins','M');
INSERT INTO Actor VALUES ('Kevin','Spacey','M');
INSERT INTO Actor VALUES ('Kate','Winslet','F');
INSERT INTO Actor VALUES ('Robin','Williams','M');
INSERT INTO Actor VALUES ('Jon','Voight','M');
INSERT INTO Actor VALUES ('Ewan','McGregor','M');
INSERT INTO Actor VALUES ('Christian','Bale','M');
INSERT INTO Actor VALUES ('Maggie','Gyllenhaal','F');
INSERT INTO Actor VALUES ('Dev','Patel','M');
INSERT INTO Actor VALUES ('Sigourney','Weaver','F');
INSERT INTO Actor VALUES ('David','Aston','M');
INSERT INTO Actor VALUES ('Ali','Astin','F');


INSERT INTO Director VALUES ('Alfred', 'Hitchcock');
INSERT INTO Director VALUES ('Jack', 'Clayton');
INSERT INTO Director VALUES ('David', 'Lean');
INSERT INTO Director VALUES ('Michael', 'Cimino');
INSERT INTO Director VALUES ('Milos', 'Forman');
INSERT INTO Director VALUES ('Ridley', 'Scott');
INSERT INTO Director VALUES ('Stanley', 'Kubrick');
INSERT INTO Director VALUES ('Bryan', 'Singer');
INSERT INTO Director VALUES ('Roman', 'Polanski');
INSERT INTO Director VALUES ('Paul', 'Thomas Anderson');
INSERT INTO Director VALUES ('Woody', 'Allen');
INSERT INTO Director VALUES ('Hayao', 'Miyazaki');
INSERT INTO Director VALUES ('Frank', 'Darabont');
INSERT INTO Director VALUES ('Sam', 'Mendes');
INSERT INTO Director VALUES ('James', 'Cameron');
INSERT INTO Director VALUES ('Gus', 'Van Sant');
INSERT INTO Director VALUES ('John', 'Boorman');
INSERT INTO Director VALUES ('Danny', 'Boyle');
INSERT INTO Director VALUES ('Christopher', 'Nolan');
INSERT INTO Director VALUES ('Richard', 'Kelly');
INSERT INTO Director VALUES ('Kevin', 'Spacey');
INSERT INTO Director VALUES ('Andrei', 'Tarkovsky');
INSERT INTO Director VALUES ('Peter', 'Jackson');



INSERT INTO Movie VALUES (901,'Vertigo', 1958, 128, 'English','1958-08-24','UK');
INSERT INTO Movie VALUES (902,'The Innocents', 1961, 100, 'English','1962-02-19','SW');
INSERT INTO Movie VALUES (903,'Lawrence of Arabia', 1962, 216, 'English','1962-12-11','UK');
INSERT INTO Movie VALUES (904,'The Deer Hunter', 1978, 183, 'English','1979-03-08','UK');
INSERT INTO Movie VALUES (905,'Amadeus', 1984, 160, 'English','1985-01-07','UK');
INSERT INTO Movie VALUES (906,'Blade Runner', 1982, 117, 'English','1982-09-09','UK');
INSERT INTO Movie VALUES (907,'Eyes Wide Shut', 1999, 159, 'English','','UK');
INSERT INTO Movie VALUES (908,'The Usual Suspects', 1995, 106, 'English','1995-08-25','UK');
INSERT INTO Movie VALUES (909,'Chinatown', 1974, 130, 'English','1974-08-09','UK');
INSERT INTO Movie VALUES (910,'Boogie Nights', 1997, 155, 'English','1998-02-16','UK');
INSERT INTO Movie VALUES (911,'Annie Hall', 1977, 93, 'English','1977-04-20','USA');
INSERT INTO Movie VALUES (912,'Princess Mononoke', 1997, 134, 'Japanese','2001-10-19','UK');
INSERT INTO Movie VALUES (913,'The Shawshank Redemption', 1994, 142, 'English','1995-2-17','UK');
INSERT INTO Movie VALUES (914,'American Beauty', 1999, 122, 'English','','UK');
INSERT INTO Movie VALUES (915,'Titanic', 1997, 194, 'English','1998-01-23','UK');
INSERT INTO Movie VALUES (916,'Good Will Hunting', 1997, 126, 'English','1998-06-03','UK');
INSERT INTO Movie VALUES (917,'Deliverance', 1972, 109, 'English','1982-10-05','UK');
INSERT INTO Movie VALUES (918,'Trainspotting', 1996, 94, 'English','1996-02-23','UK');
INSERT INTO Movie VALUES (919,'The Prestige', 2006, 130, 'English','2006-11-10','UK');
INSERT INTO Movie VALUES (920,'Donnie Darko', 2001, 113, 'English','','UK');
INSERT INTO Movie VALUES (921,'Slumdog Millionaire', 2008, 120, 'English','2009-01-09','UK');
INSERT INTO Movie VALUES (922,'Aliens', 1986, 137, 'English','1986-08-29','UK');
INSERT INTO Movie VALUES (923,'Beyond the Sea', 2004, 118, 'English','2004-11-26','UK');
INSERT INTO Movie VALUES (924,'Avatar', 2004, 162, 'English','2009-12-17','UK');
INSERT INTO Movie VALUES (925,'Braveheart', 1995, 178, 'English','1995-09-08','UK');
INSERT INTO Movie VALUES (926,'Seven Samurai', 1954, 207, 'Japanese','1954-04-26','JP');
INSERT INTO Movie VALUES (927,'Spirited Away', 2001, 125, 'Japanese','2003-09-12','UK');
INSERT INTO Movie VALUES (928,'Back to the Future', 1985, 116, 'English','1985-12-04','UK');



INSERT INTO Movie_Cast VALUES (101,901,'John Scottie Ferguson');
INSERT INTO Movie_Cast VALUES (102, 902,'Miss Giddens');
INSERT INTO Movie_Cast VALUES (103,903,'T.E. Lawrence');
INSERT INTO Movie_Cast VALUES (104,904,'Michael');
INSERT INTO Movie_Cast VALUES (105,905,'Antonio Salieri');
INSERT INTO Movie_Cast VALUES (106,906,'Rick Deckard');
INSERT INTO Movie_Cast VALUES (107,907,'Alice Harford');
INSERT INTO Movie_Cast VALUES (108,908,'McManus');
INSERT INTO Movie_Cast VALUES (109,909,'J.J. Gittes');
INSERT INTO Movie_Cast VALUES (110,910,'Eddie Adams');
INSERT INTO Movie_Cast VALUES (111, 911,'Alvy Singer');
INSERT INTO Movie_Cast VALUES (112, 912,'San');
INSERT INTO Movie_Cast VALUES (113,913,'Andy Dufresne');
INSERT INTO Movie_Cast VALUES (114,914,'Lester Burnham');
INSERT INTO Movie_Cast VALUES (115,915,'Rose DeWitt Bukater');
INSERT INTO Movie_Cast VALUES (116,916,'Sean Maguire');
INSERT INTO Movie_Cast VALUES (117,917,'Ed');
INSERT INTO Movie_Cast VALUES (118,918,'Renton');
INSERT INTO Movie_Cast VALUES (119,919,'Alfred Borden');
INSERT INTO Movie_Cast VALUES (120, 920,'Elizabeth Darko');
INSERT INTO Movie_Cast VALUES (121,921,'Older Jamal');
INSERT INTO Movie_Cast VALUES (122,922,'Ripley');
INSERT INTO Movie_Cast VALUES (114,923,'Bobby Darin');



INSERT INTO Reviewer VALUES (9001, 'Righty Sock');
INSERT INTO Reviewer VALUES (9002,'Jack Malvern');
INSERT INTO Reviewer VALUES ( 9003,'Flagrant Baronessa');
INSERT INTO Reviewer VALUES (9004,'Alec Shaw');
INSERT INTO Reviewer VALUES (9005,null);
INSERT INTO Reviewer VALUES (9006,'Victor Woeltjen');
INSERT INTO Reviewer VALUES (9007,'Simon Wright');
INSERT INTO Reviewer VALUES (9008,'Neal Wruck');
INSERT INTO Reviewer VALUES (9009,'Paul Monks');
INSERT INTO Reviewer VALUES (9010,'Mike Salvati');
INSERT INTO Reviewer VALUES (9011 ,null);
INSERT INTO Reviewer VALUES (9012,'Wesley S. Walker');
INSERT INTO Reviewer VALUES (9013,'Sasha Goldshtein');
INSERT INTO Reviewer VALUES (9014,'Josh Cates');
INSERT INTO Reviewer VALUES (9015,'Krug Stillo');
INSERT INTO Reviewer VALUES (9016,'Scott LeBrun');
INSERT INTO Reviewer VALUES (9017, 'Hannah Steele');
INSERT INTO Reviewer VALUES (9018,'Vincent Cadena');
INSERT INTO Reviewer VALUES (9019,'Brandt Sponseller');
INSERT INTO Reviewer VALUES (9020,'Richard Adams');


INSERT INTO Rating VALUES (901,9001,8.40, 263575);
INSERT INTO Rating VALUES (902,9002,7.90,20207);
INSERT INTO Rating VALUES (903,9003,8.30,202778);
INSERT INTO Rating VALUES (906,9005,8.20,484746);
INSERT INTO Rating VALUES (924, 9006, 7.30,null);
INSERT INTO Rating VALUES (908,9007, 8.60,779489);
INSERT INTO Rating VALUES (909,9008,null,227235);
INSERT INTO Rating VALUES (910,9009 ,3.00,195961);
INSERT INTO Rating VALUES (911,9010,8.10 , 203875);
INSERT INTO Rating VALUES (912,9011,8.40,null);
INSERT INTO Rating VALUES (914,9013, 7.00, 862618);
INSERT INTO Rating VALUES (915,9001, 7.70,830095);
INSERT INTO Rating VALUES (916,9014, 4.00, 642132);
INSERT INTO Rating VALUES (925,9015,7.70,81328);
INSERT INTO Rating VALUES (918,9016,null,580301);
INSERT INTO Rating VALUES (920,9017,8.10, 609451);
INSERT INTO Rating VALUES (921,9018,8.00, 667758);
INSERT INTO Rating VALUES (922,9019, 8.40,511613);
INSERT INTO Rating VALUES (923,9020,6.70, 13091);


INSERT INTO Movie_Direction VALUES (201,901);
INSERT INTO Movie_Direction VALUES (202,902);
INSERT INTO Movie_Direction VALUES (203,903);
INSERT INTO Movie_Direction VALUES (204,904);
INSERT INTO Movie_Direction VALUES (205,905);
INSERT INTO Movie_Direction VALUES (206,906);
INSERT INTO Movie_Direction VALUES (207,907);
INSERT INTO Movie_Direction VALUES (208, 908);
INSERT INTO Movie_Direction VALUES (209, 909);
INSERT INTO Movie_Direction VALUES (210,910);
INSERT INTO Movie_Direction VALUES (211,911);
INSERT INTO Movie_Direction VALUES (212,912);
INSERT INTO Movie_Direction VALUES (213, 913);
INSERT INTO Movie_Direction VALUES (214,914);
INSERT INTO Movie_Direction VALUES (215, 915);
INSERT INTO Movie_Direction VALUES (216, 916);
INSERT INTO Movie_Direction VALUES (217, 917);
INSERT INTO Movie_Direction VALUES (218,918);
INSERT INTO Movie_Direction VALUES (219,919);
INSERT INTO Movie_Direction VALUES (220, 920);
INSERT INTO Movie_Direction VALUES (218,921);
INSERT INTO Movie_Direction VALUES (215,922);
INSERT INTO Movie_Direction VALUES (221,923);

SELECT *FROM Movie

-- Ex1 -- 
SELECT COUNT(*) AS Number_of_Movies, mov_year from Movie
Group by mov_year

-- Ex2 -- 
SELECT mov_title,mov_year,mov_rel_country from Movie
WHERE mov_rel_country != 'UK'

-- Ex3--
SELECT mov_title,mov_year,mov_rel_country, mov_dt_rel, mov_lang from Movie
WHERE mov_year < 1990
AND mov_title like '%Deer%'

-- Ex 4 --
SELECT D.dir_id, D.dir_fname, D.dir_lname, M.mov_lang, COUNT(*) AS Movie_Count
FROM Director D
JOIN Movie_Direction MD ON D.dir_id = MD.dir_id
JOIN Movie M ON MD.mov_id = M.mov_id
GROUP BY D.dir_id, M.mov_lang
HAVING COUNT(*) > 3;

-- Ex 5 --
SELECT MIN(rev_stars) as Lowest_Rating, AVG(rev_stars) as Average_Rating From Rating

-- Ex 6--
SELECT rev_name from Reviewer
WHERE rev_id IN ( SELECT rev_id FROM Rating WHERE mov_id IN (SELECT mov_id FROM Movie WHERE mov_title = 'The Innocents'));

-- Ex 7 --
SELECT mov_title, COUNT(*) as Actor_Count  from Movie
JOIN Movie_Cast on Movie.mov_id = Movie_Cast.mov_id
Group by mov_title
HAVING COUNT(*) > 10

-- Ex 8 -- 

SELECT rev_name, mov_title, rev_stars from Reviewer
JOIN Movie on Movie.mov_id = Rating.mov_id
JOIN Rating on Rating.rev_id = Reviewer.rev_id
Order by rev_name, mov_title, rev_stars

