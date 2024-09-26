package org.example;

public class Module {
    private String name;

    public Module() {
    }

    public Module(String moduleName) {
        this.name = moduleName;
    }

    public String getModuleName() {
        return name;
    }

    public void setModuleName(String moduleName) {
        this.name = moduleName;
    }
}
