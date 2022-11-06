

 function validateForm1(){
        let customerID=document.forms["form1"]["customerID"].value;
        //var customerID  = document.getElementById(customerNID).value;
        var length = customerID.length
        if(customerID !=="" && (length >6 && customerID.length < 10) )
        {
            alert(customerID);
            return true;
            }
        else if(customerID.length < 6 || customerID.length > 10){
                alert("limit voilated");
                return false;
            }
            else{
                alert("ok");
                return false;

            }
    }
    
 function validateForm2(){
        let customerID=document.forms["form2"]["customerID"].value;
        //var customerID  = document.getElementById(customerNID).value;
        var length = customerID.length
        if(customerID !=="" && (length > 6 && customerID.length < 10) )
        {
            alert(customerID);
            return true;
            }
        else if(customerID.length < 6 || customerID.length > 10){
                alert("limit voilated");
                return false;
            }
            else{
                alert("ok");
                return false;

            }
    }
    
 function validateForm3(){
        let customerID=document.forms["form3"]["customerID"].value;
        //var customerID  = document.getElementById(customerNID).value;
        var length = customerID.length
        if(customerID !=="" && (length > 6 && customerID.length < 10) )
        {
            alert(customerID);
            return true;
            }
        else if(customerID.length < 6 || customerID.length > 10){
                alert("limit voilated");
                return false;
            }
            else{
                alert("ok");
                return false;

            }
    }
    
 function validateForm4(){
        let customerID=document.forms["form4"]["customerID"].value;
        //var customerID  = document.getElementById(customerNID).value;
        var length = customerID.length
        if(customerID !=="" && (length > 6 && customerID.length < 10) )
        {
            alert(customerID);
            return true;
            }
        else if(customerID.length < 6 || customerID.length > 10){
                alert("limit voilated");
                return false;
            }
            else{
                alert("ok");
                return false;

            }
    }