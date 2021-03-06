package com.stopysinger.core.api.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ViaPoint extends BaseMapPoint {
    private String type = "viaPoint";

    public ViaPoint(List<Double> point) {
        super(point);
    }
}
