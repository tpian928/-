var myApp = new Framework7();
var $$ = Dom7;

//调试用函数
function xl (str) {
   document.write(str+"<br>");
}

//画界面
function x (str) {
   document.write(str);
}

//调试输出
function o (str) {
	console.log(str);
}

//给ID的赋innerHTML
function idIsValue(id,value){
   var element = document.getElementById(id);
   element.innerHTML=value;
}

//判断是否为空
function isEmpty (str) {
	if (str!=null&&str!=""&&str!="undefined") {
		return false;
	}
	else{
		return true;
	}
}

function assignToSession (keyStr,valueStr) {

    $$.post('assign', {key: keyStr,value:valueStr}, function (data) {
        
    });   

}

function addDynamicWeb (a,b) {
	o("addDynamicWeb");
	var returnStr = "";
	$$.post('adw', {type: a,param1:b}, function (data) {
		return data;
    }); 

}

