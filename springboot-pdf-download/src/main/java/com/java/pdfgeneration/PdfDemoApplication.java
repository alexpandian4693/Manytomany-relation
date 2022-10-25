package com.java.pdfgeneration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class PdfDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PdfDemoApplication.class, args);
    }

}
