# Perpule_Assignment
Rest service for add and get customer details

# Use in project
 1. Spring boot
 2. Hibernate
 3. Apache derbyDB (Runtime - you loss data when server stoped)
 
 
# Rest Services
  1. Add Customer
  
      (a)  Authorization (Basic) :-  username & password = admin                                                                           
      (b)  Url :-  http://localhost:8080/addcustomer                                                                                       
      (c)  Request :- POST                                                                                                                 
      (d)  Body :- content type (application/json)                                                                                         
                    sample body =>                                                                                                         
                                    {
                                      "customer_name":"XYZ Yadav",
                                      "mobile_no": 885637948,
                                      "email_id":"sam@dsa.com",
                                      "occupation":"SSE",
                                      "address":"131, adrash nager, hsr layout, 560034"
                                    }
                                                                                                                                           
  2. Get Customer By Id 
  
      (a)  Authorization (Basic) :-  username & password = admin 
      (b)  Url :-  http://localhost:8080/getcustomer/{id}
      (c)  Request :- GET
      
   
   3. Get All Customer (Optional)
   
      (a)  Authorization (Basic) :-  username & password = admin 
      (b)  Url :-  http://localhost:8080/getcustomer
      (c)  Request :- GET
