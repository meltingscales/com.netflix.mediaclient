package o;

import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;

/* renamed from: o.czk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7626czk {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public IPlayerFragment.PlayerFragmentState l = IPlayerFragment.PlayerFragmentState.ACTIVITY_NOTREADY;
    public boolean m;
    private Interactivity n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f13792o;
    private boolean p;

    public final Interactivity a() {
        return this.n;
    }

    public final boolean b() {
        return this.p;
    }

    public final boolean c() {
        boolean z = this.k;
        this.k = false;
        return z;
    }

    public final void d() {
        this.f = 0L;
        this.g = false;
        this.i = false;
        this.b = false;
        this.e = false;
    }

    public final void d(Interactivity interactivity) {
        this.n = interactivity;
    }

    public final void d(boolean z) {
        this.p = z;
        if (z) {
            this.j = true;
        }
    }

    public final void e() {
        this.d++;
    }
}
