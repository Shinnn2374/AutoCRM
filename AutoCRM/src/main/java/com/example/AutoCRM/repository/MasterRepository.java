package com.example.AutoCRM.repository;

import com.example.AutoCRM.model.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepository extends JpaRepository<Master, Integer> {
}
