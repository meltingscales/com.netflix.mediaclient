package o;

import kotlin.KotlinNothingValueException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dAy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7668dAy extends dxN implements InterfaceC8748dxb {
    private final Throwable b;
    private final String e;

    @Override // o.dxN
    public dxN c() {
        return this;
    }

    public C7668dAy(Throwable th, String str) {
        this.b = th;
        this.e = str;
    }

    @Override // o.dwQ
    public boolean isDispatchNeeded(dqZ dqz) {
        e();
        throw new KotlinNothingValueException();
    }

    @Override // o.dxN, o.dwQ
    public dwQ limitedParallelism(int i) {
        e();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC8748dxb
    public InterfaceC8760dxn e(long j, Runnable runnable, dqZ dqz) {
        e();
        throw new KotlinNothingValueException();
    }

    @Override // o.dwQ
    /* renamed from: a */
    public Void dispatch(dqZ dqz, Runnable runnable) {
        e();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC8748dxb
    /* renamed from: d */
    public Void b(long j, InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
        e();
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void e() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.b
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.e
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.b
            r1.<init>(r0, r2)
            throw r1
        L36:
            o.C7667dAx.b()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7668dAy.e():java.lang.Void");
    }

    @Override // o.dxN, o.dwQ
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.b != null) {
            str = ", cause=" + this.b;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
