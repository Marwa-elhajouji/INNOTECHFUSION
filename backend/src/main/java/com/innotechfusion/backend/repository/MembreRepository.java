package com.innotechfusion.backend.repository;

import com.innotechfusion.backend.entity.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreRepository extends JpaRepository<Membre, Long> {}
