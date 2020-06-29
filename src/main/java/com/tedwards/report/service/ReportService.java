package com.tedwards.report.service;

import com.tedwards.report.entity.Employee;
import com.tedwards.report.repository.EmployeeRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    private EmployeeRepository repository;

    public String generateNewreport(String reportType) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";

        File file = ResourceUtils.getFile("classpath:"+reportType+".jrxml");

        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);




        JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\generatedreport.pdf");

        return "report generated in path : " + path;
    }

    }
