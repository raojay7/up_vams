<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<form method="post" action="">
    <c:if test="${pageResult==null}">
        <center>
            <p><a class="btn btn-primary btn-outline">还没有数据哦</a></p>
        </center>
    </c:if>

    <c:if test="${pageResult!=null}">
        <center>
            <c:if test="${pageResult.pageNum > 1}">
                <p><a href="javascript:doGoPage(${pageResult.pageNum-1})" class="btn btn-primary btn-outline">上一页</a>
                </p>
            </c:if>
        </center>

        <center>

            <p><a class="btn btn-primary btn-outline">第${pageResult.pageNum}页</a></p>

        </center>


        <center>

            <c:if test="${pageResult.pageNum < pageResult.totalPage}">
                <p><a href="javascript:doGoPage(${pageResult.pageNum+1})" class="btn btn-primary btn-outline">下一页</a>
                </p>
            </c:if>
        </center>
        <input id="pageNum" hidden name="pageNum" value="${pageResult.pageNum}"/>
    </c:if>

</form>

