create table orders (
    ID bigserial not null,
    TENNAT_ID varchar(36),
    VERSION_NO integer,
    CREATED_AT timestamp,
    CREATED_BY varchar(255),
    MODIFIED_AT timestamp,
    MODIFIED_BY varchar(255),
    LOCATION_ID varchar(36),
    SOURCE_ID varchar(36),
    TREATMENT_ID varchar(36),
    PO_NUMBER varchar(50),
    NOTES varchar(255),
    CLOSED bool,
    CLOSED_AT timestamp,
    CLOSED_BY varchar(255),
    constraint orders_PK primary key(ID)
);
