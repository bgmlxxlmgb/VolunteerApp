/**
 * Created by dell on 2016/2/23.
 */
window.onload = init;
function init(){
    document.getElementById("uploadBtn").onchange = change;
}
function change() {
    document.getElementById("uploadFile").value = this.value;
};
function passwordCheck(){
    alert("11111111111111111111");
    var passwordNew = document.getElementById("passwordNew");
    var passwordCheck = document.getElementById("passwordCheck");
    if(passwordNew.value == passwordCheck.value){
        alert("OK");
        return false;
    }
    else{
        alert("NO");
        return false;
    }
}