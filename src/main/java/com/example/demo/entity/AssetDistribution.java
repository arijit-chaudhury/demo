package com.example.demo.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "assetdistribution")
public class AssetDistribution {

    @EmbeddedId
    private AssetDistributionId assetDistributionId;

    @Column(name = "metadata")
    private String metadata;

}
