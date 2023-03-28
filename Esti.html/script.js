$(document).ready(function(){
	$("#employeeForm").submit(function(event){
		event.preventDefault();
		var name = $("#name").val();
		var id = $("#id").val();
		var location = $("#location").val();
		var address = $("#address").val();
		var bloodgroup = $("#bloodgroup").val();
		var experience = $("#experience").val();
		var skills = $("#skills").val();
		var url = "submit.php?name=" + name + "&id=" + id + "&location=" + location + "&address=" + address + "&bloodgroup=" + bloodgroup + "&experience=" + experience + "&skills=" + skills;
		$.getJSON(url, function(data){
			$("#message").html(data.message);
		});
	});
});
