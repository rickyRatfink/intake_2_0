SET @rownum:=0;
SELECT @rownum := @rownum + 1,COLUMN_NAME FROM information_schema.`COLUMNS` C
WHERE table_name = 'intake'
AND TABLE_SCHEMA = "ffarm_dev"