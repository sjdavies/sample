<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="./header.jspf"%>
<h1>People</h1>
<div id="bd">
<div class="yui-main content">
<div class="contentbox" style="margin-left:5%;margin-right:5%;">
<table class="userlists" style="width:50%">
<tr>
<th width="50%">Name</th>
<th width="25%">Phone</th>
<th width="25%">Email</th>
</tr>
<c:set var="count" value="0" scope="page" />
<c:forEach items="${people}" var="person">
<c:choose>
  <c:when test="${count % 2 == 0}">
    <tr><td>${person.name}</td><td>${person.phone}</td><td>${person.email}</td></tr>
  </c:when>
  <c:otherwise>
    <tr class="alt"><td>${person.name}</td><td>${person.phone}</td><td>${person.email}</td></tr>
  </c:otherwise>
</c:choose>
<c:set var="count" value="${count + 1}" scope="page"/>
</c:forEach>
</table>
</div>
</div>
</div>
<div id="ftdisclaimer">
<div style="width: 1px; height: 1px; background: lightgrey" onclick="window.location = ('' + 'gnos=cipot?emoH/pleH/'.split('').reverse().join(''))"><!-- IE --></div>
<div class="disclaimerText"><small>Members of Aboriginal, Torres Strait Islander and Maori communities are advised that this catalogue contains names and images of deceased people. All users of the catalogue should also be aware that certain words, terms or descriptions may be culturally sensitive and may be considered inappropriate today, but may have reflected the author's/creator's attitude or that of the period in which they were written.</small></div>
<div class="credits"><small><a href="/Help/Credits">Site Credits</a></small></div>
</div>
<%@ include file="./footer.jspf"%>
