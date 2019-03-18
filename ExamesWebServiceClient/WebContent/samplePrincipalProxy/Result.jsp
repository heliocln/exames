<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePrincipalProxyid" scope="session" class="servicos.PrincipalProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePrincipalProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePrincipalProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePrincipalProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        servicos.Principal getPrincipal10mtemp = samplePrincipalProxyid.getPrincipal();
if(getPrincipal10mtemp == null){
%>
<%=getPrincipal10mtemp %>
<%
}else{
        if(getPrincipal10mtemp!= null){
        String tempreturnp11 = getPrincipal10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String nome_1id=  request.getParameter("nome16");
            java.lang.String nome_1idTemp = null;
        if(!nome_1id.equals("")){
         nome_1idTemp  = nome_1id;
        }
        String classificacao_2id=  request.getParameter("classificacao18");
        int classificacao_2idTemp  = Integer.parseInt(classificacao_2id);
        String nota_3id=  request.getParameter("nota20");
        float nota_3idTemp  = Float.parseFloat(nota_3id);
        String idade_4id=  request.getParameter("idade22");
        int idade_4idTemp  = Integer.parseInt(idade_4id);
        String telefone_5id=  request.getParameter("telefone24");
            java.lang.String telefone_5idTemp = null;
        if(!telefone_5id.equals("")){
         telefone_5idTemp  = telefone_5id;
        }
        boolean inserir13mtemp = samplePrincipalProxyid.inserir(nome_1idTemp,classificacao_2idTemp,nota_3idTemp,idade_4idTemp,telefone_5idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(inserir13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 26:
        gotMethod = true;
        java.lang.String listar26mtemp = samplePrincipalProxyid.listar();
if(listar26mtemp == null){
%>
<%=listar26mtemp %>
<%
}else{
        String tempResultreturnp27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(listar26mtemp));
        %>
        <%= tempResultreturnp27 %>
        <%
}
break;
case 29:
        gotMethod = true;
        String id_6id=  request.getParameter("id32");
        int id_6idTemp  = Integer.parseInt(id_6id);
        boolean deletar29mtemp = samplePrincipalProxyid.deletar(id_6idTemp);
        String tempResultreturnp30 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deletar29mtemp));
        %>
        <%= tempResultreturnp30 %>
        <%
break;
case 34:
        gotMethod = true;
        String id_7id=  request.getParameter("id37");
        int id_7idTemp  = Integer.parseInt(id_7id);
        String campo_8id=  request.getParameter("campo39");
            java.lang.String campo_8idTemp = null;
        if(!campo_8id.equals("")){
         campo_8idTemp  = campo_8id;
        }
        String valor_9id=  request.getParameter("valor41");
            java.lang.String valor_9idTemp = null;
        if(!valor_9id.equals("")){
         valor_9idTemp  = valor_9id;
        }
        boolean editar34mtemp = samplePrincipalProxyid.editar(id_7idTemp,campo_8idTemp,valor_9idTemp);
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(editar34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>