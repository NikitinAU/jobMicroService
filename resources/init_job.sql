create table tag (
                     id serial not null,
                     name text not null,
                     primary key (id)
);

create table company(
                        id serial not null,
                        name text not null,
                        description text,
                        foundation_date date not null,
                        amount_of_employees integer not null,
                        ceo_name text,
                        stars float,
                        primary key(id)
);

CREATE TABLE job (
                     id serial NOT NULL,
                     name text not null,
                     description text,
                     tag_id integer not null,
                     posted_date date not null,
                     contact_phone varchar(11) not null,
                     contact_name text not null,
                     is_available boolean not null,
                     company_id integer not null,
                     primary key(id),
                     foreign key (tag_id) references tag (id) on delete cascade,
                     foreign key (company_id) references company (id) on delete cascade
);