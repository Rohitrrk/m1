--CREATE TABLE Author
CREATE TABLE Author(
authorId 		NUMBER(4),
authorName 	VARCHAR2(30) NOT NULL,
authorLocation 	VARCHAR2(30),
CONSTRAINT pk_author PRIMARY KEY(authorId));

--CREATE TABLE Book
CREATE TABLE Book(
bookId 		NUMBER(4),
bookName 	VARCHAR2(30) NOT NULL,
bookPrice 	NUMBER(7,2),
authorId 		NUMBER(4),
CONSTRAINT pk_book PRIMARY KEY(bookId),
CONSTRAINT fk_book FOREIGN KEY(authorId) REFERENCES Author(authorId));

--CREATE TABLE BookTransaction
CREATE TABLE BookTransaction(
tranId 		NUMBER(4),
bookId	 	NUMBER(4),
tranStatus 	VARCHAR2(10),
CONSTRAINT pk_bookTran PRIMARY KEY(tranId),
CONSTRAINT fk_bookTran FOREIGN KEY(bookId) REFERENCES Book(bookId),
CONSTRAINT chk_bookTran CHECK (tranStatus in ('RETURN','NOTRETURN')));

-- CREATE TABLE errLog
CREATE TABLE errorLog
(errNum VARCHAR2(50),
errDesc VARCHAR2(100),
errDate DATE);

-- CREATE SEQUENCE seq_Book
CREATE SEQUENCE seq_Book
START WITH 1001
INCREMENT BY 1;

-- CREATE PROCEDURE PRC_CREATE_AUTHOR
CREATE or REPLACE PROCEDURE PRC_CREATE_AUTHOR(
authId NUMBER,authName VARCHAR2,authLoc VARCHAR2 DEFAULT 'MUMBAI')
AS
-- DECLARE SECTION
      ecode           VARCHAR2(20);
      emsg            VARCHAR2(40);
      dup_authorId    EXCEPTION;
      v_counter       BINARY_INTEGER;
BEGIN
  -- CHECKING FOR DUPLICATE RECORD
  SELECT count(*) INTO v_counter 
  FROM Author
  WHERE authorId = authId;
  
  IF v_counter > 0 THEN
      RAISE dup_authorId;
  END IF;
  
  INSERT INTO author VALUES
  (authId,authName,authLoc);
  DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT || ' RECORD IS ADDED SUCCESSFULLY..');
  
EXCEPTION
  WHEN dup_authorId THEN
		ecode:=SQLCODE;
    emsg:=SQLERRM;
    INSERT INTO errorLog VALUES(ecode,emsg,SYSDATE);
    DBMS_OUTPUT.PUT_LINE('DUPLICATE ENTRY FOUND, ERROR Record is added in ErrorLog Table');
END;

SET SERVEROUTPUT ON

-- INSERTING RECORD IN AUTHOR TABLE
BEGIN
  PRC_CREATE_AUTHOR(seq_Book.NEXTVAL,'YASHWANT','USA');
END;
-- INSERTING DUPLICATE RECORD IN AUTHOR TABLE
BEGIN
  PRC_CREATE_AUTHOR(seq_Book.CURRVAL,'YASHWANT','USA');
END;

-- RETRIEVING RECORDS FROM AUTHOR
SELECT * FROM Author

------------------------------------------------------------------------------------------------

-- CREATE or REPLACE FUNCTION fn_GET_AUTHOR
CREATE or REPLACE FUNCTION fn_GET_AUTHOR(
authId NUMBER)
RETURN BOOLEAN
AS
-- DECLARE SECTION
           v_counter       BINARY_INTEGER;
BEGIN
  -- CHECKING FOR DUPLICATE RECORD
  SELECT count(*) INTO v_counter 
  FROM Author
  WHERE authorId = authId;
  
  IF v_counter > 0 THEN
      RETURN TRUE;
  ELSE
      RETURN FALSE;
  END IF;
END;



-- GET AUTHOR DETAILS
CREATE OR REPLACE PROCEDURE PRC_GET_AUTHOR(
authId NUMBER,authName out author.authorName%TYPE)
AS
    CURSOR cname IS SELECT authorName FROM author WHERE authorId=authId;
  	no_data 		    EXCEPTION;
    ecode           VARCHAR2(20);
    emsg            VARCHAR2(40);
BEGIN
   	OPEN cname;
  	FETCH cname INTO authName;
  	IF FN_GET_AUTHOR(authId) THEN
		WHILE cname%FOUND
		LOOP
			FETCH cname INTO authName;
      --authD:=authDetail;
      --DBMS_OUTPUT.PUT_LINE(authDetail);
		END LOOP;
    CLOSE cname;  
  	ELSE
  		RAISE no_data;
  	END IF;
	
  EXCEPTION
  	WHEN no_data THEN
		ecode:=SQLCODE;
		emsg:=SQLERRM;
		INSERT INTO errorLog VALUES(ecode,emsg,SYSDATE);
		DBMS_OUTPUT.PUT_LINE('AuthorId does not exist, ERROR Record is added in ErrorLog Table');
 END;
 
  -- CALLING PRC_GET_AUTHOR PROCEDURE
 DECLARE
    authId AUTHOR.AUTHORID%TYPE:=&AuthorID;
    authName author.authorName%TYPE; 
 BEGIN
    PRC_GET_AUTHOR(authId,authName);
    DBMS_OUTPUT.PUT_LINE(authName);
 END;
