package com.rocket_code.pruebatecnica.controller;

import com.rocket_code.pruebatecnica.entity.Summary;
import com.rocket_code.pruebatecnica.service.SummaryService;
import com.rocket_code.pruebatecnica.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/summaries")
@CrossOrigin(value = "*", maxAge = 3600)
public class SummaryController {

    @Autowired
    private SummaryService summaryService;

    @GetMapping("/get-all")
    public Response<List<Summary>> getAllSummaries() {
        return summaryService.getAllSummaries();
    }

    @GetMapping("/{id}")
    public Response<Summary> getSummaryById(@PathVariable Long id) {
        return summaryService.getSummaryById(id);
    }

    @PostMapping("/create")
    public Response<String> createSummary(@RequestBody Summary summary) {
        return summaryService.addSummary(summary);
    }

    @PutMapping("/update/{id}")
    public Response<String> updateSummary(@PathVariable Long id, @RequestBody Summary summary) {
        summary.setId(id);
        return summaryService.updateSummary(summary);
    }

    @DeleteMapping("/delete/{id}")
    public Response<String> deleteSummary(@PathVariable Long id) {
        return summaryService.deleteSummary(id);
    }
}
