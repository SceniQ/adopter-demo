package com.adopter.demo.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String mfsReferenceId;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String amount;
    @Column(nullable = false)
    private String countryCode;
    @Column(nullable = false)
    private String narration;
    @Column(nullable = false)
    private String responseCode;
    @Column(nullable = false)
    private String responseCodeDesc;
    @Column(nullable = false)
    private Date dateLogged;
}
