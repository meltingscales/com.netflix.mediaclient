package o;

import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import j$.time.Instant;

/* renamed from: o.buv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5237buv implements InterfaceC5231bup {
    private final int b;
    private final Instant c;
    private final Instant e;

    public Instant a() {
        return this.e;
    }

    public Instant c() {
        return this.c;
    }

    @Override // o.InterfaceC5231bup
    public int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5237buv) {
            C5237buv c5237buv = (C5237buv) obj;
            return C8632dsu.c(this.e, c5237buv.e) && C8632dsu.c(this.c, c5237buv.c) && this.b == c5237buv.b;
        }
        return false;
    }

    public int hashCode() {
        return (((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        Instant instant = this.e;
        Instant instant2 = this.c;
        int i = this.b;
        return "LiveEventImpl(startTime=" + instant + ", endTime=" + instant2 + ", videoId=" + i + ")";
    }

    public C5237buv(Instant instant, Instant instant2, int i) {
        C8632dsu.c((Object) instant, "");
        C8632dsu.c((Object) instant2, "");
        this.e = instant;
        this.c = instant2;
        this.b = i;
    }

    @Override // o.InterfaceC5231bup
    public LiveState d(Instant instant) {
        C8632dsu.c((Object) instant, "");
        return instant.e(a()) ? LiveState.c : c(instant) ? LiveState.a : instant.c(c()) ? LiveState.d : LiveState.e;
    }

    private final boolean c(Instant instant) {
        return (instant.c(a()) && instant.e(c())) || C8632dsu.c(instant, a()) || C8632dsu.c(instant, c());
    }
}
