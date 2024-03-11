package com.netflix.mediaclient.ui.login.countrySelector;

import com.netflix.mediaclient.service.webclient.model.leafs.PhoneCode;
import java.io.Serializable;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class PhoneCodeListWrapper implements Serializable {
    private final boolean a;
    private final PhoneCode e;

    public final PhoneCode b() {
        return this.e;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhoneCodeListWrapper) {
            PhoneCodeListWrapper phoneCodeListWrapper = (PhoneCodeListWrapper) obj;
            return C8632dsu.c(this.e, phoneCodeListWrapper.e) && this.a == phoneCodeListWrapper.a;
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + Boolean.hashCode(this.a);
    }

    public String toString() {
        PhoneCode phoneCode = this.e;
        boolean z = this.a;
        return "PhoneCodeListWrapper(phoneCode=" + phoneCode + ", currentLocation=" + z + ")";
    }

    public PhoneCodeListWrapper(PhoneCode phoneCode, boolean z) {
        C8632dsu.c((Object) phoneCode, "");
        this.e = phoneCode;
        this.a = z;
    }
}
