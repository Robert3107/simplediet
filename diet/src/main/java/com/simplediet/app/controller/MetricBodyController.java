package com.simplediet.app.controller;

import com.simplediet.app.model.entity.MetricBody;
import com.simplediet.app.model.repository.MetricBodyRepository;
import com.simplediet.app.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/metric")
@Slf4j
public class MetricBodyController {

    private final UserRepository userRepository;
    private final MetricBodyRepository metricBodyRepository;

    @GetMapping("/user/{id}")
    public MetricBody getMetricFromUser(@PathVariable long id) {
        return metricBodyRepository.findMetricBodyByPatientId(id);
    }

    @PostMapping("/add/{id}")
    public MetricBody addMetricBody(@RequestBody MetricBody metricBody, @PathVariable Long id) {
        metricBody.setPatientId(userRepository.findById(id).get().getId());
        return metricBodyRepository.save(metricBody);
    }

    @PostMapping("/edit/{id}")
    public MetricBody editMetric(@RequestBody MetricBody metric, @PathVariable long id) {
        metricBodyRepository.findById(id);
        return metricBodyRepository.save(metric);
    }

    @DeleteMapping("/remove/{id}")
    public String removeMetric(@PathVariable long id) {
        try {
            metricBodyRepository.deleteById(id);
            return "Metric has been successful deleted";
        } catch (IllegalArgumentException e) {
            return HttpStatus.NOT_FOUND.toString();
        }
    }
}
