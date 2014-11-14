CREATE TABLE USERINFO
	(userid     INTEGER,	
	username    CHAR(20) NOT NULL,
	PRIMARY KEY (userid));

CREATE TABLE SCORE
	(scoreid    INTEGER,
	score	    INTEGER NOT NULL,
      	userid      INTEGER,
        PRIMARY KEY (scoreid,userid),
	FOREIGN KEY (userid) REFERENCES USERINFO(userid) ON DELETE CASCADE);

DROP TABLE USERINFO;

DROP TABLE SCORE;


//Show attributes
show columns from *****tablename*****;