/**
 * Created by dell on 2016/2/23.
 */
function loadXMLDoc(str) {
    var val = str;
    var xmlhttp;
    if (window.XMLHttpRequest) {
        // code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp=new XMLHttpRequest();
    }
    else {
        // code for IE6, IE5
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    if(xmlhttp==null){
        alert("不能使用AJAX！")
    }
    xmlhttp.onreadystatechange=function(){
        if (xmlhttp.readyState==4 && xmlhttp.status==200){
            var responseText_r = xmlhttp.responseText;
            document.getElementById("text").innerHTML = responseText_r;
        }
    }
    xmlhttp.open("GET","/mobileCheckServlet?mobileNumber="+val,true);
    xmlhttp.send();
}