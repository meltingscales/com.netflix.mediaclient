package com.netflix.ale;

import com.netflix.ale.ParameterValidation;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC8660dtv;
import o.dsA;

/* loaded from: classes5.dex */
public final class JoseHeader implements ParameterValidation {
    private final String alg;
    private final JweEncScheme enc;
    private final String kid;

    public static /* synthetic */ JoseHeader copy$default(JoseHeader joseHeader, String str, JweEncScheme jweEncScheme, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = joseHeader.alg;
        }
        if ((i & 2) != 0) {
            jweEncScheme = joseHeader.enc;
        }
        if ((i & 4) != 0) {
            str2 = joseHeader.kid;
        }
        return joseHeader.copy(str, jweEncScheme, str2);
    }

    public final String component1() {
        return this.alg;
    }

    public final JweEncScheme component2() {
        return this.enc;
    }

    public final String component3() {
        return this.kid;
    }

    public final JoseHeader copy(String str, JweEncScheme jweEncScheme, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jweEncScheme, "");
        C8632dsu.c((Object) str2, "");
        return new JoseHeader(str, jweEncScheme, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JoseHeader) {
            JoseHeader joseHeader = (JoseHeader) obj;
            return C8632dsu.c((Object) this.alg, (Object) joseHeader.alg) && this.enc == joseHeader.enc && C8632dsu.c((Object) this.kid, (Object) joseHeader.kid);
        }
        return false;
    }

    public final String getAlg() {
        return this.alg;
    }

    public final JweEncScheme getEnc() {
        return this.enc;
    }

    public final String getKid() {
        return this.kid;
    }

    public int hashCode() {
        return (((this.alg.hashCode() * 31) + this.enc.hashCode()) * 31) + this.kid.hashCode();
    }

    public String toString() {
        return "JoseHeader(alg=" + this.alg + ", enc=" + this.enc + ", kid=" + this.kid + ')';
    }

    public JoseHeader(String str, JweEncScheme jweEncScheme, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jweEncScheme, "");
        C8632dsu.c((Object) str2, "");
        this.alg = str;
        this.enc = jweEncScheme;
        this.kid = str2;
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
        f = C8569dql.f(checkParameter("scheme", this.alg, dsA.a(String.class)), checkParameter("enc", this.enc, dsA.a(JweEncScheme.class)), checkParameter("kid", this.kid, dsA.a(String.class)));
        G = C8576dqs.G(f);
        return G;
    }
}
