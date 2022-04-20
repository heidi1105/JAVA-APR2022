# Reminders

## Project setup
1. All dependencies in pom.xml
2. application.properties (hidden method & create schema in MySQL)
3. create packages, make sure the name is correct
4. create WEB-INF folder
5. make sure you have all taglib for jsp

## jsp
1. render form : 
	- jsp: modelAttribute name
	- Controller: creating an empty object with the same name / @ModelAttribute to create an empty object
	- Edit: hidden input for "put"
	- form:hidden 
2. process form:
	- the correct order for @Valid @ModelAttribute BindingResult
	- edit: {id} in the path
	- create: NO {id} in the path
	- logic after validation
3. delete:
	- using a form to direct to a DeleteMapping path
4. dashboard:
	- c:forEach 
	- book.creator.userName

