package id.co.arya.restapi.repository;

import lombok.Data;

@Data
public class EmployeeDto {
    private int id;
    private String username;
    private String password;
}
