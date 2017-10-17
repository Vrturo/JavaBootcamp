package com.codefellows;

public enum PowerState {
    ON("power is on"),
    OFF("power is off"),
    SUSPENDED("suspended"),
    HIBERNATED("hibernated"),
    UNKNOWN("unknown");

    private String description;

    private PowerState() {
        description = null;
    }

    private PowerState(String d) {
        description = d;
    }

    public String getDescription() {
        return description;
    }
}
