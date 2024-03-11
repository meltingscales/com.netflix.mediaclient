package com.netflix.ale;

import com.netflix.ale.ParameterValidation;
import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC8660dtv;
import o.dsA;

/* loaded from: classes5.dex */
public final class KeyProvisionResponse implements ParameterValidation {
    private final KeyxResponseData keyx;
    private Number rw;
    private final AleScheme scheme;
    private final String token;
    private final Number ttl;
    private final Number ver;

    public static /* synthetic */ KeyProvisionResponse copy$default(KeyProvisionResponse keyProvisionResponse, String str, AleScheme aleScheme, Number number, Number number2, KeyxResponseData keyxResponseData, Number number3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keyProvisionResponse.token;
        }
        if ((i & 2) != 0) {
            aleScheme = keyProvisionResponse.scheme;
        }
        AleScheme aleScheme2 = aleScheme;
        if ((i & 4) != 0) {
            number = keyProvisionResponse.ttl;
        }
        Number number4 = number;
        if ((i & 8) != 0) {
            number2 = keyProvisionResponse.rw;
        }
        Number number5 = number2;
        if ((i & 16) != 0) {
            keyxResponseData = keyProvisionResponse.keyx;
        }
        KeyxResponseData keyxResponseData2 = keyxResponseData;
        if ((i & 32) != 0) {
            number3 = keyProvisionResponse.ver;
        }
        return keyProvisionResponse.copy(str, aleScheme2, number4, number5, keyxResponseData2, number3);
    }

    public final String component1() {
        return this.token;
    }

    public final AleScheme component2() {
        return this.scheme;
    }

    public final Number component3() {
        return this.ttl;
    }

    public final Number component4() {
        return this.rw;
    }

    public final KeyxResponseData component5() {
        return this.keyx;
    }

    public final Number component6() {
        return this.ver;
    }

    public final KeyProvisionResponse copy(String str, AleScheme aleScheme, Number number, Number number2, KeyxResponseData keyxResponseData, Number number3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) aleScheme, "");
        C8632dsu.c((Object) number, "");
        C8632dsu.c((Object) keyxResponseData, "");
        C8632dsu.c((Object) number3, "");
        return new KeyProvisionResponse(str, aleScheme, number, number2, keyxResponseData, number3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyProvisionResponse) {
            KeyProvisionResponse keyProvisionResponse = (KeyProvisionResponse) obj;
            return C8632dsu.c((Object) this.token, (Object) keyProvisionResponse.token) && this.scheme == keyProvisionResponse.scheme && C8632dsu.c(this.ttl, keyProvisionResponse.ttl) && C8632dsu.c(this.rw, keyProvisionResponse.rw) && C8632dsu.c(this.keyx, keyProvisionResponse.keyx) && C8632dsu.c(this.ver, keyProvisionResponse.ver);
        }
        return false;
    }

    public final KeyxResponseData getKeyx() {
        return this.keyx;
    }

    public final Number getRw() {
        return this.rw;
    }

    public final AleScheme getScheme() {
        return this.scheme;
    }

    public final String getToken() {
        return this.token;
    }

    public final Number getTtl() {
        return this.ttl;
    }

    public final Number getVer() {
        return this.ver;
    }

    public int hashCode() {
        int hashCode = this.token.hashCode();
        int hashCode2 = this.scheme.hashCode();
        int hashCode3 = this.ttl.hashCode();
        Number number = this.rw;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (number == null ? 0 : number.hashCode())) * 31) + this.keyx.hashCode()) * 31) + this.ver.hashCode();
    }

    public final void setRw(Number number) {
        this.rw = number;
    }

    public String toString() {
        return "KeyProvisionResponse(token=" + this.token + ", scheme=" + this.scheme + ", ttl=" + this.ttl + ", rw=" + this.rw + ", keyx=" + this.keyx + ", ver=" + this.ver + ')';
    }

    public KeyProvisionResponse(String str, AleScheme aleScheme, Number number, Number number2, KeyxResponseData keyxResponseData, Number number3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) aleScheme, "");
        C8632dsu.c((Object) number, "");
        C8632dsu.c((Object) keyxResponseData, "");
        C8632dsu.c((Object) number3, "");
        this.token = str;
        this.scheme = aleScheme;
        this.ttl = number;
        this.rw = number2;
        this.keyx = keyxResponseData;
        this.ver = number3;
    }

    @Override // com.netflix.ale.ParameterValidation
    public String checkParameter(String str, Object obj, InterfaceC8660dtv<?> interfaceC8660dtv) {
        return ParameterValidation.DefaultImpls.checkParameter(this, str, obj, interfaceC8660dtv);
    }

    @Override // com.netflix.ale.ParameterValidation
    public boolean isValid() {
        return enumerateProblems().isEmpty();
    }

    @Override // com.netflix.ale.ParameterValidation
    public List<String> enumerateProblems() {
        List f;
        List<String> G;
        f = C8569dql.f(checkParameter("token", this.token, dsA.a(String.class)), checkParameter("scheme", this.scheme, dsA.a(AleScheme.class)), checkParameter("ttl", this.ttl, dsA.a(Number.class)), checkParameter("ver", this.ver, dsA.a(Number.class)), checkParameter("keyx", this.keyx, dsA.a(KeyxResponseData.class)));
        if (!this.keyx.isValid()) {
            Iterator<T> it = this.keyx.enumerateProblems().iterator();
            while (it.hasNext()) {
                f.add("keyx." + ((String) it.next()));
            }
        }
        G = C8576dqs.G(f);
        return G;
    }
}
