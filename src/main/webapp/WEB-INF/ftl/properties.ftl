<#-- @ftlvariable name="properties" type="java.util.List<net.tubizou.gembro.domain.map.Property>" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>List of Properties</title>
</head>
<body>

<h1>List of Properties</h1>

<#-- Search Engine -->

<#-- Results -->
<table>
    <thead>
    <tr>
        <th>Address</th>
        <th>City</th>
    </tr>
    </thead>
    <tbody>
    <#list properties as property>
    <tr>
        <td><a href="/property/${property.id}">${property.address}</a></td>
        <td>${property.city}</td>
    </tr>
    </#list>
    </tbody>
</table>
</body>
</html>