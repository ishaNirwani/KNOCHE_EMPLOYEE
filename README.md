<h1>KNOCHE PROJECT</h1>
It’s a Company Administration Web application. Its design to give a comfortable environment with the ease in writing and reading data from databases as well as it provides security of JAVA.
Objective
<p>This section presents a conceptual overview of the solution, and then provides an introduction to its requirements.
</p>Solution Concept
The Knochee software consists of:<br>
•	Employee Registration into the database: Automate the current names of employee generation system and maintain the searchable customer, products database and product invoice, maintain the data security, user rights.<br>
•	Report Product: It automatically generates the product report and the sale of the product 
<br><br>
Technologies used:
Front End<BR>
•	jQuery<BR>
•	html<BR>
•	javascript<BR>
•	Bootstrap<BR>

<B>Back End</B>

1.	Java (NetBeans)
•	Hibernet<BR>
•	Servlet<BR>
•	Jsp<BR>
•	GlassFish Server<BR>
<BR><BR>

Web Pages and Application 

1.	Product page<BR>
It is the home page of our project where the admin can access:<BR>
•	The list of all available products<BR>
•	Availability of the products<BR>
•	Kinds of products<BR>
•	Sales of the product<BR>
•	Buyer of the specific product<BR>

1.	Front Home Page 

![](images/1.png)
This is the main page. It has different connections with the servlet for performing data retrival from the databases and performing several queries.

2.	See All Section
![](images/2.png)
* •	Mysql Table of the Products
![](images/3.png)

*  Output of the request run by displayProduct.java 
![](images/4.png)

3.	See Particular Product Section 
![](images/5.png)
*  output by show_specific requested product 
![](images/6.png)
* mysql table of the specific product (chocolate tuffel)
 ![](images/7.png)


4. Registration page 

![](images/8.png)
•	Data is entering in mysql table
 ![](images/9.png)
•	The result when we click on display all employees (on controller/display.java)
![](images/10.png)
