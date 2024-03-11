package com.netflix.mediaclient.ui.more;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.more.MoreFragment;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.functions.Consumer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.AbstractC6741ciy;
import o.C1026Lt;
import o.C1044Mm;
import o.C1180Rt;
import o.C1203Sq;
import o.C5062brf;
import o.C6193cXh;
import o.C6705ciO;
import o.C8054ddD;
import o.C8126deW;
import o.C8187dfe;
import o.C8254dgs;
import o.C8310dhv;
import o.C9834xU;
import o.C9870yD;
import o.InterfaceC1078Nw;
import o.InterfaceC5844cKl;
import o.InterfaceC6905cmC;
import o.InterfaceC7081cpV;
import o.InterfaceC7084cpY;
import o.InterfaceC7141cqc;
import o.InterfaceC7967dbW;
import o.RG;
import o.SA;
import o.aQJ;
import o.bRE;
import o.cNT;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class MoreFragment extends AbstractC6741ciy {
    private static int B = 1;
    private static Drawable b = null;
    private static byte e$ss2$5124 = 24;
    private static int y;
    private RecyclerView e;
    private NetflixActivity j;
    @Inject
    public LoginApi loginApi;
    private LinearLayout m;
    @Inject
    public InterfaceC6905cmC myList;
    @Inject
    public InterfaceC7084cpY notificationsUi;

    /* renamed from: o  reason: collision with root package name */
    private RG f13292o;
    @Inject
    public InterfaceC5844cKl profileApi;
    @Inject
    public cNT profileSelectionLauncher;
    private boolean q;
    private ViewGroup r;
    private InterfaceC7141cqc s;
    private ServiceManager t;
    private View u;
    @Inject
    public InterfaceC7967dbW userMarks;
    private C6705ciO w;
    private View x;
    private boolean l = false;
    private boolean v = false;
    private final BroadcastReceiver p = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.more.MoreFragment.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MoreFragment.this.S();
        }
    };
    private final BroadcastReceiver n = new BroadcastReceiver() { // from class: com.netflix.mediaclient.ui.more.MoreFragment.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MoreFragment.this.K();
        }
    };
    private final Runnable k = new Runnable() { // from class: com.netflix.mediaclient.ui.more.MoreFragment.1
        @Override // java.lang.Runnable
        public void run() {
            if (C8054ddD.l(MoreFragment.this.getActivity())) {
                return;
            }
            MoreFragment.this.s.N();
        }
    };

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    public static MoreFragment e() {
        return new MoreFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            ArrayList arrayList = new ArrayList();
            if (this.t.e() != null) {
                arrayList = new ArrayList(this.t.e());
            }
            String b2 = C8126deW.b(this.j);
            if (C5062brf.d() || b2 == null || arrayList.size() == 5) {
                startActivity(this.profileSelectionLauncher.c((NetflixActivityBase) bj_, AppView.moreTab, true));
            } else {
                this.profileApi.a().a(bj_, b2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(C6705ciO.a aVar) {
        if (aVar == C6705ciO.a.C0116a.e) {
            d(false, true, true);
        } else {
            Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        C1044Mm.a("MoreFragment", "profileChange unsuccessful", th);
        Q();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        this.j = (NetflixActivity) getActivity();
        View inflate = layoutInflater.inflate(R.i.aD, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.g.fw);
        this.m = linearLayout;
        linearLayout.setOnClickListener(null);
        this.m.setClickable(false);
        b = a(requireContext(), C8310dhv.a());
        this.f13292o = new RG(inflate, new C1180Rt.d() { // from class: com.netflix.mediaclient.ui.more.MoreFragment.3
            @Override // o.C1180Rt.d
            public void e() {
            }
        });
        this.x = inflate.findViewById(R.g.gC);
        View findViewById = inflate.findViewById(R.g.cs);
        this.u = findViewById;
        if (findViewById != null) {
            C1203Sq c1203Sq = (C1203Sq) findViewById;
            String string = this.j.getString(R.o.hH);
            if (string.startsWith("'!#+")) {
                int i2 = B + 115;
                y = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[1];
                z(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            }
            c1203Sq.setText(string);
            c1203Sq.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), C1026Lt.a.cU), (Drawable) null, b, (Drawable) null);
            int i4 = y + 49;
            B = i4 % 128;
            int i5 = i4 % 2;
        }
        this.r = (ViewGroup) inflate.findViewById(R.g.dV);
        this.w = new C6705ciO(this.j, this.profileApi, (SA) inflate.findViewById(R.g.eN), ProcessLifecycleOwner.get());
        if (C8126deW.a()) {
            inflate.findViewById(R.g.dw).setVisibility(8);
            int i6 = y + 93;
            B = i6 % 128;
            int i7 = i6 % 2;
        } else {
            inflate.findViewById(R.g.dw).setOnClickListener(new View.OnClickListener() { // from class: o.ciH
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoreFragment.this.c(view);
                }
            });
        }
        this.f.add(this.w.a().subscribe(new Consumer() { // from class: o.ciE
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MoreFragment.this.c((C6705ciO.a) obj);
            }
        }, new Consumer() { // from class: o.ciL
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MoreFragment.this.c((Throwable) obj);
            }
        }));
        RecyclerView recyclerView = (RecyclerView) this.m.findViewById(R.g.m);
        this.e = recyclerView;
        recyclerView.setFocusable(false);
        K();
        d(this.n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        d(true, false, false);
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        d(InterfaceC1078Nw.aJ);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        return L();
    }

    private boolean L() {
        ServiceManager serviceManager = this.t;
        return serviceManager != null && serviceManager.c() && this.t.F();
    }

    private void Q() {
        if (!this.v || L()) {
            return;
        }
        C1044Mm.b("MoreFragment", "Showing content view...");
        this.f13292o.b(false);
        this.m.setVisibility(0);
        this.x.setVisibility(8);
        View view = getView();
        NetflixActivity bj_ = bj_();
        if (isHidden() || view == null || bj_ == null) {
            return;
        }
        view.setEnabled(true);
        if (view.getVisibility() == 0) {
            if (view.getAlpha() < 1.0f) {
                view.animate().alpha(1.0f).setDuration(150L).start();
            }
        } else {
            C8254dgs.d(view, false);
        }
        if (bj_.getBottomNavBar() != null) {
            bj_.getBottomNavBar().setEnabled(true);
        }
    }

    private void d(boolean z, boolean z2, boolean z3) {
        C1044Mm.b("MoreFragment", "Showing loading view...");
        if (!this.w.b() && z) {
            this.f13292o.a(false);
        }
        this.x.setVisibility(0);
        View view = getView();
        NetflixActivity bj_ = bj_();
        if (view != null) {
            view.setEnabled(false);
            if (z) {
                view.setVisibility(8);
            } else if (z2) {
                view.animate().alpha(0.4f).setDuration(400L).start();
            } else {
                view.setAlpha(0.4f);
            }
            if (!z3 || bj_.getBottomNavBar() == null) {
                return;
            }
            bj_.getBottomNavBar().setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        ServiceManager serviceManager = this.t;
        if (serviceManager != null) {
            UmaAlert x = serviceManager.x();
            this.l = x != null && !x.isConsumed() && x.blocking() && C6193cXh.d(requireContext(), x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        if (this.r == null) {
            C1044Mm.b("MoreFragment", "notificationsFragmentContainer is null - can't set visibility");
        } else if (z) {
            C1044Mm.b("MoreFragment", "Showing notifications header");
            this.r.setVisibility(0);
            this.u.setVisibility(0);
            c(true);
        } else {
            C8187dfe.e(this.k);
            C1044Mm.b("MoreFragment", "Hiding notifications header");
            this.r.setVisibility(8);
            this.u.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        final List<bRE.b> d = bRE.d(this.j);
        if (d.size() > 0) {
            a aVar = new a(getContext(), d);
            aVar.a(new a.d() { // from class: o.ciG
                @Override // com.netflix.mediaclient.ui.more.MoreFragment.a.d
                public final void d(View view, int i) {
                    MoreFragment.b(d, view, i);
                }
            });
            this.e.setAdapter(aVar);
            this.e.setVisibility(0);
            return;
        }
        this.e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(List list, View view, int i) {
        Runnable runnable;
        bRE.b bVar = (bRE.b) list.get(i);
        if (bVar == null || (runnable = bVar.e) == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        this.t = serviceManager;
        F();
        I();
        J();
        G();
        K();
        O();
        S();
        InterfaceC7141cqc interfaceC7141cqc = this.s;
        if (interfaceC7141cqc != null) {
            interfaceC7141cqc.onManagerReady(serviceManager, status);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
        InterfaceC7141cqc interfaceC7141cqc = this.s;
        if (interfaceC7141cqc != null) {
            interfaceC7141cqc.onManagerUnavailable(serviceManager, status);
        }
        this.t = null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.u;
        if (view != null && view.getVisibility() == 0) {
            c(true);
        }
        O();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("RefreshUserMessageRequest.ACTION_UMA_MESSAGE_UPDATED");
        intentFilter.addAction("RefreshUserMessageRequest.ACTION_UMA_MESSAGE_CONSUMED");
        LocalBroadcastManager.getInstance(this.j).registerReceiver(this.p, intentFilter);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        c(false);
        LocalBroadcastManager.getInstance(this.j).unregisterReceiver(this.p);
    }

    public void c(boolean z) {
        InterfaceC7141cqc interfaceC7141cqc = this.s;
        if (interfaceC7141cqc != null) {
            if (z && !this.q) {
                this.q = true;
                interfaceC7141cqc.e("MoreFragment");
                this.s.a(true);
                C8187dfe.a(this.k, OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME);
            } else if (z || !this.q) {
            } else {
                this.q = false;
                interfaceC7141cqc.a(false);
                this.s.d("MoreFragment");
                C8187dfe.e(this.k);
            }
        }
    }

    private boolean N() {
        ServiceManager serviceManager = this.t;
        if (serviceManager == null || !serviceManager.c()) {
            C1044Mm.b("MoreFragment", "Manager is not ready - can't update");
            return false;
        }
        return true;
    }

    private void O() {
        if (this.w.d()) {
            this.v = true;
            Q();
        }
    }

    private void I() {
        int i = 2 % 2;
        if (N()) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.ciJ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoreFragment.this.a(view);
                }
            };
            C1203Sq c1203Sq = (C1203Sq) this.m.findViewById(R.g.dQ);
            String string = this.j.getString(R.o.eu);
            Object obj = null;
            if (string.startsWith("'!#+")) {
                int i2 = y + 95;
                B = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    z(string.substring(4), objArr);
                    ((String) objArr[0]).intern();
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr2 = new Object[1];
                z(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            c1203Sq.setText(string);
            c1203Sq.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), C1026Lt.a.yv), (Drawable) null, b, (Drawable) null);
            c1203Sq.setOnClickListener(onClickListener);
            c1203Sq.setVisibility(0);
            int i3 = B + 63;
            y = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        if (this.l) {
            return;
        }
        requireContext().startActivity(this.myList.e(false));
    }

    private void J() {
        int i = 2 % 2;
        if (N()) {
            int i2 = y + 15;
            B = i2 % 128;
            int i3 = i2 % 2;
            if (aQJ.j().e()) {
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.ciI
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MoreFragment.this.b(view);
                    }
                };
                C1203Sq c1203Sq = (C1203Sq) this.m.findViewById(R.g.gQ);
                String string = this.j.getString(R.o.gI);
                Object obj = null;
                if (string.startsWith("'!#+")) {
                    int i4 = B + 23;
                    y = i4 % 128;
                    if (i4 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        z(string.substring(4), objArr);
                        ((String) objArr[0]).intern();
                        obj.hashCode();
                        throw null;
                    }
                    Object[] objArr2 = new Object[1];
                    z(string.substring(4), objArr2);
                    string = ((String) objArr2[0]).intern();
                }
                c1203Sq.setText(string);
                c1203Sq.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), C1026Lt.a.dp), (Drawable) null, b, (Drawable) null);
                c1203Sq.setOnClickListener(onClickListener);
                c1203Sq.setVisibility(0);
            }
        }
        int i5 = y + 3;
        B = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.l) {
            return;
        }
        requireContext().startActivity(this.userMarks.e());
    }

    private void G() {
        if (N() && this.j.showSignOutInMenu()) {
            C1203Sq c1203Sq = (C1203Sq) this.m.findViewById(R.g.fN);
            final Runnable runnable = new Runnable() { // from class: o.ciC
                @Override // java.lang.Runnable
                public final void run() {
                    MoreFragment.this.M();
                }
            };
            c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.ciz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
            c1203Sq.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        this.loginApi.d(this.j);
    }

    private void F() {
        if (N()) {
            this.t.j().c(true);
            if (!C8126deW.a()) {
                C1044Mm.b("MoreFragment", "Inflating notifications into layout");
                this.r.setVisibility(0);
                InterfaceC7141cqc interfaceC7141cqc = (InterfaceC7141cqc) getChildFragmentManager().findFragmentByTag("NOTIFICATIONS_FRAGMENT");
                this.s = interfaceC7141cqc;
                if (interfaceC7141cqc == null) {
                    this.s = this.notificationsUi.e();
                    getChildFragmentManager().beginTransaction().add(R.g.dV, (Fragment) this.s, "NOTIFICATIONS_FRAGMENT").commitNowAllowingStateLoss();
                }
                this.s.b(new InterfaceC7081cpV() { // from class: o.ciF
                    @Override // o.InterfaceC7081cpV
                    public final void d(boolean z) {
                        MoreFragment.this.e(z);
                    }
                });
                C1044Mm.b("MoreFragment", "Notifications frag: " + this.s);
                e(this.s.e());
                this.m.findViewById(R.g.cs).setOnClickListener(new View.OnClickListener() { // from class: o.ciD
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MoreFragment.this.d(view);
                    }
                });
                this.s.P();
                return;
            }
            this.u.setVisibility(8);
            this.r.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.j.startActivity(new Intent(this.j, this.notificationsUi.c()));
    }

    private Drawable a(Context context, boolean z) {
        Drawable mutate = ContextCompat.getDrawable(context, z ? C1026Lt.a.gu : C1026Lt.a.gx).mutate();
        mutate.setColorFilter(ContextCompat.getColor(context, C9834xU.c.B), PorterDuff.Mode.SRC_IN);
        int dimension = (int) context.getResources().getDimension(C9834xU.a.aa);
        return new InsetDrawable(mutate, dimension, dimension, dimension, dimension);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.Adapter<b> {
        private d a;
        private final LayoutInflater b;
        private final List<bRE.b> d;
        private final Context e;

        /* loaded from: classes4.dex */
        public interface d {
            void d(View view, int i);
        }

        void a(d dVar) {
            this.a = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        a(Context context, List<bRE.b> list) {
            this.e = context;
            this.b = LayoutInflater.from(context);
            this.d = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new b(this.b.inflate(R.i.aG, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a */
        public void onBindViewHolder(b bVar, int i) {
            bRE.b bVar2 = this.d.get(i);
            bVar.a.setText(bVar2.b);
            bVar.a.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(this.e, bVar2.c.intValue()), (Drawable) null, MoreFragment.b, (Drawable) null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.d.size();
        }

        /* loaded from: classes4.dex */
        public class b extends RecyclerView.ViewHolder implements View.OnClickListener {
            C1203Sq a;

            b(View view) {
                super(view);
                C1203Sq c1203Sq = (C1203Sq) view;
                this.a = c1203Sq;
                c1203Sq.setOnClickListener(this);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.this.a != null) {
                    a.this.a.d(view, getAbsoluteAdapterPosition());
                }
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        if (this.j.hasBottomNavBar()) {
            C9870yD.d(view, 1, this.i);
        } else {
            C9870yD.d(view, 1, this.i + ((NetflixFrag) this).d);
        }
        C9870yD.d(view, 3, this.h);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return AppView.accountMenu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        if (r1.startsWith("'!#+") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
        r5 = com.netflix.mediaclient.ui.more.MoreFragment.B + 83;
        com.netflix.mediaclient.ui.more.MoreFragment.y = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
        if ((r5 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
        r0 = r1.substring(4);
        r1 = new java.lang.Object[1];
        z(r0, r1);
        r1 = ((java.lang.String) r1[0]).intern();
        r0 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
        r0 = r1.substring(4);
        r1 = new java.lang.Object[1];
        z(r0, r1);
        r1 = ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (r1.startsWith("'!#+") != false) goto L10;
     */
    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean bD_() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.ui.more.MoreFragment.y
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.netflix.mediaclient.ui.more.MoreFragment.B = r2
            int r1 = r1 % r0
            com.netflix.mediaclient.android.activity.NetflixActivity r1 = r8.j
            com.netflix.mediaclient.android.widget.NetflixActionBar r2 = r1.getNetflixActionBar()
            r3 = 0
            if (r2 == 0) goto L92
            int r4 = com.netflix.mediaclient.ui.more.MoreFragment.y
            int r4 = r4 + 61
            int r5 = r4 % 128
            com.netflix.mediaclient.ui.more.MoreFragment.B = r5
            int r4 = r4 % r0
            java.lang.String r5 = "'!#+"
            r6 = 1
            if (r4 != 0) goto L3c
            com.netflix.mediaclient.android.widget.NetflixActionBar$b$b r4 = r1.getActionBarStateBuilder()
            com.netflix.mediaclient.android.widget.NetflixActionBar$b$b r4 = r4.b(r3)
            com.netflix.mediaclient.android.widget.NetflixActionBar$b$b r4 = r4.l(r3)
            int r7 = com.netflix.mediaclient.ui.R.o.kQ
            java.lang.String r1 = r1.getString(r7)
            boolean r5 = r1.startsWith(r5)
            if (r5 == 0) goto L86
            goto L54
        L3c:
            com.netflix.mediaclient.android.widget.NetflixActionBar$b$b r4 = r1.getActionBarStateBuilder()
            com.netflix.mediaclient.android.widget.NetflixActionBar$b$b r4 = r4.b(r3)
            com.netflix.mediaclient.android.widget.NetflixActionBar$b$b r4 = r4.l(r6)
            int r7 = com.netflix.mediaclient.ui.R.o.kQ
            java.lang.String r1 = r1.getString(r7)
            boolean r5 = r1.startsWith(r5)
            if (r5 == 0) goto L86
        L54:
            int r5 = com.netflix.mediaclient.ui.more.MoreFragment.B
            int r5 = r5 + 83
            int r7 = r5 % 128
            com.netflix.mediaclient.ui.more.MoreFragment.y = r7
            int r5 = r5 % r0
            r0 = 4
            if (r5 == 0) goto L75
            java.lang.String r0 = r1.substring(r0)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r8.z(r0, r1)
            r0 = r1[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.intern()
            r0 = 63
            int r0 = r0 / r3
            goto L86
        L75:
            java.lang.String r0 = r1.substring(r0)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r8.z(r0, r1)
            r0 = r1[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.intern()
        L86:
            com.netflix.mediaclient.android.widget.NetflixActionBar$b$b r0 = r4.e(r1)
            com.netflix.mediaclient.android.widget.NetflixActionBar$b r0 = r0.c()
            r2.c(r0)
            return r6
        L92:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.more.MoreFragment.bD_():boolean");
    }

    private void z(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$5124);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
