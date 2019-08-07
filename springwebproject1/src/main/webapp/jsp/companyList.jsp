<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,com.example.springwebproject1.model.Company"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Stock chart application</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <script src="AdminLandingPage.js"></script>
  <link rel="stylesheet" type="text/css" href="/css/companyList.css">
</head>
<body>
        
        <div class="jumbotron">
            <h1> Company Details </h1>
        </div>
        <div class="container">
                
              <%
                  List companyList=(List)request.getAttribute("companyList");
                  System.out.println(companyList);
              %>
              
              <%for(int i=0;i<companyList.size();i++)
              {
	             Company e = (Company)companyList.get(i);
              
	          %>
                <div class="panel panel-info">
                        <div class="panel-heading">Company Details</div>
                        <div class="panel-body">
                        <div class="row">
                            <div  class="col-md-2">

                            </div>

                            <div  class="col-md-2">
                            <p><%= e.getCompany_name() %></p> 
                            </div>

                            <div  class="col-md-2">
                            <p><%= e.getTurnover() %></p>  
                            </div>

                            <div  class="col-md-4">
                            <p><%= e.getBrief() %></p>   
                            </div>

                            
                            <div  class="col-md-2">
                            <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal" >EDIT</button>
                            </div>

                        </div>
                        </div>
                      </div>
                      
                      <% } %>
                          <div class="modal fade" id="myModal" role="dialog">
                                <div class="modal-dialog">
                                
                                  <!-- Modal content-->
                                  <div class="modal-content">
                                    <div class="modal-header">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      <h2 class="modal-title">Edit Details Form</h2>
                                    </div>
                                    <div class="modal-body">
                                            <form action="/action_page.php">
                                                <label for="cname">Company Name</label>
                                                <input type="text" id="cname" name="companyname" placeholder="Company Name">
                                            
                                                <label for="lname">Stock Exchange</label>
                                                <input type="text" id="stock_change" name="stockexchange" placeholder="Stock Exchange">
                
                                            
                                                <label for="briefwriteup">Brief WriteUp</label>
                                                <textarea id="brief" name="briefwriteup" placeholder="Brief WriteUp" style="height:200px"></textarea>
                                            
                                                <input type="submit" value="Submit">
                                              </form>
                                    </div>
                    
                                  </div>
                                  
                                </div>
                              </div>
        </div>
</body>
</html>