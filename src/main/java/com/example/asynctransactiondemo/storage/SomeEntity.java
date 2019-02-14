package com.example.asynctransactiondemo.storage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SomeEntity {

    @Id @GeneratedValue()
    public int id;
}
