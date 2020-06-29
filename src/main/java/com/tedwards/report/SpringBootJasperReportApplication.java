package com.tedwards.report;

import com.tedwards.report.entity.Employee;
import com.tedwards.report.repository.EmployeeRepository;
import com.tedwards.report.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileNotFoundException;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootJasperReportApplication {

    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private ReportService service;

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {

        return repository.findAll();

    }

    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportReport(format);
    }

    @GetMapping("/piechart/{format}")
    public String generatePie(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportPieChart(format);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJasperReportApplication.class, args);
    }

}
