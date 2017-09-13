/* <!-- internal java script -->
		 function Interest(a,b,c)
		  { 
		      var res = (parseFloat(a.value)*parseInt(b.value)*parseInt(c.value))/100;
			  alert ('simple interest is '+res);
			  }*/
 


 function calSI(frm)
  {
	  if(frm.checkValidity())
	  {
		  var win =window.open("","simple Interest","width=300,height=500");
		  var message="<html><head><title>simple interest details</title></head><body>";
		  
		  message += "<h2>principle Amount is"+frm.txtFN.value+"</h2>";
		  
		  message += "<h2>No.of Years is"+frm.txtEN.value+"</h2>";
		  
		  message += "<h2>Rate of Interest"+frm.txtSN.value+"</h2>";
		 
		 var p=parseFloat(frm.txtFN.value);
		 var n= parseInt(frm.txtEN.value);
		
		 var r= parseInt(frm.txtSN.value);
		 
		  var  si= p*n*r/100;
		  
		  message += "<h1> Simple Interest is "+si+"</h1>";
		   win.document.write(message);
		  
	  }  
  }