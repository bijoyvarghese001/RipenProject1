USE Mentee

--Inserting PersonalInfo test data
INSERT INTO PersonalInfo VALUES(1001, 'Vikas Yadav', 'vikas.yadav@gmail.com', 'India', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1002, 'Parav Pandit', 'parav.pandit@gmail.com', 'USA', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1003, 'Vikram Bhatt', 'vikram.bhatt@gmail.com', 'Australia', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1004, 'Pranav Gavende', 'gavande.p@gmail.com', 'Canada', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1005, 'Shardul Sharma', 's.sharma@gmail.com', 'UK', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1006, 'Richard Wall', 'richard.wall@gmail.com', 'Germany', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1007, 'William Jones', 'william.jones12@hotmail.com', 'Russia', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1008, 'Derrick Desouza', 'derrick.desouza@yahoo.com', 'Indonesia', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1009, 'Mark Taylor', 'taylor.mac@gmail.com', 'Myanmar', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1010, 'Anthony Brown', 'brown.anthony@gmail.com', 'Brazil', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1011, 'Matthew Wilson', 'matthew.w@hotmail.com', 'South Africa', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1012, 'Daniel Thomas', 'thomas@yahoo.com', 'Canada', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1013, 'Joseph Walker', 'walker.joseph@gmail.com', 'Mexico', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1014, 'Richard Wright', 'wroght.rich@gmail.com', 'Canada', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1015, 'David White', 'david.white56@gmail.com', 'Peru', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1016, 'Robert Lewis', 'lewis.rob@gmail.com', 'Keniya', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1017, 'John Wood', 'jonhwood@hotmail.com', 'Vietnam', '03-04-2022')
INSERT INTO PersonalInfo VALUES(1018, 'James Clarke', 'clarke.john@gmail.com', 'China', '03-04-2022')


-- Inserting Education Info test data
INSERT INTO EducationalInfo VALUES('1001', 'MA', 'International Management with Finance', 'Queen Mary & Westfield College', 'UK')
INSERT INTO EducationalInfo VALUES('1002', 'BSc', 'IT', NULL, NULL)
INSERT INTO EducationalInfo VALUES('1003', 'Masters', 'Computer Applications', NULL, NULL)
INSERT INTO EducationalInfo VALUES('1004', 'Bachelors', 'Economics', 'Vietnam National University', 'Vietnam')
INSERT INTO EducationalInfo VALUES('1005', 'Masters', 'Computer Science', 'U of S', NULL)
INSERT INTO EducationalInfo VALUES('1006', 'Masters', 'Computer Science and Technology', NULL, NULL)
INSERT INTO EducationalInfo VALUES('1007', NULL, 'Marketing and Business', 'University of Finance and Marketing', 'Vietnam')
INSERT INTO EducationalInfo VALUES('1008', 'Masters', 'Computer Application', NULL, 'India')
INSERT INTO EducationalInfo VALUES('1009', 'MSc', 'Computer Science', 'University of Sharjah', NULL)
INSERT INTO EducationalInfo VALUES('1010', 'Masters', 'Computer Applications', NULL, 'India')
INSERT INTO EducationalInfo VALUES('1011', 'MSc', 'Computer Science', 'University of Moratuwa', 'SriLanka')
INSERT INTO EducationalInfo VALUES('1012', 'MSc', 'IT', NULL, NULL)
INSERT INTO EducationalInfo VALUES('1013', 'MSc', 'Information Science', NULL, NULL)
INSERT INTO EducationalInfo VALUES('1014', 'Bachelors', 'Architecture', NULL, NULL)
INSERT INTO EducationalInfo VALUES('1015', 'BSc', 'Computer Science', 'University of Saskatchewan', 'Canada')
INSERT INTO EducationalInfo VALUES('1016', 'BSc', 'Computer Science', NULL, NULL)
INSERT INTO EducationalInfo VALUES('1017', 'Masters', 'Software Engineering', 'Birla Institute of Technology and Science', 'India')
INSERT INTO EducationalInfo VALUES('1018', 'Diploma', 'Business Information Systems', NULL, NULL)


SELECT * FROM PersonalInfo
SELECT * FROM EducationalInfo