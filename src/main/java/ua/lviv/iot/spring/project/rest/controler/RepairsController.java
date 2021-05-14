package ua.lviv.iot.spring.project.rest.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.spring.project.rest.models.Repairs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/students")
@RestController
public class RepairsController {

    private final Map<Integer, Repairs> students = new HashMap<>();

    private final AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<Repairs>getStudents() {
        return new LinkedList<Repairs>(students.values());
    }

    @GetMapping(path = "/{id}")
    public Repairs getStudent(final @PathVariable("id") Integer studentsId) {
        return students.get(studentsId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Repairs createStudent(@RequestBody Repairs repairs) {

        repairs.setId(idCounter.incrementAndGet());
        this.students.put(repairs.getId(), repairs);

        return repairs;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Repairs> deleteStudent(@PathVariable("id") Integer studentId) {
        HttpStatus status = students.remove(studentId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;

        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public Repairs updateStudents(final @PathVariable("id") Integer studentsId, final @RequestBody Repairs repairs) {
        repairs.setId(studentsId);
        return this.students.put(repairs.getId(), repairs);
    }
}


