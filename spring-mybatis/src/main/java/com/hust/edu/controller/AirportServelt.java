package com.hust.edu.controller;

import com.hust.edu.pojo.Airport;
import com.hust.edu.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * locate com.hust.edu.controller
 * Created by MasterTj on 2019/1/10.
 */
@WebServlet(value = "/servlet/AirportServelt")
public class AirportServelt extends HttpServlet {

    @Autowired
    private AirportService airportService;

    @Override
    public void init() throws ServletException {
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,getServletContext());
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Airport> allAirport = airportService.findAllAirport();
        req.setAttribute("airPortList",allAirport);
        System.out.println(allAirport);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
