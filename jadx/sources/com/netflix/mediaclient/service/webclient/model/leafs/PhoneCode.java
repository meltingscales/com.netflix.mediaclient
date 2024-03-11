package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.io.Serializable;
import o.C8632dsu;
import o.duD;

/* loaded from: classes4.dex */
public final class PhoneCode implements Serializable {
    @SerializedName("code")
    private final String code;
    @SerializedName(SignupConstants.Field.LANG_ID)
    private final String id;
    @SerializedName("name")
    private final String name;

    public static /* synthetic */ PhoneCode copy$default(PhoneCode phoneCode, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneCode.id;
        }
        if ((i & 2) != 0) {
            str2 = phoneCode.code;
        }
        if ((i & 4) != 0) {
            str3 = phoneCode.name;
        }
        return phoneCode.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.name;
    }

    public final PhoneCode copy(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        return new PhoneCode(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhoneCode) {
            PhoneCode phoneCode = (PhoneCode) obj;
            return C8632dsu.c((Object) this.id, (Object) phoneCode.id) && C8632dsu.c((Object) this.code, (Object) phoneCode.code) && C8632dsu.c((Object) this.name, (Object) phoneCode.name);
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.code.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.code;
        String str3 = this.name;
        return "PhoneCode(id=" + str + ", code=" + str2 + ", name=" + str3 + ")";
    }

    public PhoneCode(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.id = str;
        this.code = str2;
        this.name = str3;
    }

    public final String getFormattedCountryCode() {
        boolean d;
        d = duD.d((CharSequence) this.code, (CharSequence) "+", false, 2, (Object) null);
        if (d) {
            return this.code;
        }
        String str = this.code;
        return "+" + str;
    }
}
