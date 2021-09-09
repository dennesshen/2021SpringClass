--<ScriptOptions statementTerminator=";"/>

CREATE TABLE emp (
	eid INT NOT NULL,
	ename VARCHAR(50) NOT NULL,
	age INT,
	createtime TIMESTAMP DEFAULT 'CURRENT_TIMESTAMP',
	PRIMARY KEY (eid)
);

CREATE TABLE emptest (
	eid INT NOT NULL,
	ename VARCHAR(50) NOT NULL,
	age INT,
	createtime TIMESTAMP DEFAULT 'CURRENT_TIMESTAMP',
	PRIMARY KEY (eid)
);

CREATE UNIQUE INDEX ename ON emp (ename ASC);

CREATE UNIQUE INDEX ename ON emptest (ename ASC);

