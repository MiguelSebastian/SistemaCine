/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.utp.controlcine.utiles;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Miguel
 */
public class Utiles {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/reservacion_cine?useLegacyDatetimeCode=false&serverTimezone=UTC";
    //String DB_URL = "jdbc:mysql://localhost:3306/reservacion_cine?useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USUAR = "root";
    public static final String CONTR = "12345";    

    public static Connection getConection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USUAR, CONTR);
        } catch (SQLException ex) {
            Logger.getLogger(Utiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public void ColorEntra(JLabel jlabel){
        jlabel.setBackground(Color.blue);
    }
    public void ColorSale(JLabel jlabel){
        jlabel.setBackground(Color.WHITE);
    }
    private static final String FILE_NAME = "/tmp/MyFirstExcel.xlsx";

    public void Excel(JTable tablita, String nombre) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data Table");
        int filas = tablita.getRowCount();
        Object[][] datatypes = {
            
            {"Datatype", "Type", "Size(in bytes)"},
            {"int", "Primitive", 2},
            {"float", "Primitive", 4},
            {"double", "Primitive", 8},
            {"char", "Primitive", 1},
            {"String", "Non-Primitive", "No fixed size"}
        };
        int rowNum = 0;
        System.out.println("Creating excel");
        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }


    public String getFechaActual(){
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatoFecha.format(LocalDate.now());        
    }

}
