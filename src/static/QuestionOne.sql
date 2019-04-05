select first_name, ifnull(incentive_amount, 0)
from Employee  left join Incentive as ince
on Employee.employee_id = ince.employee_ref_id;