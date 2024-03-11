package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.commanderinfra.api.util.CommanderState;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;
import o.C1294Wd;
import o.C8632dsu;

@ActivityScoped
/* loaded from: classes4.dex */
public final class bBJ implements bBG {
    private final VD e;
    public static final a b = new a(null);
    public static final int a = 8;

    @Inject
    public bBJ(VD vd) {
        C8632dsu.c((Object) vd, "");
        this.e = vd;
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ControllerUiImpl");
        }
    }

    @Override // o.bBG
    public boolean e() {
        return this.e.d().m() == CommanderState.a;
    }

    @Override // o.bBG
    public boolean d() {
        return this.e.d().m() == CommanderState.d;
    }

    @Override // o.bBG
    public boolean a() {
        return this.e.d().m() == CommanderState.b;
    }

    @Override // o.bBG
    public boolean f() {
        if (this.e.d().m() == CommanderState.a) {
            if (this.e.d().a()) {
                this.e.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.ControllerUiImpl$onBackPressed$1
                    @Override // o.drM
                    /* renamed from: d */
                    public final C1294Wd invoke(C1294Wd c1294Wd) {
                        C1294Wd c2;
                        C8632dsu.c((Object) c1294Wd, "");
                        c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                        return c2;
                    }
                });
            } else if (this.e.d().i()) {
                this.e.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.ControllerUiImpl$onBackPressed$2
                    @Override // o.drM
                    /* renamed from: b */
                    public final C1294Wd invoke(C1294Wd c1294Wd) {
                        C1294Wd c;
                        C8632dsu.c((Object) c1294Wd, "");
                        c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                        return c;
                    }
                });
            } else if (this.e.d().g()) {
                this.e.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.ControllerUiImpl$onBackPressed$3
                    @Override // o.drM
                    /* renamed from: e */
                    public final C1294Wd invoke(C1294Wd c1294Wd) {
                        C1294Wd c;
                        C8632dsu.c((Object) c1294Wd, "");
                        c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                        return c;
                    }
                });
            } else if (this.e.d().j()) {
                this.e.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.ControllerUiImpl$onBackPressed$4
                    @Override // o.drM
                    /* renamed from: c */
                    public final C1294Wd invoke(C1294Wd c1294Wd) {
                        C1294Wd c;
                        C8632dsu.c((Object) c1294Wd, "");
                        c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                        return c;
                    }
                });
            } else {
                this.e.a(CommanderState.d);
            }
            return true;
        }
        return false;
    }

    @Override // o.bBG
    public void b(final boolean z) {
        this.e.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.ControllerUiImpl$onKeyboardPaddingChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final C1294Wd invoke(C1294Wd c1294Wd) {
                C1294Wd c;
                C8632dsu.c((Object) c1294Wd, "");
                c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : z, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                return c;
            }
        });
    }

    @Override // o.bBG
    public void j() {
        this.e.e();
    }

    @Override // o.bBG
    public void b() {
        b.getLogTag();
        this.e.a(CommanderState.b);
    }

    @Override // o.bBG
    public void c() {
        b.getLogTag();
        this.e.a(CommanderState.d);
    }
}
