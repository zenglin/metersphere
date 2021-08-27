package io.metersphere.api.dto.automation;

import io.metersphere.base.domain.TestResource;
import io.metersphere.dto.BaseSystemConfigDTO;
import lombok.Data;

import java.util.Map;

@Data
public class RunModeConfig {
    private String mode;
    private String reportType;
    private String reportName;
    private String reportId;
    private boolean onSampleError;
    private String resourcePoolId;
    private BaseSystemConfigDTO baseInfo;
    private TestResource testResource;
    /**
     * 运行环境
     */
    private Map<String, String> envMap;
}
