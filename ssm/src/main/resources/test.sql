select
       t6.parent_id as root1_id,
       t6.dept_name as root1_name,
       t5.parent_id as root2_id,
       t5.dept_name as root2_name,
       t4.parent_id as root3_id,
       t4.dept_name as root3_name,
       t3.parent_id as root4_id,
       t3.dept_name as root4_name,
       t2.parent_id as root5_id,
       t2.dept_name as root5_name,
       t1.dept_id,
       t1.dept_name
from sys_dept t1
         left join sys_dept t2 on t1.parent_id = t2.dept_id
         left join sys_dept t3 on t2.parent_id = t3.dept_id
         left join sys_dept t4 on t3.parent_id = t4.dept_id
         left join sys_dept t5 on t4.parent_id = t5.dept_id
         left join sys_dept t6 on t5.parent_id = t6.dept_id
-- where t1.dept_id = '1565322350815932430'
order by root1_id desc
;

-- select * from sys_dept where dept_id='1565322350815932422'
-- select * from sys_dept

select
    f_tb.dept_id as dept_id,
    f_tb.dept_name as dept_name,
    z_tb.dept_id as z_id,
    z_tb.dept_name as z_name
from sys_dept f_tb
         left join sys_dept z_tb on  f_tb.dept_id = z_tb.parent_id
where f_tb.dept_id='1565322350815932422'

select * from sys_dept where dept_id='1565322350815932422'

select
    't2.parent_id' as p_id,
    't2.dept_name' as p_name,
    't1.dept_id' as dept_id,
    't1.dept_name' as dept_name




select
    f_tb.dept_id as dept_id,
    f_tb.dept_name as dept_name,
    z_tb.dept_id as z_id,
    z_tb.dept_name as z_name
from sys_dept f_tb
         left join sys_dept z_tb on f_tb.dept_id = z_tb.parent_id
where f_tb.dept_id='1565322350815938876'


