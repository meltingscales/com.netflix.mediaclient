package o;

import com.netflix.hawkins.consumer.tokens.Token;

/* renamed from: o.Le  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1011Le {
    private final Token.Typography a;
    private final Token.Typography e;

    public final Token.Typography c() {
        return this.a;
    }

    public final Token.Typography e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1011Le) {
            C1011Le c1011Le = (C1011Le) obj;
            return C8632dsu.c(this.e, c1011Le.e) && C8632dsu.c(this.a, c1011Le.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        Token.Typography typography = this.a;
        return (hashCode * 31) + (typography == null ? 0 : typography.hashCode());
    }

    public String toString() {
        Token.Typography typography = this.e;
        Token.Typography typography2 = this.a;
        return "StaticListTypography(emphasized=" + typography + ", unemphasized=" + typography2 + ")";
    }

    public C1011Le(Token.Typography typography, Token.Typography typography2) {
        C8632dsu.c((Object) typography, "");
        this.e = typography;
        this.a = typography2;
    }
}
