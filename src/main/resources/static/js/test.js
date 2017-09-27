/**
 * 
 */

window.onload = function() {
	$('#hit').on('click', function () {
		console.log("test");
	   $.ajax({
	   type:'GET',
	   url :"testFunction",
	   success: function(data) {
	        console.log('success',data);
	        $("#abcd").val(data);
	   },
	   error:function(exception){alert('Exeption:'+exception);}
	}); 
	});
}
