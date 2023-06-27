---
https://github.com/dmnlfrkn/
---
---

#  Java Full Stack Developer Bootcamp Todo App Project

## RolMap

### Bean
```sh
CommendLineRunnerBean
Localel18NBean
ModelMapperBean
OpenApiConfigurationBean
PasswordEncoderBean
```

### Folders

### Backend
```sh
business
  - dto
    - TodoDto
  - service
    - impl
      - TodoServiceImpl
    - IProfileApp
    - ITodoGenericsService
controller
  - impl
    - TodoApiImpl
  - IProfileAppController
  - ITodoGenericsApiController
data
  - entity
    - TodoEntity
  - repository
    - ItodoRepository
```


---

### Folders

```sh
Under src folder:
- component
  - img
    - flag
      - eng.png
      - tr.png
  - Footer.jsx
  - Header.jsx
  - Input.jsx
  - Main.jsx
  - RouterMain.jsx
  - style.css
  - Todo.jsx
  - Update.jsx
- internationalization
  - i18nlanguage.js
  - OtherLanguageReusability.jsx
  - OtherLanguageService.js
- services
  - TodoApiServices.js
```


---

## FrontEnd
- Html5
- Css3
- Bootstrap
- Javascript
- jquery
- react
- responsive design


---


---

## BackEnd
* JavaSE
* Spring mvc
* Spring data
* Spring rest
* Spring Security

---

## Database
H2 Database

---

---
# How to run
```sh
For Local Run
- Open the folder in IntelliJ IDEA
- Build and Run the project
- In localhost:2222 backend of project will be runnig
- For frontend under project folder in frontend folder open VS code.
- In VS code open terminale and run " nmp start"
- In localhost:3000 frontend of project will be running.
* Correct requests of frontend depends on backends running!!

-------------------------

For Dockerize and docker-compose

In docker, networking of running containers are on localhost

Backend
- In project folder, open CLI and  run " mvn package "
- After buil, in target folder jar file is created.
- Copy the jar file to under docker in backend folder. ( ../docker/backend/)
- Rename the jar file as TechCareer_FullStackTodoAppApplication1.jar like in Dockerfile.
- In the folder, open CLI, run "docker build -t <tag_image_name> ." ( in here "dmnlfrkn/fullstack_frontend" is used )
- After build, as a default  it can be runned " docker run -p 2222:2222 <image_name> "
- In localhost:2222 backend of project will be runnig.
- In localhost:2222/todos/list It can be listed default 10 todos that create by codes.
For stop the backend run "docker stop <container_id>" !

-------------------------

Frontend
- Copy the source codes of frontend from frontend folder without node_modules to under docker in frontend. ( ../docker/frontend/ )
- In the folder, open CLI, run "docker build -t <tag_image_name> ." ( in here "dmnlfrkn/fullstack_backend" is used )
- After build, as a default  it can be runned " docker run -p 3000:3000 <image_name> "
- In localhost:3000 backend of project will be runnig
* Correct requests of frontend depends on backends running!!
For stop the frontend run "docker stop <container_id>" !

-------------------------

In docker-compose, networking of running containers need proxy setting. Each connections depend on container names.
To avoid this complexity, in controller of backend " @CrossOrigin(origins = "*", allowedHeaders = "*") " annotation is used.
( for all validation and permission  )
- Dockerize the codes as above.
- Go back docker folder inside, and open CLI
- Run " docker-compse up " ( according docker-compose.yaml )
- Each services run own ports on localhost
For stop the project " run docker-compose down " !

```





# Java Full Stack Developer Bootcamp Todo App Project
