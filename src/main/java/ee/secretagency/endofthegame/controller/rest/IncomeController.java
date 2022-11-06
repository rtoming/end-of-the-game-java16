package ee.secretagency.endofthegame.controller.rest;

import ee.secretagency.endofthegame.entity.Income;
import ee.secretagency.endofthegame.service.IncomesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class IncomeController {

    private final IncomesService service;

    public IncomeController(IncomesService service) {
        this.service = service;
    }

    // TODO: handle paging and sorting
    @GetMapping("/incomes")
    public List<Income> getAllIncomes() {
        log.info("getting all incomes");

        return service.readAllIncomes();
    }

    @GetMapping("/incomes/{id}")
    public Income getIncomeById(@PathVariable("id") Long idOfIncome) {
        log.info("trying to get income with id: [{}]", idOfIncome);

        return service.readIncomeByIdBetterWay(idOfIncome);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/incomes/{id}")
    public void deleteIncomeById(@PathVariable("id") Long id) {
        log.info("trying to delete income with id: [{}]", id);

        service.deleteIncomeWithId(id);
    }



} //END
