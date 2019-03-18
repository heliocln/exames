<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exames</title>

<link rel="stylesheet" type="text/css" href="../Exames/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../Exames/css/datatable-bootstrap.css">


<script src="../Exames/js/jquery.js"></script>
<script src="../Exames/js/bootstrap.js"></script>
<script src="../Exames/js/jquery-datatable.js"></script>
<script src="../Exames/js/datatable-bootstrap.js"></script>
<script src="../Exames/js/index.js"></script>

</head>
<body>
<br><br><br><br>
<table id="example" class="table table-striped table-bordered" style="width:100%">
        <thead>
            <tr>
                <th>Nome</th>
                <th>Qualificação</th>
                <th>Nota</th>
                <th>Idade</th>
                <th>Telefone</th>                
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Thiago Freitas</td>
                <td>System Architect</td>
                <td>Edinburgh</td>
                <td>61</td>
                <td>2011/04/25</td>                
            </tr>
            <tr>
                <td>Helio Caetano</td>
                <td>Accountant</td>
                <td>Tokyo</td>
                <td>63</td>
                <td>2011/07/25</td>                
            </tr>          
        </tbody>
        <tfoot>
            <tr>
                <th>Nome</th>
                <th>Qualificação</th>
                <th>Nota</th>
                <th>Idade</th>
                <th>Telefone</th>  
            </tr>
        </tfoot>
    </table>

	
</body>
</html>