function f_name()
{
	let fname1= document.getElementById("fname").value;
	let fre = /^[A-Za-z]$/
	if (fname1 == ""|| fname1.length<2)
	{
		document.getElementById("1").innerHTML = "First name should contain minimum of 2 characters";
		return false;
	}
	else if( !fre.test(fname1))
	{
		document.getElementById("1").innerHTML = "First name should not contain numbers or special characters";
		return false;
	}
	else if(fname1.length>10 )
	{
		document.getElementById("1").innerHTML = "First name cannot exceed 10 characters ";
		return false;
	}
	else{
	document.getElementById("1").innerHTML = "";
}

}

function l_name()
{
	let lname1= document.getElementById("lname").value;
	let lre = /^[A-Za-z]$/
	if (lname1 == "")
	{
		document.getElementById("2").innerHTML = "Last name cannot be null<br>";
		return false;
	}
	else if( !lre.test(lname1))
	{
		document.getElementById("2").innerHTML = "Last name should not contain numbers<br>";
		return false;
	}
	else if(lname1.length>10 )
	{
		document.getElementById("2").innerHTML = "Last name cannot exceed 10 characters ";
		return false;
	}
	else{
	document.getElementById("2").innerHTML = "";
}
}



function d_name()
{
	let dname1= document.getElementById("dname").value;
	let dre = /^[A-Za-z0-9]{2,10} $/
	if (dname1 == "")
	{
		document.getElementById("3").innerHTML = "Display name cannot be null<br>";
		return false;
	}
	else if( !dre.test(dname1))
	{
		document.getElementById("3").innerHTML = "Last name should not contain numbers<br>";
		return false;
	}
	else if(dname1.length>10 )
	{
		document.getElementById("3").innerHTML = "display name cannot exceed 10 characters ";
		return false;
	}
	else{
	document.getElementById("3").innerHTML = "";
}
}

function chpassword()
{
	let pass = document.getElementById("password").value;
	let pre = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*]$/
	if(pass=="")
	{
		document.getElementById("4").innerHTML = "Password cannot be null";
		return false;
	}
	else if(!pre.test(pass))
	{
		document.getElementById("4").innerHTML = "Password should contain atleast one Uppercase,one Lowercase, one Special character,one digit from 0-9";
		return false;
	}
	else if(pass.length<10)
	{
		document.getElementById("4").innerHTML = "Password should atleast contain 10 characters";	
		return false;
	}
	else{
	document.getElementById("4").innerHTML = "";
}
}

function chpassword2()
{
	let pass1 = document.getElementById("cpassword").value;
	let pass = document.getElementById("password").value;
	if(pass == pass1)
	{
		document.getElementById("5").innerHTML = "Passwords do not match";
		return false;
	}
	else{
	document.getElementById("5").innerHTML = "";
}
}

function dobvalid()
{
	let dob = document.getElementById("dob").value;
	let tdob = new Date(dob);
	let currDate = new Date();
	if(tdob>=currDate)
	{
		document.getElementById("6").innerHTML = "Enter a valid Date";
		return false;
	}
	else{
	document.getElementById("6").innerHTML = "";
}
}

function mailed()
{
	let email = document.getElementById("email").value;
	let cemail =/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

	if(!cemail.test(email))
	{
		document.getElementById("7").innerHTML = "Enter a valid email";
		return false;
	}
	else{
	document.getElementById("7").innerHTML = "";
}
}

function phnum()
{
	let phonenumber = document.getElementById("phonenumber").value;
	let phcheck = /^[0-9]{10}$/
	if(!phcheck.test(phonenumber))
	{
		document.getElementById("8").innerHTML = "Phone Number must be 10 digits only"
		return false;
	}
	else{
	document.getElementById("8").innerHTML = "";
	}
	
}


function add()
{
	let address = document.getElementById("address").value;
	if(address = ""||address.length<30)
	{
		document.getElementById("9").innerHTML = "Please enter a valid address";
		return false;
	}
	else{
	document.getElementById("9").innerHTML = "";
}


}

function pcode()
{
	let pincode1 = document.getElementById("pincode").value;
	let cpincode = /^[0-9]{6}$/
	if(pincode1=""|| !cpincode.test(pincode1))
	{
		document.getElementById("10").innerHTML = "Enter a valid pincode";	
		return false;
	
	}
	else{
	document.getElementById("10").innerHTML = "";
}
}
