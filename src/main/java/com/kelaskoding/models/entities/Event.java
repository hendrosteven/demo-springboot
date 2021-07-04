package com.kelaskoding.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_events")
public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 1000, nullable = false)
    private String description;

    @Temporal(TemporalType.DATE)
    private Date eventStartDate;

    @Temporal(TemporalType.DATE)
    private Date eventEndDate;

    @Column(length = 20, nullable = false)
    private String eventStartTime;

    @Column(length = 20, nullable = false)
    private String eventEndTime;

    @ManyToOne
    private User creator;

    @ManyToOne
    private Category category;
}
