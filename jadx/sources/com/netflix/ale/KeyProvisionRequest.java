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
public final class KeyProvisionRequest implements ParameterValidation {
    private final KeyxRequestData keyx;
    private final AleScheme scheme;
    private final AleUseCase type;
    private final Number ver;

    public static /* synthetic */ KeyProvisionRequest copy$default(KeyProvisionRequest keyProvisionRequest, Number number, AleScheme aleScheme, AleUseCase aleUseCase, KeyxRequestData keyxRequestData, int i, Object obj) {
        if ((i & 1) != 0) {
            number = keyProvisionRequest.ver;
        }
        if ((i & 2) != 0) {
            aleScheme = keyProvisionRequest.scheme;
        }
        if ((i & 4) != 0) {
            aleUseCase = keyProvisionRequest.type;
        }
        if ((i & 8) != 0) {
            keyxRequestData = keyProvisionRequest.keyx;
        }
        return keyProvisionRequest.copy(number, aleScheme, aleUseCase, keyxRequestData);
    }

    public final Number component1() {
        return this.ver;
    }

    public final AleScheme component2() {
        return this.scheme;
    }

    public final AleUseCase component3() {
        return this.type;
    }

    public final KeyxRequestData component4() {
        return this.keyx;
    }

    public final KeyProvisionRequest copy(Number number, AleScheme aleScheme, AleUseCase aleUseCase, KeyxRequestData keyxRequestData) {
        C8632dsu.c((Object) number, "");
        C8632dsu.c((Object) aleScheme, "");
        C8632dsu.c((Object) aleUseCase, "");
        C8632dsu.c((Object) keyxRequestData, "");
        return new KeyProvisionRequest(number, aleScheme, aleUseCase, keyxRequestData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyProvisionRequest) {
            KeyProvisionRequest keyProvisionRequest = (KeyProvisionRequest) obj;
            return C8632dsu.c(this.ver, keyProvisionRequest.ver) && this.scheme == keyProvisionRequest.scheme && this.type == keyProvisionRequest.type && C8632dsu.c(this.keyx, keyProvisionRequest.keyx);
        }
        return false;
    }

    public final KeyxRequestData getKeyx() {
        return this.keyx;
    }

    public final AleScheme getScheme() {
        return this.scheme;
    }

    public final AleUseCase getType() {
        return this.type;
    }

    public final Number getVer() {
        return this.ver;
    }

    public int hashCode() {
        return (((((this.ver.hashCode() * 31) + this.scheme.hashCode()) * 31) + this.type.hashCode()) * 31) + this.keyx.hashCode();
    }

    public String toString() {
        return "KeyProvisionRequest(ver=" + this.ver + ", scheme=" + this.scheme + ", type=" + this.type + ", keyx=" + this.keyx + ')';
    }

    public KeyProvisionRequest(Number number, AleScheme aleScheme, AleUseCase aleUseCase, KeyxRequestData keyxRequestData) {
        C8632dsu.c((Object) number, "");
        C8632dsu.c((Object) aleScheme, "");
        C8632dsu.c((Object) aleUseCase, "");
        C8632dsu.c((Object) keyxRequestData, "");
        this.ver = number;
        this.scheme = aleScheme;
        this.type = aleUseCase;
        this.keyx = keyxRequestData;
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
        f = C8569dql.f(checkParameter("ver", this.ver, dsA.a(Number.class)), checkParameter("scheme", this.scheme, dsA.a(AleScheme.class)), checkParameter("type", this.type, dsA.a(AleUseCase.class)), checkParameter("keyx", this.keyx, dsA.a(KeyxRequestData.class)));
        KeyxRequestData keyxRequestData = this.keyx;
        if (keyxRequestData != null && !keyxRequestData.isValid()) {
            Iterator<T> it = this.keyx.enumerateProblems().iterator();
            while (it.hasNext()) {
                f.add("keyx." + ((String) it.next()));
            }
        }
        G = C8576dqs.G(f);
        return G;
    }
}
