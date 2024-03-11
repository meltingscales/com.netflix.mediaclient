package o;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.text.Cue;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.player.subtitles.SizeMapping;
import com.netflix.mediaclient.service.player.subtitles.text.OpacityMapping;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.SubtitlePreference;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.hilt.android.AndroidEntryPoint;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C5972cPf;
import o.C5980cPn;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1640aIu;
import o.InterfaceC5283bvo;
import o.InterfaceC5284bvp;
import o.RG;
import o.dpR;

@AndroidEntryPoint
/* renamed from: o.cPf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5972cPf extends AbstractC5968cPb {
    public static final d b;
    private static final Map<String, Integer> e;
    private static byte e$ss2$4510 = 0;
    private static int p = 1;
    private static int s;
    private final AppView j;
    private final InterfaceC8554dpx k;
    private final boolean l;
    private e m;
    private InterfaceC5283bvo n;

    /* renamed from: o  reason: collision with root package name */
    private final a f13690o;
    private InterfaceC5284bvp q;

    static void a() {
        e$ss2$4510 = (byte) 24;
    }

    private final String c(boolean z) {
        return z ? "SEMI_TRANSPARENT" : "OPAQUE";
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.j;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.l;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    public C5972cPf() {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.profilesubtitleappearance.impl.ProfileSubtitleAppearanceFragment$profileId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final String invoke() {
                String string = C5972cPf.this.requireArguments().getString("extra_profile_id");
                if (string != null) {
                    return string;
                }
                throw new IllegalArgumentException("profileId cannot be null".toString());
            }
        });
        this.k = b2;
        this.f13690o = new a();
        this.j = AppView.subtitlesStyleSelector;
    }

    /* renamed from: o.cPf$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ProfileSubtitleAppearance");
        }

        public final C5972cPf a(Bundle bundle) {
            C5972cPf c5972cPf = new C5972cPf();
            c5972cPf.setArguments(bundle);
            return c5972cPf;
        }
    }

    static {
        Map<String, Integer> c;
        a();
        b = new d(null);
        c = dqE.c(dpD.a("SMALL", Integer.valueOf(C5980cPn.d.r)), dpD.a("MEDIUM", Integer.valueOf(C5980cPn.d.l)), dpD.a("LARGE", Integer.valueOf(C5980cPn.d.f13691o)));
        e = c;
    }

    /* renamed from: o.cPf$e */
    /* loaded from: classes4.dex */
    public static final class e {
        private final C5982cPp c;
        private RG e;

        public final RG a() {
            return this.e;
        }

        public final void b(RG rg) {
            this.e = rg;
        }

        public final C5982cPp e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            RG rg = this.e;
            return (hashCode * 31) + (rg == null ? 0 : rg.hashCode());
        }

        public String toString() {
            C5982cPp c5982cPp = this.c;
            RG rg = this.e;
            return "Holder(viewBinding=" + c5982cPp + ", loadingAndErrorWrapper=" + rg + ")";
        }

        public e(C5982cPp c5982cPp, RG rg) {
            C8632dsu.c((Object) c5982cPp, "");
            this.c = c5982cPp;
            this.e = rg;
        }

        public /* synthetic */ e(C5982cPp c5982cPp, RG rg, int i, C8627dsp c8627dsp) {
            this(c5982cPp, (i & 2) != 0 ? null : rg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e() {
        return (String) this.k.getValue();
    }

    /* renamed from: o.cPf$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5164btb {
        a() {
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void d(Status status, AccountData accountData) {
            ServiceManager bl_;
            UserAgent u;
            C8632dsu.c((Object) status, "");
            if (!status.i() && (bl_ = C5972cPf.this.bl_()) != null && (u = bl_.u()) != null) {
                u.b((InterfaceC5018bqo) null);
            }
            NetflixActivity bj_ = C5972cPf.this.bj_();
            if (bj_ == null || !C5972cPf.this.bn_()) {
                return;
            }
            if (status.i()) {
                InterfaceC1640aIu.b.a(InterfaceC1640aIu.d, bj_, status, false, 4, null);
                bj_.setResult(0);
            } else {
                bj_.setResult(-1, new Intent().putExtra(cMY.a(), C5972cPf.this.e()));
            }
            bj_.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        InterfaceC5284bvp subtitlePreference;
        List<? extends InterfaceC5283bvo> b2;
        super.onCreate(bundle);
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo interfaceC5283bvo = null;
        if (k != null && (b2 = k.b()) != null) {
            Iterator<T> it = b2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C8632dsu.c((Object) ((InterfaceC5283bvo) next).getProfileGuid(), (Object) e())) {
                    interfaceC5283bvo = next;
                    break;
                }
            }
            interfaceC5283bvo = interfaceC5283bvo;
        }
        this.n = interfaceC5283bvo;
        if (interfaceC5283bvo == null || (subtitlePreference = interfaceC5283bvo.getSubtitlePreference()) == null) {
            return;
        }
        this.q = new SubtitlePreference(subtitlePreference.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        C5982cPp d2 = C5982cPp.d(layoutInflater, viewGroup, false);
        C8632dsu.a(d2, "");
        this.m = new e(d2, null, 2, null);
        ConstraintLayout c = d2.c();
        C8632dsu.a(c, "");
        return c;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        List<Cue> e2;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
        C8632dsu.a(netflixImmutableStatus, "");
        d(netflixImmutableStatus);
        e eVar = this.m;
        if (eVar != null) {
            RG rg = new RG(eVar.e().f, null);
            rg.b(false);
            eVar.b(rg);
            C5983cPq c5983cPq = eVar.e().h;
            c5983cPq.setSubtitleDisplayArea(null, eVar.e().f);
            c5983cPq.setTextSizeMultiple(1.67f);
            c5983cPq.b(new Rect(0, 0, 0, 0));
            String string = c5983cPq.getContext().getString(C5980cPn.c.a);
            C8632dsu.a(string, "");
            e2 = C8566dqi.e(new Cue.Builder().setText(string).build());
            c5983cPq.setCues(e2);
            InterfaceC5284bvp interfaceC5284bvp = this.q;
            if (interfaceC5284bvp != null) {
                b(interfaceC5284bvp);
                e(interfaceC5284bvp);
            }
            a(eVar.e());
        }
    }

    private final void a(C5982cPp c5982cPp) {
        c5982cPp.q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.cPe
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                C5972cPf.b(C5972cPf.this, radioGroup, i);
            }
        });
        c5982cPp.k.setColorChangedListener(new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.profilesubtitleappearance.impl.ProfileSubtitleAppearanceFragment$setupListeners$2$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str) {
                e(str);
                return dpR.c;
            }

            public final void e(String str) {
                InterfaceC5284bvp interfaceC5284bvp;
                InterfaceC5284bvp charColor;
                C8632dsu.c((Object) str, "");
                interfaceC5284bvp = C5972cPf.this.q;
                if (interfaceC5284bvp == null || (charColor = interfaceC5284bvp.setCharColor(str)) == null) {
                    return;
                }
                C5972cPf c5972cPf = C5972cPf.this;
                c5972cPf.q = charColor;
                c5972cPf.b(charColor);
            }
        });
        c5982cPp.g.setStyleChangedListener(new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.profilesubtitleappearance.impl.ProfileSubtitleAppearanceFragment$setupListeners$3$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str) {
                e(str);
                return dpR.c;
            }

            public final void e(String str) {
                InterfaceC5284bvp interfaceC5284bvp;
                InterfaceC5284bvp charEdgeAttrs;
                C8632dsu.c((Object) str, "");
                interfaceC5284bvp = C5972cPf.this.q;
                if (interfaceC5284bvp == null || (charEdgeAttrs = interfaceC5284bvp.setCharEdgeAttrs(str)) == null) {
                    return;
                }
                C5972cPf c5972cPf = C5972cPf.this;
                c5972cPf.q = charEdgeAttrs;
                c5972cPf.b(charEdgeAttrs);
            }
        });
        c5982cPp.c.setColorChangedListener(new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.profilesubtitleappearance.impl.ProfileSubtitleAppearanceFragment$setupListeners$4$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str) {
                b(str);
                return dpR.c;
            }

            public final void b(String str) {
                InterfaceC5284bvp interfaceC5284bvp;
                InterfaceC5284bvp charEdgeColor;
                C8632dsu.c((Object) str, "");
                interfaceC5284bvp = C5972cPf.this.q;
                if (interfaceC5284bvp == null || (charEdgeColor = interfaceC5284bvp.setCharEdgeColor(str)) == null) {
                    return;
                }
                C5972cPf c5972cPf = C5972cPf.this;
                c5972cPf.q = charEdgeColor;
                c5972cPf.b(charEdgeColor);
            }
        });
        c5982cPp.b.setColorChangedListener(new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.profilesubtitleappearance.impl.ProfileSubtitleAppearanceFragment$setupListeners$5$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str) {
                d(str);
                return dpR.c;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
                r0 = r2.b.q;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void d(java.lang.String r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r3, r0)
                    o.cPf r0 = o.C5972cPf.this
                    java.lang.String r3 = o.C5972cPf.e(r0, r3)
                    if (r3 != 0) goto L1f
                    o.cPf r0 = o.C5972cPf.this
                    o.bvp r0 = o.C5972cPf.d(r0)
                    if (r0 == 0) goto L4a
                    com.netflix.mediaclient.graphql.models.type.SubtitleOpacity r1 = com.netflix.mediaclient.graphql.models.type.SubtitleOpacity.e
                    java.lang.String r1 = r1.c()
                    r0.setBackgroundOpacity(r1)
                    goto L4a
                L1f:
                    o.cPf r0 = o.C5972cPf.this
                    o.bvp r0 = o.C5972cPf.d(r0)
                    if (r0 == 0) goto L2c
                    java.lang.String r0 = r0.getBackgroundOpacity()
                    goto L2d
                L2c:
                    r0 = 0
                L2d:
                    com.netflix.mediaclient.graphql.models.type.SubtitleOpacity r1 = com.netflix.mediaclient.graphql.models.type.SubtitleOpacity.e
                    java.lang.String r1 = r1.c()
                    boolean r0 = o.C8632dsu.c(r0, r1)
                    if (r0 == 0) goto L4a
                    o.cPf r0 = o.C5972cPf.this
                    o.bvp r0 = o.C5972cPf.d(r0)
                    if (r0 == 0) goto L4a
                    com.netflix.mediaclient.graphql.models.type.SubtitleOpacity r1 = com.netflix.mediaclient.graphql.models.type.SubtitleOpacity.c
                    java.lang.String r1 = r1.c()
                    r0.setBackgroundOpacity(r1)
                L4a:
                    o.cPf r0 = o.C5972cPf.this
                    o.bvp r0 = o.C5972cPf.d(r0)
                    if (r0 == 0) goto L60
                    o.bvp r3 = r0.setBackgroundColor(r3)
                    if (r3 == 0) goto L60
                    o.cPf r0 = o.C5972cPf.this
                    o.C5972cPf.b(r0, r3)
                    o.C5972cPf.d(r0, r3)
                L60:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profilesubtitleappearance.impl.ProfileSubtitleAppearanceFragment$setupListeners$5$1.d(java.lang.String):void");
            }
        });
        c5982cPp.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.cPg
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C5972cPf.e(C5972cPf.this, compoundButton, z);
            }
        });
        c5982cPp.s.setColorChangedListener(new drM<String, dpR>() { // from class: com.netflix.mediaclient.ui.profilesubtitleappearance.impl.ProfileSubtitleAppearanceFragment$setupListeners$7$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(String str) {
                c(str);
                return dpR.c;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
                r0 = r2.c.q;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void c(java.lang.String r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r3, r0)
                    o.cPf r0 = o.C5972cPf.this
                    java.lang.String r3 = o.C5972cPf.e(r0, r3)
                    if (r3 != 0) goto L1f
                    o.cPf r0 = o.C5972cPf.this
                    o.bvp r0 = o.C5972cPf.d(r0)
                    if (r0 == 0) goto L4a
                    com.netflix.mediaclient.graphql.models.type.SubtitleOpacity r1 = com.netflix.mediaclient.graphql.models.type.SubtitleOpacity.e
                    java.lang.String r1 = r1.c()
                    r0.setWindowOpacity(r1)
                    goto L4a
                L1f:
                    o.cPf r0 = o.C5972cPf.this
                    o.bvp r0 = o.C5972cPf.d(r0)
                    if (r0 == 0) goto L2c
                    java.lang.String r0 = r0.getWindowOpacity()
                    goto L2d
                L2c:
                    r0 = 0
                L2d:
                    com.netflix.mediaclient.graphql.models.type.SubtitleOpacity r1 = com.netflix.mediaclient.graphql.models.type.SubtitleOpacity.e
                    java.lang.String r1 = r1.c()
                    boolean r0 = o.C8632dsu.c(r0, r1)
                    if (r0 == 0) goto L4a
                    o.cPf r0 = o.C5972cPf.this
                    o.bvp r0 = o.C5972cPf.d(r0)
                    if (r0 == 0) goto L4a
                    com.netflix.mediaclient.graphql.models.type.SubtitleOpacity r1 = com.netflix.mediaclient.graphql.models.type.SubtitleOpacity.c
                    java.lang.String r1 = r1.c()
                    r0.setWindowOpacity(r1)
                L4a:
                    o.cPf r0 = o.C5972cPf.this
                    o.bvp r0 = o.C5972cPf.d(r0)
                    if (r0 == 0) goto L60
                    o.bvp r3 = r0.setWindowColor(r3)
                    if (r3 == 0) goto L60
                    o.cPf r0 = o.C5972cPf.this
                    o.C5972cPf.b(r0, r3)
                    o.C5972cPf.d(r0, r3)
                L60:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profilesubtitleappearance.impl.ProfileSubtitleAppearanceFragment$setupListeners$7$1.c(java.lang.String):void");
            }
        });
        c5982cPp.t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.cPd
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C5972cPf.c(C5972cPf.this, compoundButton, z);
            }
        });
        c5982cPp.m.setOnClickListener(new View.OnClickListener() { // from class: o.cPj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5972cPf.a(C5972cPf.this, view);
            }
        });
        c5982cPp.i.setOnClickListener(new View.OnClickListener() { // from class: o.cPk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5972cPf.b(C5972cPf.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5972cPf c5972cPf, RadioGroup radioGroup, int i) {
        C8632dsu.c((Object) c5972cPf, "");
        c5972cPf.c(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5972cPf c5972cPf, CompoundButton compoundButton, boolean z) {
        InterfaceC5284bvp backgroundOpacity;
        C8632dsu.c((Object) c5972cPf, "");
        InterfaceC5284bvp interfaceC5284bvp = c5972cPf.q;
        if (interfaceC5284bvp == null || (backgroundOpacity = interfaceC5284bvp.setBackgroundOpacity(c5972cPf.c(z))) == null) {
            return;
        }
        c5972cPf.q = backgroundOpacity;
        c5972cPf.b(backgroundOpacity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C5972cPf c5972cPf, CompoundButton compoundButton, boolean z) {
        InterfaceC5284bvp windowOpacity;
        C8632dsu.c((Object) c5972cPf, "");
        InterfaceC5284bvp interfaceC5284bvp = c5972cPf.q;
        if (interfaceC5284bvp == null || (windowOpacity = interfaceC5284bvp.setWindowOpacity(c5972cPf.c(z))) == null) {
            return;
        }
        c5972cPf.q = windowOpacity;
        c5972cPf.b(windowOpacity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5972cPf c5972cPf, View view) {
        C8632dsu.c((Object) c5972cPf, "");
        c5972cPf.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5972cPf c5972cPf, View view) {
        C8632dsu.c((Object) c5972cPf, "");
        SubtitlePreference subtitlePreference = new SubtitlePreference("{\n                \"charColor\": \"white\",\n                \"charOpacity\": \"OPAQUE\",\n                \"charSize\": \"MEDIUM\",\n                \"charStyle\": \"proportional_sans_serif\",\n                \"charEdgeAttrs\": \"DROP_SHADOW\",\n                \"charEdgeColor\": \"black\",\n                \"backgroundColor\": \"null\",\n                \"backgroundOpacity\": \"OPAQUE\",\n                \"windowColor\": \"null\",\n                \"windowOpacity\": \"OPAQUE\"\n            }");
        c5972cPf.q = subtitlePreference;
        c5972cPf.e(subtitlePreference);
        c5972cPf.b(subtitlePreference);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RG a2;
        e eVar = this.m;
        if (eVar != null && (a2 = eVar.a()) != null) {
            a2.b(false);
        }
        this.m = null;
        super.onDestroyView();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        int i = 2 % 2;
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            NetflixActionBar.b.C0051b actionBarStateBuilder = bj_.getActionBarStateBuilder();
            NetflixActionBar.b.C0051b k = actionBarStateBuilder.k(true);
            String string = bj_.getString(com.netflix.mediaclient.ui.R.o.D);
            if (string.startsWith("'!#+")) {
                int i2 = s + 45;
                p = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    r(string.substring(4), objArr);
                    ((String) objArr[0]).intern();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr2 = new Object[1];
                r(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            NetflixActionBar.b.C0051b b2 = k.b(string);
            String string2 = bj_.getString(C5980cPn.c.c);
            if (string2.startsWith("'!#+")) {
                Object[] objArr3 = new Object[1];
                r(string2.substring(4), objArr3);
                string2 = ((String) objArr3[0]).intern();
            }
            b2.e((CharSequence) string2);
            NetflixActionBar netflixActionBar = bj_.getNetflixActionBar();
            if (netflixActionBar != null) {
                int i3 = s + 89;
                p = i3 % 128;
                int i4 = i3 % 2;
                netflixActionBar.c(actionBarStateBuilder.c());
            }
        }
        return true;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        InterfaceC5284bvp interfaceC5284bvp = this.q;
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        if (c(interfaceC5284bvp, interfaceC5283bvo != null ? interfaceC5283bvo.getSubtitlePreference() : null)) {
            FragmentActivity activity = getActivity();
            C8632dsu.d(activity);
            new AlertDialog.Builder(activity, C9834xU.o.c).setMessage(C5980cPn.c.d).setPositiveButton(C5980cPn.c.b, new DialogInterface.OnClickListener() { // from class: o.cPi
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C5972cPf.a(C5972cPf.this, dialogInterface, i);
                }
            }).setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, new DialogInterface.OnClickListener() { // from class: o.cPh
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C5972cPf.c(C5972cPf.this, dialogInterface, i);
                }
            }).show();
            return true;
        }
        return super.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5972cPf c5972cPf, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c5972cPf, "");
        c5972cPf.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C5972cPf c5972cPf, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c5972cPf, "");
        FragmentActivity activity = c5972cPf.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void G() {
        dpR dpr = (dpR) C9726vo.d(this.n, this.q, new drX<InterfaceC5283bvo, InterfaceC5284bvp, dpR>() { // from class: com.netflix.mediaclient.ui.profilesubtitleappearance.impl.ProfileSubtitleAppearanceFragment$performSave$1
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: d */
            public final dpR invoke(InterfaceC5283bvo interfaceC5283bvo, InterfaceC5284bvp interfaceC5284bvp) {
                C5972cPf.e eVar;
                C5972cPf.a aVar;
                RG a2;
                C8632dsu.c((Object) interfaceC5283bvo, "");
                C8632dsu.c((Object) interfaceC5284bvp, "");
                eVar = C5972cPf.this.m;
                if (eVar != null && (a2 = eVar.a()) != null) {
                    a2.a(true);
                }
                ServiceManager bl_ = C5972cPf.this.bl_();
                if (bl_ != null) {
                    String profileGuid = interfaceC5283bvo.getProfileGuid();
                    aVar = C5972cPf.this.f13690o;
                    bl_.a(profileGuid, interfaceC5284bvp, aVar);
                    return dpR.c;
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(InterfaceC5284bvp interfaceC5284bvp) {
        UserAgent k;
        e eVar = this.m;
        if (eVar == null || (k = AbstractApplicationC1040Mh.getInstance().i().k()) == null) {
            return;
        }
        eVar.e().h.b(interfaceC5284bvp, k.k());
    }

    private final void e(InterfaceC5284bvp interfaceC5284bvp) {
        UserAgent k;
        e eVar = this.m;
        if (eVar == null || (k = AbstractApplicationC1040Mh.getInstance().i().k()) == null) {
            return;
        }
        String charColor = interfaceC5284bvp.getCharColor();
        String str = null;
        if (charColor == null) {
            InterfaceC5284bvp k2 = k.k();
            charColor = k2 != null ? k2.getCharColor() : null;
        }
        eVar.e().k.setSelectionFromColor(charColor);
        String charEdgeColor = interfaceC5284bvp.getCharEdgeColor();
        if (charEdgeColor == null) {
            InterfaceC5284bvp k3 = k.k();
            charEdgeColor = k3 != null ? k3.getCharEdgeColor() : null;
        }
        eVar.e().c.setSelectionFromColor(charEdgeColor);
        String charEdgeAttrs = interfaceC5284bvp.getCharEdgeAttrs();
        if (charEdgeAttrs == null) {
            InterfaceC5284bvp k4 = k.k();
            charEdgeAttrs = k4 != null ? k4.getCharEdgeAttrs() : null;
        }
        eVar.e().g.setSelectionFromStyle(charEdgeAttrs);
        String backgroundColor = interfaceC5284bvp.getBackgroundColor();
        if (backgroundColor == null) {
            InterfaceC5284bvp k5 = k.k();
            backgroundColor = k5 != null ? k5.getBackgroundColor() : null;
        }
        eVar.e().b.setSelectionFromColor(backgroundColor);
        SwitchCompat switchCompat = eVar.e().e;
        String backgroundOpacity = interfaceC5284bvp.getBackgroundOpacity();
        if (backgroundOpacity == null) {
            InterfaceC5284bvp k6 = k.k();
            backgroundOpacity = k6 != null ? k6.getBackgroundOpacity() : null;
        }
        switchCompat.setChecked(a(backgroundOpacity));
        String windowColor = interfaceC5284bvp.getWindowColor();
        if (windowColor == null) {
            InterfaceC5284bvp k7 = k.k();
            windowColor = k7 != null ? k7.getWindowColor() : null;
        }
        eVar.e().s.setSelectionFromColor(windowColor);
        SwitchCompat switchCompat2 = eVar.e().t;
        String windowOpacity = interfaceC5284bvp.getWindowOpacity();
        if (windowOpacity == null) {
            InterfaceC5284bvp k8 = k.k();
            if (k8 != null) {
                str = k8.getWindowOpacity();
            }
        } else {
            str = windowOpacity;
        }
        switchCompat2.setChecked(a(str));
        eVar.e().q.check(e.getOrDefault(interfaceC5284bvp.getCharSize(), Integer.valueOf(C5980cPn.d.l)).intValue());
    }

    private final void c(int i) {
        String d2;
        InterfaceC5284bvp interfaceC5284bvp = this.q;
        if (interfaceC5284bvp != null) {
            if (i == C5980cPn.d.f13691o) {
                d2 = SizeMapping.large.d();
            } else if (i == C5980cPn.d.r) {
                d2 = SizeMapping.small.d();
            } else {
                d2 = SizeMapping.medium.d();
            }
            C8632dsu.d((Object) d2);
            interfaceC5284bvp.setCharSize(d2);
            b(interfaceC5284bvp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(String str) {
        if (C8632dsu.c((Object) str, (Object) "null")) {
            return null;
        }
        return str;
    }

    private final boolean a(String str) {
        return C8632dsu.c(OpacityMapping.b(str), OpacityMapping.semiTransparent.c());
    }

    private final boolean c(InterfaceC5284bvp interfaceC5284bvp, InterfaceC5284bvp interfaceC5284bvp2) {
        if (interfaceC5284bvp != null && interfaceC5284bvp2 != null) {
            UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
            InterfaceC5284bvp k2 = k != null ? k.k() : null;
            boolean b2 = b(interfaceC5284bvp.getBackgroundColor(), interfaceC5284bvp2.getBackgroundColor(), k2 != null ? k2.getBackgroundColor() : null);
            boolean b3 = b(interfaceC5284bvp.getBackgroundOpacity(), interfaceC5284bvp2.getBackgroundOpacity(), k2 != null ? k2.getBackgroundOpacity() : null);
            boolean b4 = b(interfaceC5284bvp.getCharColor(), interfaceC5284bvp2.getCharColor(), k2 != null ? k2.getCharColor() : null);
            boolean b5 = b(interfaceC5284bvp.getCharEdgeAttrs(), interfaceC5284bvp2.getCharEdgeAttrs(), k2 != null ? k2.getCharEdgeAttrs() : null);
            boolean b6 = b(interfaceC5284bvp.getCharEdgeColor(), interfaceC5284bvp2.getCharEdgeColor(), k2 != null ? k2.getCharEdgeColor() : null);
            boolean b7 = b(interfaceC5284bvp.getCharSize(), interfaceC5284bvp2.getCharSize(), k2 != null ? k2.getCharSize() : null);
            boolean b8 = b(interfaceC5284bvp.getWindowColor(), interfaceC5284bvp2.getWindowColor(), k2 != null ? k2.getWindowColor() : null);
            boolean b9 = b(interfaceC5284bvp.getWindowOpacity(), interfaceC5284bvp2.getWindowOpacity(), k2 != null ? k2.getWindowOpacity() : null);
            if (b2 || b3 || b4 || b7 || b5 || b6 || b8 || b9) {
                return true;
            }
        }
        return false;
    }

    private final boolean b(String str, String str2, String str3) {
        if (str2 == null) {
            str2 = str3;
        }
        return (str == null || C8632dsu.c((Object) str, (Object) str2)) ? false : true;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d, view.getPaddingRight(), this.h);
    }

    private void r(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$4510);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
