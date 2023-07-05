package org.jasper;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author PC-Jose
 */
public class Jasper {

    public static void main (String[] str){
        try{
            JasperReport jasperReport = null;
            JasperPrint jasperPrint = null;
            JasperDesign jasperDesign = null;
            Map paramaters = new HashMap();
            jasperDesign = JRXmlLoader.load("C:\\Users\\Lesly\\OneDrive\\Documentos\\NetBeansProjects\\Jasper\\src\\main\\java\\org\\ListaPersonas.jrxml");//cambiar esto
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, paramaters,
                    new JRBeanCollectionDataSource(Datos.generaDatosPersona()));
            JasperExportManager.exportReportToPdfFile(jasperPrint,"target/ListaPersonas.pdf");
            JasperViewer.viewReport(jasperPrint);
        }catch(Exception ex){
            System.out.println("EXCEPTION: " + ex);
        }
    }
}
