package com.adopter.demo.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SystemConfig implements Serializable {

    @EmbeddedId
    private SystemConfigId id;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public static class SystemConfigId implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column
        private String serviceName;
    }
}
