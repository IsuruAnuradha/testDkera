select department,count(employee_id), sum(salary)
from Employee  left join Incentive
on Employee.employee_id = Incentive.employee_ref_id
group by department
order by salary desc;