package com.netflix.mediaclient.servicemgr.interface_.user;

/* loaded from: classes4.dex */
public enum ProfileType {
    STANDARD("standard"),
    JFK("jfk");
    
    private String value;

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    ProfileType(String str) {
        this.value = str;
    }

    public static ProfileType create(String str) {
        ProfileType[] values;
        for (ProfileType profileType : values()) {
            if (profileType.value.equalsIgnoreCase(str)) {
                return profileType;
            }
        }
        throw new IllegalStateException("Unknown profile type");
    }
}
