CREATE SEQUENCE AM_SYSTEM_APP_SEQUENCE START WITH 1 INCREMENT BY 1 ;
CREATE TABLE IF NOT EXISTS AM_SYSTEM_APPS (
            ID INTEGER DEFAULT nextval('am_system_app_sequence'),
            NAME VARCHAR(50) NOT NULL,
            CONSUMER_KEY VARCHAR(512) NOT NULL,
            CONSUMER_SECRET VARCHAR(512) NOT NULL,
            CREATED_TIME TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
            PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS AM_API_CLIENT_CERTIFICATE (
  TENANT_ID INTEGER NOT NULL,
  ALIAS VARCHAR(45) NOT NULL,
  API_ID INTEGER NOT NULL,
  CERTIFICATE BYTEA NOT NULL,
  REMOVED BOOLEAN NOT NULL DEFAULT 0,
  TIER_NAME VARCHAR (512),
  FOREIGN KEY (API_ID) REFERENCES AM_API (API_ID) ON DELETE CASCADE ON UPDATE CASCADE,
  PRIMARY KEY (ALIAS,TENANT_ID, REMOVED)
);

ALTER TABLE AM_POLICY_SUBSCRIPTION ADD MONETIZATION_PLAN VARCHAR(25) NULL DEFAULT NULL,
   ADD FIXED_RATE VARCHAR(15) NULL DEFAULT NULL, 
   ADD BILLING_CYCLE VARCHAR(15) NULL DEFAULT NULL, 
   ADD PRICE_PER_REQUEST VARCHAR(15) NULL DEFAULT NULL, 
   ADD CURRENCY VARCHAR(15) NULL DEFAULT NULL;

CREATE TABLE IF NOT EXISTS AM_MONETIZATION_USAGE_PUBLISHER (
	ID VARCHAR(100) NOT NULL,
	STATE VARCHAR(50) NOT NULL,
	STATUS VARCHAR(50) NOT NULL,
	STARTED_TIME VARCHAR(50) NOT NULL,
	PUBLISHED_TIME VARCHAR(50) NOT NULL,
	PRIMARY KEY(ID)
);

ALTER TABLE AM_API_COMMENTS
ALTER COLUMN COMMENT_ID TYPE VARCHAR(255);

ALTER TABLE AM_API_RATINGS
ALTER COLUMN RATING_ID TYPE VARCHAR(255) NOT NULL;
