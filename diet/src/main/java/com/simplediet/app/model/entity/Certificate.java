package com.simplediet.app.model.entity;

import com.simplediet.app.model.types.CertificationCategory;
import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "certifications", indexes = {@Index(columnList = "id, dietican_id, company_id, certification_category, title")})
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dietican_id")
    private Long dieticanId;

    @Column(name = "company_id")
    private Long companyId;

    @NotNull
    @NotEmpty(message = "The certification title is required")
    private String title;

    @Size(max = 512)
    private String description;

    @Column(name = "certification_category")
    private CertificationCategory certificationCategory;

    @Column(name = "date_of_obtaining")
    private Date dateOfObtaining;

    @Column(name="created_date", updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    public Certificate(Long id,
                       Long dieticanId,
                       Long companyId,
                       String title,
                       String description,
                       CertificationCategory certificationCategory,
                       Date dateOfObtaining, Date createdDate) {
        this.id = id;
        this.dieticanId = dieticanId;
        this.companyId = companyId;
        this.title = title;
        this.description = description;
        this.certificationCategory = certificationCategory;
        this.dateOfObtaining = dateOfObtaining;
        this.createdDate = createdDate;
    }

    public Certificate() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDieticanId() {
        return dieticanId;
    }

    public void setDieticanId(Long dieticanId) {
        this.dieticanId = dieticanId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CertificationCategory getCertificationCategory() {
        return certificationCategory;
    }

    public void setCertificationCategory(CertificationCategory certificationCategory) {
        this.certificationCategory = certificationCategory;
    }

    public Date getDateOfObtaining() {
        return dateOfObtaining;
    }

    public void setDateOfObtaining(Date dateOfObtaining) {
        this.dateOfObtaining = dateOfObtaining;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
