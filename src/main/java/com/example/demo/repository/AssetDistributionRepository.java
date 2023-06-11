package com.example.demo.repository;

import com.example.demo.entity.AssetDistribution;
import com.example.demo.entity.AssetDistributionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetDistributionRepository extends JpaRepository<AssetDistribution, AssetDistributionId> {
}
