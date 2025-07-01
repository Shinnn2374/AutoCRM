package com.example.AutoCRM.dto.master;

import com.example.AutoCRM.model.modelEnums.MasterStatus;
import com.example.AutoCRM.model.modelEnums.Specilization;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MasterResponseDto {

    private Specilization specilization;

    private String firstName;

    private String lastName;

    private MasterStatus status;
}
