create table Auth
(
    authId     varchar(255) not null primary key,
    created_at datetime(6)  not null,
    updated_at datetime(6)  null,
    authRole   varchar(255) null
);

create table Member
(
    authId      varchar(255) not null,
    memberId    varchar(255) not null,
    created_at  datetime(6)  not null,
    updated_at  datetime(6)  null,
    memberLevel varchar(255) null,
    memberName        varchar(255) null,
    primary key (authId, memberId),
    constraint FK_AUTHID foreign key (authId) references Auth (authId)
);

create table Wallet
(
    walletId   varchar(255) not null
        primary key,
    created_at datetime(6)  not null,
    updated_at datetime(6)  null,
    walletName       varchar(255) null,
    walletType       varchar(255) null,
    authId     varchar(255) null,
    memberId   varchar(255) null,
    constraint FK_MEMBERID_AUTHID foreign key (authId, memberId) references Member (authId, memberId)
);