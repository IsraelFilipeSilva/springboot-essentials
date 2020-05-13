package br.com.devdojo.demo.javaclient;

import br.com.devdojo.demo.model.Student;

public class javaSpringClientTest {
    public static void main(String[] args) {

        Student studentPost = new Student();
        studentPost.setName("John Wick 3");
        studentPost.setEmail("johnwith@outlook.com");
//        studentPost.setId(89L);
        JavaClienteDAO dao = new JavaClienteDAO();
//        System.out.println(dao.findById(111));
//        System.out.println(dao.listAll());
//        System.out.println(dao.save(studentPost));
//       dao.update(studentPost);
        dao.delete(89);
    }
}