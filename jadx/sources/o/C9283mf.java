package o;

import android.content.Context;
import o.C9169kX;
import o.C9201lC;
import o.C9223lY;
import o.C9224lZ;
import o.C9247lw;
import o.C9258mG;
import o.C9283mf;
import o.C9292mo;

/* renamed from: o.mf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9283mf extends AbstractC9267mP {
    private final InterfaceC8554dpx c;
    private final InterfaceC8554dpx d;
    private final InterfaceC8554dpx g;
    private final InterfaceC8554dpx h;
    private final InterfaceC8554dpx j;
    private final InterfaceC8554dpx e = e(new drO<String>() { // from class: com.bugsnag.android.StorageModule$deviceId$2
        {
            super(0);
        }

        @Override // o.drO
        /* renamed from: e */
        public final String invoke() {
            C9169kX f;
            f = C9283mf.this.f();
            return f.b();
        }
    });
    private final InterfaceC8554dpx a = e(new drO<String>() { // from class: com.bugsnag.android.StorageModule$internalDeviceId$2
        {
            super(0);
        }

        @Override // o.drO
        /* renamed from: a */
        public final String invoke() {
            C9169kX f;
            f = C9283mf.this.f();
            return f.a();
        }
    });
    private final InterfaceC8554dpx b = e(new drO<C9247lw>() { // from class: com.bugsnag.android.StorageModule$lastRunInfo$2
        {
            super(0);
        }

        @Override // o.drO
        /* renamed from: a */
        public final C9247lw invoke() {
            C9247lw d = C9283mf.this.c().d();
            C9283mf.this.c().e(new C9247lw(0, false, false));
            return d;
        }
    });

    public C9283mf(final Context context, final C9258mG c9258mG, final InterfaceC9200lB interfaceC9200lB) {
        this.h = e(new drO<C9224lZ>() { // from class: com.bugsnag.android.StorageModule$sharedPrefMigrator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final C9224lZ invoke() {
                return new C9224lZ(context);
            }
        });
        this.c = e(new drO<C9169kX>() { // from class: com.bugsnag.android.StorageModule$deviceIdStore$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final C9169kX invoke() {
                return new C9169kX(context, null, null, null, null, this.j(), interfaceC9200lB, 30, null);
            }
        });
        this.j = e(new drO<C9292mo>() { // from class: com.bugsnag.android.StorageModule$userStore$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final C9292mo invoke() {
                return new C9292mo(C9258mG.this, this.b(), null, this.j(), interfaceC9200lB, 4, null);
            }
        });
        this.d = e(new drO<C9201lC>() { // from class: com.bugsnag.android.StorageModule$lastRunInfoStore$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final C9201lC invoke() {
                return new C9201lC(C9258mG.this);
            }
        });
        this.g = e(new drO<C9223lY>() { // from class: com.bugsnag.android.StorageModule$sessionStore$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final C9223lY invoke() {
                return new C9223lY(C9258mG.this, interfaceC9200lB, null);
            }
        });
    }

    public final C9224lZ j() {
        return (C9224lZ) this.h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C9169kX f() {
        return (C9169kX) this.c.getValue();
    }

    public final String b() {
        return (String) this.e.getValue();
    }

    public final String d() {
        return (String) this.a.getValue();
    }

    public final C9292mo h() {
        return (C9292mo) this.j.getValue();
    }

    public final C9201lC c() {
        return (C9201lC) this.d.getValue();
    }

    public final C9223lY e() {
        return (C9223lY) this.g.getValue();
    }

    public final C9247lw a() {
        return (C9247lw) this.b.getValue();
    }
}
