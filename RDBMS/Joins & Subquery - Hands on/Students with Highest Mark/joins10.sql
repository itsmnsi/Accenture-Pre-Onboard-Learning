select student_name, max(mark.value) as MAX_MARK from student inner join mark on mark.student_id=student.student_id
group by student_name order by student_name;
