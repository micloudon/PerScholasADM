var element = document.getElementById("form");
var ele = document.getElementById("feedback");
if(element.addEventListener) {
    element.addEventListener("submit", main_validator, true);
}

else if(ele.attachEvent) {
    element.attachEvent("onsubmit", main_validator);
}

function main_validator(e) {
    console.log(e);
    e.preventDefault();
    ele.innerHTML = "";
    if(check_username(e.targer[0].value)
    && check_dob(e.targer[1].value)) {
        element.submit();
    }
}

function check_username(username) {
    var re = new RegEx('^[a-zA-Z0-9_.-]*$[a-zA-Z_.-]*$/g');
    var message = "";
    var someWrong = false;
    console.log(re.test(username))

    if(!re.test(username)) {
        message += "USER Name only be a-z A-Z 0-9 or _.-";
        someWrong = true;
    }

    if(username.length > 20) {
        message += "\n Username must be under 20 characters"
        someWrong = true;
    }

    if(someWrong) {
        var para = document.createElement("p");
        para.classList.add("danger");

        var t = document.createTextNode(message);
        para.appendChild(t);
        ele.appendChild(para);
        return false;
    }
    return true;
}

function check_dob(dob) {
    var re = new RegExp("/(\d+)(-|\/)(\d+)(?:(\d+)\s+(\d+):(\d+)(?::(\d+))?(?:\.(\d+))?)?/");

    var message = "";

    var someWrong = false;
    
    if(!re.test(dob)){
        message += "Your date of birth is not formatted right";
        someWrong = true;
    }

    if(someWrong) {
        var para = document.createElement("p");
        para.classList.add("danger");

        var t = document.createTextNode(message);

        para.appendChild(t);
        ele.appendChild(para);
        return false;
    }
}