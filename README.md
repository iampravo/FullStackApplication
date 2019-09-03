# FullStackApplication

This is a simple full stack application having :
- UI with d3js & HTML 
- Backend with Java,Spring Boot, Spring JPA - Hibernate 
- Database with H2 - in memeory database

## UI
UI comprises of d3js and simple html.
Two chart have been created using d3js : Heatmap * Histogram

## Backend
Backend comprises of Jav, SPring boot & Spring JPA.
Three REST endpoints are 
 - created using spring-boot
 - secured by Spring security
 - encrypted by SSL having JKS
 - exposed over https 
 - wrapped by Spring JPA-Hibernate to access db
 
## Database
H2 In-Memory is used as database 
It is connected using hibernate to backend code
Its uses schema.sql to create tables in H2 db.
