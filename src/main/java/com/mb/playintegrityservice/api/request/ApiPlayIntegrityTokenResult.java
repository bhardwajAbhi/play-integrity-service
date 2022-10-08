package com.mb.playintegrityservice.api.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ApiPlayIntegrityTokenResult {

    @ApiModelProperty(value = "Play integrity token")
    private String token;

    // This is an optional field.
    @ApiModelProperty(value = "Package name which is mobile client package name", example = "com.mb.android")
    private String packageName;

    public String getPackageName() {
        return this.packageName == null ? null : "com.mb.android";
    }

}
