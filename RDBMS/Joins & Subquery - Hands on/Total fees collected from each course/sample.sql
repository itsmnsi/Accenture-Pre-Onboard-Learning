select course.courseid, CourseName, sum(Fees) as TOTALFEES from COURSE
inner join REGISTRATION on course.courseid=registration.CourseID
group by course.courseid, CourseName
order by course.courseid;
