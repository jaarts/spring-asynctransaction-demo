package com.example.asynctransactiondemo.storage;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.stream.Stream;

public interface SomeRepository extends CrudRepository<SomeEntity, String> {

    @Query("SELECT s FROM SomeEntity s")
    Stream<SomeEntity> streamAll();
}
