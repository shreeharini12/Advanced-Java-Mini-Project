function validatepro() 
	{
		var cardnumber =document.forms.form.CardNumber.value;
		var cardholdername =document.forms.form.CardHolderName.value;
		var validity =document.forms.form.Validity.value;
	    var securitycode =document.forms.form.SecurityCode.value;
		var cardname=/^[A-Za-z]+$/;							

		if (cardnumber == "" ) {
			alert("Please enter cardnumber.");
			cardnumber.focus();
			return false;
		}

		
		
		if (cardholdername== "" ||!cardname.test(cardholdername) ) {
			alert("Please enter only alphabets for name ");
			cardholdername.focus();
			return false;
		}
		
		if (validity == "") {
			alert("Please enter date. ");
			validity.focus();
			return false;
		}

		
		if (securitycode == "" ) {
			alert("Please enter securitycode. ");
			securitycode.focus();
			return false;
		}

		
		return true;
	}