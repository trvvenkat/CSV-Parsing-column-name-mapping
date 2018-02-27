package com.kgisl.parseexbeen;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class App {

    public static void main(String[] args) throws IOException {

        String fileName = "src/main/resources/Employe.csv";
        Path myPath = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(myPath,
                StandardCharsets.UTF_8)) {

            HeaderColumnNameMappingStrategy<Employee> strategy
                    = new HeaderColumnNameMappingStrategy<>();
            strategy.setType(Employee.class);

            CsvToBean csvToBean = new CsvToBeanBuilder(br)
                    .withType(Employee.class)
                    .withMappingStrategy(strategy)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<Employee> emp = csvToBean.parse();
            
            emp.forEach(System.out::println);
        }
    }
}
