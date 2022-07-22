package com.simplediet.app.model.entity;

import com.simplediet.app.model.types.CertificationCategory;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
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
}
