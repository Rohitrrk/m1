function displayMsg(frm)
	     {
		    if(frm.checkvalidity())
			{
			window.alert('hello');
			  var message;
			   var win =window.open("","simple Interest","width=300,height=500");
			  message +="name is"+frm.txtName.value+";
			   message +="Address is"+frm.txtAddr.value+";
			    message +="State is"+frm.txtState.value+";
				 message +="phone no is"+frm.txtCN.value+";
				  message +="Email is"+frm.txtEmail.value+";
				   //message+="Prefferd way to contact you? is"+frm.txtName.value+";
			 win.document.write(message);
			}
			}