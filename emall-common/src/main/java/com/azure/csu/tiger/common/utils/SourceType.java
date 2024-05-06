package com.azure.csu.tiger.common.utils;

import java.util.Objects;

public enum SourceType {

    PC(0, "PC"),
    Android(1, "Android"),
    IOS(2, "IOS"),
    WeChat(3, "WeChat");

    private Integer type;
    private String name;

    SourceType(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static SourceType fromType(Integer type) {
        for (SourceType value : SourceType.values()) {
            if (Objects.equals(type, value.getType())) {
                return value;
            }
        }
        return null;
    }
}
