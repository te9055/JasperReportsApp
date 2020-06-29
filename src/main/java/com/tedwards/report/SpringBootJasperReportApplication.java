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

    @GetMapping("/areachart/{format}")
    public String generateArea(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportAreaChart(format);
    }

    @GetMapping("/barchart/{format}")
    public String generatebar(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportBarChart(format);
    }

    @GetMapping("/3dbarchart/{format}")
    public String generateThreeDBar(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportThreeDBarChart(format);
    }

    @GetMapping("/bubblechart/{format}")
    public String generateBubble(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportBubbleChart(format);
    }

    @GetMapping("/Candlechart/{format}")
    public String generateCandle(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportCandleChart(format);
    }

    @GetMapping("/hilowchart/{format}")
    public String generateHiLow(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportHiLowChart(format);
    }

    @GetMapping("/Linechart/{format}")
    public String generateLine(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportLineChart(format);
    }

    @GetMapping("/meterchart/{format}")
    public String generatemeter(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportmeterChart(format);
    }

    @GetMapping("/piechart/{format}")
    public String generatePie(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportPieChart(format);
    }

    @GetMapping("/threedpiechart/{format}")
    public String generateThreeDPie(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportThreeDPieChart(format);
    }

    @GetMapping("/scatterchart/{format}")
    public String generatScatter(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportScatterChart(format);
    }

    @GetMapping("/stackedareachart/{format}")
    public String generateStackedArea(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportStackedAreaChart(format);
    }

    @GetMapping("/stackedbarchart/{format}")
    public String generateStackedBar(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportStackedBarChart(format);
    }

    @GetMapping("/threedstackedbarchart/{format}")
    public String generateThreeDStackedBar(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportThreeDBarChart(format);
    }

    @GetMapping("/thermometerchart/{format}")
    public String generateThermometer(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportThermometerChart(format);
    }

    @GetMapping("/timeserieschart/{format}")
    public String generateTimeSeries(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportTimeSeriesChart(format);
    }

    @GetMapping("/xyareachart/{format}")
    public String generatexyarea(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exporxyAxisChart(format);
    }

    @GetMapping("/xybarchart/{format}")
    public String generatexyBar(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exporxybarChart(format);
    }

    @GetMapping("/xylinechart/{format}")
    public String generatexyLine(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exporxyLineChart(format);
    }

    @GetMapping("/generatenewreport/{type}")
    public String generateNewwReport(@PathVariable String type) throws FileNotFoundException, JRException {
        return service.generateNewreport(type);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJasperReportApplication.class, args);
    }

}
