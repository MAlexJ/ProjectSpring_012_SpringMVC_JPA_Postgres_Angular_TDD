1. Display Hibernate SQL to console – show_sql , format_sql and use_sql_comments
http://www.mkyong.com/hibernate/hibernate-display-generated-sql-to-console-show_sql-format_sql-and-use_sql_comments/

2. How to set hibernate.hbm2ddl.auto in Spring with Annotations and pure Java
http://stackoverflow.com/questions/32897640/how-to-set-hibernate-hbm2ddl-auto-in-spring-with-annotations-and-pure-java

3. Config Hibernate
https://www.youtube.com/watch?v=eodwKFs6bR4&app=desktop -> JavaDay

4. JaCOCO
https://www.youtube.com/watch?v=CiPhTanChr8

5. Unit Testing of Spring MVC Controllers: “Normal” Controllers
http://www.petrikainulainen.net/programming/spring-framework/unit-testing-of-spring-mvc-controllers-normal-controllers/

5. MockMvc
Main entry point for server-side Spring MVC test support.
http://docs.spring.io/spring/docs/3.2.x/javadoc-api/org/springframework/test/web/servlet/MockMvc.html

!!! Norm !!!!!! ->>>>>>>
http://stackoverflow.com/questions/14563489/how-to-test-a-spring-controller-method-by-using-mockmvc

Simple controller -> https://habrahabr.ru/post/171911/
REST controller -> https://habrahabr.ru/post/173593/


6. java 8
http://urvanov.ru/category/%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/java/

7.  Removing The Dotted Outline
https://css-tricks.com/removing-the-dotted-outline/

8. AngularJs navBar
http://jsfiddle.net/8mcedv3b/


9. Вставка html в angularjs
http://ru.stackoverflow.com/questions/362250/%D0%92%D1%81%D1%82%D0%B0%D0%B2%D0%BA%D0%B0-html-%D0%B2-angularjs

10.How to respond with HTTP 400 error in a Spring MVC @ResponseBody method returning String?
http://stackoverflow.com/questions/16232833/how-to-respond-with-http-400-error-in-a-spring-mvc-responsebody-method-returnin


I m using this in my spring boot application

@RequestMapping(value = "/matches/{matchId}", produces = "application/json")
@ResponseBody
public @ResponseBody ResponseEntity<?> match(@PathVariable String matchId, @RequestBody String body,
            HttpServletRequest request, HttpServletResponse response) {

    Product p ;
     try{
       Product p = service.getproduct(request.getProductId());
      }
     catch(Exception ex){
       return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }

     return new ResponseEntity<product,HttpStatus.OK);

}

11 spring-mvc-test auto rollback transactions configured with AOP xml on Service layer
http://stackoverflow.com/questions/24379980/spring-mvc-test-auto-rollback-transactions-configured-with-aop-xml-on-service-la

