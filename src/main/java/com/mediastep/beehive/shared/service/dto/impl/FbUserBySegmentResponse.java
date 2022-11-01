package com.mediastep.beehive.shared.service.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FbUserBySegmentResponse {
    private Long id;
    private String name;
    private String fbUserId;
    private String fbPageId;
}
