# ServletForm
Basic motive of this project is to see how Servlet handles HTTP request.
I just created basic HTML form.
when user enter his/her details and submits the form the correspondind details(username,password,course,email,gender) are sent to server using post method.
When server recieves the request i just retrieved those details and displayed the same on new HTML page.
At backend I've extended HttpServlet class.
In that class I've overriden doPost() and doGet() methods.
