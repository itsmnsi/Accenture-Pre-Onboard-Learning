select subject_name, student_name from Mark join Student using(student_id) join Subject using(subject_id) where (subject_id,value) in
(select subject_id, max(value) from Mark group by subject_id) order by subject_name, student_name;
