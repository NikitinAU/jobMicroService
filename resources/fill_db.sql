INSERT INTO tag (name) values  ('Java'),
                               ('C++'),
                               ('Python'),
                               ('JavaScript');
INSERT Into company (name, description, foundation_date, amount_of_employees, ceo_name, stars)
values  ('company1', 'desc', '1999-01-01', 1200, 'Mike Wazowski', 4.01),
        ('company2', 'desc', '1998-12-30', 30000, 'Cool Guy', 3.53),
        ('company3', 'desc', '2005-07-23', 300, 'Man Man', 4.55);
INSERT INTO job (name, description, tag_id, posted_date, contact_phone, contact_name, is_available, company_id)
values  ('Backend Java Developer', 'desc', 9, '2023-01-08', '9999999999', 'HR Person 1', 'true', 16),
        ('Frontend Developer (JavaScript)', 'desc', 12, '2022-11-03', '9219219291', 'HR Guy 1', 'true', 17);
