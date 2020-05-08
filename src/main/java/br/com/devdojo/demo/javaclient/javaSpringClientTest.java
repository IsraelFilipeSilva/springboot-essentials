package br.com.devdojo.demo.javaclient;

import br.com.devdojo.demo.model.PageableResponse;
import br.com.devdojo.demo.model.Student;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class javaSpringClientTest {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .rootUri("http://localhost:8080/v1/protected/students")
                .basicAuthentication("toyo", "password")
                .build();
        Student student = restTemplate.getForObject("/{id}", Student.class, 23);
        ResponseEntity<Student> forEntity = restTemplate.getForEntity("/{id}", Student.class, 28);

        System.out.println(student);
        System.out.println(forEntity.getBody());

       /* Student[] students = restTemplate.getForObject("/", Student[].class);
        System.out.println(Arrays.toString(students));

        ResponseEntity<List<Student>> exchange = restTemplate.exchange("/", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Student>>() {
                });
        System.out.println(exchange.getBody());*/

        ResponseEntity<PageableResponse<Student>> exchange = restTemplate.exchange("/?sort=id,desc&sort=name,asc", HttpMethod.GET, null,
                new ParameterizedTypeReference<PageableResponse<Student>>() {
                });
        System.out.println(exchange);
    }
}