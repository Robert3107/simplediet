package com.simplediet.app.controller;

import com.simplediet.app.model.entity.Certificate;
import com.simplediet.app.repository.CertificateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/certificate")
public class CertificateController {

    private final CertificateRepository certificateRepository;

    @GetMapping("/dietician/cert/{dieticianId}")
    public List<Certificate> dieticanCertificationList(@PathVariable Long dieticianId) {
        return certificateRepository.findAllByDieticanId(dieticianId);
    }

    @GetMapping("/company/cert/{companyId}")
    public List<Certificate> companyCertificationList(@PathVariable Long companyId) {
        return certificateRepository.findAllByCompanyId(companyId);
    }

    @PostMapping("/add")
    public HttpStatus addCertificate(@Valid @RequestBody Certificate certificate, BindingResult result) {
        if (result.hasErrors()) {
            return HttpStatus.BAD_REQUEST;
        }
        certificateRepository.save(certificate);
        return HttpStatus.OK;
    }

    @PutMapping("/edit/{certId}")
    public HttpStatus editCertification(@Valid @RequestBody Certificate certificate, @PathVariable Long certId, BindingResult result) {
        if (result.hasErrors()){
            return HttpStatus.BAD_REQUEST;
        }
            certificateRepository.findById(certId);
            certificateRepository.save(certificate);
            return HttpStatus.OK;
    }
}
