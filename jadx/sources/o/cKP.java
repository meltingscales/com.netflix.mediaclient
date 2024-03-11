package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.model.AppView;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.profilelock.api.PinVerifySource;
import com.netflix.mediaclient.ui.profilelock.impl.DeletePinDialog;
import com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog;
import com.netflix.mediaclient.ui.profilelock.impl.ValidatePasswordDialog;
import com.netflix.mediaclient.ui.profilelock.impl.VerifyPinDialog;
import com.netflix.mediaclient.util.AccessibilityUtils;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import o.AbstractApplicationC1040Mh;
import o.AbstractC1017Lk;
import o.C5863cLd;
import o.C8632dsu;
import o.C9872yF;
import o.C9878yL;
import o.aEY;
import o.cKB;
import o.cKP;
import o.dpR;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class cKP extends cKN {
    public static final c b;
    public static final int e;
    private static byte e$ss2$4010 = 0;
    private static int p = 0;
    private static int r = 1;
    private final AppView j = AppView.profileLockSettings;
    private e k;
    private final boolean l;
    private boolean m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC5283bvo f13671o;
    private final InterfaceC8554dpx q;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PinVerifySource.values().length];
            try {
                iArr[PinVerifySource.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinVerifySource.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr;
        }
    }

    static {
        a();
        b = new c(null);
        e = 8;
    }

    private final boolean G() {
        return (this.n || this.m) ? false : true;
    }

    static void a() {
        e$ss2$4010 = (byte) 24;
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

    public cKP() {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.profilelock.impl.ProfileLockFragment$profileId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final String invoke() {
                String string = cKP.this.requireArguments().getString("extra_profile_id");
                if (string != null) {
                    return string;
                }
                throw new IllegalArgumentException("profileId cannot be null".toString());
            }
        });
        this.q = b2;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ProfileLock");
        }

        public final cKP e(Bundle bundle) {
            cKP ckp = new cKP();
            ckp.setArguments(bundle);
            return ckp;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e {
        private final C5877cLr c;

        public final C5877cLr a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C5877cLr c5877cLr = this.c;
            return "Holder(viewBinding=" + c5877cLr + ")";
        }

        public e(C5877cLr c5877cLr) {
            C8632dsu.c((Object) c5877cLr, "");
            this.c = c5877cLr;
        }
    }

    private final String e() {
        return (String) this.q.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        C5877cLr c2 = C5877cLr.c(layoutInflater, viewGroup, false);
        C8632dsu.a(c2, "");
        this.k = new e(c2);
        L();
        b.getLogTag();
        return c2.d();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
        C8632dsu.a(netflixImmutableStatus, "");
        d(netflixImmutableStatus);
        I();
        SubscribersKt.subscribeBy$default(C9935zP.b.d(by_()).d(cKB.class), (drM) null, (drO) null, new drM<cKB, dpR>() { // from class: com.netflix.mediaclient.ui.profilelock.impl.ProfileLockFragment$onViewCreated$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cKB ckb) {
                b(ckb);
                return dpR.c;
            }

            public final void b(cKB ckb) {
                C8632dsu.c((Object) ckb, "");
                if (!(ckb instanceof cKB.a)) {
                    if (!(ckb instanceof cKB.b)) {
                        if (!(ckb instanceof cKB.d)) {
                            if (ckb instanceof cKB.c) {
                                cKP.this.e((cKB.c) ckb);
                                return;
                            }
                            return;
                        }
                        cKP.b.getLogTag();
                        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
                        if (k != null) {
                            k.c(new aEY(((cKB.d) ckb).a().e(), false, 2, null));
                        }
                        cKP.this.e("DeletePinDialogTag");
                        C9872yF c9872yF = cKP.this.by_().composeViewOverlayManager;
                        C8632dsu.a(c9872yF, "");
                        String string = cKP.this.getString(C5863cLd.a.b);
                        C8632dsu.a(string, "");
                        C9878yL.d(c9872yF, (r22 & 1) != 0 ? Modifier.Companion : null, string, (r22 & 4) != 0 ? null : HawkinsIcon.aY.e, (r22 & 8) != 0 ? null : null, (r22 & 16) != 0 ? new AbstractC1017Lk.d(null, 1, null) : null, (r22 & 32) != 0 ? Theme.b : Theme.b, (r22 & 64) != 0 ? 3000 : 3000, (r22 & 128) != 0, (r22 & JSONzip.end) != 0 ? null : null);
                        cKP.this.L();
                        return;
                    }
                    cKP.b.getLogTag();
                    UserAgent k2 = AbstractApplicationC1040Mh.getInstance().i().k();
                    if (k2 != null) {
                        k2.c(new aEY(((cKB.b) ckb).d().b(), false, 2, null));
                    }
                    cKP.this.e("ProfileLockPinDialog");
                    C9872yF c9872yF2 = cKP.this.by_().composeViewOverlayManager;
                    C8632dsu.a(c9872yF2, "");
                    String string2 = cKP.this.getString(C5863cLd.a.h);
                    C8632dsu.a(string2, "");
                    C9878yL.d(c9872yF2, (r22 & 1) != 0 ? Modifier.Companion : null, string2, (r22 & 4) != 0 ? null : HawkinsIcon.aY.e, (r22 & 8) != 0 ? null : null, (r22 & 16) != 0 ? new AbstractC1017Lk.d(null, 1, null) : null, (r22 & 32) != 0 ? Theme.b : Theme.b, (r22 & 64) != 0 ? 3000 : 3000, (r22 & 128) != 0, (r22 & JSONzip.end) != 0 ? null : null);
                    cKP.this.L();
                    return;
                }
                cKP.b.getLogTag();
                if (((cKB.a) ckb).e()) {
                    cKP.this.e("PasswordValidDialog");
                    cKP.this.n = true;
                    cKP.this.a(false);
                }
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(cKB.c cVar) {
        this.m = true;
        int i = b.b[cVar.a().ordinal()];
        if (i == 1) {
            a(true);
        } else if (i != 2) {
        } else {
            F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        C5877cLr a;
        C5877cLr a2;
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        ConstraintLayout constraintLayout = null;
        InterfaceC5283bvo b2 = k != null ? k.b(e()) : null;
        this.f13671o = b2;
        boolean z = b2 != null && b2.isProfileLocked();
        b.getLogTag();
        e eVar = this.k;
        LinearLayout linearLayout = (eVar == null || (a2 = eVar.a()) == null) ? null : a2.e;
        if (linearLayout != null) {
            linearLayout.setVisibility(z ? 0 : 8);
        }
        e eVar2 = this.k;
        if (eVar2 != null && (a = eVar2.a()) != null) {
            constraintLayout = a.d;
        }
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setVisibility(z ^ true ? 0 : 8);
    }

    private final void I() {
        C5877cLr a;
        e eVar = this.k;
        if (eVar == null || (a = eVar.a()) == null) {
            return;
        }
        C1203Sq c1203Sq = a.g;
        C8632dsu.a(c1203Sq, "");
        c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.cKX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cKP.b(cKP.this, view);
            }
        });
        c1203Sq.setClickable(true);
        C1204Sr c1204Sr = a.a;
        C8632dsu.a(c1204Sr, "");
        c1204Sr.setOnClickListener(new View.OnClickListener() { // from class: o.cKV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cKP.a(cKP.this, view);
            }
        });
        c1204Sr.setClickable(true);
        C1204Sr c1204Sr2 = a.a;
        C8632dsu.a(c1204Sr2, "");
        AccessibilityUtils.RoleDescription roleDescription = AccessibilityUtils.RoleDescription.e;
        AccessibilityUtils.e(c1204Sr2, roleDescription, null, null, 6, null);
        C1204Sr c1204Sr3 = a.c;
        C8632dsu.a(c1204Sr3, "");
        c1204Sr3.setOnClickListener(new View.OnClickListener() { // from class: o.cKU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cKP.j(cKP.this, view);
            }
        });
        c1204Sr3.setClickable(true);
        C1204Sr c1204Sr4 = a.c;
        C8632dsu.a(c1204Sr4, "");
        AccessibilityUtils.e(c1204Sr4, roleDescription, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cKP ckp, View view) {
        C8632dsu.c((Object) ckp, "");
        ckp.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cKP ckp, View view) {
        C8632dsu.c((Object) ckp, "");
        if (ckp.G()) {
            ckp.d(PinVerifySource.e);
        } else {
            ckp.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(cKP ckp, View view) {
        C8632dsu.c((Object) ckp, "");
        if (ckp.G()) {
            ckp.d(PinVerifySource.a);
        } else {
            ckp.F();
        }
    }

    private final void J() {
        final NetflixActivity by_ = by_();
        Fragment findFragmentByTag = by_.getSupportFragmentManager().findFragmentByTag("PasswordValidDialog");
        if (findFragmentByTag == null || !findFragmentByTag.isAdded()) {
            C8187dfe.e.a().post(new Runnable() { // from class: o.cKR
                @Override // java.lang.Runnable
                public final void run() {
                    cKP.b(NetflixActivity.this, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(NetflixActivity netflixActivity, cKP ckp) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) ckp, "");
        if (C9737vz.a(netflixActivity) || netflixActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        ValidatePasswordDialog validatePasswordDialog = new ValidatePasswordDialog();
        new Bundle().putString("extra_profile_id", ckp.e());
        validatePasswordDialog.setStyle(2, C5863cLd.d.b);
        validatePasswordDialog.showNow(netflixActivity.getSupportFragmentManager(), "PasswordValidDialog");
    }

    private final void F() {
        final NetflixActivity by_ = by_();
        Fragment findFragmentByTag = by_.getSupportFragmentManager().findFragmentByTag("DeletePinDialogTag");
        if (findFragmentByTag == null || !findFragmentByTag.isAdded()) {
            C8187dfe.e.a().post(new Runnable() { // from class: o.cKQ
                @Override // java.lang.Runnable
                public final void run() {
                    cKP.d(NetflixActivity.this, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(NetflixActivity netflixActivity, cKP ckp) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) ckp, "");
        if (C9737vz.a(netflixActivity) || netflixActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        Bundle bundle = new Bundle();
        b.getLogTag();
        bundle.putString("extra_profile_id", ckp.e());
        DeletePinDialog c2 = DeletePinDialog.a.c(bundle);
        c2.setStyle(2, C5863cLd.d.b);
        c2.showNow(netflixActivity.getSupportFragmentManager(), "DeletePinDialogTag");
    }

    private final void d(final PinVerifySource pinVerifySource) {
        final NetflixActivity by_ = by_();
        Fragment findFragmentByTag = by_.getSupportFragmentManager().findFragmentByTag("PinVerifyDialog");
        if (findFragmentByTag == null || !findFragmentByTag.isAdded()) {
            C8187dfe.e.a().post(new Runnable() { // from class: o.cKT
                @Override // java.lang.Runnable
                public final void run() {
                    cKP.c(NetflixActivity.this, this, pinVerifySource);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(NetflixActivity netflixActivity, cKP ckp, PinVerifySource pinVerifySource) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) ckp, "");
        C8632dsu.c((Object) pinVerifySource, "");
        if (C9737vz.a(netflixActivity) || netflixActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_profile_id", ckp.e());
        VerifyPinDialog d = VerifyPinDialog.b.d(bundle, pinVerifySource);
        d.setStyle(2, C5863cLd.d.b);
        d.showNow(netflixActivity.getSupportFragmentManager(), "PinVerifyDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final boolean z) {
        final NetflixActivity by_ = by_();
        Fragment findFragmentByTag = by_.getSupportFragmentManager().findFragmentByTag("ProfileLockPinDialog");
        if (findFragmentByTag == null || !findFragmentByTag.isAdded()) {
            C8187dfe.e.a().post(new Runnable() { // from class: o.cKW
                @Override // java.lang.Runnable
                public final void run() {
                    cKP.d(NetflixActivity.this, this, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(NetflixActivity netflixActivity, cKP ckp, boolean z) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) ckp, "");
        if (C9737vz.a(netflixActivity) || netflixActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_profile_id", ckp.e());
        bundle.putBoolean("extra_pin_edit_mode", z);
        ProfileLockPinDialog a = ProfileLockPinDialog.a.a(bundle);
        a.setStyle(2, C5863cLd.d.b);
        a.showNow(netflixActivity.getSupportFragmentManager(), "ProfileLockPinDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String str) {
        FragmentManager supportFragmentManager;
        NetflixActivity bj_ = bj_();
        Fragment findFragmentByTag = (bj_ == null || (supportFragmentManager = bj_.getSupportFragmentManager()) == null) ? null : supportFragmentManager.findFragmentByTag(str);
        DialogFragment dialogFragment = findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.k = null;
        super.onDestroyView();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        int i = 2 % 2;
        int i2 = p + 43;
        r = i2 % 128;
        int i3 = i2 % 2;
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            NetflixActionBar.b.C0051b actionBarStateBuilder = bj_.getActionBarStateBuilder();
            NetflixActionBar.b.C0051b k = actionBarStateBuilder.k(true);
            String string = bj_.getString(com.netflix.mediaclient.ui.R.o.D);
            if (string.startsWith("'!#+")) {
                int i4 = r + 29;
                p = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                t(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            }
            NetflixActionBar.b.C0051b b2 = k.b(string);
            String string2 = bj_.getString(C5863cLd.a.j);
            if (!(!string2.startsWith("'!#+"))) {
                int i6 = p + 15;
                r = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr2 = new Object[1];
                t(string2.substring(4), objArr2);
                string2 = ((String) objArr2[0]).intern();
            }
            b2.e((CharSequence) string2);
            NetflixActionBar netflixActionBar = bj_.getNetflixActionBar();
            if (netflixActionBar != null) {
                netflixActionBar.c(actionBarStateBuilder.c());
            }
        }
        int i8 = p + 41;
        r = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 75 / 0;
        }
        return true;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d, view.getPaddingRight(), this.h);
    }

    private void t(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$4010);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
