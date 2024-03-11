package o;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetworkErrorStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import io.reactivex.functions.Consumer;
import java.nio.charset.StandardCharsets;
import o.C3983bRx;
import o.C8012dcO;
import o.C9834xU;
import o.cQQ;

@SuppressLint({"AutoDispose", "CheckResult"})
/* renamed from: o.dcO  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8012dcO extends NetflixDialogFrag {
    private static byte e$ss2$2611 = 24;
    private static int k = 0;

    /* renamed from: o  reason: collision with root package name */
    private static int f13826o = 1;
    private boolean a;
    private TextView b;
    private AlertDialog c;
    private InterfaceC8018dcU d;
    private int e;
    private boolean f;
    private PlayVerifierVault g;
    private ProgressBar h;
    private boolean i;
    private boolean j = false;

    public void d(InterfaceC8018dcU interfaceC8018dcU) {
        this.d = interfaceC8018dcU;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static C8012dcO e(PlayVerifierVault playVerifierVault) {
        C1044Mm.e("nf_age", "creating dialog");
        C8012dcO c8012dcO = new C8012dcO();
        Bundle bundle = new Bundle();
        bundle.putParcelable("PlayVerifierVault", playVerifierVault);
        c8012dcO.setArguments(bundle);
        c8012dcO.setStyle(1, com.netflix.mediaclient.ui.R.l.g);
        return c8012dcO;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        super.onCreate(bundle);
        this.i = true;
        boolean z = bundle != null;
        this.f = z;
        C1044Mm.e("nf_age", String.format("onCreateDialog - mIsActive:%b,  restored=%b", Boolean.valueOf(this.a), Boolean.valueOf(z)));
        if (this.f) {
            this.i = bundle.getBoolean("age_progress");
        }
        this.g = (PlayVerifierVault) getArguments().getParcelable("PlayVerifierVault");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C9834xU.o.c);
        View inflate = getActivity().getLayoutInflater().inflate(com.netflix.mediaclient.ui.R.i.f, (ViewGroup) null);
        this.h = (ProgressBar) inflate.findViewById(com.netflix.mediaclient.ui.R.g.aX);
        this.b = (TextView) inflate.findViewById(com.netflix.mediaclient.ui.R.g.n);
        this.e = C8150deu.h() ? 400 : 320;
        builder.setView(inflate);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.setButton(-2, getString(com.netflix.mediaclient.ui.R.o.cL), new d());
        create.setButton(-1, getString(com.netflix.mediaclient.ui.R.o.cy), new b());
        this.a = true;
        this.c = create;
        return create;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1044Mm.e("nf_age", "onSavedInstanceState");
        bundle.putBoolean("age_progress", this.i);
    }

    private void e(boolean z) {
        int i;
        int i2 = 2 % 2;
        this.i = z;
        this.h.setVisibility(!z ? 8 : 0);
        TextView textView = this.b;
        if (z) {
            i = com.netflix.mediaclient.ui.R.o.cB;
        } else {
            i = com.netflix.mediaclient.ui.R.o.cz;
            int i3 = f13826o + 103;
            k = i3 % 128;
            int i4 = i3 % 2;
        }
        Context context = textView.getContext();
        String string = context.getString(i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            l(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                int i5 = f13826o + 113;
                k = i5 % 128;
                int i6 = i5 % 2;
                string = spannableString;
            }
        }
        textView.setText(string);
        a(!z);
        int i7 = f13826o + 105;
        k = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void a(boolean z) {
        Button button = this.c.getButton(-1);
        if (button != null) {
            button.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C1044Mm.e("nf_age", "onCancel");
        this.a = false;
        f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C1044Mm.e("nf_age", "onResume");
        i();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        C1044Mm.e("nf_age", "onStart");
        super.onStart();
        e(this.i);
        NetflixActivity netflixActivity = getNetflixActivity();
        if (this.f || netflixActivity == null) {
            return;
        }
        C1044Mm.e("nf_age", "starting age verification");
        a(netflixActivity);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        super.onManagerReady(serviceManager, status);
        C1044Mm.e("nf_age", "onManagerReady - starting age verification");
        NetflixActivity netflixActivity = getNetflixActivity();
        if (netflixActivity != null) {
            a(netflixActivity);
        }
    }

    private void a(NetflixActivity netflixActivity) {
        new cQQ().m().takeUntil(netflixActivity.getActivityDestroy()).subscribe(new Consumer() { // from class: o.dcN
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8012dcO.this.a((cQQ.b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(cQQ.b bVar) {
        e(bVar.c(), bVar.b());
    }

    private void a() {
        this.a = false;
        e(false);
    }

    /* renamed from: o.dcO$d */
    /* loaded from: classes5.dex */
    class d implements DialogInterface.OnClickListener {
        private d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C1044Mm.e("nf_age", "onCancel button");
            C8012dcO.this.e();
            C8012dcO.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dcO$b */
    /* loaded from: classes5.dex */
    public class b implements DialogInterface.OnClickListener {
        private b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C1044Mm.e("nf_age", "verifyButton clicked - going to webview");
            final NetflixActivity netflixActivity = C8012dcO.this.getNetflixActivity();
            C1044Mm.e("nf_age", "Get autologin token...");
            final C3983bRx c3983bRx = new C3983bRx(netflixActivity);
            final NetworkErrorStatus networkErrorStatus = new NetworkErrorStatus(C8237dgb.c);
            final Runnable runnable = new Runnable() { // from class: o.dcQ
                @Override // java.lang.Runnable
                public final void run() {
                    C8012dcO.b.this.e(c3983bRx, networkErrorStatus);
                }
            };
            netflixActivity.getHandler().postDelayed(runnable, 10000L);
            new cQQ().c(3600000L).takeUntil(netflixActivity.getActivityDestroy()).subscribe(new Consumer() { // from class: o.dcR
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8012dcO.b.this.d(netflixActivity, runnable, c3983bRx, (cQQ.d) obj);
                }
            }, new Consumer() { // from class: o.dcT
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8012dcO.b.this.b((Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(boolean z) {
            C8012dcO.this.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(C3983bRx c3983bRx, Status status) {
            c3983bRx.c(null, status, null, new C3983bRx.c() { // from class: o.dcS
                @Override // o.C3983bRx.c
                public final void c(boolean z) {
                    C8012dcO.b.this.b(z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(NetflixActivity netflixActivity, Runnable runnable, C3983bRx c3983bRx, cQQ.d dVar) {
            netflixActivity.getHandler().removeCallbacks(runnable);
            c3983bRx.c(dVar.b(), dVar.e(), "https://www.netflix.com/verifyage", new C3983bRx.c() { // from class: o.dcP
                @Override // o.C3983bRx.c
                public final void c(boolean z) {
                    C8012dcO.b.this.c(z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(boolean z) {
            C8012dcO.this.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Throwable th) {
            C8012dcO.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        C8187dfe.c(new Runnable() { // from class: o.dcK
            @Override // java.lang.Runnable
            public final void run() {
                C8012dcO.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.a) {
            e();
        }
        if (this.j) {
            return;
        }
        this.j = true;
        f();
    }

    private void i() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        try {
            layoutParams.copyFrom(getDialog().getWindow().getAttributes());
            layoutParams.width = (int) (TypedValue.applyDimension(1, this.e, getResources().getDisplayMetrics()) + 0.5f);
            getDialog().getWindow().setAttributes(layoutParams);
        } catch (Exception e) {
            C1044Mm.d("nf_age", "Could not set windowSize e:" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        C1044Mm.e("nf_age", "dismissing age dialog");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        this.a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        C1044Mm.e("nf_pin", String.format("%s onAgeCancelled vault: %s", NetflixActivity.class.getSimpleName(), this.g));
        if (this.g == null) {
            C1044Mm.e("nf_age", "mValut is null - cannot start playback");
        } else if (PlayVerifierVault.RequestedBy.e.c().equals(this.g.b()) && getActivity() != null) {
            NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(getActivity(), NetflixActivity.class);
            if (netflixActivity != null) {
                netflixActivity.sendIntentToNetflixService(C6575cfr.a(getActivity(), "com.netflix.mediaclient.intent.action.MDX_ACTION_PINCANCELLED", this.g.a()));
            }
        } else if (PlayVerifierVault.RequestedBy.c.c().equals(this.g.b())) {
            InterfaceC8018dcU interfaceC8018dcU = this.d;
            if (interfaceC8018dcU != null) {
                interfaceC8018dcU.onPlayVerified(false, this.g);
            } else {
                C1044Mm.e("nf_age", "notifyCallerAgeCancelled PLAYER callback is null");
            }
        } else if (PlayVerifierVault.RequestedBy.b.c().equals(this.g.b())) {
            InterfaceC8018dcU interfaceC8018dcU2 = this.d;
            if (interfaceC8018dcU2 != null) {
                interfaceC8018dcU2.onOfflineDownloadPinAndAgeVerified(false, this.g);
            } else {
                C1044Mm.e("nf_age", "notifyCallerAgeCancelled OFFLINE_DOWNLOAD callback is null");
            }
        }
    }

    public void e(boolean z, Status status) {
        C1044Mm.e("nf_age", String.format("onVerified mVault:%s", this.g));
        if (!this.a) {
            C1044Mm.e("nf_age", "dialog was cancelled before.. nothing to do");
            return;
        }
        C1044Mm.a("nf_age", "onAgeVerified statusCode:%d", Integer.valueOf(status.c().getValue()));
        if (status.j() && z) {
            e();
            C8021dcX.a((NetflixActivity) getActivity(), this.g, this.d);
            return;
        }
        a();
    }

    private void l(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$2611);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
