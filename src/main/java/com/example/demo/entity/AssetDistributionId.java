package com.example.demo.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AssetDistributionId implements Serializable {

    @Column(name = "dae_uuid")
    private UUID daeUUID;

    @Column(name = "dam_uuid")
    private UUID damUUID;
}
