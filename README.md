<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Changes:
<br>
mainscreen.html, Line 14: Changed title to "My Gaming Station Shop"
<br>
mainscreen.html, Line 19: Changed h1 to say "My Gaming Station Shop"
<br>

## D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
Added about.html to templates folder. <br>
mainscreen.html, Line 20: added link to about page <br>
about.html, Line 1-25: Added same formatting contents that are in mainscreen.html for similar styling and format. <br>
about.html, Line 14: Changed title to About <br>
about.html, Line 18: Created h1 header <br>
about.html, Line 19: added link to main page <br>
about.html, Line 20: added hr tag to create line under page header <br>
about.html, Line 21-22: Added description to about us paragraph. <br>
aboutController.java, Line 1-8: added package and imports  <br>
aboutController.java, Line 17: added controller class <br>
aboutController.java, Line 21: added GetMapping controller to return the about page <br>


## E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

BootStrapData.java, Line 63-110: uncommented sample code, and added products, inhouse parts, and outsourced parts to data. <br>
BootStrapData.java, Line 111-122: added logic so that duplicate data does not get added every time program is run. <br>
mainscreen.html, Line 14: Changed title to "My Lawn Care Shop" <br>
mainscreen.html, Line 19: Changed h1 to say "My Lawn Care Shop" <br>
about.html, Line 21-22: Changed description for about us paragraph to reflect new store. 

## F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

mainscreen.html, Line 86-87: added buy now button. <br>

Created new file confirmationbuyproduct.html, and copied contents from confirmationdeleteproduct.html <br>
confirmationbuyproduct.html, Line 10: Changed message contents. <br>
mainscreen.html, Line 86: Added "Buy Now" button. <br>
AddProductController.java, Line 34-35:  added ProductService variable to class for use with buyNow method. <br>
AddProductController.java, Line 131-142: Added buyNow controller.  <br>
ProductService.java, Line 20: created buyProduct method. <br>
ProductServiceImpl.java, Line 71-84: created buyProduct method and what it does. <br>
Created failbuyproduct.html <br>




## G.  Modify the parts to track maximum and minimum inventory by doing the following:
Part.java, Line 34-37: added maxInv and minInv variables. <br>
Part.java, Line 60-70: Added getters and setters for minInv and maxInv. <br>
BootStrapData.java, Line 69-109: Added minInv and maxInv setters for each part. <br>
InhousePartForm.html, Line 24-28: Added field in form for minInv and maxInv. <br>
OutsourcedPartForm.html, Line 25-29: Added field in form for minInv and maxInv. <br>
Renamed DB file to old-spring-boot-db in application.properties file, and the file itself. <br>
Part.java, line 116-117: Created method isValidInv() to check if part inventory is between max and min allowed values. <br>
mainscreen.html, line 49-50: added min and max values to table. <br>
Created ValidMaxParts.java annotation file and MaxPartsValidator.java for max inventory validation. <br>
Created ValidMinParts.java annotation file and MinPartsValidator.java for min inventory validation. <br>
AddInhousePartController.java line 43-48: added error handling to keep inv between min and max. <br>
AddOutsourcedPartController.java line 43-48: added error handling to keep inv between min and max.


## H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:

No changes made, all tasks already work. 

## I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
PartTest.java, Line 160-194: Added 4 part tests for maxinv and mininv.

## J.  Remove the class files for any unused validators in order to clean your code.