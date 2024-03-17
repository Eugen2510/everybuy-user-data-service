package com.everybuy.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "last_activity_date")
    private Date lastActivityDate;

    @Column(name = "is_block")
    private boolean isBlock;

}

