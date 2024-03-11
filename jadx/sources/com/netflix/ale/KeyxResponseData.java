package com.netflix.ale;

import com.netflix.ale.ParameterValidation;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC8660dtv;
import o.dsA;

/* loaded from: classes5.dex */
public final class KeyxResponseData implements ParameterValidation {
    private final Object data;
    private final String kid;
    private final AleKeyxScheme scheme;

    public static /* synthetic */ KeyxResponseData copy$default(KeyxResponseData keyxResponseData, AleKeyxScheme aleKeyxScheme, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            aleKeyxScheme = keyxResponseData.scheme;
        }
        if ((i & 2) != 0) {
            str = keyxResponseData.kid;
        }
        if ((i & 4) != 0) {
            obj = keyxResponseData.data;
        }
        return keyxResponseData.copy(aleKeyxScheme, str, obj);
    }

    public final AleKeyxScheme component1() {
        return this.scheme;
    }

    public final String component2() {
        return this.kid;
    }

    public final Object component3() {
        return this.data;
    }

    public final KeyxResponseData copy(AleKeyxScheme aleKeyxScheme, String str, Object obj) {
        C8632dsu.c((Object) aleKeyxScheme, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c(obj, "");
        return new KeyxResponseData(aleKeyxScheme, str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyxResponseData) {
            KeyxResponseData keyxResponseData = (KeyxResponseData) obj;
            return this.scheme == keyxResponseData.scheme && C8632dsu.c((Object) this.kid, (Object) keyxResponseData.kid) && C8632dsu.c(this.data, keyxResponseData.data);
        }
        return false;
    }

    public final Object getData() {
        return this.data;
    }

    public final String getKid() {
        return this.kid;
    }

    public final AleKeyxScheme getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        return (((this.scheme.hashCode() * 31) + this.kid.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "KeyxResponseData(scheme=" + this.scheme + ", kid=" + this.kid + ", data=" + this.data + ')';
    }

    public KeyxResponseData(AleKeyxScheme aleKeyxScheme, String str, Object obj) {
        C8632dsu.c((Object) aleKeyxScheme, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c(obj, "");
        this.scheme = aleKeyxScheme;
        this.kid = str;
        this.data = obj;
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
        f = C8569dql.f(checkParameter("scheme", this.scheme, dsA.a(AleKeyxScheme.class)), checkParameter("kid", this.kid, dsA.a(String.class)), checkParameter(NotificationFactory.DATA, this.data, dsA.a(Object.class)));
        G = C8576dqs.G(f);
        return G;
    }
}
