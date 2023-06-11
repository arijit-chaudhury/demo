package com.example.demo.repository;

import com.example.demo.entity.DistributionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface DistributionStatusRepository extends JpaRepository<DistributionStatus, BigInteger> {
}
