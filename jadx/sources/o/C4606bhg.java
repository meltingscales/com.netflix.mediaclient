package o;

import android.content.Context;
import androidx.media3.common.PriorityTaskManager;

/* renamed from: o.bhg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4606bhg {
    private final InterfaceC4423beI a;
    private final InterfaceC4657bie b;
    private final InterfaceC4873boB c;
    private final Context d;
    private final InterfaceC4776bmK e;
    private final InterfaceC4342bch f;
    private final InterfaceC4793bmb h;
    private final PriorityTaskManager i;

    public final InterfaceC4873boB a() {
        return this.c;
    }

    public final InterfaceC4776bmK b() {
        return this.e;
    }

    public final InterfaceC4423beI c() {
        return this.a;
    }

    public final Context d() {
        return this.d;
    }

    public final InterfaceC4657bie e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4606bhg) {
            C4606bhg c4606bhg = (C4606bhg) obj;
            return C8632dsu.c(this.d, c4606bhg.d) && C8632dsu.c(this.i, c4606bhg.i) && C8632dsu.c(this.b, c4606bhg.b) && C8632dsu.c(this.a, c4606bhg.a) && C8632dsu.c(this.c, c4606bhg.c) && C8632dsu.c(this.h, c4606bhg.h) && C8632dsu.c(this.f, c4606bhg.f) && C8632dsu.c(this.e, c4606bhg.e);
        }
        return false;
    }

    public final InterfaceC4793bmb f() {
        return this.h;
    }

    public final PriorityTaskManager g() {
        return this.i;
    }

    public final InterfaceC4342bch h() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((((this.d.hashCode() * 31) + this.i.hashCode()) * 31) + this.b.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.h.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        Context context = this.d;
        PriorityTaskManager priorityTaskManager = this.i;
        InterfaceC4657bie interfaceC4657bie = this.b;
        InterfaceC4423beI interfaceC4423beI = this.a;
        InterfaceC4873boB interfaceC4873boB = this.c;
        InterfaceC4793bmb interfaceC4793bmb = this.h;
        InterfaceC4342bch interfaceC4342bch = this.f;
        InterfaceC4776bmK interfaceC4776bmK = this.e;
        return "PlayerFactoryParams(context=" + context + ", priorityTaskManager=" + priorityTaskManager + ", asePlatformContext=" + interfaceC4657bie + ", mediaDrmManager=" + interfaceC4423beI + ", manifestProvider=" + interfaceC4873boB + ", networkStackFactory=" + interfaceC4793bmb + ", mediaSessionMetaDataProvider=" + interfaceC4342bch + ", allSessionStatsProvider=" + interfaceC4776bmK + ")";
    }

    public C4606bhg(Context context, PriorityTaskManager priorityTaskManager, InterfaceC4657bie interfaceC4657bie, InterfaceC4423beI interfaceC4423beI, InterfaceC4873boB interfaceC4873boB, InterfaceC4793bmb interfaceC4793bmb, InterfaceC4342bch interfaceC4342bch, InterfaceC4776bmK interfaceC4776bmK) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) priorityTaskManager, "");
        C8632dsu.c((Object) interfaceC4657bie, "");
        C8632dsu.c((Object) interfaceC4423beI, "");
        C8632dsu.c((Object) interfaceC4873boB, "");
        C8632dsu.c((Object) interfaceC4793bmb, "");
        C8632dsu.c((Object) interfaceC4342bch, "");
        C8632dsu.c((Object) interfaceC4776bmK, "");
        this.d = context;
        this.i = priorityTaskManager;
        this.b = interfaceC4657bie;
        this.a = interfaceC4423beI;
        this.c = interfaceC4873boB;
        this.h = interfaceC4793bmb;
        this.f = interfaceC4342bch;
        this.e = interfaceC4776bmK;
    }
}
