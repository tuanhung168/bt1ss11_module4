package com.example.ra;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
      List<Customer> customerList = new ArrayList<>();

    public void init() {
        Customer customer = new Customer(1,"Nguyen Hoai nam","1983-08-20","Ha noi","https://www.vietnamfineart.com.vn/wp-content/uploads/2023/03/hinh-anh-co-gai-cute-anime-8-min-4.jpg");
        Customer customer1 = new Customer(2,"Nguyen Hoai nam","1983-08-20","Ha noi","https://www.vietnamfineart.com.vn/wp-content/uploads/2023/03/hinh-anh-co-gai-cute-anime-8-min-4.jpg");
        Customer customer2 = new Customer(3,"Nguyen Hoai nam","1983-08-20","Ha noi","https://www.vietnamfineart.com.vn/wp-content/uploads/2023/03/hinh-anh-co-gai-cute-anime-8-min-4.jpg");
        Customer customer3 = new Customer(4,"Nguyen Hoai nam","1983-08-20","Ha noi","https://www.vietnamfineart.com.vn/wp-content/uploads/2023/03/hinh-anh-co-gai-cute-anime-8-min-4.jpg");
        Customer customer4 = new Customer(5,"Nguyen Hoai nam","1983-08-20","Ha noi","https://www.vietnamfineart.com.vn/wp-content/uploads/2023/03/hinh-anh-co-gai-cute-anime-8-min-4.jpg");
        Customer customer5 = new Customer(6,"Nguyen Hoai nam","1983-08-20","Ha noi","https://www.vietnamfineart.com.vn/wp-content/uploads/2023/03/hinh-anh-co-gai-cute-anime-8-min-4.jpg");
        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("listPro",customerList);
        request.getRequestDispatcher("/customer.jsp").forward(request,response);
    }

    public void destroy() {
    }
}