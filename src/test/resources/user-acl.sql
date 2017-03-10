CREATE TABLE `UserAcl` (
  `accountID` varchar(32) NOT NULL,
  `userID` varchar(32) NOT NULL,
  `aclID` varchar(64) NOT NULL,
  `accessLevel` smallint(5) unsigned DEFAULT NULL,
  `description` varchar(128) CHARACTER SET utf8 DEFAULT NULL,
  `lastUpdateTime` int(10) unsigned DEFAULT NULL,
  `creationTime` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`accountID`,`userID`,`aclID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
SELECT * FROM UserAcl;