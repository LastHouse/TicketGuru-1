package fi.rbmk.ticketguru.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EventOrganizersController {

	@Autowired
    private EventOrganizersRepository eorepository;

    @GetMapping("api/eventOrganizers")

    public List<EventOrganizers> evenOrganizersListRest() {
        return (List<EventOrganizers>) eorepository.findAll();
    }
	
}
