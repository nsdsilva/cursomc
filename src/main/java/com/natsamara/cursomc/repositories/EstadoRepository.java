package com.natsamara.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natsamara.cursomc.domain.Estado;



@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
