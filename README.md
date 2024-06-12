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
•  Add additional fields to the part entity for maximum and minimum inventory.<br>
•  Modify the sample inventory to include the maximum and minimum fields.<br>
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.<br>
•  Rename the file the persistent storage is saved to.<br>
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.


## H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.<br>
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.<br>
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.<br>


## I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


## J.  Remove the class files for any unused validators in order to clean your code.