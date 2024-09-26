package org.example;

public class Module {
    private String id;
    private String name;

    public Module() {
    }

    public Module(String moduleName, String id) {
        this.name = moduleName;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleName() {
        return name;
    }

    public void setModuleName(String moduleName) {
        this.name = moduleName;
    }
}
