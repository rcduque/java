select email from (
    select email, count(*) as num
        from Person
        group by email
    ) as n where n.num >1