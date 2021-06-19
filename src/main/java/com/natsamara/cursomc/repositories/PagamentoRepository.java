package com.natsamara.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natsamara.cursomc.domain.Pagamento;



@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
