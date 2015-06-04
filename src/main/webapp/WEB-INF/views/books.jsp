<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="./header.jspf"%>
<h1>People</h1>
<div id="bd">
<div class="yui-main content">
<div class="contentbox" style="margin-left:5%;margin-right:5%;">
<table class="userlists" style="width:50%">
<tr>
<th width="50%">Title</th>
<th width="25%">Author</th>
<th width="25%">ISBN</th>
</tr>
<c:forEach items="${books}" var="book">
<tr><td>${book.title}</td><td>${book.author}</td><td>${book.isbn}</td></tr>
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
