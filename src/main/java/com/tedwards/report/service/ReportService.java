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


    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:employees.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\employees.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\employees.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportAreaChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        List<Employee> employees = repository.findAll();
        File file = ResourceUtils.getFile("classpath:areachart.jrxml");
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\areachart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\areachart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportBarChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:barchart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\barchart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\barchart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportThreeDBarChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:3dbarchart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\3dbarchart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\3dbarchart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportBubbleChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:bubblechart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\bubblechart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\bubblechart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportCandleChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:candlechart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\candlechart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\candlechart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportHiLowChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:hilowchart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\hilowchart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\hilowchart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportLineChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:linechart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\linechart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\linechart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportmeterChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:meterchart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\meterchart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\meterchart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportPieChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:piechart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\piechart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\piechart.pdf");
        }

        return "report generated in path : " + path;
    }


    public String exportThreeDPieChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:3dpiechart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\3dpiechart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\3dpiechart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportScatterChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:scatterchart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\scatterchart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\scatterchart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportStackedAreaChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:stackedareachart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\stackedareachart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\stackedareachart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportStackedBarChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:stackedbarchart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\stackedbarchart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\stackedbarchart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportThermometerChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:thermometerchart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\thermometerchart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\thermometerchart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exportTimeSeriesChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:timeserieschart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\timeserieschart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\timeserieschart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exporxyAxisChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:xyaxischart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\xyaxischart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\xyaxischart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exporxybarChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:xybarchart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\xybarchart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\xybarchart.pdf");
        }

        return "report generated in path : " + path;
    }

    public String exporxyLineChart(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Thomas\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:xylinechart.jrxml");
        List<Employee> employees = repository.findAll();
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employees);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Thomas Edwards");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\xylinechart.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\xylinechart.pdf");
        }

        return "report generated in path : " + path;
    }

}
