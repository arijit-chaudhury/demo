package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "distributionstatus")
public class DistributionStatus {

    @Id
    @Column(name = "dist_status_id")
    private BigInteger id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "dae_uuid", referencedColumnName = "dae_uuid"),
            @JoinColumn(name = "dam_uuid", referencedColumnName = "dam_uuid")
    })
    private AssetDistribution assetDistribution;
}
