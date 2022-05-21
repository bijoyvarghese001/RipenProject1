<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<form action="add" method="post">
	<label for="role">Choose a Role</label>
	<select name="role" id="role"> <br>
	  <option value="role_mentor">Mentor</option>
	  <option value="role_mentee">Mentee</option>
	</select><br/>
	
	<div class="container d-flex justify-content-center align-items-center">
	
	<div class= "card">
	<div class= "card-body">
		<div>
		<img src="./src/main/styles/images/img1.jpg" alt="" width="150px" height="60px">	
		<img src="./src/main/styles/images/img1.jpg" alt="" width="150px" height="60px">
		<img src="./src/main/styles/images/img1.jpg" alt="" width="150px" height="60px">
		</div>
	<div>
		<h3><b>MENTOR INTAKE FORM</b></h3>
	</div><br>
	<p>This mentor intake form is drafted to make mentorship a rewarding experience. 
	It will also help us in knowing you and your interests a little better.
	Please take a few moments to answer the below questions in their respective sections allowing us to match you with a protégé. 
	Kindly return the completed form to mentorship@sk.cips.ca</p>
	
	<div class="form-group">
	<div class="row">
	<div class="col-md-6">
		<label for="fullName">Full Name </label>
   		 <input type="text" class="form-control" id="fullName" placeholder="">
   		 </div>
   		 <div class="col-md-6">
   		 <label for="cipsMem">CIPS Membership No </label>
   		 <input type="text" class="form-control" id="cipsMemNo" placeholder="">
   		 </div>
	</div>
	<div class="row">
	<div class="col-md-6">
		<label for="currLoc">Current Location </label>
   		 <input type="text" class="form-control" id="currLoc" placeholder="">
   		 </div>
   		 <div class="col-md-6">
   		 <label for="email">Email </label>
   		 <input type="text" class="form-control" id="email" placeholder="">
   		 </div>
   		 </div>
   		 <div class="row">
	<div class="col-md-6">
		<label for="profession">Profession </label>
   		 <input type="text" class="form-control" id="profession" placeholder="">
   		 </div>
   		 <div class="col-md-6">
   		 <label for="title">Current Title </label>
   		 <input type="text" class="form-control" id="title" placeholder="">
   		 </div>
	</div>
	
</div>

	<button class="btn btn-primary" type="submit">Submit form</button>
	
	</div>
	</div>
	</div>

	</form>
</body>
</html>