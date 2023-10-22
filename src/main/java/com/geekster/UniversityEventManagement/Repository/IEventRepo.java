package com.geekster.UniversityEventManagement.Repository;

import com.geekster.UniversityEventManagement.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<Event, Long> {

    List<Event> findAllByDate(LocalDate date);
}
