package o;

import com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget;
import o.AbstractC2065aYo;
import o.aWW;

/* renamed from: o.aYn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2064aYn<T extends aWW> extends AbstractC2065aYo<T> implements InterfaceC2070aYt {
    protected int a;
    protected boolean c;
    protected boolean e;

    @Override // o.AbstractC2065aYo
    public SessionMdxTarget c() {
        return this.k;
    }

    public abstract void e(aVX avx);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aYn$e */
    /* loaded from: classes3.dex */
    public static abstract class e<U extends e<U, ?, ?>, V extends aWW, W extends AbstractC2064aYn<V>> extends AbstractC2065aYo.e<U, V, W> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e(String str, String str2, String str3, V v) {
            super(str, str2, str3, v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2064aYn(e<?, T, ?> eVar) {
        super(eVar);
        this.a = 0;
        this.e = false;
    }

    @Override // o.AbstractC2065aYo
    public boolean i() {
        SessionMdxTarget sessionMdxTarget;
        return this.e || ((sessionMdxTarget = this.k) != null && sessionMdxTarget.i());
    }

    @Override // o.AbstractC2065aYo
    public boolean a() {
        SessionMdxTarget sessionMdxTarget;
        return (i() || (sessionMdxTarget = this.k) == null || !sessionMdxTarget.a()) ? false : true;
    }

    @Override // o.AbstractC2065aYo
    public String d() {
        SessionMdxTarget sessionMdxTarget = this.k;
        return sessionMdxTarget != null ? sessionMdxTarget.d() : "";
    }

    @Override // o.AbstractC2065aYo
    public String e() {
        SessionMdxTarget sessionMdxTarget = this.k;
        return sessionMdxTarget != null ? sessionMdxTarget.e() : "";
    }

    @Override // o.AbstractC2065aYo
    public String b() {
        SessionMdxTarget sessionMdxTarget = this.k;
        return sessionMdxTarget != null ? sessionMdxTarget.b() : "";
    }

    public void j() {
        e(null);
    }

    public void g() {
        SessionMdxTarget sessionMdxTarget = this.k;
        if (sessionMdxTarget != null) {
            sessionMdxTarget.Q();
            if (this.k.N()) {
                return;
            }
            this.k = null;
            this.a = 0;
        }
    }
}
