package com.netflix.msl.tokens;

/* loaded from: classes5.dex */
public class DeviceIdentity {
    private final DeviceIdentityLifecycle b;
    private final String e;

    /* loaded from: classes5.dex */
    public enum DeviceIdentityLifecycle {
        CREATED,
        EXTRACTED
    }

    public String c() {
        return this.e;
    }

    public DeviceIdentityLifecycle d() {
        return this.b;
    }

    public DeviceIdentity(String str) {
        this(str, DeviceIdentityLifecycle.CREATED);
    }

    public DeviceIdentity(String str, DeviceIdentityLifecycle deviceIdentityLifecycle) {
        this.e = str;
        this.b = deviceIdentityLifecycle == null ? DeviceIdentityLifecycle.CREATED : deviceIdentityLifecycle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceIdentity) {
            DeviceIdentity deviceIdentity = (DeviceIdentity) obj;
            String str = this.e;
            if (str == null) {
                return deviceIdentity.e == null;
            }
            return str.equals(deviceIdentity.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() + ":" + this.b.name()).hashCode();
    }

    public String toString() {
        return "DeviceIdentity(identity=" + c() + ", lifecycle=" + d().name() + ")";
    }
}
