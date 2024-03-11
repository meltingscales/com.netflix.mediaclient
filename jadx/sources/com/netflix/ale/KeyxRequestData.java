package com.netflix.ale;

import com.netflix.ale.ParameterValidation;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC8660dtv;
import o.dsA;

/* loaded from: classes5.dex */
public final class KeyxRequestData implements ParameterValidation {
    private final Object data;
    private final AleKeyxScheme scheme;

    public static /* synthetic */ KeyxRequestData copy$default(KeyxRequestData keyxRequestData, AleKeyxScheme aleKeyxScheme, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            aleKeyxScheme = keyxRequestData.scheme;
        }
        if ((i & 2) != 0) {
            obj = keyxRequestData.data;
        }
        return keyxRequestData.copy(aleKeyxScheme, obj);
    }

    public final AleKeyxScheme component1() {
        return this.scheme;
    }

    public final Object component2() {
        return this.data;
    }

    public final KeyxRequestData copy(AleKeyxScheme aleKeyxScheme, Object obj) {
        C8632dsu.c((Object) aleKeyxScheme, "");
        return new KeyxRequestData(aleKeyxScheme, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyxRequestData) {
            KeyxRequestData keyxRequestData = (KeyxRequestData) obj;
            return this.scheme == keyxRequestData.scheme && C8632dsu.c(this.data, keyxRequestData.data);
        }
        return false;
    }

    public final Object getData() {
        return this.data;
    }

    public final AleKeyxScheme getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        int hashCode = this.scheme.hashCode();
        Object obj = this.data;
        return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "KeyxRequestData(scheme=" + this.scheme + ", data=" + this.data + ')';
    }

    public KeyxRequestData(AleKeyxScheme aleKeyxScheme, Object obj) {
        C8632dsu.c((Object) aleKeyxScheme, "");
        this.scheme = aleKeyxScheme;
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
        f = C8569dql.f(checkParameter("scheme", this.scheme, dsA.a(AleKeyxScheme.class)));
        G = C8576dqs.G(f);
        return G;
    }
}
