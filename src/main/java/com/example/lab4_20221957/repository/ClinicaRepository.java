package com.example.lab4_20221957.repository;

import com.example.lab4_20221957.entity.Clinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClinicaRepository extends JpaRepository<Clinica,Integer> {

}
