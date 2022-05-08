USE Mentee

CREATE TABLE PersonalInfo(
MemberID int PRIMARY KEY,
FullName nvarchar(50),
Email nvarchar(30),
CurLocation nvarchar(15),	--Adding City and country
RegDate date
)

CREATE TABLE EducationalInfo(
MemberID int PRIMARY KEY,
EduLevel nvarchar(10),
EduField nvarchar(50),		-- Added new field
InstituteName nvarchar(50),
Country nvarchar(15),
FOREIGN KEY (MemberID) REFERENCES PersonalInfo(MemberID)
)	--Adding past and current study information?

CREATE TABLE ExpireneceType(
MemberID int PRIMARY KEY,
ITExp int,
NonITExp int,
FOREIGN KEY (MemberID) REFERENCES PersonalInfo(MemberID)
)

CREATE TABLE Experience(
MemberID int PRIMARY KEY,
StrategyGov int,
PeopleMgmt int,
Arch int,
Infra int,
Cloud int,
SecRisk int,
ProjMgmt int,
DataInt int,
MLAI int,
Other nvarchar(15),
FOREIGN KEY (MemberID) REFERENCES PersonalInfo(MemberID)
)

CREATE TABLE Ranking(
MemberID int PRIMARY KEY,
StrategyGov int,
PeopleMgmt int,
Arch int,
Infra int,
Cloud int,
SecRisk int,
ProjMgmt int,
DataInt int,
MLAI int,
Other nvarchar(15),
FOREIGN KEY (MemberID) REFERENCES PersonalInfo(MemberID)
)

CREATE TABLE Interests(
MemberID int PRIMARY KEY,
Career nvarchar(50),
Personal nvarchar(50),
SoftSkill nvarchar(50),
FOREIGN KEY (MemberID) REFERENCES PersonalInfo(MemberID)
)

CREATE TABLE Preference(
MemberID int PRIMARY KEY,
MentorTypes nvarchar(50),
FOREIGN KEY (MemberID) REFERENCES PersonalInfo(MemberID)
)

CREATE TABLE Goals(
MemberID int PRIMARY KEY,
Goals nvarchar(50)
FOREIGN KEY (MemberID) REFERENCES PersonalInfo(MemberID)
)


--DROP TABLE EducationalInfo
--DROP TABLE ExpireneceType
--DROP TABLE Experience
--DROP TABLE Ranking
--DROP TABLE Interests
--DROP TABLE Preference
--DROP TABLE Goals
--DROP TABLE PersonalInfo
