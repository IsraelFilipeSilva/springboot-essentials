package br.com.devdojo.demo.javaclient;

import br.com.devdojo.demo.model.Student;

public class javaSpringClientTest {
    public static void main(String[] args) {

        Student studentPost = new Student();
        studentPost.setName("John Wick");
        studentPost.setEmail("johnwith@outlook.com");
        JavaClienteDAO dao = new JavaClienteDAO();
        System.out.println(dao.findById(21));
        System.out.println(dao.listAll());
        System.out.println(dao.save(studentPost));
    }
}