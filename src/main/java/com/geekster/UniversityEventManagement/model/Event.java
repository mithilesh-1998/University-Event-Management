package com.geekster.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "Event")
public class Event {

    @Id
    private Long eventId;

    //@NotNull
    private String eventName;

    private String locationOfEvent;

    //@NotNull
    private LocalDate date;

    //@NotNull
    private LocalTime startTime;

   // @NotNull
    private LocalTime endTime;
}
