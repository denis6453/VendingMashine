package PayApp.impl;

public enum EPackage {
    PLASTICK("Пластик"), GLASS("Стекло");

    private final String material;

    EPackage(String material) {

        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
