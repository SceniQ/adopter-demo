package com.adopter.demo.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SystemConfig implements Serializable {

    @EmbeddedId
    private SystemConfigId id;
    @Column(nullable = false)
    private String configKey;
    @Column(nullable = false)
    private String configValue;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public static class SystemConfigId implements Serializable {
        @NotNull(message = "config id cannot be null")
        @Column(nullable = false)
        private Long id;
        @Column
        private String serviceName;
    }
}
