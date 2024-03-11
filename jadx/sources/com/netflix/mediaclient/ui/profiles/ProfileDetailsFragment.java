package com.netflix.mediaclient.ui.profiles;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Outline;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.action.AddProfile;
import com.netflix.cl.model.event.session.action.EditProfile;
import com.netflix.cl.model.event.session.command.EditContentRestrictionCommand;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment;
import com.netflix.mediaclient.ui.profiles.languages.api.LanguageSelectorType;
import com.netflix.profiles.ProfileControlsActivity;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Provider;
import o.AbstractC5164btb;
import o.C1045Mp;
import o.C1163Rc;
import o.C1203Sq;
import o.C1204Sr;
import o.C1332Xp;
import o.C1333Xq;
import o.C1645aIz;
import o.C1907aSr;
import o.C3983bRx;
import o.C5855cKw;
import o.C5858cKz;
import o.C5928cNo;
import o.C5934cNu;
import o.C5947cOg;
import o.C8126deW;
import o.C8150deu;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C9726vo;
import o.C9737vz;
import o.C9834xU;
import o.C9867yA;
import o.InterfaceC1078Nw;
import o.InterfaceC1640aIu;
import o.InterfaceC5283bvo;
import o.InterfaceC5958cOs;
import o.MP;
import o.RG;
import o.bXE;
import o.cKD;
import o.cLM;
import o.cLU;
import o.cOJ;
import o.cOY;
import o.cQQ;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.duD;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class ProfileDetailsFragment extends cLU {
    public static final c b;
    public static final int e;
    private static byte e$ss2$9820 = 0;
    private static int u = 0;
    private static int y = 1;
    private String k;
    private boolean l;
    @Inject
    public InterfaceC5958cOs lolopi;
    private AvatarInfo m;
    private InterfaceC5283bvo n;

    /* renamed from: o  reason: collision with root package name */
    private List<String> f13310o;
    private AvatarInfo p;
    @Inject
    public cKD profileLock;
    @Inject
    public Provider<Boolean> profileLockEnabled;
    private String r;
    private b t;
    @Inject
    public Provider<Boolean> viewingRestrictionsEnabled;
    private boolean x;
    private final Handler q = new Handler();
    private final a s = new a();
    private final j w = new j();
    private final AppView j = AppView.editProfile;

    static {
        I();
        b = new c(null);
        e = 8;
    }

    static void I() {
        e$ss2$9820 = (byte) 24;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.j;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* loaded from: classes4.dex */
    public static final class d<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner a;

        public d(LifecycleOwner lifecycleOwner) {
            this.a = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.a;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.a.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$refreshProfile$$inlined$createDestroyObservable$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!ObservableEmitter.this.isDisposed()) {
                        ObservableEmitter.this.onNext(dpR.c);
                        try {
                            ObservableEmitter.this.onComplete();
                        } catch (CancellationException unused) {
                        }
                    }
                    super.onDestroy(lifecycleOwner2);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ProfileDetailsFragment");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {
        private C5858cKz b;
        private RG e;

        public final C5858cKz b() {
            return this.b;
        }

        public final RG d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.b, bVar.b) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            C5858cKz c5858cKz = this.b;
            RG rg = this.e;
            return "Holder(viewBinding=" + c5858cKz + ", loadingAndErrorWrapper=" + rg + ")";
        }

        public b(C5858cKz c5858cKz, RG rg) {
            C8632dsu.c((Object) c5858cKz, "");
            C8632dsu.c((Object) rg, "");
            this.b = c5858cKz;
            this.e = rg;
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

    public final cKD e() {
        cKD ckd = this.profileLock;
        if (ckd != null) {
            return ckd;
        }
        C8632dsu.d("");
        return null;
    }

    public final Provider<Boolean> F() {
        Provider<Boolean> provider = this.profileLockEnabled;
        if (provider != null) {
            return provider;
        }
        C8632dsu.d("");
        return null;
    }

    public final Provider<Boolean> G() {
        Provider<Boolean> provider = this.viewingRestrictionsEnabled;
        if (provider != null) {
            return provider;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5164btb {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void d(Status status, AccountData accountData) {
            List<InterfaceC5283bvo> userProfiles;
            C8632dsu.c((Object) status, "");
            NetflixActivity bj_ = ProfileDetailsFragment.this.bj_();
            if (status.i() && bj_ != null && !C9737vz.a(bj_)) {
                InterfaceC1640aIu.b.a(InterfaceC1640aIu.d, bj_, status, false, 4, null);
                bj_.setResult(0);
            }
            C5934cNu.b.b(status, false, ProfileDetailsFragment.this.K(), ProfileDetailsFragment.this.r, null, ProfileDetailsFragment.this.bh_());
            if (ProfileDetailsFragment.this.bn_()) {
                ProfileDetailsFragment profileDetailsFragment = ProfileDetailsFragment.this;
                InterfaceC5283bvo interfaceC5283bvo = null;
                if (accountData != null && (userProfiles = accountData.getUserProfiles()) != null) {
                    ProfileDetailsFragment profileDetailsFragment2 = ProfileDetailsFragment.this;
                    Iterator<T> it = userProfiles.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (C8632dsu.c((Object) ((InterfaceC5283bvo) next).getProfileGuid(), (Object) profileDetailsFragment2.r)) {
                            interfaceC5283bvo = next;
                            break;
                        }
                    }
                    interfaceC5283bvo = interfaceC5283bvo;
                }
                profileDetailsFragment.n = interfaceC5283bvo;
            }
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
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.r = arguments.getString("extra_profile_id");
            this.m = C5928cNo.b.b(getArguments());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C5858cKz d2 = C5858cKz.d(layoutInflater, viewGroup, false);
        C8632dsu.a(d2, "");
        this.t = new b(d2, new RG(d2.f13680o, null));
        ConstraintLayout b2 = d2.b();
        C8632dsu.a(b2, "");
        return b2;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        d(bundle);
        aa();
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
        C8632dsu.a(netflixImmutableStatus, "");
        d(netflixImmutableStatus);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.x) {
            this.x = false;
            S();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        C5858cKz b2;
        EditText editText;
        Editable text;
        String obj;
        CharSequence n;
        C8632dsu.c((Object) bundle, "");
        super.onSaveInstanceState(bundle);
        b bVar = this.t;
        if (bVar == null || (b2 = bVar.b()) == null || (editText = b2.k) == null || (text = editText.getText()) == null || (obj = text.toString()) == null) {
            str = null;
        } else {
            n = duD.n((CharSequence) obj);
            str = n.toString();
        }
        bundle.putString("bundle_name", str);
        bundle.putParcelable("bundle_default_avatar", this.p);
        bundle.putParcelable("bundle_current_avatar", this.m);
    }

    private final void d(Bundle bundle) {
        b bVar = this.t;
        if (bVar != null) {
            C5858cKz b2 = bVar.b();
            b2.a.setOnClickListener(new View.OnClickListener() { // from class: o.cNk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileDetailsFragment.i(ProfileDetailsFragment.this, view);
                }
            });
            X();
            b2.k.setClipToOutline(true);
            b2.k.setOutlineProvider(this.w);
            b2.k.addTextChangedListener(new e(b2, this));
            b2.j.setClipToOutline(true);
            b2.j.setOutlineProvider(this.w);
            b2.c.setOnClickListener(new View.OnClickListener() { // from class: o.cNn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileDetailsFragment.h(ProfileDetailsFragment.this, view);
                }
            });
            if (bundle != null && bundle.containsKey("bundle_name") && bundle.containsKey("bundle_default_avatar") && bundle.containsKey("bundle_current_avatar")) {
                b2.k.setText(bundle.getString("bundle_name"));
                this.p = (AvatarInfo) bundle.getParcelable("bundle_default_avatar");
                AvatarInfo avatarInfo = (AvatarInfo) bundle.getParcelable("bundle_current_avatar");
                this.m = avatarInfo;
                if (avatarInfo == null || this.p == null) {
                    return;
                }
                this.l = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ProfileDetailsFragment profileDetailsFragment, View view) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        profileDetailsFragment.N();
    }

    /* loaded from: classes4.dex */
    public static final class e implements TextWatcher {
        final /* synthetic */ C5858cKz a;
        final /* synthetic */ ProfileDetailsFragment c;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        e(C5858cKz c5858cKz, ProfileDetailsFragment profileDetailsFragment) {
            this.a = c5858cKz;
            this.c = profileDetailsFragment;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C8632dsu.c((Object) charSequence, "");
            this.a.k.setError(this.c.d(charSequence));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ProfileDetailsFragment profileDetailsFragment, View view) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        profileDetailsFragment.L();
    }

    private final void X() {
        C5858cKz b2;
        b bVar = this.t;
        if (bVar == null || (b2 = bVar.b()) == null) {
            return;
        }
        by_().getKeyboardState().c(new C9867yA.b() { // from class: o.cNf
            @Override // o.C9867yA.b
            public final void onKeyboardStateChanged(boolean z) {
                ProfileDetailsFragment.d(ProfileDetailsFragment.this, z);
            }
        });
        b2.k.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.cNi
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ProfileDetailsFragment.e(ProfileDetailsFragment.this, view, z);
            }
        });
        b2.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.cNe
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ProfileDetailsFragment.e(ProfileDetailsFragment.this, compoundButton, z);
            }
        });
        b2.i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.cNm
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ProfileDetailsFragment.c(ProfileDetailsFragment.this, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ProfileDetailsFragment profileDetailsFragment, boolean z) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        if (z || !profileDetailsFragment.R()) {
            return;
        }
        profileDetailsFragment.U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ProfileDetailsFragment profileDetailsFragment, View view, boolean z) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        if (!z && profileDetailsFragment.l && profileDetailsFragment.R()) {
            profileDetailsFragment.U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ProfileDetailsFragment profileDetailsFragment, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        if (profileDetailsFragment.l) {
            profileDetailsFragment.U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ProfileDetailsFragment profileDetailsFragment, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        if (profileDetailsFragment.l) {
            profileDetailsFragment.U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aa() {
        InterfaceC5283bvo interfaceC5283bvo;
        b bVar = this.t;
        C5858cKz b2 = bVar != null ? bVar.b() : null;
        if (getView() == null || b2 == null) {
            return;
        }
        W();
        C1203Sq c1203Sq = b2.a;
        C8632dsu.a(c1203Sq, "");
        InterfaceC5283bvo interfaceC5283bvo2 = this.n;
        c1203Sq.setVisibility((interfaceC5283bvo2 == null || interfaceC5283bvo2.isPrimaryProfile()) ? 8 : 0);
        a(this.n);
        Boolean bool = F().get();
        C8632dsu.a(bool, "");
        if (bool.booleanValue()) {
            Z();
        }
        a(b2);
        c(b2);
        b(b2);
        if (!this.l && (interfaceC5283bvo = this.n) != null) {
            b2.k.setText(interfaceC5283bvo.getProfileName());
            b2.g.setChecked(interfaceC5283bvo.isAutoPlayEnabled());
            b2.i.setChecked(!interfaceC5283bvo.disableVideoMerchAutoPlay());
            this.l = true;
        }
        if (bl_() == null) {
            b(true, false);
            return;
        }
        b(false, true);
        AvatarInfo avatarInfo = this.m;
        if (avatarInfo == null || !b(avatarInfo)) {
            return;
        }
        b2.e.showImage(avatarInfo.getUrl());
    }

    private final void a(C5858cKz c5858cKz) {
        C1203Sq c1203Sq = c5858cKz.h;
        C5947cOg c5947cOg = C5947cOg.d;
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        c1203Sq.setText(c5947cOg.a(requireContext, R.o.kM, R.o.kN));
        c5858cKz.h.setOnClickListener(new View.OnClickListener() { // from class: o.cMV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileDetailsFragment.f(ProfileDetailsFragment.this, view);
            }
        });
        C1203Sq c1203Sq2 = c5858cKz.d;
        Context requireContext2 = requireContext();
        C8632dsu.a(requireContext2, "");
        c1203Sq2.setText(c5947cOg.a(requireContext2, R.o.kH, R.o.kL));
        c5858cKz.d.setOnClickListener(new View.OnClickListener() { // from class: o.cMZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileDetailsFragment.j(ProfileDetailsFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final ProfileDetailsFragment profileDetailsFragment, View view) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        C9726vo.d(profileDetailsFragment.getActivity(), profileDetailsFragment.n, new drX<FragmentActivity, InterfaceC5283bvo, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$setupLanguagesButtons$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(FragmentActivity fragmentActivity, InterfaceC5283bvo interfaceC5283bvo) {
                e(fragmentActivity, interfaceC5283bvo);
                return dpR.c;
            }

            public final void e(FragmentActivity fragmentActivity, InterfaceC5283bvo interfaceC5283bvo) {
                C8632dsu.c((Object) fragmentActivity, "");
                C8632dsu.c((Object) interfaceC5283bvo, "");
                List<String> languagesList = interfaceC5283bvo.getLanguagesList();
                if (languagesList == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C8632dsu.a(languagesList, "");
                ProfileDetailsFragment profileDetailsFragment2 = ProfileDetailsFragment.this;
                LanguageSelectorType languageSelectorType = LanguageSelectorType.DISPLAY_LANGUAGE;
                String str = languagesList.get(0);
                C8632dsu.a(str, "");
                profileDetailsFragment2.e(languageSelectorType, str, languagesList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final ProfileDetailsFragment profileDetailsFragment, View view) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        C9726vo.d(profileDetailsFragment.getActivity(), profileDetailsFragment.n, new drX<FragmentActivity, InterfaceC5283bvo, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$setupLanguagesButtons$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(FragmentActivity fragmentActivity, InterfaceC5283bvo interfaceC5283bvo) {
                d(fragmentActivity, interfaceC5283bvo);
                return dpR.c;
            }

            public final void d(FragmentActivity fragmentActivity, InterfaceC5283bvo interfaceC5283bvo) {
                C8632dsu.c((Object) fragmentActivity, "");
                C8632dsu.c((Object) interfaceC5283bvo, "");
                ProfileDetailsFragment profileDetailsFragment2 = ProfileDetailsFragment.this;
                LanguageSelectorType languageSelectorType = LanguageSelectorType.CONTENT_LANGUAGES;
                String[] languages = interfaceC5283bvo.getLanguages();
                C8632dsu.d(languages);
                String str = languages[0];
                C8632dsu.a(str, "");
                List<String> secondaryLanguages = interfaceC5283bvo.getSecondaryLanguages();
                C8632dsu.a(secondaryLanguages, "");
                profileDetailsFragment2.e(languageSelectorType, str, secondaryLanguages);
            }
        });
    }

    private final void c(C5858cKz c5858cKz) {
        C1203Sq c1203Sq = c5858cKz.m;
        C5947cOg c5947cOg = C5947cOg.d;
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        c1203Sq.setText(c5947cOg.a(requireContext, C5855cKw.i.M, C5855cKw.i.f13678J));
        c5858cKz.m.setOnClickListener(new View.OnClickListener() { // from class: o.cNg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileDetailsFragment.l(ProfileDetailsFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final ProfileDetailsFragment profileDetailsFragment, View view) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        C9726vo.d(profileDetailsFragment.getActivity(), profileDetailsFragment.n, new drX<FragmentActivity, InterfaceC5283bvo, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$setupSubtitleAppearanceButton$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(FragmentActivity fragmentActivity, InterfaceC5283bvo interfaceC5283bvo) {
                a(fragmentActivity, interfaceC5283bvo);
                return dpR.c;
            }

            public final void a(FragmentActivity fragmentActivity, InterfaceC5283bvo interfaceC5283bvo) {
                C8632dsu.c((Object) fragmentActivity, "");
                C8632dsu.c((Object) interfaceC5283bvo, "");
                ProfileDetailsFragment.this.Q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(LanguageSelectorType languageSelectorType, String str, List<String> list) {
        cOJ c2 = cOJ.d.c();
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        String str2 = this.r;
        if (str2 != null) {
            startActivityForResult(c2.c(requireContext, str2, languageSelectorType, str, list), 6002);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        cOY a2 = cOY.b.a();
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        String str = this.r;
        if (str != null) {
            startActivityForResult(a2.b(requireContext, str), 6002);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        cKD e2 = e();
        String str = this.r;
        if (str != null) {
            startActivityForResult(e2.e(str), 6004);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void b(C5858cKz c5858cKz) {
        SwitchCompat switchCompat = c5858cKz.g;
        C5947cOg c5947cOg = C5947cOg.d;
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        switchCompat.setText(c5947cOg.a(requireContext, R.o.kD, R.o.kK));
        SwitchCompat switchCompat2 = c5858cKz.i;
        Context requireContext2 = requireContext();
        C8632dsu.a(requireContext2, "");
        switchCompat2.setText(c5947cOg.a(requireContext2, R.o.kI, R.o.kJ));
    }

    private final void W() {
        C5858cKz b2;
        b bVar = this.t;
        C1204Sr c1204Sr = (bVar == null || (b2 = bVar.b()) == null) ? null : b2.b;
        if (c1204Sr == null) {
            return;
        }
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        c1204Sr.setVisibility((interfaceC5283bvo == null || !interfaceC5283bvo.isDefaultKidsProfile()) ? 8 : 0);
    }

    private final void Z() {
        C5858cKz b2;
        CharSequence text;
        b bVar = this.t;
        if (bVar == null || (b2 = bVar.b()) == null) {
            return;
        }
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        if (interfaceC5283bvo == null || !interfaceC5283bvo.isProfileLocked()) {
            text = requireContext.getResources().getText(C5855cKw.i.E);
        } else {
            text = requireContext.getResources().getText(C5855cKw.i.F);
        }
        C8632dsu.d(text);
        C1203Sq c1203Sq = b2.n;
        C5947cOg c5947cOg = C5947cOg.d;
        CharSequence text2 = requireContext.getResources().getText(C5855cKw.i.G);
        C8632dsu.a(text2, "");
        c1203Sq.setText(c5947cOg.c(requireContext, text2, text));
        C1203Sq c1203Sq2 = b2.n;
        C8632dsu.a(c1203Sq2, "");
        c1203Sq2.setVisibility(0);
        C1203Sq c1203Sq3 = b2.n;
        C8632dsu.a(c1203Sq3, "");
        c1203Sq3.setOnClickListener(new View.OnClickListener() { // from class: o.cNc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileDetailsFragment.k(ProfileDetailsFragment.this, view);
            }
        });
        c1203Sq3.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final ProfileDetailsFragment profileDetailsFragment, View view) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        C9726vo.d(profileDetailsFragment.getActivity(), profileDetailsFragment.n, new drX<FragmentActivity, InterfaceC5283bvo, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$updateProfileLockUI$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(FragmentActivity fragmentActivity, InterfaceC5283bvo interfaceC5283bvo) {
                d(fragmentActivity, interfaceC5283bvo);
                return dpR.c;
            }

            public final void d(FragmentActivity fragmentActivity, InterfaceC5283bvo interfaceC5283bvo) {
                C8632dsu.c((Object) fragmentActivity, "");
                C8632dsu.c((Object) interfaceC5283bvo, "");
                ProfileDetailsFragment.this.P();
            }
        });
    }

    private final void a(InterfaceC5283bvo interfaceC5283bvo, C5858cKz c5858cKz) {
        String string;
        C1203Sq c1203Sq = c5858cKz.f;
        C8632dsu.a(c1203Sq, "");
        c1203Sq.setVisibility(8);
        final Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        C1203Sq c1203Sq2 = c5858cKz.r;
        C8632dsu.a(c1203Sq2, "");
        c1203Sq2.setVisibility(0);
        boolean hasTitleRestrictions = interfaceC5283bvo.hasTitleRestrictions();
        if (interfaceC5283bvo.isMaturityHighest() && !hasTitleRestrictions) {
            string = getString(C5855cKw.i.H);
        } else {
            string = getString(C5855cKw.i.L);
        }
        C8632dsu.d((Object) string);
        C1203Sq c1203Sq3 = c5858cKz.r;
        C5947cOg c5947cOg = C5947cOg.d;
        CharSequence text = requireContext.getResources().getText(C5855cKw.i.N);
        C8632dsu.a(text, "");
        c1203Sq3.setText(c5947cOg.c(requireContext, text, string));
        C1203Sq c1203Sq4 = c5858cKz.r;
        C8632dsu.a(c1203Sq4, "");
        c1203Sq4.setOnClickListener(new View.OnClickListener() { // from class: o.cNh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileDetailsFragment.a(ProfileDetailsFragment.this, requireContext, view);
            }
        });
        c1203Sq4.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ProfileDetailsFragment profileDetailsFragment, Context context, View view) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        C8632dsu.c((Object) context, "");
        ProfileControlsActivity.e eVar = ProfileControlsActivity.b;
        String str = profileDetailsFragment.r;
        if (str != null) {
            profileDetailsFragment.startActivityForResult(eVar.e(context, str, "viewingRestrictions"), 6005);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void a(final InterfaceC5283bvo interfaceC5283bvo) {
        C5858cKz b2;
        dpR dpr;
        List<String> maturityLabels;
        String c2;
        b bVar = this.t;
        if (bVar == null || (b2 = bVar.b()) == null) {
            return;
        }
        InterfaceC5283bvo interfaceC5283bvo2 = this.n;
        boolean z = (interfaceC5283bvo2 == null || interfaceC5283bvo2.isKidsProfile()) ? false : true;
        Boolean bool = G().get();
        C8632dsu.a(bool, "");
        if (bool.booleanValue() && !(!z) && interfaceC5283bvo != null) {
            a(interfaceC5283bvo, b2);
            return;
        }
        C1203Sq c1203Sq = b2.r;
        C8632dsu.a(c1203Sq, "");
        c1203Sq.setVisibility(8);
        if (interfaceC5283bvo == null || (maturityLabels = interfaceC5283bvo.getMaturityLabels()) == null) {
            dpr = null;
        } else if (maturityLabels.isEmpty()) {
            c(false);
            return;
        } else {
            c(true);
            final String str = maturityLabels.get(0);
            if (interfaceC5283bvo.isMaturityLowest()) {
                c2 = str;
            } else if (interfaceC5283bvo.isMaturityHighest()) {
                c2 = getString(C5855cKw.i.H);
            } else {
                c2 = C1333Xq.d(C5855cKw.i.I).d("maturityRating", str).c();
            }
            Context requireContext = requireContext();
            C8632dsu.a(requireContext, "");
            C1203Sq c1203Sq2 = b2.f;
            C5947cOg c5947cOg = C5947cOg.d;
            CharSequence text = requireContext.getResources().getText(C5855cKw.i.C);
            C8632dsu.a(text, "");
            C8632dsu.d((Object) c2);
            c1203Sq2.setText(c5947cOg.c(requireContext, text, c2));
            b2.f.setOnClickListener(new View.OnClickListener() { // from class: o.cNb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileDetailsFragment.d(ProfileDetailsFragment.this, interfaceC5283bvo, str, view);
                }
            });
            dpr = dpR.c;
        }
        if (dpr == null) {
            c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ProfileDetailsFragment profileDetailsFragment, InterfaceC5283bvo interfaceC5283bvo, String str, View view) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        C8632dsu.d((Object) str);
        profileDetailsFragment.c(interfaceC5283bvo, str);
    }

    private final void c(boolean z) {
        C5858cKz b2;
        b bVar = this.t;
        C1203Sq c1203Sq = (bVar == null || (b2 = bVar.b()) == null) ? null : b2.f;
        if (c1203Sq == null) {
            return;
        }
        c1203Sq.setVisibility(z ? 0 : 8);
    }

    private final void ab() {
        InterfaceC5283bvo interfaceC5283bvo;
        List<? extends InterfaceC5283bvo> e2;
        Object obj;
        this.n = null;
        if (this.r != null) {
            ServiceManager bl_ = bl_();
            if (bl_ == null || (e2 = bl_.e()) == null) {
                interfaceC5283bvo = null;
            } else {
                Iterator<T> it = e2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C8632dsu.c((Object) ((InterfaceC5283bvo) obj).getProfileGuid(), (Object) this.r)) {
                        break;
                    }
                }
                interfaceC5283bvo = (InterfaceC5283bvo) obj;
            }
            this.n = interfaceC5283bvo;
            if (interfaceC5283bvo == null) {
                this.r = null;
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) status, "");
        aa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void T() {
        List<? extends InterfaceC5283bvo> e2;
        ServiceManager bl_ = bl_();
        InterfaceC5283bvo interfaceC5283bvo = null;
        if (bl_ != null && (e2 = bl_.e()) != null) {
            Iterator<T> it = e2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C8632dsu.c((Object) ((InterfaceC5283bvo) next).getProfileGuid(), (Object) this.r)) {
                    interfaceC5283bvo = next;
                    break;
                }
            }
            interfaceC5283bvo = interfaceC5283bvo;
        }
        this.n = interfaceC5283bvo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        InterfaceC5283bvo interfaceC5283bvo = this.n;
        if (interfaceC5283bvo != null) {
            boolean c2 = C8632dsu.c(this.m, this.p);
            AvatarInfo avatarInfo = new AvatarInfo(interfaceC5283bvo.getProfileName(), interfaceC5283bvo.getAvatarUrl(), true);
            this.p = avatarInfo;
            if (c2 || this.m == null) {
                this.m = avatarInfo;
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        FragmentActivity activity;
        super.onDestroyView();
        this.t = null;
        if (isRemoving() || ((activity = getActivity()) != null && activity.isFinishing())) {
            a().b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 6001 && i2 == -1) {
            AvatarInfo avatarInfo = this.m;
            this.m = C5928cNo.b.c(intent);
            b.getLogTag();
            if (!C8632dsu.c(this.m, avatarInfo)) {
                C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$onActivityResult$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                        e(serviceManager);
                        return dpR.c;
                    }

                    public final void e(ServiceManager serviceManager) {
                        C8632dsu.c((Object) serviceManager, "");
                        ProfileDetailsFragment.this.U();
                    }
                });
            }
            aa();
        } else if (i == 6002 && i2 == -1) {
            b(intent);
        } else if (i == MP.h) {
            ((bXE) C1332Xp.b(bXE.class)).a(i2);
        } else if (i == 6004) {
            ab();
            Z();
        } else if (i == 6005) {
            ab();
            a(this.n);
        }
    }

    private final void b(Intent intent) {
        C9726vo.d(intent != null ? intent.getStringExtra("extra_selector_type") : null, intent != null ? intent.getStringArrayListExtra("extra_selections_results") : null, new drX<String, ArrayList<String>, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$processLanguageResults$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(String str, ArrayList<String> arrayList) {
                d(str, arrayList);
                return dpR.c;
            }

            public final void d(final String str, final ArrayList<String> arrayList) {
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) arrayList, "");
                final ProfileDetailsFragment profileDetailsFragment = ProfileDetailsFragment.this;
                C1645aIz.a(profileDetailsFragment, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$processLanguageResults$1.1

                    /* renamed from: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$processLanguageResults$1$1$c */
                    /* loaded from: classes4.dex */
                    public final /* synthetic */ class c {
                        public static final /* synthetic */ int[] b;

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
                            b = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                        c(serviceManager);
                        return dpR.c;
                    }

                    public final void c(ServiceManager serviceManager) {
                        C8632dsu.c((Object) serviceManager, "");
                        String str2 = str;
                        C8632dsu.a(str2, "");
                        int i = c.b[LanguageSelectorType.valueOf(str2).ordinal()];
                        if (i == 1) {
                            profileDetailsFragment.k = arrayList.get(0);
                        } else if (i == 2) {
                            profileDetailsFragment.f13310o = arrayList;
                        }
                        profileDetailsFragment.U();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean z, boolean z2) {
        b bVar = this.t;
        if (bVar != null) {
            boolean z3 = true;
            if (z) {
                bVar.d().a(true);
            } else {
                bVar.d().b(true);
            }
            C5858cKz b2 = bVar.b();
            boolean z4 = !z;
            b2.f13680o.setEnabled(z4);
            b2.k.setEnabled(z4);
            b2.a.setEnabled(z4);
            b2.f.setEnabled(z4);
            b2.h.setEnabled(z4);
            b2.d.setEnabled(z4);
            b2.m.setEnabled(z4);
            b2.g.setEnabled(z4);
            b2.i.setEnabled(z4);
            b2.c.setEnabled((!b(this.m) || z) ? false : false);
            if (z2) {
                b2.f13680o.animate().alpha(z ? 0.4f : 1.0f).setDuration(400L).start();
            } else {
                b2.f13680o.setAlpha(z ? 0.4f : 1.0f);
            }
        }
    }

    private final void N() {
        if (((dpR) C9726vo.d(bj_(), this.n, new drX<NetflixActivity, InterfaceC5283bvo, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$deleteProfile$1
            private static int c = 1;
            private static int e = 0;
            private static byte e$ss2$42 = 24;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(NetflixActivity netflixActivity, InterfaceC5283bvo interfaceC5283bvo) {
                e(netflixActivity, interfaceC5283bvo);
                return dpR.c;
            }

            public final void e(NetflixActivity netflixActivity, InterfaceC5283bvo interfaceC5283bvo) {
                String str;
                DialogInterface.OnClickListener J2;
                Handler handler;
                int i = 2 % 2;
                int i2 = c + 67;
                e = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    C8632dsu.c((Object) netflixActivity, "");
                    C8632dsu.c((Object) interfaceC5283bvo, "");
                    ProfileDetailsFragment.this.O();
                    C8126deW.a(netflixActivity);
                    obj.hashCode();
                    throw null;
                }
                C8632dsu.c((Object) netflixActivity, "");
                C8632dsu.c((Object) interfaceC5283bvo, "");
                ProfileDetailsFragment.this.O();
                InterfaceC5283bvo a2 = C8126deW.a(netflixActivity);
                if (a2 != null) {
                    str = a2.getProfileGuid();
                } else {
                    int i3 = e + NetflixImageView.DEFAULT_LAYER_GRAVITY;
                    c = i3 % 128;
                    int i4 = i3 % 2;
                    str = null;
                }
                if (!C8632dsu.c((Object) str, (Object) interfaceC5283bvo.getProfileGuid())) {
                    cLM.e eVar = cLM.b;
                    String profileName = interfaceC5283bvo.getProfileName();
                    C8632dsu.a(profileName, "");
                    J2 = ProfileDetailsFragment.this.J();
                    netflixActivity.showDialog(eVar.d(profileName, J2));
                    return;
                }
                String string = netflixActivity.getString(R.o.ks);
                if (string.startsWith("'!#+")) {
                    int i5 = c + 123;
                    e = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = new Object[1];
                    b(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
                String string2 = netflixActivity.getString(R.o.f13253fi);
                if (string2.startsWith("'!#+")) {
                    Object[] objArr2 = new Object[1];
                    b(string2.substring(4), objArr2);
                    string2 = ((String) objArr2[0]).intern();
                }
                C1907aSr c1907aSr = new C1907aSr(null, string, string2, null);
                handler = ProfileDetailsFragment.this.q;
                netflixActivity.displayDialog(C1163Rc.e(netflixActivity, handler, c1907aSr));
            }

            private void b(String str, Object[] objArr) {
                byte[] decode = Base64.decode(str, 0);
                byte[] bArr = new byte[decode.length];
                for (int i = 0; i < decode.length; i++) {
                    bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$42);
                }
                objArr[0] = new String(bArr, StandardCharsets.UTF_8);
            }
        })) == null) {
            bg_();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogInterface.OnClickListener J() {
        return new DialogInterface.OnClickListener() { // from class: o.cNd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ProfileDetailsFragment.d(ProfileDetailsFragment.this, dialogInterface, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final ProfileDetailsFragment profileDetailsFragment, DialogInterface dialogInterface, final int i) {
        C8632dsu.c((Object) profileDetailsFragment, "");
        C9726vo.d(profileDetailsFragment.bl_(), profileDetailsFragment.n, new drX<ServiceManager, InterfaceC5283bvo, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$createDeleteDialogListener$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(ServiceManager serviceManager, InterfaceC5283bvo interfaceC5283bvo) {
                e(serviceManager, interfaceC5283bvo);
                return dpR.c;
            }

            public final void e(ServiceManager serviceManager, InterfaceC5283bvo interfaceC5283bvo) {
                C8632dsu.c((Object) serviceManager, "");
                C8632dsu.c((Object) interfaceC5283bvo, "");
                int i2 = i;
                if (i2 == -1) {
                    ProfileDetailsFragment.c cVar = ProfileDetailsFragment.b;
                    profileDetailsFragment.b(true, true);
                    String profileGuid = interfaceC5283bvo.getProfileGuid();
                    C8632dsu.a(profileGuid, "");
                    serviceManager.d(profileGuid, new a(profileDetailsFragment, profileGuid));
                } else if (i2 == -2) {
                    ProfileDetailsFragment.c cVar2 = ProfileDetailsFragment.b;
                    C5934cNu c5934cNu = C5934cNu.b;
                    String profileGuid2 = interfaceC5283bvo.getProfileGuid();
                    C8632dsu.a(profileGuid2, "");
                    c5934cNu.e(profileGuid2, profileDetailsFragment.bh_());
                }
            }

            /* loaded from: classes4.dex */
            public static final class a extends AbstractC5164btb {
                final /* synthetic */ ProfileDetailsFragment a;
                final /* synthetic */ String d;

                a(ProfileDetailsFragment profileDetailsFragment, String str) {
                    this.a = profileDetailsFragment;
                    this.d = str;
                }

                @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
                public void d(Status status, AccountData accountData) {
                    CompositeDisposable bk_;
                    NetflixActivity bj_;
                    C8632dsu.c((Object) status, "");
                    if (status.i() && (bj_ = this.a.bj_()) != null) {
                        InterfaceC1640aIu.b.a(InterfaceC1640aIu.d, bj_, status, false, 4, null);
                        bj_.setResult(0);
                    }
                    C5934cNu.b.b(this.d, this.a.bh_(), status);
                    if (status.j()) {
                        this.a.bg_();
                    } else if (status.c() == StatusCode.NO_PROFILES_FOUND || status.c() == StatusCode.PROFILE_OPERATION_ERROR) {
                        bk_ = this.a.bk_();
                        Observable<cQQ.e> o2 = new cQQ().o();
                        ProfileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$2 profileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$2 = ProfileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$2.b;
                        final ProfileDetailsFragment profileDetailsFragment = this.a;
                        DisposableKt.plusAssign(bk_, SubscribersKt.subscribeBy$default(o2, profileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$2, (drO) null, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0069: INVOKE  
                              (r7v2 'bk_' io.reactivex.disposables.CompositeDisposable)
                              (wrap: io.reactivex.disposables.Disposable : 0x0065: INVOKE  (r8v8 io.reactivex.disposables.Disposable A[REMOVE]) = 
                              (r0v2 'o2' io.reactivex.Observable<o.cQQ$e>)
                              (r1v2 'profileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$2' com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$2)
                              (wrap: o.drO : ?: CAST (o.drO) (null o.drO))
                              (wrap: o.drM<o.cQQ$e, o.dpR> : 0x0060: CONSTRUCTOR  (r3v0 o.drM<o.cQQ$e, o.dpR> A[REMOVE]) = (r8v7 'profileDetailsFragment' com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment A[DONT_INLINE]) call: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$3.<init>(com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment):void type: CONSTRUCTOR)
                              (2 int)
                              (wrap: java.lang.Object : ?: CAST (java.lang.Object) (null java.lang.Object))
                             type: STATIC call: io.reactivex.rxkotlin.SubscribersKt.subscribeBy$default(io.reactivex.Observable, o.drM, o.drO, o.drM, int, java.lang.Object):io.reactivex.disposables.Disposable)
                             type: STATIC call: io.reactivex.rxkotlin.DisposableKt.plusAssign(io.reactivex.disposables.CompositeDisposable, io.reactivex.disposables.Disposable):void in method: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$createDeleteDialogListener$1$1.a.d(com.netflix.mediaclient.android.app.Status, com.netflix.mediaclient.service.webclient.model.leafs.AccountData):void, file: classes4.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:133)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$3, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 23 more
                            */
                        /*
                            this = this;
                            java.lang.String r8 = ""
                            o.C8632dsu.c(r7, r8)
                            boolean r8 = r7.i()
                            if (r8 == 0) goto L21
                            com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment r8 = r6.a
                            com.netflix.mediaclient.android.activity.NetflixActivity r8 = r8.bj_()
                            if (r8 == 0) goto L21
                            o.aIu$b r0 = o.InterfaceC1640aIu.d
                            r3 = 0
                            r4 = 4
                            r5 = 0
                            r1 = r8
                            r2 = r7
                            o.InterfaceC1640aIu.b.a(r0, r1, r2, r3, r4, r5)
                            r0 = 0
                            r8.setResult(r0)
                        L21:
                            o.cNu r8 = o.C5934cNu.b
                            java.lang.String r0 = r6.d
                            com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment r1 = r6.a
                            com.netflix.cl.model.AppView r1 = r1.bh_()
                            r8.b(r0, r1, r7)
                            boolean r8 = r7.j()
                            if (r8 == 0) goto L3a
                            com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment r7 = r6.a
                            r7.bg_()
                            goto L6c
                        L3a:
                            com.netflix.mediaclient.StatusCode r8 = r7.c()
                            com.netflix.mediaclient.StatusCode r0 = com.netflix.mediaclient.StatusCode.NO_PROFILES_FOUND
                            if (r8 == r0) goto L4a
                            com.netflix.mediaclient.StatusCode r7 = r7.c()
                            com.netflix.mediaclient.StatusCode r8 = com.netflix.mediaclient.StatusCode.PROFILE_OPERATION_ERROR
                            if (r7 != r8) goto L6c
                        L4a:
                            com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment r7 = r6.a
                            io.reactivex.disposables.CompositeDisposable r7 = com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment.d(r7)
                            o.cQQ r8 = new o.cQQ
                            r8.<init>()
                            io.reactivex.Observable r0 = r8.o()
                            com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$2 r1 = com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$2.b
                            r2 = 0
                            com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$3 r3 = new com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$createDeleteDialogListener$1$1$deleteRequestCallback$1$onProfileListUpdateStatus$3
                            com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment r8 = r6.a
                            r3.<init>(r8)
                            r4 = 2
                            r5 = 0
                            io.reactivex.disposables.Disposable r8 = io.reactivex.rxkotlin.SubscribersKt.subscribeBy$default(r0, r1, r2, r3, r4, r5)
                            io.reactivex.rxkotlin.DisposableKt.plusAssign(r7, r8)
                        L6c:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$createDeleteDialogListener$1$1.a.d(com.netflix.mediaclient.android.app.Status, com.netflix.mediaclient.service.webclient.model.leafs.AccountData):void");
                    }
                }
            });
        }

        private final void c(final InterfaceC5283bvo interfaceC5283bvo, String str) {
            int i;
            String string;
            String string2;
            int i2 = 2 % 2;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                LayoutInflater layoutInflater = activity.getLayoutInflater();
                C8632dsu.a(layoutInflater, "");
                View inflate = layoutInflater.inflate(C5855cKw.c.f13675o, (ViewGroup) null);
                View findViewById = inflate.findViewById(C5855cKw.d.l);
                C8632dsu.a(findViewById, "");
                if (!interfaceC5283bvo.isKidsProfile()) {
                    i = 8;
                } else {
                    int i3 = y + 105;
                    u = i3 % 128;
                    i = i3 % 2 != 0 ? 1 : 0;
                }
                findViewById.setVisibility(i);
                C1204Sr c1204Sr = (C1204Sr) inflate.findViewById(C5855cKw.d.s);
                if (!interfaceC5283bvo.isMaturityHighest()) {
                    string = str;
                } else {
                    int i4 = u + 15;
                    y = i4 % 128;
                    if (i4 % 2 == 0) {
                        activity.getString(R.o.kA).startsWith("'!#+");
                        throw null;
                    }
                    int i5 = R.o.kA;
                    string = activity.getString(i5);
                    if (string.startsWith("'!#+")) {
                        Object[] objArr = new Object[1];
                        v(string.substring(4), objArr);
                        string = ((String) objArr[0]).intern();
                        CharSequence text = activity.getText(i5);
                        if (text instanceof Spanned) {
                            SpannableString spannableString = new SpannableString(string);
                            TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                            string = spannableString;
                        }
                    }
                }
                c1204Sr.setText(string);
                C1204Sr c1204Sr2 = (C1204Sr) inflate.findViewById(C5855cKw.d.q);
                if (interfaceC5283bvo.isMaturityLowest()) {
                    int i6 = y + 65;
                    u = i6 % 128;
                    int i7 = i6 % 2;
                    string2 = C1333Xq.d(R.o.kC).d("maturityRating", str).c();
                } else {
                    string2 = interfaceC5283bvo.isMaturityHighest() ? getString(R.o.kF) : C1333Xq.d(R.o.kE).d("maturityRating", str).c();
                }
                c1204Sr2.setText(Html.fromHtml(string2, 0));
                new AlertDialog.Builder(activity, C9834xU.o.c).setTitle(C5855cKw.i.C).setView(inflate).setPositiveButton(R.o.kp, new DialogInterface.OnClickListener() { // from class: o.cNa
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        ProfileDetailsFragment.c(ProfileDetailsFragment.this, interfaceC5283bvo, dialogInterface, i8);
                    }
                }).setNegativeButton(R.o.cL, (DialogInterface.OnClickListener) null).show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(ProfileDetailsFragment profileDetailsFragment, InterfaceC5283bvo interfaceC5283bvo, DialogInterface dialogInterface, int i) {
            C8632dsu.c((Object) profileDetailsFragment, "");
            C8632dsu.c((Object) interfaceC5283bvo, "");
            profileDetailsFragment.x = true;
            CLv2Utils.d(new EditContentRestrictionCommand());
            C3983bRx c3983bRx = new C3983bRx(profileDetailsFragment.bj_());
            String profileGuid = interfaceC5283bvo.getProfileGuid();
            C3983bRx.e(c3983bRx, "profiles/restrictions/" + profileGuid, false, null, 6, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            if (r2.isKidsProfile() == true) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void L() {
            /*
                r5 = this;
                com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r0 = r5.m
                boolean r0 = r5.b(r0)
                if (r0 == 0) goto L36
                androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
                if (r0 == 0) goto L36
                o.coI$a r0 = o.C7017coI.c
                o.coI r0 = r0.e()
                o.aHp$f r1 = o.AbstractC1608aHp.f.d
                o.coI$e r0 = r0.d(r1)
                java.lang.String r1 = r5.r
                o.bvo r2 = r5.n
                r3 = 0
                if (r2 == 0) goto L29
                boolean r2 = r2.isKidsProfile()
                r4 = 1
                if (r2 != r4) goto L29
                goto L2a
            L29:
                r4 = r3
            L2a:
                o.aHp$e r2 = new o.aHp$e
                r2.<init>(r1, r4, r3)
                o.coI$e r0 = r0.d(r2)
                r0.b(r5)
            L36:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment.L():void");
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean b(o.InterfaceC5283bvo r18, java.lang.String r19, com.netflix.mediaclient.servicemgr.ServiceManager r20) {
            /*
                r17 = this;
                r0 = r17
                com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$b r1 = r0.t
                r2 = 0
                if (r1 == 0) goto La8
                o.cKz r1 = r1.b()
                if (r1 != 0) goto Lf
                goto La8
            Lf:
                java.lang.String r3 = r18.getAvatarUrl()
                com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r4 = r0.m
                r5 = 0
                if (r4 == 0) goto L1d
                java.lang.String r4 = r4.getUrl()
                goto L1e
            L1d:
                r4 = r5
            L1e:
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 == 0) goto L25
                goto L2f
            L25:
                com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r3 = r0.m
                if (r3 == 0) goto L2f
                java.lang.String r3 = r3.getName()
                r10 = r3
                goto L30
            L2f:
                r10 = r5
            L30:
                java.lang.String r3 = r0.k
                if (r3 == 0) goto L4b
                java.lang.String[] r3 = r18.getLanguages()
                if (r3 == 0) goto L3d
                r2 = r3[r2]
                goto L3e
            L3d:
                r2 = r5
            L3e:
                java.lang.String r3 = r0.k
                boolean r2 = o.C8632dsu.c(r2, r3)
                if (r2 == 0) goto L47
                goto L4b
            L47:
                java.lang.String r2 = r0.k
                r12 = r2
                goto L4c
            L4b:
                r12 = r5
            L4c:
                java.util.List<java.lang.String> r2 = r0.f13310o
                if (r2 == 0) goto L61
                java.util.List r2 = r18.getSecondaryLanguages()
                java.util.List<java.lang.String> r3 = r0.f13310o
                boolean r2 = o.C8632dsu.c(r2, r3)
                if (r2 == 0) goto L5d
                goto L61
            L5d:
                java.util.List<java.lang.String> r2 = r0.f13310o
                r13 = r2
                goto L62
            L61:
                r13 = r5
            L62:
                boolean r2 = r18.isAutoPlayEnabled()
                androidx.appcompat.widget.SwitchCompat r3 = r1.g
                boolean r3 = r3.isChecked()
                if (r2 != r3) goto L70
                r14 = r5
                goto L7b
            L70:
                androidx.appcompat.widget.SwitchCompat r2 = r1.g
                boolean r2 = r2.isChecked()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r14 = r2
            L7b:
                boolean r2 = r18.disableVideoMerchAutoPlay()
                androidx.appcompat.widget.SwitchCompat r3 = r1.i
                boolean r3 = r3.isChecked()
                r4 = 1
                if (r2 == r3) goto L8a
            L88:
                r15 = r5
                goto L96
            L8a:
                androidx.appcompat.widget.SwitchCompat r1 = r1.i
                boolean r1 = r1.isChecked()
                r1 = r1 ^ r4
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                goto L88
            L96:
                java.lang.String r7 = r18.getProfileGuid()
                com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$a r1 = r0.s
                r9 = 0
                r11 = 0
                r6 = r20
                r8 = r19
                r16 = r1
                r6.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r4
            La8:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment.b(o.bvo, java.lang.String, com.netflix.mediaclient.servicemgr.ServiceManager):boolean");
        }

        private final boolean R() {
            C5858cKz b2;
            EditText editText;
            Editable text;
            b bVar = this.t;
            CharSequence n = (bVar == null || (b2 = bVar.b()) == null || (editText = b2.k) == null || (text = editText.getText()) == null) ? null : duD.n(text);
            InterfaceC5283bvo interfaceC5283bvo = this.n;
            return !C8632dsu.c((Object) n, (Object) (interfaceC5283bvo != null ? interfaceC5283bvo.getProfileName() : null));
        }

        private final boolean b(AvatarInfo avatarInfo) {
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

        @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
        public boolean bD_() {
            NetflixActivity bj_ = bj_();
            NetflixActivity bj_2 = bj_();
            NetflixActionBar netflixActionBar = bj_2 != null ? bj_2.getNetflixActionBar() : null;
            NetflixActivity bj_3 = bj_();
            C9726vo.d(bj_, netflixActionBar, bj_3 != null ? bj_3.getActionBarStateBuilder() : null, ProfileDetailsFragment$updateActionBar$1.d);
            return true;
        }

        private final boolean M() {
            if (bl_() == null || this.m == null) {
                return true;
            }
            b bVar = this.t;
            C5858cKz b2 = bVar != null ? bVar.b() : null;
            if (getActivity() == null || b2 == null) {
                return true;
            }
            Editable text = b2.k.getText();
            C8632dsu.a(text, "");
            String d2 = d(text);
            if (d2 != null) {
                b2.k.setError(d2);
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(CharSequence charSequence) {
            ServiceManager bl_;
            List<? extends InterfaceC5283bvo> e2;
            CharSequence n;
            boolean d2;
            boolean d3;
            boolean d4;
            boolean d5;
            if (getActivity() == null || (bl_ = bl_()) == null || (e2 = bl_.e()) == null) {
                return null;
            }
            n = duD.n(charSequence);
            d2 = duD.d(n, (CharSequence) "\"", false, 2, (Object) null);
            if (!d2) {
                d3 = duD.d(n, (CharSequence) "<", false, 2, (Object) null);
                if (!d3) {
                    d4 = duD.d(n, (CharSequence) ">", false, 2, (Object) null);
                    if (!d4) {
                        int length = n.length() - 1;
                        int i = 0;
                        boolean z = false;
                        while (i <= length) {
                            boolean z2 = C8632dsu.d(n.charAt(!z ? i : length), 32) <= 0;
                            if (z) {
                                if (!z2) {
                                    break;
                                }
                                length--;
                            } else if (z2) {
                                i++;
                            } else {
                                z = true;
                            }
                        }
                        if (TextUtils.isEmpty(n.subSequence(i, length + 1))) {
                            return getString(R.o.kV);
                        }
                        if (!e2.isEmpty()) {
                            for (InterfaceC5283bvo interfaceC5283bvo : e2) {
                                if (!C8632dsu.c((Object) interfaceC5283bvo.getProfileGuid(), (Object) this.r)) {
                                    d5 = C8691duz.d(n, interfaceC5283bvo.getProfileName(), true);
                                    if (d5) {
                                        return getString(R.o.ky);
                                    }
                                }
                            }
                        }
                        return null;
                    }
                }
            }
            return getString(R.o.kU);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void O() {
            C5858cKz b2;
            FragmentActivity activity = getActivity();
            b bVar = this.t;
            C9726vo.d(activity, (bVar == null || (b2 = bVar.b()) == null) ? null : b2.k, new drX<FragmentActivity, EditText, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$removeFocusAndHideKeyboard$1
                @Override // o.drX
                public /* synthetic */ dpR invoke(FragmentActivity fragmentActivity, EditText editText) {
                    e(fragmentActivity, editText);
                    return dpR.c;
                }

                public final void e(FragmentActivity fragmentActivity, EditText editText) {
                    C8632dsu.c((Object) fragmentActivity, "");
                    C8632dsu.c((Object) editText, "");
                    editText.clearFocus();
                    C8150deu.b(fragmentActivity, editText);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
            if (r0.isKidsProfile() == true) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.netflix.cl.model.ProfileSettings K() {
            /*
                r7 = this;
                o.bvo r0 = r7.n
                if (r0 == 0) goto L9
                int r0 = r0.getMaturityValue()
                goto Lc
            L9:
                r0 = 1000000(0xf4240, float:1.401298E-39)
            Lc:
                r5 = r0
                o.cNu r1 = o.C5934cNu.b
                com.netflix.mediaclient.servicemgr.ServiceManager r2 = r7.bl_()
                com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r3 = r7.m
                o.bvo r0 = r7.n
                if (r0 == 0) goto L21
                boolean r0 = r0.isKidsProfile()
                r4 = 1
                if (r0 != r4) goto L21
                goto L23
            L21:
                r0 = 0
                r4 = r0
            L23:
                o.bvo r6 = r7.n
                com.netflix.cl.model.ProfileSettings r0 = r1.b(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment.K():com.netflix.cl.model.ProfileSettings");
        }

        @SuppressLint({"AutoDispose"})
        private final void S() {
            b(true, false);
            CompositeDisposable bk_ = bk_();
            Observable<cQQ.e> observeOn = new cQQ().o().observeOn(AndroidSchedulers.mainThread());
            Observable subscribeOn = Observable.create(new d(this)).subscribeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(subscribeOn, "");
            Observable<cQQ.e> takeUntil = observeOn.takeUntil(subscribeOn);
            C8632dsu.a(takeUntil, "");
            DisposableKt.plusAssign(bk_, SubscribersKt.subscribeBy$default(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$refreshProfile$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    a(th);
                    return dpR.c;
                }

                public final void a(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    ProfileDetailsFragment.this.bg_();
                }
            }, (drO) null, new drM<cQQ.e, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileDetailsFragment$refreshProfile$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cQQ.e eVar) {
                    c(eVar);
                    return dpR.c;
                }

                public final void c(cQQ.e eVar) {
                    ProfileDetailsFragment.this.T();
                    ProfileDetailsFragment.this.V();
                    ProfileDetailsFragment.this.aa();
                    ProfileDetailsFragment.this.b(false, false);
                }
            }, 2, (Object) null));
        }

        @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            b.getLogTag();
            ab();
            if (!this.l) {
                V();
            }
            aa();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void U() {
            C5858cKz b2;
            CharSequence n;
            b.getLogTag();
            ServiceManager bl_ = bl_();
            if ((bl_ != null ? bl_.e() : null) == null) {
                return;
            }
            if (M()) {
                C5934cNu.b.b(this.r, K(), bh_());
                return;
            }
            b bVar = this.t;
            if (bVar == null || (b2 = bVar.b()) == null) {
                return;
            }
            O();
            n = duD.n((CharSequence) b2.k.getText().toString());
            String obj = n.toString();
            InterfaceC5283bvo interfaceC5283bvo = this.n;
            ServiceManager bl_2 = bl_();
            if (bl_2 != null && interfaceC5283bvo != null) {
                b(interfaceC5283bvo, obj, bl_2);
                return;
            }
            String str = this.r;
            if (str == null) {
                C5934cNu.d(C5934cNu.b, new AddProfile(null, bh_(), K(), null, null), null, null, null, 12, null);
            } else if (str != null) {
                C5934cNu.d(C5934cNu.b, new EditProfile(null, str, bh_(), K(), null, null), null, null, null, 12, null);
            }
            requireActivity().setResult(0);
            bg_();
        }

        @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d, view.getPaddingRight(), this.h);
        }

        private void v(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$9820);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }
