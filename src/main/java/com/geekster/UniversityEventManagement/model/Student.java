package com.geekster.UniversityEventManagement.model;

//import jakarta.persistence.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Student")
public class Student {

    @Id
    private Long studentId;

    //@NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Min(value = 18, message = "Age should be at least 18")
    @Max(value = 25, message = "Age should not exceed 25")
    private Integer age;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Department department;
}
