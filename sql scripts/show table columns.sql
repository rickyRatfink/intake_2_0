SELECT * FROM ffarm_dev.student_history WHERE INTAKE_ID=4116014 order by student_history_id desc;

SELECT count(*) FROM `ffarm_dev`.`intake` WHERE INTAKE_ID>83031 AND intake_id<85040;

update ffarm_dev.intake set class='Orientation' where INTAKE_ID>83031 AND intake_id<85040;
update ffarm_dev.intake set class='1' where INTAKE_ID>82030 AND intake_id<82060;
update ffarm_dev.intake set class='2' where INTAKE_ID>82000 AND intake_id<82030;
update ffarm_dev.intake set class='3' where INTAKE_ID>81000 AND intake_id<82000;
update ffarm_dev.intake set class='4' where INTAKE_ID>82060 AND intake_id<83015;
update ffarm_dev.intake set class='5' where INTAKE_ID>83015 AND intake_id<83025;
update ffarm_dev.intake set class='6' where INTAKE_ID>83025 AND intake_id<83031;
/*update ffarm_dev.intake set farm_base='BOYNTON BEACH' where INTAKE_ID>85032 AND intake_id<85038;
*/
 from ffarm_dev.course_rotation_history;




select * from ffarm_dev.course_rotation_history;



SELECT  FIRSTNAME,LASTNAME, ENTRY_DATE, BED, ROOM, AREA, PROGRAM_STATUS  
FROM `ffarm_dev`.`intake`   INNER JOIN `ffarm_dev`.`student_history`
ON INTAKE.INTAKE_ID = STUDENT_HISTORY.INTAKE_ID 
ORDER BY ENTRY_DATE ASC




