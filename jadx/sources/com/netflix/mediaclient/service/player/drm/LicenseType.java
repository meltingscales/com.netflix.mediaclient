package com.netflix.mediaclient.service.player.drm;

/* loaded from: classes3.dex */
public enum LicenseType {
    LICENSE_TYPE_LDL(1, "LDL"),
    LICENSE_TYPE_STANDARD(2, "STANDARD"),
    LICENSE_TYPE_OFFLINE(3, "OFFLINE"),
    LICENSE_TYPE_MANIFEST_LDL(4, "MANIFEST_LDL");
    
    private String i;
    private int j;

    LicenseType(int i, String str) {
        this.j = i;
        this.i = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "LicenseType{type=" + this.j + ", description='" + this.i + "'}";
    }
}
