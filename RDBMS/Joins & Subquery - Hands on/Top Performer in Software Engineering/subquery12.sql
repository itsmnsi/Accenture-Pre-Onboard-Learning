select a.student_name, b.department_name, c.value from Student a
inner join Department b on a.department_id=b.department_id
inner join Mark c on c.student_id=a.student_id and(c.subject_id, c.value) in
(select subject_id, max(a.value) from Mark a join Subject d using(subject_id)
where d.subject_name='Software Engineering'
group by subject_id)
order by b.department_name;
