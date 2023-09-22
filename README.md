# Admin Dashboard Backend APIs

Welcome to the Consultant Booking Web App Backend! This system serves as the core of our web application's admin
dashboard, enabling seamless management of consultant requests, user profiles and statistics. 

## Table of Contents

- [Technical Requirements](#technical-requirements)
- [Tables Schema](#tables-schema)
    - [User](#1-user)
    - [Consultant Req](#2-consultant-req)
    - [Consultant](#3-consultant)
- [Services](#services-)
    - [Approve Consultant API](#1-approve-consultant-api)
    - [Consultant Details API](#2-consultant-details-api)
    - [Add Addtional Details API](#3-add-additional-details-api)
    - [Web Statistics API](#4-web-statistics-api)

## Technical Requirements:

1. Backend Language: Java
2. Framework: Spring Boot for building RESTful APIs.
2. Data Storage: Used H2 DB as in-memory database.
3. Code Quality: Write clear, readable, and well-documented code to ensure maintainability.

## Tables Schema:

### 1. User

- UserID : Primary Key , Int
- Role : String , Default: Client (Admin/Consultant)
- Name : String, Required
- Age : Int
- PhoneNo : BigInt
- Gender : String
- Email : String
- CV : String(Link)

### 2. Consultant Req

- RequestID : Primary Key
- UserID : Foreign Key
- Status : Default , Pending (else Verified/Rejected)

### 3. Consultant

- ConsultantID : Primary Key
- UserID : Foreign Key

## Services :

### 1. Approve Consultant API:

- Endpoint1: `api/getConsultantsReq`
- Description: This API allows the admin to view all the consultant requests which are pending.

- Endpoint2: `/api/approveConsultantRequest/{Approval}/{ConsultantID}`
- Description: This API allows the admin to approve or reject consultant requests. The {consultantID} parameter
  represents the unique identifier of the consultant request to be
  approved or rejected.

### 2. Consultant Details API:

- Endpoint1: `/api/getConsultantDetails`
- Description: This API allows the admin to view a list of all consultant with their details.

- Endpoint2: `/api/getConsultantDetailByRole`
- Description: This API allows the admin to view a list of all consultant with a sepcific Job Role.


### 3. Add Additional Details API:

- Endpoint: `/api/updateField/{UserId}/{FieldName}/{value}`
- Description: This API allows to add details of consultant. link of CV can be stored.

### 4. Web Statistics API:

- Endpoint: `/api/getStats`
- Description: This API returns number of clients, number of consultants and no of sessions booked.
