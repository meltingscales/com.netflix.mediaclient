package com.netflix.mediaclient.ui.profiles.languages.impl;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.profiles.languages.api.LanguageSelectorType;
import com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractApplicationC1040Mh;
import o.AbstractC5164btb;
import o.AbstractC8882fB;
import o.C1045Mp;
import o.C5967cPa;
import o.C8126deW;
import o.C8242dgg;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.C9726vo;
import o.C9737vz;
import o.C9935zP;
import o.InterfaceC1078Nw;
import o.InterfaceC5283bvo;
import o.InterfaceC8554dpx;
import o.InterfaceC8612dsa;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.InterfaceC8976gq;
import o.cOI;
import o.cOK;
import o.cOU;
import o.cOX;
import o.cQQ;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drI;
import o.drM;
import o.drO;
import o.dsA;
import o.dtC;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class ProfileLanguagesFragment extends cOI {
    private static final Map<LanguageSelectorType, d.b> j;
    @Inject
    public C8242dgg cacheHelper;
    private final boolean k;
    private ArrayList<String> l;
    private boolean m = true;
    private final InterfaceC8554dpx n;

    /* renamed from: o  reason: collision with root package name */
    private e f13313o;
    static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(ProfileLanguagesFragment.class, "languagesViewModel", "getLanguagesViewModel()Lcom/netflix/mediaclient/ui/profiles/languages/impl/LanguagesViewModel;", 0))};
    public static final d b = new d(null);

    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LanguageSelectorType.values().length];
            try {
                iArr[LanguageSelectorType.DISPLAY_LANGUAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LanguageSelectorType.CONTENT_LANGUAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.k;
    }

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC8882fB<ProfileLanguagesFragment, cOK> {
        final /* synthetic */ drM a;
        final /* synthetic */ boolean b;
        final /* synthetic */ InterfaceC8660dtv c;
        final /* synthetic */ InterfaceC8660dtv d;

        public a(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.d = interfaceC8660dtv;
            this.b = z;
            this.a = drm;
            this.c = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: a */
        public InterfaceC8554dpx<cOK> c(ProfileLanguagesFragment profileLanguagesFragment, dtC<?> dtc) {
            C8632dsu.c((Object) profileLanguagesFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.d;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.c;
            return d.d(profileLanguagesFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: e */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(LanguagesState.class), this.b, this.a);
        }
    }

    public ProfileLanguagesFragment() {
        final InterfaceC8660dtv a2 = dsA.a(cOK.class);
        this.n = new a(a2, false, new drM<InterfaceC8890fJ<cOK, LanguagesState>, cOK>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.cOK, o.fS] */
            @Override // o.drM
            /* renamed from: d */
            public final cOK invoke(InterfaceC8890fJ<cOK, LanguagesState> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, LanguagesState.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, e[0]);
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ProfileLanguageSelectorFragment");
        }

        public final ProfileLanguagesFragment c(Bundle bundle) {
            ProfileLanguagesFragment profileLanguagesFragment = new ProfileLanguagesFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("mavericks:arg", bundle);
            profileLanguagesFragment.setArguments(bundle2);
            return profileLanguagesFragment;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b {
            private final AppView a;
            private final int b;

            public final AppView a() {
                return this.a;
            }

            public final int e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return this.a == bVar.a && this.b == bVar.b;
                }
                return false;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
            }

            public String toString() {
                AppView appView = this.a;
                int i = this.b;
                return "FragmentConfig(appView=" + appView + ", titleRes=" + i + ")";
            }

            public b(AppView appView, int i) {
                C8632dsu.c((Object) appView, "");
                this.a = appView;
                this.b = i;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b a(LanguageSelectorType languageSelectorType) {
            Object obj = ProfileLanguagesFragment.j.get(languageSelectorType);
            if (obj != null) {
                return (b) obj;
            }
            throw new IllegalArgumentException(("LanguageSelectorType (" + languageSelectorType + ") is missing FragmentConfig").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e {
        private final ProfileLanguagesEpoxyController d;

        public final ProfileLanguagesEpoxyController a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.d, ((e) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            ProfileLanguagesEpoxyController profileLanguagesEpoxyController = this.d;
            return "Holder(epoxyController=" + profileLanguagesEpoxyController + ")";
        }

        public e(ProfileLanguagesEpoxyController profileLanguagesEpoxyController) {
            C8632dsu.c((Object) profileLanguagesEpoxyController, "");
            this.d = profileLanguagesEpoxyController;
        }
    }

    static {
        Map<LanguageSelectorType, d.b> c2;
        c2 = dqE.c(dpD.a(LanguageSelectorType.DISPLAY_LANGUAGE, new d.b(AppView.languageSelector, C5967cPa.a.f)), dpD.a(LanguageSelectorType.CONTENT_LANGUAGES, new d.b(AppView.secondaryLanguagesSelector, C5967cPa.a.h)));
        j = c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cOK G() {
        return (cOK) this.n.getValue();
    }

    public final C8242dgg I() {
        C8242dgg c8242dgg = this.cacheHelper;
        if (c8242dgg != null) {
            return c8242dgg;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(C5967cPa.d.d, viewGroup, false);
        C8632dsu.a(inflate, "");
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        C9935zP d2 = bVar.d(viewLifecycleOwner);
        ProfileLanguagesEpoxyController profileLanguagesEpoxyController = new ProfileLanguagesEpoxyController(by_(), d2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C5967cPa.b.a);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(profileLanguagesEpoxyController.getAdapter());
        this.f13313o = new e(profileLanguagesEpoxyController);
        b(d2);
        e(this, false, 1, null);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f13313o = null;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(G(), new drM<LanguagesState, Boolean>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment$isLoadingData$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(LanguagesState languagesState) {
                C8632dsu.c((Object) languagesState, "");
                return Boolean.valueOf(languagesState.isLoading());
            }
        })).booleanValue();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return b.a(M()).a();
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(G(), new drM<LanguagesState, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment$invalidate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final dpR invoke(LanguagesState languagesState) {
                boolean z;
                ProfileLanguagesFragment.e eVar;
                ProfileLanguagesEpoxyController a2;
                C8632dsu.c((Object) languagesState, "");
                z = ProfileLanguagesFragment.this.m;
                if (z && !languagesState.isLoading()) {
                    ProfileLanguagesFragment.this.m = false;
                    ProfileLanguagesFragment profileLanguagesFragment = ProfileLanguagesFragment.this;
                    NetflixImmutableStatus netflixImmutableStatus = languagesState.isFailed() ? InterfaceC1078Nw.ad : InterfaceC1078Nw.aJ;
                    C8632dsu.d(netflixImmutableStatus);
                    profileLanguagesFragment.d(netflixImmutableStatus);
                }
                eVar = ProfileLanguagesFragment.this.f13313o;
                if (eVar == null || (a2 = eVar.a()) == null) {
                    return null;
                }
                a2.setData(languagesState);
                return dpR.c;
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActivity bj_ = bj_();
        NetflixActivity bj_2 = bj_();
        NetflixActionBar netflixActionBar = bj_2 != null ? bj_2.getNetflixActionBar() : null;
        NetflixActivity bj_3 = bj_();
        C9726vo.d(bj_, netflixActionBar, bj_3 != null ? bj_3.getActionBarStateBuilder() : null, new InterfaceC8612dsa<NetflixActivity, NetflixActionBar, NetflixActionBar.b.C0051b, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment$updateActionBar$1
            private static int b = 0;
            private static int d = 1;
            private static byte e$ss2$42 = 24;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(NetflixActivity netflixActivity, NetflixActionBar netflixActionBar2, NetflixActionBar.b.C0051b c0051b) {
                d(netflixActivity, netflixActionBar2, c0051b);
                return dpR.c;
            }

            public final void d(NetflixActivity netflixActivity, NetflixActionBar netflixActionBar2, NetflixActionBar.b.C0051b c0051b) {
                LanguageSelectorType M;
                int i = 2 % 2;
                C8632dsu.c((Object) netflixActivity, "");
                C8632dsu.c((Object) netflixActionBar2, "");
                C8632dsu.c((Object) c0051b, "");
                NetflixActionBar.b.C0051b k = c0051b.k(true);
                String string = netflixActivity.getString(R.o.D);
                if (string.startsWith("'!#+")) {
                    int i2 = d + 121;
                    b = i2 % 128;
                    int i3 = i2 % 2;
                    Object[] objArr = new Object[1];
                    c(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
                NetflixActionBar.b.C0051b b2 = k.b(string);
                ProfileLanguagesFragment.d dVar = ProfileLanguagesFragment.b;
                M = ProfileLanguagesFragment.this.M();
                String string2 = netflixActivity.getString(dVar.a(M).e());
                if (string2.startsWith("'!#+")) {
                    int i4 = b + 19;
                    d = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object[] objArr2 = new Object[1];
                        c(string2.substring(4), objArr2);
                        ((String) objArr2[0]).intern();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object[] objArr3 = new Object[1];
                    c(string2.substring(4), objArr3);
                    string2 = ((String) objArr3[0]).intern();
                }
                b2.e((CharSequence) string2);
                netflixActionBar2.c(c0051b.c());
            }

            private void c(String str, Object[] objArr) {
                byte[] decode = Base64.decode(str, 0);
                byte[] bArr = new byte[decode.length];
                for (int i = 0; i < decode.length; i++) {
                    bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$42);
                }
                objArr[0] = new String(bArr, StandardCharsets.UTF_8);
            }
        });
        return true;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        final InterfaceC5283bvo b2 = C8126deW.b();
        final ArrayList<String> arrayList = this.l;
        if (arrayList == null || arrayList.isEmpty() || b2 == null || M() != LanguageSelectorType.DISPLAY_LANGUAGE || !C8632dsu.c((Object) K(), (Object) b2.getProfileGuid())) {
            return super.o();
        }
        cOX b3 = cOX.d.b(new DialogInterface.OnClickListener() { // from class: o.cOW
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ProfileLanguagesFragment.c(ProfileLanguagesFragment.this, b2, arrayList, dialogInterface, i);
            }
        });
        NetflixActivity bj_ = bj_();
        if (bj_ == null || !bj_.showDialog(b3)) {
            String str = arrayList.get(0);
            C8632dsu.a(str, "");
            b(b2, str);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ProfileLanguagesFragment profileLanguagesFragment, InterfaceC5283bvo interfaceC5283bvo, ArrayList arrayList, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) profileLanguagesFragment, "");
        if (i == -1) {
            Object obj = arrayList.get(0);
            C8632dsu.a(obj, "");
            profileLanguagesFragment.b(interfaceC5283bvo, (String) obj);
            return;
        }
        FragmentActivity activity = profileLanguagesFragment.getActivity();
        if (activity != null) {
            activity.setResult(0);
        }
        FragmentActivity activity2 = profileLanguagesFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    static /* synthetic */ void e(ProfileLanguagesFragment profileLanguagesFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchLanguageData");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        profileLanguagesFragment.b(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean z) {
        int i = b.a[M().ordinal()];
        if (i == 1) {
            G().c(z);
        } else if (i != 2) {
        } else {
            G().b(z);
        }
    }

    private final String K() {
        Bundle bundle;
        Bundle arguments = getArguments();
        String string = (arguments == null || (bundle = arguments.getBundle("mavericks:arg")) == null) ? null : bundle.getString("extra_profile_id");
        if (string != null) {
            C8632dsu.a(string, "");
            return string;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LanguageSelectorType M() {
        Bundle bundle;
        Bundle arguments = getArguments();
        String string = (arguments == null || (bundle = arguments.getBundle("mavericks:arg")) == null) ? null : bundle.getString("extra_selector_type");
        if (string != null) {
            C8632dsu.a(string, "");
            return LanguageSelectorType.valueOf(string);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final cOU.b bVar) {
        if (C9737vz.a(getActivity())) {
            return;
        }
        C8980gu.c(G(), new drM<LanguagesState, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment$handleUserSelectionChanged$1

            /* loaded from: classes4.dex */
            public final /* synthetic */ class d {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[LanguageSelectorType.values().length];
                    try {
                        iArr[LanguageSelectorType.DISPLAY_LANGUAGE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LanguageSelectorType.CONTENT_LANGUAGES.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    a = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
            /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
            @Override // o.drM
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final o.dpR invoke(com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesState r8) {
                /*
                    Method dump skipped, instructions count: 302
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment$handleUserSelectionChanged$1.invoke(com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesState):o.dpR");
            }
        });
    }

    private final void b(InterfaceC5283bvo interfaceC5283bvo, String str) {
        ServiceManager bl_ = bl_();
        if (bl_ != null) {
            G().e(bl_, interfaceC5283bvo, str, new c());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC5164btb {
        c() {
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        @SuppressLint({"CheckResult"})
        public void d(Status status, AccountData accountData) {
            C8632dsu.c((Object) status, "");
            CompositeDisposable compositeDisposable = ProfileLanguagesFragment.this.f;
            Completable andThen = new cQQ().o().ignoreElements().andThen(ProfileLanguagesFragment.this.I().c());
            ProfileLanguagesFragment$saveDisplayLanguageAndRestart$1$1$onProfileListUpdateStatus$1 profileLanguagesFragment$saveDisplayLanguageAndRestart$1$1$onProfileListUpdateStatus$1 = new ProfileLanguagesFragment$saveDisplayLanguageAndRestart$1$1$onProfileListUpdateStatus$1(ProfileLanguagesFragment.this);
            C8632dsu.d(andThen);
            final ProfileLanguagesFragment profileLanguagesFragment = ProfileLanguagesFragment.this;
            DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy(andThen, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment$saveDisplayLanguageAndRestart$1$1$onProfileListUpdateStatus$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    ProfileLanguagesFragment.this.L();
                }
            }, profileLanguagesFragment$saveDisplayLanguageAndRestart$1$1$onProfileListUpdateStatus$1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        AbstractApplicationC1040Mh.getInstance().d(requireActivity(), "Profile Language Change");
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d, view.getPaddingRight(), this.h);
    }

    @SuppressLint({"AutoDispose"})
    private final void b(C9935zP c9935zP) {
        CompositeDisposable compositeDisposable = this.f;
        Observable observeOn = c9935zP.d(cOU.class).observeOn(AndroidSchedulers.mainThread());
        final drM<cOU, dpR> drm = new drM<cOU, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment$subscribeToEvents$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cOU cou) {
                d(cou);
                return dpR.c;
            }

            public final void d(cOU cou) {
                cOK G;
                if (cou instanceof cOU.e) {
                    ProfileLanguagesFragment.this.b(true);
                } else if (cou instanceof cOU.b) {
                    ProfileLanguagesFragment profileLanguagesFragment = ProfileLanguagesFragment.this;
                    C8632dsu.d(cou);
                    cOU.b bVar = (cOU.b) cou;
                    profileLanguagesFragment.b(bVar);
                    G = ProfileLanguagesFragment.this.G();
                    G.e(bVar.e());
                }
            }
        };
        Disposable subscribe = observeOn.subscribe(new Consumer() { // from class: o.cOV
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfileLanguagesFragment.c(drM.this, obj);
            }
        });
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }
}
