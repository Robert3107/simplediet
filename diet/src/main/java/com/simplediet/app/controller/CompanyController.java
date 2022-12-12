package com.simplediet.app.controller;

import com.simplediet.app.model.entity.Company;
import com.simplediet.app.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

    private final CompanyRepository companyRepository;

    @GetMapping("/list")
    public List<Company> companyList() {
        return companyRepository.findAll();
    }

    @PostMapping("/add")
    public HttpStatus addCompany(@RequestBody @Valid Company company, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return HttpStatus.BAD_REQUEST;
        }
        companyRepository.save(company);
        return HttpStatus.OK;
    }

    @PutMapping("/edit/{companyId}")
    public HttpStatus editCompany(@Valid @RequestBody Company company, @PathVariable Long companyId, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return HttpStatus.BAD_REQUEST;
        }

        companyRepository.findById(companyId);
        companyRepository.save(company);
        return HttpStatus.OK;
    }

    @DeleteMapping("/delete/{companyId}")
    public HttpStatus deleteCompany(@PathVariable Long companyId) {
        companyRepository.deleteById(companyId);
        return HttpStatus.OK;
    }
}
