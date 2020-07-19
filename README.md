# ServletForm
Basic motive of this project is to see how Servlet handles HTTP request.
I just created basic HTML form.
when user enter his/her details and submits the form the correspondind details(username,password,course,email,gender) are sent to server using post method.
When server recieves the request i just retrieved those details and displayed the same on new HTML page.
At backend I've extended HttpServlet class.
In that class I've overriden doPost() and doGet() methods.
Now I've created home.html and set it as default homepage.
To know the wprking of RequestDispatcher I've created two Servlets i.e SuccesServlet and UnsuccesServlet.
The main use of RequestDispatcher is one servlet can call another servlet using forward() method and one servlet can include output of another servlet uisng include() method.
Created com.attr for the understanding of setting and retriving attributs, for this purpose I've created S1 and S2 servlets.
