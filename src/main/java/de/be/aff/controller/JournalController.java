package de.be.aff.controller;

import de.be.aff.domain.Journal;
import de.be.aff.repository.JournalRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController //@Controller
// + @ResponseBody - from Spring MVC - uses the correct HTTP message converter to transform resource in preffered MediaType
public class JournalController {

    @Autowired //instantiates annotated bean
    private JournalRepository repo;

    @GetMapping(value="/journals",produces={MediaType.APPLICATION_JSON_UTF8_VALUE})
    public List<Journal> getJournals()
    {
        return repo.findAll();
    }
}
