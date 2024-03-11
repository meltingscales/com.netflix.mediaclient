package com.netflix.mediaclient.ui.profiles;

import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.ProfileSettings;
import com.netflix.cl.model.event.session.action.AddProfile;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.profiles.AddProfileFragment;
import com.netflix.mediaclient.ui.profiles.ProfileCreator;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import dagger.hilt.android.AndroidEntryPoint;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import o.AbstractC1608aHp;
import o.AbstractC5164btb;
import o.C1045Mp;
import o.C1174Rn;
import o.C1332Xp;
import o.C1336Xt;
import o.C5856cKx;
import o.C5928cNo;
import o.C5934cNu;
import o.C5952cOl;
import o.C7017coI;
import o.C8054ddD;
import o.C8145dep;
import o.C8563dqf;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C9726vo;
import o.C9834xU;
import o.InterfaceC1078Nw;
import o.InterfaceC1640aIu;
import o.InterfaceC5018bqo;
import o.InterfaceC5283bvo;
import o.InterfaceC5958cOs;
import o.MP;
import o.RG;
import o.bXE;
import o.cLQ;
import o.cMY;
import o.dpR;
import o.dqN;
import o.duD;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class AddProfileFragment extends cLQ {
    public static final c b;
    public static final int e;
    private static byte e$ss2$4815 = 0;
    private static int u = 0;
    private static int y = 1;
    private final AppView j;
    private AvatarInfo k;
    private boolean l;
    @Inject
    public InterfaceC5958cOs lolopi;
    private boolean m;
    private b n;

    /* renamed from: o  reason: collision with root package name */
    private AvatarInfo f13309o;
    private final j p;
    private final i q;
    private Set<String> r;
    private boolean s;
    private boolean t;

    static {
        e();
        b = new c(null);
        e = 8;
    }

    static void e() {
        e$ss2$4815 = (byte) 24;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.j;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.m;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("AddProfileFragment");
        }
    }

    public AddProfileFragment() {
        Set<String> e2;
        e2 = dqN.e();
        this.r = e2;
        this.m = true;
        this.q = new i();
        this.p = new j();
        this.j = AppView.addProfile;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {
        private RG a;
        private C5856cKx e;

        public final C5856cKx a() {
            return this.e;
        }

        public final RG c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            C5856cKx c5856cKx = this.e;
            RG rg = this.a;
            return "Holder(viewBinding=" + c5856cKx + ", loadingAndErrorWrapper=" + rg + ")";
        }

        public b(C5856cKx c5856cKx, RG rg) {
            C8632dsu.c((Object) c5856cKx, "");
            C8632dsu.c((Object) rg, "");
            this.e = c5856cKx;
            this.a = rg;
        }
    }

    public final InterfaceC5958cOs a() {
        InterfaceC5958cOs interfaceC5958cOs = this.lolopi;
        if (interfaceC5958cOs != null) {
            return interfaceC5958cOs;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC5164btb {
        i() {
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void d(Status status, AccountData accountData) {
            Collection i;
            List g;
            Object x;
            UserAgent userAgent;
            C8632dsu.c((Object) status, "");
            NetflixActivity by_ = AddProfileFragment.this.by_();
            String str = null;
            if (!status.i()) {
                if ((!AddProfileFragment.this.r.isEmpty()) && accountData != null) {
                    List<InterfaceC5283bvo> userProfiles = accountData.getUserProfiles();
                    if (userProfiles == null) {
                        i = C8569dql.i();
                    } else {
                        i = new ArrayList();
                        for (InterfaceC5283bvo interfaceC5283bvo : userProfiles) {
                            String profileGuid = interfaceC5283bvo.getProfileGuid();
                            if (profileGuid != null) {
                                i.add(profileGuid);
                            }
                        }
                    }
                    g = C8576dqs.g((Iterable) i, (Iterable) AddProfileFragment.this.r);
                    x = C8576dqs.x(g);
                    str = (String) x;
                }
                C5934cNu.b.b(status, false, AddProfileFragment.this.I(), null, str, AddProfileFragment.this.bh_());
                by_.setResult(-1, new Intent().putExtra(cMY.a(), str));
                AddProfileFragment.this.bg_();
                return;
            }
            InterfaceC1640aIu.b.a(InterfaceC1640aIu.d, by_, status, false, 4, null);
            by_.setResult(0);
            C5934cNu.b.b(status, false, AddProfileFragment.this.I(), null, null, AddProfileFragment.this.bh_());
            if (status.c() != StatusCode.PROFILE_OPERATION_ERROR || (userAgent = by_.getUserAgent()) == null) {
                return;
            }
            userAgent.b((InterfaceC5018bqo) null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends ViewOutlineProvider {
        j() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) outline, "");
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            C1332Xp c1332Xp = C1332Xp.b;
            outline.setRoundRect(0, 0, measuredWidth, measuredHeight, (int) TypedValue.applyDimension(1, 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C5856cKx a2 = C5856cKx.a(layoutInflater, viewGroup, false);
        C8632dsu.a(a2, "");
        this.n = new b(a2, new RG(a2.h, null));
        FrameLayout d2 = a2.d();
        C8632dsu.a(d2, "");
        return d2;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        e(bundle);
        O();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putString("bundle_name", N());
        bundle.putParcelable("bundle_default_avatar", this.k);
        bundle.putParcelable("bundle_current_avatar", this.f13309o);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) status, "");
        O();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        FragmentActivity activity;
        super.onDestroyView();
        if (isRemoving() || ((activity = getActivity()) != null && activity.isFinishing())) {
            if (!this.s) {
                C5934cNu.b.c(null, I(), bh_());
                C8054ddD.c(getContext(), R.o.kq, 1);
            }
            a().b();
        }
        this.n = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 6001 && i3 == -1) {
            this.f13309o = C5928cNo.b.c(intent);
            b.getLogTag();
            O();
        } else if (i2 == MP.h) {
            ((bXE) C1332Xp.b(bXE.class)).a(i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        int i2;
        int i3 = 2 % 2;
        int i4 = y + 65;
        u = i4 % 128;
        if (i4 % 2 != 0) {
            C8632dsu.c((Object) menu, "");
            C8632dsu.c((Object) menuInflater, "");
            super.onCreateOptionsMenu(menu, menuInflater);
            getActivity();
            throw null;
        }
        C8632dsu.c((Object) menu, "");
        C8632dsu.c((Object) menuInflater, "");
        super.onCreateOptionsMenu(menu, menuInflater);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i5 = y + 107;
            u = i5 % 128;
            int i6 = i5 % 2;
            String string = activity.getString(R.o.kO);
            if (!(!string.startsWith("'!#+"))) {
                Object[] objArr = new Object[1];
                v(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            }
            SpannableString spannableString = new SpannableString(string);
            if (this.t) {
                int i7 = y + 115;
                u = i7 % 128;
                int i8 = i7 % 2;
                i2 = C9834xU.c.c;
            } else {
                i2 = C9834xU.c.g;
                int i9 = u + 19;
                y = i9 % 128;
                int i10 = i9 % 2;
            }
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(activity, i2)), 0, spannableString.length(), 17);
            spannableString.setSpan(new C8145dep(C1336Xt.b(getActivity())), 0, spannableString.length(), 17);
            MenuItem add = menu.add(0, R.g.eJ, 0, spannableString);
            add.setShowAsAction(2);
            add.setEnabled(this.t);
            int i11 = y + 89;
            u = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        if (menuItem.getItemId() == R.g.eJ) {
            R();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActivity bj_ = bj_();
        NetflixActivity bj_2 = bj_();
        NetflixActionBar netflixActionBar = bj_2 != null ? bj_2.getNetflixActionBar() : null;
        NetflixActivity bj_3 = bj_();
        C9726vo.d(bj_, netflixActionBar, bj_3 != null ? bj_3.getActionBarStateBuilder() : null, AddProfileFragment$updateActionBar$1.b);
        return true;
    }

    private final C5856cKx P() {
        b bVar = this.n;
        C5856cKx a2 = bVar != null ? bVar.a() : null;
        if (a2 != null) {
            return a2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void e(Bundle bundle) {
        Object c2;
        C5856cKx P = P();
        P.d.setAgeChangedListener(new e());
        EditText editText = P.i;
        C8632dsu.a(editText, "");
        editText.addTextChangedListener(new d(editText, this));
        editText.setClipToOutline(true);
        editText.setOutlineProvider(this.p);
        P.e.setClipToOutline(true);
        P.e.setOutlineProvider(this.p);
        P.a.setOnClickListener(new View.OnClickListener() { // from class: o.cLx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddProfileFragment.a(AddProfileFragment.this, view);
            }
        });
        if (bundle != null && bundle.containsKey("bundle_name") && bundle.containsKey("bundle_default_avatar") && bundle.containsKey("bundle_current_avatar")) {
            editText.setText(bundle.getString("bundle_name"));
            this.k = (AvatarInfo) bundle.getParcelable("bundle_default_avatar");
            AvatarInfo avatarInfo = (AvatarInfo) bundle.getParcelable("bundle_current_avatar");
            this.f13309o = avatarInfo;
            if (avatarInfo != null && this.k != null) {
                this.l = true;
                this.m = false;
            }
        }
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("extra_new_profile_age_setting")) {
            return;
        }
        Bundle arguments2 = getArguments();
        c2 = C8563dqf.c(ProfileCreator.AgeSetting.values(), arguments2 != null ? arguments2.getInt("extra_new_profile_age_setting") : -1);
        ProfileCreator.AgeSetting ageSetting = (ProfileCreator.AgeSetting) c2;
        if (ageSetting != null) {
            P.d.setStartingSelection(ageSetting);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements C5952cOl.c {
        e() {
        }

        @Override // o.C5952cOl.c
        public void b(ProfileCreator.AgeSetting ageSetting, ProfileCreator.AgeSetting ageSetting2) {
            C8632dsu.c((Object) ageSetting, "");
            C8632dsu.c((Object) ageSetting2, "");
            AddProfileFragment.this.a(ageSetting2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements TextWatcher {
        final /* synthetic */ AddProfileFragment b;
        final /* synthetic */ EditText c;

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C8632dsu.c((Object) charSequence, "");
        }

        d(EditText editText, AddProfileFragment addProfileFragment) {
            this.c = editText;
            this.b = addProfileFragment;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C8632dsu.c((Object) charSequence, "");
            this.c.setError(null);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C8632dsu.c((Object) editable, "");
            this.b.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AddProfileFragment addProfileFragment, View view) {
        C8632dsu.c((Object) addProfileFragment, "");
        addProfileFragment.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        if (getView() == null) {
            return;
        }
        if (bl_() == null || this.m) {
            b(true, false);
            return;
        }
        b(false, true);
        K();
        AvatarInfo avatarInfo = this.f13309o;
        if (avatarInfo == null || !c(avatarInfo)) {
            return;
        }
        P().b.showImage(avatarInfo.getUrl());
    }

    private final void b(boolean z, boolean z2) {
        b bVar = this.n;
        if (bVar != null) {
            boolean z3 = true;
            if (z) {
                bVar.c().a(true);
            } else {
                bVar.c().b(true);
                NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                C8632dsu.a(netflixImmutableStatus, "");
                d(netflixImmutableStatus);
            }
            C1174Rn c1174Rn = bVar.a().c;
            C8632dsu.a(c1174Rn, "");
            boolean z4 = !z;
            c1174Rn.setEnabled(z4);
            bVar.a().i.setEnabled(z4);
            a(z4);
            bVar.a().d.setEnabled(z4);
            bVar.a().b.setEnabled((z || !c(this.f13309o)) ? false : false);
            if (z2) {
                c1174Rn.animate().alpha(z ? 0.4f : 1.0f).setDuration(400L).start();
            } else {
                c1174Rn.setAlpha(z ? 0.4f : 1.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ProfileCreator.AgeSetting ageSetting) {
        ServiceManager bl_;
        if (ageSetting != ProfileCreator.AgeSetting.b || (bl_ = bl_()) == null) {
            return;
        }
        bl_.e(new a());
    }

    private final void F() {
        if (c(this.f13309o) && bn_()) {
            C7017coI.c.e().d(AbstractC1608aHp.f.d).d(new AbstractC1608aHp.e(null, P().d.e() == ProfileCreator.AgeSetting.b, false)).b(this);
        }
    }

    private final String N() {
        CharSequence n;
        n = duD.n((CharSequence) P().i.getText().toString());
        return n.toString();
    }

    private final boolean L() {
        boolean z;
        boolean g;
        Editable text = P().i.getText();
        if (text != null) {
            g = C8691duz.g(text);
            if (!g) {
                z = false;
                return !z;
            }
        }
        z = true;
        return !z;
    }

    private final boolean J() {
        return (!L() || bl_() == null || this.f13309o == null) ? false : true;
    }

    private final boolean c(AvatarInfo avatarInfo) {
        String url;
        boolean g;
        String name;
        boolean g2;
        if (avatarInfo != null && (url = avatarInfo.getUrl()) != null) {
            g = C8691duz.g(url);
            if (!g && (name = avatarInfo.getName()) != null) {
                g2 = C8691duz.g(name);
                if (!g2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(boolean z) {
        this.t = z && J();
        bD_();
    }

    private final boolean G() {
        List<? extends InterfaceC5283bvo> e2;
        boolean d2;
        boolean d3;
        boolean d4;
        boolean a2;
        C5856cKx P = P();
        P.i.setError(null);
        ServiceManager bl_ = bl_();
        if (bl_ == null || this.f13309o == null || getActivity() == null || (e2 = bl_.e()) == null) {
            return true;
        }
        String N = N();
        d2 = duD.d((CharSequence) N, (CharSequence) "\"", false, 2, (Object) null);
        if (!d2) {
            d3 = duD.d((CharSequence) N, (CharSequence) "<", false, 2, (Object) null);
            if (!d3) {
                d4 = duD.d((CharSequence) N, (CharSequence) ">", false, 2, (Object) null);
                if (!d4) {
                    int length = N.length() - 1;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 <= length) {
                        boolean z2 = C8632dsu.d(N.charAt(!z ? i2 : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i2++;
                        } else {
                            z = true;
                        }
                    }
                    if (TextUtils.isEmpty(N.subSequence(i2, length + 1).toString())) {
                        String string = getString(R.o.kV);
                        C8632dsu.a(string, "");
                        P.i.setError(string);
                        return true;
                    }
                    if (!e2.isEmpty()) {
                        for (InterfaceC5283bvo interfaceC5283bvo : e2) {
                            a2 = C8691duz.a(N, interfaceC5283bvo.getProfileName(), true);
                            if (a2) {
                                String string2 = getString(R.o.ky);
                                C8632dsu.a(string2, "");
                                P.i.setError(string2);
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        String string3 = getString(R.o.kU);
        C8632dsu.a(string3, "");
        P.i.setError(string3);
        return true;
    }

    private final void K() {
        C5856cKx a2;
        EditText editText;
        b bVar = this.n;
        if (bVar == null || (a2 = bVar.a()) == null || (editText = a2.i) == null) {
            return;
        }
        editText.requestFocus();
        Object systemService = editText.getContext().getSystemService("input_method");
        C8632dsu.d(systemService);
        ((InputMethodManager) systemService).showSoftInput(editText, 1);
    }

    private final void M() {
        C5856cKx a2;
        EditText editText;
        b bVar = this.n;
        if (bVar == null || (a2 = bVar.a()) == null || (editText = a2.i) == null) {
            return;
        }
        editText.clearFocus();
        Object systemService = editText.getContext().getSystemService("input_method");
        C8632dsu.d(systemService);
        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfileSettings I() {
        C5856cKx a2;
        C5952cOl c5952cOl;
        C5934cNu c5934cNu = C5934cNu.b;
        ServiceManager bl_ = bl_();
        AvatarInfo avatarInfo = this.f13309o;
        b bVar = this.n;
        return c5934cNu.b(bl_, avatarInfo, ((bVar == null || (a2 = bVar.a()) == null || (c5952cOl = a2.d) == null) ? null : c5952cOl.e()) == ProfileCreator.AgeSetting.b, Prefetch.NANOSECONDS_PER_MILLISECOND, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a extends AbstractC5164btb {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
            if (r15 == false) goto L20;
         */
        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void g(java.util.List<? extends com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo> r14, com.netflix.mediaclient.android.app.Status r15) {
            /*
                r13 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r15, r0)
                com.netflix.mediaclient.ui.profiles.AddProfileFragment$c r0 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.b
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r0 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                r1 = 0
                com.netflix.mediaclient.ui.profiles.AddProfileFragment.b(r0, r1)
                boolean r0 = r15.j()
                if (r0 == 0) goto L86
                if (r14 == 0) goto L86
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r15 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                boolean r15 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.a(r15)
                if (r15 == 0) goto L29
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r15 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r15 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.b(r15)
                boolean r15 = o.C8570dqm.a(r14, r15)
                if (r15 != 0) goto L6b
            L29:
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r15 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                java.util.Iterator r0 = r14.iterator()
            L2f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L43
                java.lang.Object r1 = r0.next()
                r2 = r1
                com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r2 = (com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo) r2
                boolean r2 = r2.isInDefaultSet()
                if (r2 == 0) goto L2f
                goto L44
            L43:
                r1 = 0
            L44:
                com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r1 = (com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo) r1
                com.netflix.mediaclient.ui.profiles.AddProfileFragment.b(r15, r1)
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r15 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r15 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.c(r15)
                if (r15 != 0) goto L62
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r15 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                int r0 = r14.size()
                int r0 = r0 + (-1)
                java.lang.Object r14 = r14.get(r0)
                com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r14 = (com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo) r14
                com.netflix.mediaclient.ui.profiles.AddProfileFragment.b(r15, r14)
            L62:
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r14 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r15 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.c(r14)
                com.netflix.mediaclient.ui.profiles.AddProfileFragment.d(r14, r15)
            L6b:
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r14 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                com.netflix.mediaclient.ui.profiles.AddProfileFragment.g(r14)
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r14 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                com.netflix.mediaclient.ui.profiles.AddProfileFragment$b r14 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.e(r14)
                if (r14 == 0) goto Lb7
                o.cKx r14 = r14.a()
                if (r14 == 0) goto Lb7
                android.widget.EditText r14 = r14.i
                if (r14 == 0) goto Lb7
                r14.requestFocus()
                goto Lb7
            L86:
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r14 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                com.netflix.mediaclient.android.activity.NetflixActivity r1 = r14.bj_()
                if (r1 == 0) goto Lb7
                o.aIu$b r0 = o.InterfaceC1640aIu.d
                r3 = 0
                r4 = 4
                r5 = 0
                r2 = r15
                o.InterfaceC1640aIu.b.a(r0, r1, r2, r3, r4, r5)
                o.cNu r6 = o.C5934cNu.b
                com.netflix.cl.model.event.session.action.AddProfile r7 = new com.netflix.cl.model.event.session.action.AddProfile
                r1 = 0
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r14 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                com.netflix.cl.model.AppView r2 = r14.bh_()
                com.netflix.mediaclient.ui.profiles.AddProfileFragment r14 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.this
                com.netflix.cl.model.ProfileSettings r3 = com.netflix.mediaclient.ui.profiles.AddProfileFragment.d(r14)
                com.netflix.cl.model.CommandValue r4 = com.netflix.cl.model.CommandValue.AddProfileCommand
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r9 = 0
                r10 = 0
                r11 = 12
                r12 = 0
                r8 = r15
                o.C5934cNu.d(r6, r7, r8, r9, r10, r11, r12)
            Lb7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profiles.AddProfileFragment.a.g(java.util.List, com.netflix.mediaclient.android.app.Status):void");
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d, view.getPaddingRight(), this.h);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) status, "");
        b.getLogTag();
        if (!this.l) {
            serviceManager.e(new a());
        }
        O();
    }

    private final void R() {
        Set<String> W;
        b.getLogTag();
        ServiceManager bl_ = bl_();
        dpR dpr = null;
        List<? extends InterfaceC5283bvo> e2 = bl_ != null ? bl_.e() : null;
        if (e2 == null) {
            return;
        }
        if (G()) {
            C5934cNu.b.b((String) null, I(), bh_());
            return;
        }
        M();
        C5856cKx P = P();
        String N = N();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5283bvo interfaceC5283bvo : e2) {
            String profileGuid = interfaceC5283bvo.getProfileGuid();
            if (profileGuid != null) {
                arrayList.add(profileGuid);
            }
        }
        W = C8576dqs.W(arrayList);
        this.r = W;
        ServiceManager bl_2 = bl_();
        if (bl_2 != null) {
            this.s = true;
            boolean z = P.d.e() == ProfileCreator.AgeSetting.b;
            AvatarInfo avatarInfo = this.f13309o;
            bl_2.a(N, z, avatarInfo != null ? avatarInfo.getName() : null, null, this.q);
            b(true, true);
            dpr = dpR.c;
        }
        if (dpr == null) {
            this.s = false;
            C5934cNu.d(C5934cNu.b, new AddProfile(null, bh_(), I(), null, null), null, null, null, 12, null);
            requireActivity().setResult(0);
            bg_();
        }
    }

    private void v(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$4815);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
