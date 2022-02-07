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
public class EventLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventLogId;
    @Column(nullable = false)
    private String mfsReferenceId;
    @Column(nullable = false)
    private String request;
    @Column(nullable = false)
    private String response;
    @Column(nullable = false)
    private Date dateLogged;
}
