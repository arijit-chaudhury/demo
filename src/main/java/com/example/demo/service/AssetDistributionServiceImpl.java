package com.example.demo.service;

import com.example.demo.entity.AssetDistribution;
import com.example.demo.entity.AssetDistributionId;
import com.example.demo.entity.DistributionStatus;
import com.example.demo.repository.AssetDistributionRepository;
import com.example.demo.repository.DistributionStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.UUID;

@Service
public class AssetDistributionServiceImpl {
    @Autowired
    private AssetDistributionRepository assetDistributionRepository;

    @Autowired
    private DistributionStatusRepository distributionStatusRepository;

    public void saveAssetDistributionData(){
        AssetDistributionId assetDistributionId = new AssetDistributionId(
                UUID.randomUUID(),
                UUID.randomUUID()
                );
        AssetDistribution assetDistribution = new AssetDistribution(assetDistributionId, "distributiondata");
        assetDistributionRepository.save(assetDistribution);

        DistributionStatus distributionStatus = new DistributionStatus(BigInteger.valueOf(1001), assetDistribution);
        distributionStatusRepository.save(distributionStatus);
    }
}
