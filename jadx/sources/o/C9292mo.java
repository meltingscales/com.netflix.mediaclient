package o;

import com.bugsnag.android.UserStore$loadPersistedUser$1;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC9286mi;

/* renamed from: o.mo  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9292mo {
    private final boolean a;
    private final C9258mG b;
    private final InterfaceC9200lB c;
    private final String d;
    private final AtomicReference<C9294mq> e;
    private final C9224lZ h;
    private final C9282me<C9294mq> i;

    public C9292mo(C9258mG c9258mG, String str, File file, C9224lZ c9224lZ, InterfaceC9200lB interfaceC9200lB) {
        this.b = c9258mG;
        this.d = str;
        this.h = c9224lZ;
        this.c = interfaceC9200lB;
        this.a = c9258mG.r();
        this.e = new AtomicReference<>(null);
        this.i = new C9282me<>(file);
    }

    public /* synthetic */ C9292mo(C9258mG c9258mG, String str, File file, C9224lZ c9224lZ, InterfaceC9200lB interfaceC9200lB, int i, C8627dsp c8627dsp) {
        this(c9258mG, str, (i & 4) != 0 ? new File(c9258mG.x().getValue(), "bugsnag/user-info") : file, c9224lZ, interfaceC9200lB);
    }

    public final C9295mr e(C9294mq c9294mq) {
        if (!a(c9294mq)) {
            c9294mq = this.a ? e() : null;
        }
        C9295mr c9295mr = (c9294mq == null || !a(c9294mq)) ? new C9295mr(new C9294mq(this.d, null, null)) : new C9295mr(c9294mq);
        c9295mr.addObserver(new InterfaceC9263mL() { // from class: o.mp
            @Override // o.InterfaceC9263mL
            public final void onStateChange(AbstractC9286mi abstractC9286mi) {
                C9292mo.b(C9292mo.this, abstractC9286mi);
            }
        });
        return c9295mr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C9292mo c9292mo, AbstractC9286mi abstractC9286mi) {
        if (abstractC9286mi instanceof AbstractC9286mi.q) {
            c9292mo.c(((AbstractC9286mi.q) abstractC9286mi).a);
        }
    }

    public final void c(C9294mq c9294mq) {
        if (!this.a || C8632dsu.c(c9294mq, this.e.getAndSet(c9294mq))) {
            return;
        }
        try {
            this.i.a(c9294mq);
        } catch (Exception e) {
            this.c.e("Failed to persist user info", e);
        }
    }

    private final boolean a(C9294mq c9294mq) {
        return (c9294mq.c() == null && c9294mq.d() == null && c9294mq.b() == null) ? false : true;
    }

    private final C9294mq e() {
        if (this.h.a()) {
            C9294mq c = this.h.c(this.d);
            c(c);
            return c;
        }
        if (this.i.b().canRead() && this.i.b().length() > 0 && this.a) {
            try {
                return this.i.d(new UserStore$loadPersistedUser$1(C9294mq.b));
            } catch (Exception e) {
                this.c.e("Failed to load user info", e);
            }
        }
        return null;
    }
}
