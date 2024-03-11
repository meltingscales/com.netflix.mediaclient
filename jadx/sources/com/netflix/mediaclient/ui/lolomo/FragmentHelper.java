package com.netflix.mediaclient.ui.lolomo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.Fade;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o.C1045Mp;
import o.C1645aIz;
import o.C6413cco;
import o.C6703ciM;
import o.C8054ddD;
import o.C8150deu;
import o.C8153dex;
import o.C8187dfe;
import o.C8348dig;
import o.C8353dil;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.C9834xU;
import o.InterfaceC1078Nw;
import o.InterfaceC1593aHa;
import o.InterfaceC3639bFh;
import o.InterfaceC5345bwx;
import o.InterfaceC8612dsa;
import o.bFO;
import o.bMR;
import o.bMZ;
import o.bNH;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class FragmentHelper implements bMZ {
    private Animator c;
    private final bMR f;
    private final NetflixActivity g;
    private int h;
    private int i;
    private final InterfaceC5345bwx j;
    private final int k;
    private final ArrayList<InterfaceC5345bwx> l;
    private final InterfaceC3639bFh m;
    private final InterfaceC5345bwx n;

    /* renamed from: o  reason: collision with root package name */
    private final bNH f13282o;
    private final InterfaceC5345bwx p;
    private final C6413cco q;
    private final ArrayList<BackStackEntry> r;
    private boolean s;
    private int t;
    private int w;
    private final boolean x;
    private ViewGroup y;
    public static final d e = new d(null);
    public static final int b = 8;
    private static long a = -1;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes4.dex */
    public interface c {
        bNH b();
    }

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes4.dex */
    public interface e {
        InterfaceC3639bFh F();
    }

    public static final long o() {
        return e.c();
    }

    @Override // o.bMZ
    public boolean i() {
        return this.x;
    }

    public FragmentHelper(boolean z, NetflixActivity netflixActivity, int i, bMR bmr, Bundle bundle) {
        List i2;
        BackStackEntry backStackEntry;
        C8632dsu.c((Object) netflixActivity, "");
        this.x = z;
        this.g = netflixActivity;
        this.k = i;
        this.f = bmr;
        InterfaceC3639bFh F = ((e) EntryPointAccessors.fromApplication(netflixActivity, e.class)).F();
        this.m = F;
        bNH b2 = ((c) EntryPointAccessors.fromActivity(netflixActivity, c.class)).b();
        this.f13282o = b2;
        ArrayList<InterfaceC5345bwx> arrayList = new ArrayList<>(5);
        this.l = arrayList;
        InterfaceC5345bwx a2 = F.a(this, netflixActivity);
        this.n = a2;
        InterfaceC5345bwx b3 = b2.b(this);
        this.p = b3;
        InterfaceC5345bwx b4 = F.b(this);
        this.j = b4;
        C6413cco c6413cco = new C6413cco(netflixActivity, this);
        this.q = c6413cco;
        ArrayList<BackStackEntry> arrayList2 = new ArrayList<>();
        this.r = arrayList2;
        u();
        if (bundle != null) {
            bundle.setClassLoader(FragmentHelper.class.getClassLoader());
        }
        i2 = C8569dql.i(b4, a2, c6413cco, b3);
        arrayList.addAll(i2);
        if (C8153dex.W()) {
            arrayList.add(new C6703ciM(this));
        }
        if (bundle != null) {
            arrayList2.clear();
            ArrayList<BackStackEntry> parcelableArrayList = bundle.getParcelableArrayList("fh_backstack");
            if (parcelableArrayList != null) {
                for (BackStackEntry backStackEntry2 : parcelableArrayList) {
                    backStackEntry2.e().setExtrasClassLoader(FragmentHelper.class.getClassLoader());
                    this.r.add(backStackEntry2);
                }
            }
            this.s = bundle.getBoolean("fh_showing_actionbar_initially");
            BackStackEntry t = t();
            if (t != null) {
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                NetflixFrag q = q();
                String str = (q == null || (str = q.toString()) == null) ? "none" : "none";
                Intent e2 = t.e();
                aVar.a("FH - restored - topFrag: " + str + " intent: " + e2);
                r();
                if (this.r.size() < 2) {
                    backStackEntry = null;
                } else {
                    ArrayList<BackStackEntry> arrayList3 = this.r;
                    backStackEntry = arrayList3.get(arrayList3.size() - 2);
                }
                a(backStackEntry, t, false);
                C8187dfe.c(new Runnable() { // from class: o.cce
                    @Override // java.lang.Runnable
                    public final void run() {
                        FragmentHelper.c(FragmentHelper.this);
                    }
                });
            }
        }
    }

    private final InterfaceC5345bwx p() {
        BackStackEntry t = t();
        if (t == null) {
            return null;
        }
        return b(t.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetflixFrag q() {
        FragmentManager supportFragmentManager = this.g.getSupportFragmentManager();
        BackStackEntry t = t();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(t != null ? t.a() : null);
        if (findFragmentByTag instanceof NetflixFrag) {
            return (NetflixFrag) findFragmentByTag;
        }
        return null;
    }

    private final BackStackEntry t() {
        if (this.r.isEmpty()) {
            return null;
        }
        ArrayList<BackStackEntry> arrayList = this.r;
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(FragmentHelper fragmentHelper) {
        C8632dsu.c((Object) fragmentHelper, "");
        if (fragmentHelper.p() != null) {
            NetflixActionBar netflixActionBar = fragmentHelper.g.getNetflixActionBar();
            if (netflixActionBar != null) {
                netflixActionBar.c(false);
            }
            NetflixFrag q = fragmentHelper.q();
            if (q != null) {
                q.bD_();
            }
        }
    }

    private final String s() {
        if (C8153dex.U()) {
            String uuid = UUID.randomUUID().toString();
            C8632dsu.a(uuid, "");
            return uuid;
        }
        return "fh_main_fragment";
    }

    @Override // o.bMZ
    public void c(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        bundle.putBoolean("fh_showing_fragment", h());
        bundle.putBoolean("fh_showing_actionbar_initially", this.s);
        bundle.putParcelableArrayList("fh_backstack", this.r);
    }

    @Override // o.bMZ
    public int a() {
        return this.r.size();
    }

    public List<BackStackEntry> k() {
        List<BackStackEntry> U;
        U = C8576dqs.U(this.r);
        return U;
    }

    @Override // o.bMZ
    public void n() {
        NetflixFrag c2 = c();
        if (c2 != null) {
            c2.bD_();
        }
    }

    public void b(InterfaceC5345bwx interfaceC5345bwx) {
        C8632dsu.c((Object) interfaceC5345bwx, "");
        if (this.l.contains(interfaceC5345bwx)) {
            return;
        }
        this.l.add(interfaceC5345bwx);
    }

    private final InterfaceC5345bwx e(Intent intent) {
        Iterator<InterfaceC5345bwx> it = this.l.iterator();
        while (it.hasNext()) {
            InterfaceC5345bwx next = it.next();
            if (next.e(intent)) {
                return next;
            }
        }
        return null;
    }

    @Override // o.bMZ
    public boolean b(Intent intent) {
        final boolean z;
        BackStackEntry b2;
        NetflixActionBar netflixActionBar;
        boolean z2 = false;
        if (x() && intent != null) {
            e.getLogTag();
            if (!h()) {
                NetflixActionBar netflixActionBar2 = this.g.getNetflixActionBar();
                this.s = netflixActionBar2 != null ? netflixActionBar2.l() : false;
                bMR bmr = this.f;
                if (bmr != null && !bmr.e(intent)) {
                    b(this.f.a());
                }
            } else {
                bMR bmr2 = this.f;
                if (bmr2 != null && bmr2.e(intent)) {
                    b(0);
                    return true;
                }
            }
            View currentFocus = this.g.getWindow().getCurrentFocus();
            InterfaceC5345bwx e2 = e(intent);
            if (e2 != null) {
                if (currentFocus instanceof EditText) {
                    C8150deu.b(this.g, (EditText) currentFocus);
                }
                if (!h() && (netflixActionBar = this.g.getNetflixActionBar()) != null && !netflixActionBar.l()) {
                    this.c = netflixActionBar.e(1);
                }
                InterfaceC5345bwx p = p();
                NetflixFrag q = q();
                BackStackEntry t = t();
                bFO bfo = q instanceof bFO ? (bFO) q : null;
                Parcelable a2 = bfo != null ? bfo.a() : null;
                if (intent.getBooleanExtra("fh_replace_on_backstack", false)) {
                    intent.putExtra("fh_replace_on_backstack", false);
                    z = true;
                } else {
                    z = false;
                }
                Boolean bool = (Boolean) C9726vo.d(p, q, t, new InterfaceC8612dsa<InterfaceC5345bwx, NetflixFrag, BackStackEntry, Boolean>() { // from class: com.netflix.mediaclient.ui.lolomo.FragmentHelper$handleIntent$willDetach$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    /* renamed from: b */
                    public final Boolean invoke(InterfaceC5345bwx interfaceC5345bwx, NetflixFrag netflixFrag, FragmentHelper.BackStackEntry backStackEntry) {
                        C8632dsu.c((Object) interfaceC5345bwx, "");
                        C8632dsu.c((Object) netflixFrag, "");
                        C8632dsu.c((Object) backStackEntry, "");
                        return Boolean.valueOf(C8153dex.U() && !z && interfaceC5345bwx.c(backStackEntry.e(), netflixFrag));
                    }
                });
                Fragment.SavedState saveFragmentInstanceState = (q == null || (bool != null ? bool.booleanValue() : false)) ? null : this.g.getSupportFragmentManager().saveFragmentInstanceState(q);
                Fragment d2 = e2.d(intent);
                if (d2 != null) {
                    if (z) {
                        b2 = a(intent, e2);
                    } else {
                        if (t != null) {
                            t.d(saveFragmentInstanceState);
                        }
                        if (t != null) {
                            t.a(a2);
                        }
                        b2 = b(intent, e2);
                    }
                    a(t, b2, p, q, e2, (NetflixFrag) d2, false, z);
                    r();
                    n();
                    a(t, b2, false);
                    z2 = true;
                }
                NetflixApplication.getInstance().y().b();
            }
            this.c = null;
        }
        return z2;
    }

    static /* synthetic */ boolean a(FragmentHelper fragmentHelper, BackStackEntry backStackEntry, BackStackEntry backStackEntry2, InterfaceC5345bwx interfaceC5345bwx, NetflixFrag netflixFrag, InterfaceC5345bwx interfaceC5345bwx2, NetflixFrag netflixFrag2, boolean z, boolean z2, int i, Object obj) {
        return fragmentHelper.a(backStackEntry, backStackEntry2, interfaceC5345bwx, netflixFrag, interfaceC5345bwx2, netflixFrag2, z, (i & 128) != 0 ? false : z2);
    }

    private final boolean a(BackStackEntry backStackEntry, BackStackEntry backStackEntry2, InterfaceC5345bwx interfaceC5345bwx, NetflixFrag netflixFrag, InterfaceC5345bwx interfaceC5345bwx2, NetflixFrag netflixFrag2, boolean z, boolean z2) {
        boolean z3;
        Intent e2;
        Intent e3;
        if (netflixFrag2 != null) {
            netflixFrag2.d(this.w, this.h, this.t, this.i);
        }
        boolean z4 = false;
        boolean z5 = true;
        if (backStackEntry2 == null || (e3 = backStackEntry2.e()) == null || !e3.getBooleanExtra("fh_skip_transition", false)) {
            z3 = false;
        } else {
            backStackEntry2.e().putExtra("fh_skip_transition", false);
            z3 = true;
        }
        if (z3) {
            if (netflixFrag != null) {
                netflixFrag.setExitTransition(null);
            }
            if (netflixFrag2 != null) {
                netflixFrag2.setEnterTransition(null);
            }
        } else {
            d(netflixFrag, netflixFrag2, z);
        }
        FragmentTransaction beginTransaction = this.g.getSupportFragmentManager().beginTransaction();
        C8632dsu.a(beginTransaction, "");
        if (interfaceC5345bwx != null && netflixFrag != null && backStackEntry != null) {
            if (!z3) {
                interfaceC5345bwx.b(backStackEntry.e(), netflixFrag, backStackEntry2 != null ? backStackEntry2.e() : null, z);
            }
            if (C8153dex.U() && !z && !z2 && interfaceC5345bwx.c(backStackEntry.e(), netflixFrag)) {
                z4 = true;
            }
            if (z4) {
                beginTransaction.detach(netflixFrag);
            } else {
                beginTransaction.remove(netflixFrag);
            }
            backStackEntry.d(z4);
            if (z) {
                NetflixApplication.getInstance().y().e(this.g, backStackEntry.d(), interfaceC5345bwx.b(backStackEntry.e()), true);
                interfaceC5345bwx.a(backStackEntry.e(), netflixFrag);
            }
            z4 = true;
        }
        if (interfaceC5345bwx2 == null || netflixFrag2 == null || backStackEntry2 == null) {
            z5 = z4;
        } else {
            if (!z3) {
                interfaceC5345bwx2.c(backStackEntry2.e(), netflixFrag2, z);
            }
            if (z && backStackEntry2.h()) {
                beginTransaction.attach(netflixFrag2);
            } else {
                beginTransaction.add(this.k, netflixFrag2, backStackEntry2.a());
            }
            if (!z) {
                NetflixApplication.getInstance().y().e(this.g, interfaceC5345bwx2.a(backStackEntry2.e()), interfaceC5345bwx2.b(backStackEntry2.e()));
            }
        }
        if (z5) {
            beginTransaction.commitNow();
        }
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        Object obj = "none";
        String str = (netflixFrag2 == null || (str = netflixFrag2.toString()) == null) ? "none" : "none";
        if (backStackEntry2 != null && (e2 = backStackEntry2.e()) != null) {
            obj = e2;
        }
        aVar.a("FH-isBack: " + z + " nextFrag: " + str + " intent: " + obj);
        return z5;
    }

    private final void a(BackStackEntry backStackEntry, BackStackEntry backStackEntry2, boolean z) {
        if (!this.x) {
            b(backStackEntry, backStackEntry2, z);
        }
        this.g.invalidateOptionsMenu();
        this.g.onActivityRefreshed(k().size());
    }

    private final boolean x() {
        return !this.g.getSupportFragmentManager().isStateSaved();
    }

    private final InterfaceC5345bwx b(String str) {
        Iterator<InterfaceC5345bwx> it = this.l.iterator();
        while (it.hasNext()) {
            InterfaceC5345bwx next = it.next();
            if (C8632dsu.c((Object) next.getClass().getCanonicalName(), (Object) str)) {
                return next;
            }
        }
        return null;
    }

    @Override // o.bMZ
    public boolean g() {
        NetflixFrag q = q();
        if (q == null || !q.y()) {
            InterfaceC5345bwx p = p();
            if (p == null || !p.a()) {
                return f();
            }
            return true;
        }
        return true;
    }

    @Override // o.bMZ
    public boolean e() {
        return d(true);
    }

    private final boolean d(boolean z) {
        if (x()) {
            e.getLogTag();
            NetflixFrag c2 = c();
            if (c2 == null || !c2.o()) {
                return c(z);
            }
            return true;
        }
        return false;
    }

    private final boolean c(boolean z) {
        InterfaceC5345bwx interfaceC5345bwx;
        NetflixFrag netflixFrag;
        NetflixFrag q = q();
        BackStackEntry w = w();
        if (w == null || q == null) {
            return false;
        }
        InterfaceC5345bwx b2 = b(w.c());
        BackStackEntry t = t();
        if (t != null) {
            interfaceC5345bwx = b(t.c());
        } else {
            NetflixActionBar netflixActionBar = this.g.getNetflixActionBar();
            if (netflixActionBar != null && !this.s) {
                this.c = netflixActionBar.c(1);
            }
            interfaceC5345bwx = null;
        }
        if (interfaceC5345bwx == null || t == null) {
            netflixFrag = null;
        } else {
            NetflixFrag netflixFrag2 = t.h() ? (NetflixFrag) this.g.getSupportFragmentManager().findFragmentByTag(t.a()) : null;
            if (netflixFrag2 == null) {
                netflixFrag2 = interfaceC5345bwx.d(t.e());
            }
            if (netflixFrag2 != null) {
                if (!t.h()) {
                    netflixFrag2.setInitialSavedState(t.j());
                }
                bFO bfo = netflixFrag2 instanceof bFO ? (bFO) netflixFrag2 : null;
                if (bfo != null) {
                    bfo.e(t.b());
                }
            } else {
                netflixFrag2 = null;
            }
            netflixFrag = netflixFrag2;
        }
        InterfaceC5345bwx interfaceC5345bwx2 = interfaceC5345bwx;
        a(this, w, t, b2, q, interfaceC5345bwx, netflixFrag, true, false, 128, null);
        r();
        if (interfaceC5345bwx2 != null && t != null && netflixFrag != null) {
            netflixFrag.bD_();
        }
        a(w, t, true);
        if (z) {
            NetflixApplication.getInstance().y().b();
        }
        this.c = null;
        return true;
    }

    @Override // o.bMZ
    public NetflixActionBar.b.C0051b b() {
        NetflixActionBar.b.C0051b p;
        NetflixActionBar.b.C0051b k;
        NetflixActionBar.b.C0051b d2;
        NetflixActionBar netflixActionBar = this.g.getNetflixActionBar();
        boolean z = true;
        if (this.x && a() <= 1) {
            z = false;
        }
        if (netflixActionBar == null || (p = netflixActionBar.p()) == null || (k = p.k(z)) == null || (d2 = k.d(0)) == null) {
            return null;
        }
        return d2.b(NetflixActionBar.LogoType.b);
    }

    @Override // o.bMZ
    public void a(int i, int i2, int i3, int i4) {
        this.w = i;
        this.h = i2;
        this.t = i3;
        this.i = i4;
        NetflixFrag q = q();
        if (q != null) {
            q.d(i, i2, i3, i4);
        }
    }

    private final void u() {
        if (this.g.findViewById(this.k) != null) {
            View findViewById = this.g.findViewById(this.k);
            C8632dsu.a(findViewById, "");
            ViewGroup viewGroup = (ViewGroup) findViewById;
            this.y = viewGroup;
            if (this.x) {
                ViewGroup viewGroup2 = null;
                if (viewGroup == null) {
                    C8632dsu.d("");
                    viewGroup = null;
                }
                viewGroup.setAlpha(1.0f);
                ViewGroup viewGroup3 = this.y;
                if (viewGroup3 == null) {
                    C8632dsu.d("");
                } else {
                    viewGroup2 = viewGroup3;
                }
                viewGroup2.setVisibility(0);
                return;
            }
            return;
        }
        throw new IllegalStateException("fragmentContainerId missing");
    }

    @Override // o.bMZ
    public boolean h() {
        return !this.r.isEmpty();
    }

    private final void r() {
        C1645aIz.a(this.g, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.FragmentHelper$forwardManagerReadyToFragment$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                b(serviceManager);
                return dpR.c;
            }

            public final void b(ServiceManager serviceManager) {
                NetflixFrag q;
                C8632dsu.c((Object) serviceManager, "");
                q = FragmentHelper.this.q();
                if (q != null) {
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    q.onManagerReady(serviceManager, netflixImmutableStatus);
                }
            }
        });
    }

    @Override // o.bMZ
    public boolean j() {
        InterfaceC5345bwx p = p();
        if (p != null) {
            return this.m.b(p);
        }
        return false;
    }

    @Override // o.bMZ
    public NetflixFrag c() {
        return q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        com.netflix.mediaclient.NetflixApplication.getInstance().y().b();
     */
    @Override // o.bMZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.x()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = -1
            r2 = 1
            if (r7 != r0) goto L1a
            java.util.ArrayList<com.netflix.mediaclient.ui.lolomo.FragmentHelper$BackStackEntry> r0 = r6.r
            int r0 = r0.size()
            if (r0 <= r2) goto L1a
            boolean r0 = r6.s
            if (r0 != 0) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r1
        L1b:
            r3 = r1
        L1c:
            java.util.ArrayList<com.netflix.mediaclient.ui.lolomo.FragmentHelper$BackStackEntry> r4 = r6.r
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L37
            java.util.ArrayList<com.netflix.mediaclient.ui.lolomo.FragmentHelper$BackStackEntry> r4 = r6.r
            int r4 = r4.size()
            int r5 = r7 + 1
            if (r4 <= r5) goto L37
            boolean r4 = r6.c(r1)
            if (r4 != 0) goto L35
            goto L37
        L35:
            r3 = r2
            goto L1c
        L37:
            if (r3 == 0) goto L44
            com.netflix.mediaclient.NetflixApplication r7 = com.netflix.mediaclient.NetflixApplication.getInstance()
            o.dhJ r7 = r7.y()
            r7.b()
        L44:
            if (r0 == 0) goto L4f
            com.netflix.mediaclient.android.activity.NetflixActivity r7 = r6.g
            com.netflix.mediaclient.android.widget.NetflixActionBar r7 = r7.requireNetflixActionBar()
            r7.a(r1)
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.lolomo.FragmentHelper.b(int):boolean");
    }

    @Override // o.bMZ
    public boolean m() {
        InterfaceC5345bwx p;
        int i;
        if (x() && (p = p()) != null) {
            int size = this.r.size() - 1;
            int size2 = this.r.size() - 2;
            while (true) {
                int i2 = size2;
                i = size;
                size = i2;
                if (-1 >= size || !C8632dsu.c((Object) this.r.get(size).c(), (Object) p.getClass().getCanonicalName())) {
                    break;
                }
                this.r.get(size).e().putExtra("fh_remove_all_of_type", true);
                size2 = size - 1;
            }
            return b(i - 1);
        }
        return false;
    }

    @Override // o.bMZ
    public boolean f() {
        return b(this.x ? 0 : -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r6.getVisibility() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(com.netflix.mediaclient.ui.lolomo.FragmentHelper.BackStackEntry r6, com.netflix.mediaclient.ui.lolomo.FragmentHelper.BackStackEntry r7, boolean r8) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = ""
            r2 = 1
            r3 = 0
            if (r7 != 0) goto L56
            if (r8 != 0) goto L26
            if (r6 == 0) goto L26
            o.cco r7 = r5.q
            android.content.Intent r6 = r6.e()
            boolean r6 = r7.g(r6)
            if (r6 == 0) goto L26
            android.view.ViewGroup r6 = r5.y
            if (r6 != 0) goto L1f
            o.C8632dsu.d(r1)
            r6 = r3
        L1f:
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L26
            goto L27
        L26:
            r2 = r0
        L27:
            com.netflix.mediaclient.ui.lolomo.FragmentHelper$d r6 = com.netflix.mediaclient.ui.lolomo.FragmentHelper.e
            android.view.ViewGroup r7 = r5.y
            if (r7 != 0) goto L31
            o.C8632dsu.d(r1)
            goto L32
        L31:
            r3 = r7
        L32:
            if (r2 == 0) goto L37
            long r7 = o.C8349dih.a
            goto L3b
        L37:
            long r7 = r6.c()
        L3b:
            r1 = 4
            com.netflix.mediaclient.ui.lolomo.FragmentHelper.d.d(r6, r3, r1, r7)
            com.netflix.mediaclient.android.activity.NetflixActivity r6 = r5.g
            if (r2 == 0) goto L4d
            o.dih r7 = new o.dih
            boolean r8 = o.C8150deu.h()
            r7.<init>(r8)
            goto L52
        L4d:
            androidx.transition.Fade r7 = new androidx.transition.Fade
            r7.<init>()
        L52:
            r6.setFragmentsHiddenState(r0, r7)
            goto La0
        L56:
            android.view.ViewGroup r8 = r5.y
            if (r8 != 0) goto L5e
            o.C8632dsu.d(r1)
            r8 = r3
        L5e:
            r4 = 1065353216(0x3f800000, float:1.0)
            r8.setAlpha(r4)
            android.view.ViewGroup r8 = r5.y
            if (r8 != 0) goto L6b
            o.C8632dsu.d(r1)
            goto L6c
        L6b:
            r3 = r8
        L6c:
            r3.setVisibility(r0)
            if (r6 != 0) goto La0
            o.bwx r6 = r5.p()
            o.cco r8 = r5.q
            if (r6 != r8) goto L8d
            android.content.Intent r6 = r7.e()
            boolean r6 = r8.g(r6)
            if (r6 == 0) goto L8d
            o.dih r6 = new o.dih
            boolean r7 = o.C8150deu.h()
            r6.<init>(r7)
            goto L98
        L8d:
            androidx.transition.Fade r6 = new androidx.transition.Fade
            r6.<init>()
            r7 = 300(0x12c, double:1.48E-321)
            androidx.transition.Transition r6 = r6.setDuration(r7)
        L98:
            o.C8632dsu.d(r6)
            com.netflix.mediaclient.android.activity.NetflixActivity r7 = r5.g
            r7.setFragmentsHiddenState(r2, r6)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.lolomo.FragmentHelper.b(com.netflix.mediaclient.ui.lolomo.FragmentHelper$BackStackEntry, com.netflix.mediaclient.ui.lolomo.FragmentHelper$BackStackEntry, boolean):void");
    }

    @Override // o.bMZ
    public PlayContext d() {
        PlayContextImp b2;
        Bundle arguments;
        NetflixFrag c2 = c();
        TrackingInfoHolder trackingInfoHolder = (c2 == null || (arguments = c2.getArguments()) == null) ? null : (TrackingInfoHolder) arguments.getParcelable("tracking_info_holder");
        return (trackingInfoHolder == null || (b2 = TrackingInfoHolder.b(trackingInfoHolder, false, 1, null)) == null) ? new EmptyPlayContext(e.getLogTag(), -390) : b2;
    }

    private final void d(NetflixFrag netflixFrag, NetflixFrag netflixFrag2, boolean z) {
        if (netflixFrag2 != null) {
            netflixFrag2.setEnterTransition(z ? new Fade() : e(z));
        }
        if (netflixFrag != null) {
            netflixFrag.setExitTransition(z ? e(z) : new Fade());
        }
    }

    private final C8348dig e(boolean z) {
        C8348dig c8348dig;
        if (C8150deu.h()) {
            c8348dig = new C8353dil(true);
        } else {
            c8348dig = new C8348dig(false);
        }
        c8348dig.a(BrowseExperience.e(this.g, 16842836));
        c8348dig.setDuration(e.c());
        Animator animator = this.c;
        if (animator != null) {
            if (z) {
                c8348dig.a(animator);
            } else {
                c8348dig.b(animator);
            }
        }
        return c8348dig;
    }

    private final BackStackEntry a(Intent intent, InterfaceC5345bwx interfaceC5345bwx) {
        w();
        String canonicalName = interfaceC5345bwx.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = interfaceC5345bwx.getClass().getName();
        }
        String str = canonicalName;
        String s = s();
        C8632dsu.d((Object) str);
        BackStackEntry backStackEntry = new BackStackEntry(s, str, intent, interfaceC5345bwx.a(intent), null, null, false, 64, null);
        this.r.add(backStackEntry);
        return backStackEntry;
    }

    private final BackStackEntry b(Intent intent, InterfaceC5345bwx interfaceC5345bwx) {
        String canonicalName = interfaceC5345bwx.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = interfaceC5345bwx.getClass().getName();
        }
        String str = canonicalName;
        String s = s();
        C8632dsu.d((Object) str);
        BackStackEntry backStackEntry = new BackStackEntry(s, str, intent, interfaceC5345bwx.a(intent), null, null, false, 112, null);
        this.r.add(backStackEntry);
        return backStackEntry;
    }

    private final BackStackEntry w() {
        if (this.r.isEmpty()) {
            return null;
        }
        ArrayList<BackStackEntry> arrayList = this.r;
        return arrayList.remove(arrayList.size() - 1);
    }

    @SuppressLint({"ParcelCreator"})
    /* loaded from: classes4.dex */
    public static final class BackStackEntry implements Parcelable {
        public static final Parcelable.Creator<BackStackEntry> CREATOR = new Creator();
        private final String a;
        private final Intent b;
        private final String c;
        private final AppView d;
        private boolean e;
        private Parcelable g;
        private Fragment.SavedState j;

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<BackStackEntry> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final BackStackEntry[] newArray(int i) {
                return new BackStackEntry[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final BackStackEntry createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return new BackStackEntry(parcel.readString(), parcel.readString(), (Intent) parcel.readParcelable(BackStackEntry.class.getClassLoader()), AppView.valueOf(parcel.readString()), (Fragment.SavedState) parcel.readParcelable(BackStackEntry.class.getClassLoader()), parcel.readParcelable(BackStackEntry.class.getClassLoader()), parcel.readInt() != 0);
            }
        }

        public final String a() {
            return this.c;
        }

        public final void a(Parcelable parcelable) {
            this.g = parcelable;
        }

        public final Parcelable b() {
            return this.g;
        }

        public final String c() {
            return this.a;
        }

        public final AppView d() {
            return this.d;
        }

        public final void d(Fragment.SavedState savedState) {
            this.j = savedState;
        }

        public final void d(boolean z) {
            this.e = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Intent e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BackStackEntry) {
                BackStackEntry backStackEntry = (BackStackEntry) obj;
                return C8632dsu.c((Object) this.c, (Object) backStackEntry.c) && C8632dsu.c((Object) this.a, (Object) backStackEntry.a) && C8632dsu.c(this.b, backStackEntry.b) && this.d == backStackEntry.d && C8632dsu.c(this.j, backStackEntry.j) && C8632dsu.c(this.g, backStackEntry.g) && this.e == backStackEntry.e;
            }
            return false;
        }

        public final boolean h() {
            return this.e;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.a.hashCode();
            int hashCode3 = this.b.hashCode();
            int hashCode4 = this.d.hashCode();
            Fragment.SavedState savedState = this.j;
            int hashCode5 = savedState == null ? 0 : savedState.hashCode();
            Parcelable parcelable = this.g;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (parcelable != null ? parcelable.hashCode() : 0)) * 31) + Boolean.hashCode(this.e);
        }

        public final Fragment.SavedState j() {
            return this.j;
        }

        public String toString() {
            String str = this.c;
            String str2 = this.a;
            Intent intent = this.b;
            AppView appView = this.d;
            Fragment.SavedState savedState = this.j;
            Parcelable parcelable = this.g;
            boolean z = this.e;
            return "BackStackEntry(fragmentTag=" + str + ", hostClassName=" + str2 + ", intent=" + intent + ", appView=" + appView + ", savedInstanceState=" + savedState + ", layoutManagerState=" + parcelable + ", isDetached=" + z + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeString(this.c);
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.d.name());
            parcel.writeParcelable(this.j, i);
            parcel.writeParcelable(this.g, i);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public BackStackEntry(String str, String str2, Intent intent, AppView appView, Fragment.SavedState savedState, Parcelable parcelable, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) intent, "");
            C8632dsu.c((Object) appView, "");
            this.c = str;
            this.a = str2;
            this.b = intent;
            this.d = appView;
            this.j = savedState;
            this.g = parcelable;
            this.e = z;
        }

        public /* synthetic */ BackStackEntry(String str, String str2, Intent intent, AppView appView, Fragment.SavedState savedState, Parcelable parcelable, boolean z, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new Intent() : intent, (i & 8) != 0 ? AppView.UNKNOWN : appView, (i & 16) != 0 ? null : savedState, (i & 32) == 0 ? parcelable : null, (i & 64) != 0 ? false : z);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("FragmentHelper");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(View view, int i, long j) {
            view.animate().cancel();
            if (i == 8 && view.getVisibility() == 8) {
                return;
            }
            if (i == 4 && view.getVisibility() == 4) {
                return;
            }
            ViewPropertyAnimator animate = view.animate();
            animate.alpha(1.0f);
            animate.setDuration(j);
            animate.setListener(new c(view, i));
            animate.start();
        }

        /* loaded from: classes4.dex */
        public static final class c extends AnimatorListenerAdapter {
            private boolean a;
            final /* synthetic */ int b;
            final /* synthetic */ View e;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C8632dsu.c((Object) animator, "");
                this.a = true;
            }

            c(View view, int i) {
                this.e = view;
                this.b = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C8632dsu.c((Object) animator, "");
                if (this.a) {
                    return;
                }
                this.e.setVisibility(this.b);
            }
        }

        public final long c() {
            if (FragmentHelper.a == -1) {
                FragmentHelper.a = C8054ddD.e(NetflixApplication.getInstance(), C9834xU.f.e);
            }
            return FragmentHelper.a;
        }
    }
}
