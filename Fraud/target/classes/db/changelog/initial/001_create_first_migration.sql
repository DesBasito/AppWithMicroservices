--liquibase formatted sql
--changeset Abu:create hibernate sequence
CREATE SEQUENCE public.hibernate_sequence INCREMENT 1 START 1 MINVALUE 1;
