$(document).ready(function(){
	$('#autoCompleteTxt').keyup(function(){
		var inputText=$(this).val();
		if(inputText != '')
		{
			$.ajax({
//				url:"http://peerless-clock-220123.appspot.com/",
				dataType: "json",
				//url:"https://datazen.katren.ru/calendar/day/",
				//url:"https://elemental-day-220421.appspot.com/hello-world",
				url:"http://localhost:8080/hello-world",
				method:"GET",
				data:{inputText:inputText},
				success:function(data){
					$('#productList').fadeIn();
					//$('#productList').html(result.id);
					$('.greeting-id').append(data.id);
				       $('.greeting-content').append(data.content)
					
				}
			});
		}
	});
});
