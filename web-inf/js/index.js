/**
 *
 */

function login(from) {
	var id = document.getElementById("id");
	var pass = document.getElementById("pass");
	var tdDt = document.getElementsByClassName("tdDt");
	for (var i = 0; i < tdDt.length; i++) {
		var a = tdDt[i];
		alert(a.innerText);
	}
}

function login2() {
	var id = document.getElementById("id");
	var pass = document.getElementById("pass");

	if(!lengthCheck(id.value, "ID", 4) ){
		alert("ok");
	}


}

function lengthCheck(str, nm, len) {
	if(str.length < len ) {
		alert(nm + "는 " + len + "글자 이상 지정해주세요.");
		return false;
	}
	return true;
}

function goto() {
	var url = document.getElementById("url");
	location.href="http://" + url.value;
}