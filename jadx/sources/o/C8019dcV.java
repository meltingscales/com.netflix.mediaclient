package o;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import io.reactivex.functions.Consumer;
import java.nio.charset.StandardCharsets;
import o.C9834xU;
import o.cQQ;

/* renamed from: o.dcV  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8019dcV extends NetflixDialogFrag {
    private static final Uri a;
    private static byte e$ss2$4516 = 0;
    private static int q = 0;
    private static int r = 1;
    protected boolean b;
    private InterfaceC8018dcU c;
    private int d;
    private ImageView e;
    public EditText g;
    public TextView h;
    public TextView j;
    private ProgressBar k;
    private boolean l;
    protected PlayVerifierVault m;
    protected Long n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13827o;
    public int f = 4;
    protected int i = 4;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(int i) {
        return i >= this.f;
    }

    static void o() {
        e$ss2$4516 = (byte) 24;
    }

    public void b(Dialog dialog) {
    }

    public boolean g() {
        return this.l;
    }

    static {
        o();
        a = Uri.parse("http://www.netflix.com/PIN");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static C8019dcV d(PlayVerifierVault playVerifierVault) {
        C1044Mm.e("nf_pin", "creating dialog");
        C8019dcV c8019dcV = new C8019dcV();
        Bundle bundle = new Bundle();
        bundle.putParcelable("PlayVerifierVault", playVerifierVault);
        c8019dcV.setArguments(bundle);
        c8019dcV.setStyle(1, com.netflix.mediaclient.ui.R.l.g);
        return c8019dcV;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(this.b);
        objArr[1] = Boolean.valueOf(bundle != null);
        C1044Mm.e("nf_pin", String.format("onCreateDialog - mIsActive:%b,  restored=%b", objArr));
        if (bundle != null) {
            this.l = bundle.getBoolean("pin_progress");
            this.f13827o = bundle.getBoolean("pin_error");
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.m = (PlayVerifierVault) arguments.getParcelable("PlayVerifierVault");
        }
        final FragmentActivity requireActivity = requireActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity, C9834xU.o.c);
        boolean z = getResources().getConfiguration().orientation == 2;
        boolean h = C8150deu.h();
        View inflate = requireActivity.getLayoutInflater().inflate((!z || h) ? com.netflix.mediaclient.ui.R.i.aP : com.netflix.mediaclient.ui.R.i.aN, (ViewGroup) null);
        this.k = (ProgressBar) inflate.findViewById(com.netflix.mediaclient.ui.R.g.bc);
        this.g = (EditText) inflate.findViewById(com.netflix.mediaclient.ui.R.g.em);
        a(4);
        this.g.setOnEditorActionListener(new e());
        this.g.addTextChangedListener(new a());
        this.j = (TextView) inflate.findViewById(com.netflix.mediaclient.ui.R.g.et);
        TextView textView = (TextView) inflate.findViewById(com.netflix.mediaclient.ui.R.g.en);
        this.h = textView;
        textView.setText(C8168dfL.c(getString(com.netflix.mediaclient.ui.R.o.fG)));
        TextView textView2 = this.h;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: o.dcV.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C8019dcV c8019dcV = C8019dcV.this;
                c8019dcV.h.setTextColor(c8019dcV.getResources().getColor(com.netflix.mediaclient.ui.R.c.t));
                Intent intent = new Intent("android.intent.action.VIEW", C8019dcV.a);
                if (intent.resolveActivity(requireActivity.getPackageManager()) != null) {
                    C8019dcV.this.startActivity(intent);
                }
            }
        });
        this.h.setFocusable(false);
        this.e = (ImageView) inflate.findViewById(com.netflix.mediaclient.ui.R.g.eo);
        this.d = h ? 400 : z ? 480 : 320;
        b(this.f13827o);
        a(this.l);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        c(create, z);
        this.b = true;
        b(create);
        return create;
    }

    protected void c(AlertDialog alertDialog, boolean z) {
        if (C8150deu.h() || !z) {
            alertDialog.setCanceledOnTouchOutside(false);
            alertDialog.setButton(-2, getString(com.netflix.mediaclient.ui.R.o.cL), new c());
            return;
        }
        alertDialog.setCanceledOnTouchOutside(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1044Mm.e("nf_pin", "onSavedInstanceState");
        bundle.putBoolean("pin_progress", this.l);
        bundle.putBoolean("pin_error", this.f13827o);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C1044Mm.e("nf_pin", "onCancel");
        this.b = false;
        f();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C1044Mm.e("nf_pin", "onResume");
        b();
        if (this.l) {
            return;
        }
        m();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C1044Mm.e("nf_pin", "onStart");
        if (C8082ddf.a().g()) {
            C1044Mm.e("nf_pin", "onStart - dismissOnForeground");
            d();
        }
        this.n = Logger.INSTANCE.startSession(new Presentation(AppView.pinPrompt, null));
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        super.onManagerReady(serviceManager, status);
        C1044Mm.e("nf_pin", "onManagerReady");
        if (this.l) {
            C1044Mm.e("nf_pin", "doing pin validation again for restored dialog");
            String obj = this.g.getText().toString();
            NetflixActivity netflixActivity = getNetflixActivity();
            if (netflixActivity != null) {
                a(netflixActivity, obj);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Long l = this.n;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
            this.n = null;
        }
    }

    public void c(InterfaceC8018dcU interfaceC8018dcU) {
        C1044Mm.e("nf_pin", "setPinVerifierCallback");
        this.c = interfaceC8018dcU;
    }

    public void a(int i) {
        if (i != this.i) {
            this.i = i;
            this.g.setHint(C8168dfL.c("-", i));
            InputFilter[] filters = this.g.getFilters();
            if (filters != null) {
                InputFilter[] inputFilterArr = new InputFilter[filters.length];
                int i2 = 0;
                for (InputFilter inputFilter : filters) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        inputFilterArr[i2] = inputFilter;
                    } else {
                        inputFilterArr[i2] = new InputFilter.LengthFilter(i);
                    }
                    i2++;
                }
                this.g.setFilters(inputFilterArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dcV$c */
    /* loaded from: classes5.dex */
    public class c implements DialogInterface.OnClickListener {
        private c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C8019dcV c8019dcV = C8019dcV.this;
            c8019dcV.b = false;
            c8019dcV.d();
        }
    }

    /* renamed from: o.dcV$a */
    /* loaded from: classes5.dex */
    class a implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            if (C8019dcV.this.l) {
                return;
            }
            int length = obj.length();
            C8019dcV c8019dcV = C8019dcV.this;
            if (length >= c8019dcV.i) {
                c8019dcV.g.setEnabled(false);
                NetflixActivity netflixActivity = C8019dcV.this.getNetflixActivity();
                if (netflixActivity != null) {
                    C8019dcV.this.a(netflixActivity, obj);
                    return;
                }
                return;
            }
            c8019dcV.g.setEnabled(true);
            C8019dcV.this.g.setError(null, null);
            C8019dcV.this.b(false);
        }
    }

    /* renamed from: o.dcV$e */
    /* loaded from: classes5.dex */
    class e implements TextView.OnEditorActionListener {
        private e() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            if (C8019dcV.this.l) {
                return true;
            }
            String charSequence = textView.getText().toString();
            if (C8019dcV.this.c(charSequence.length())) {
                NetflixActivity netflixActivity = C8019dcV.this.getNetflixActivity();
                if (netflixActivity == null) {
                    C1044Mm.e("nf_pin", "activity is null");
                    return false;
                }
                C8019dcV.this.a(netflixActivity, charSequence);
                return false;
            }
            return true;
        }
    }

    @SuppressLint({"AutoDispose", "CheckResult"})
    protected void a(NetflixActivity netflixActivity, String str) {
        a(true);
        b(false);
        C8150deu.e(c(netflixActivity), this.g);
        C1044Mm.e("nf_pin", "onEditorAction gotDone! password: " + str);
        new cQQ().b(str, UserAgent.PinType.MATURITY_PIN, null).takeUntil(netflixActivity.getActivityDestroy()).subscribe(new Consumer() { // from class: o.ddc
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8019dcV.this.b((cQQ.b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(cQQ.b bVar) {
        c(bVar.c(), bVar.b());
    }

    public void c(boolean z, Status status) {
        C1044Mm.e("nf_pin", "onVerified");
        if (!this.b) {
            C1044Mm.e("nf_pin", "dialog was cancelled before.. nothing to do");
            return;
        }
        a(false);
        if (status.j() && !z) {
            j();
            return;
        }
        h();
        if (status.j()) {
            C8082ddf.a().h();
            d((NetflixActivity) getActivity(), this.m, this.c);
            return;
        }
        NetflixActivity netflixActivity = (NetflixActivity) getActivity();
        if (netflixActivity != null) {
            c(netflixActivity, status);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
        if ((r2 instanceof android.text.Spanned) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
        r3 = new android.text.SpannableString(r4);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r2, 0, r4.length(), java.lang.Object.class, r3, 0);
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
        if ((r2 instanceof android.text.Spanned) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j() {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            android.widget.TextView r1 = r13.j
            int r2 = com.netflix.mediaclient.ui.R.o.fF
            android.content.Context r3 = r1.getContext()
            java.lang.String r4 = r3.getString(r2)
            java.lang.String r5 = "'!#+"
            boolean r5 = r4.startsWith(r5)
            r6 = 1
            if (r5 == 0) goto L6f
            int r5 = o.C8019dcV.q
            int r5 = r5 + 29
            int r7 = r5 % 128
            o.C8019dcV.r = r7
            int r5 = r5 % r0
            r7 = 4
            r8 = 0
            java.lang.String r4 = r4.substring(r7)
            if (r5 != 0) goto L42
            java.lang.Object[] r5 = new java.lang.Object[r6]
            t(r4, r5)
            r4 = r5[r8]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            java.lang.CharSequence r2 = r3.getText(r2)
            boolean r3 = r2 instanceof android.text.Spanned
            r5 = 26
            int r5 = r5 / r8
            if (r3 == 0) goto L6f
            goto L57
        L42:
            java.lang.Object[] r5 = new java.lang.Object[r6]
            t(r4, r5)
            r4 = r5[r8]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            java.lang.CharSequence r2 = r3.getText(r2)
            boolean r3 = r2 instanceof android.text.Spanned
            if (r3 == 0) goto L6f
        L57:
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r4)
            r7 = r2
            android.text.SpannedString r7 = (android.text.SpannedString) r7
            r8 = 0
            int r9 = r4.length()
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r2 = r3
            android.text.SpannableString r2 = (android.text.SpannableString) r2
            r12 = 0
            r11 = r3
            android.text.TextUtils.copySpansFrom(r7, r8, r9, r10, r11, r12)
            r4 = r3
        L6f:
            r1.setText(r4)
            android.widget.EditText r1 = r13.g
            android.text.Editable r1 = r1.getText()
            r1.clear()
            r13.b(r6)
            r13.m()
            int r1 = o.C8019dcV.q
            int r1 = r1 + 39
            int r2 = r1 % 128
            o.C8019dcV.r = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L8d
            return
        L8d:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8019dcV.j():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(NetflixActivity netflixActivity, PlayVerifierVault playVerifierVault, InterfaceC8018dcU interfaceC8018dcU) {
        if (playVerifierVault == null || netflixActivity == null) {
            C1044Mm.e("nf_pin", "mVault or activity is null - cannot start playback");
        } else if (PlayVerifierVault.RequestedBy.a.c().equals(playVerifierVault.b())) {
            if (playVerifierVault.d() == null) {
                C1044Mm.e("nf_pin", "videoid is null - cannot start playback");
                return;
            }
            playVerifierVault.e().b(true);
            aGH.a(netflixActivity).a(playVerifierVault);
        } else if (PlayVerifierVault.RequestedBy.e.c().equals(playVerifierVault.b())) {
            netflixActivity.sendIntentToNetflixService(C6575cfr.a(netflixActivity, "com.netflix.mediaclient.intent.action.MDX_ACTION_PINCONFIRMED", playVerifierVault.a()));
        } else if (PlayVerifierVault.RequestedBy.c.c().equals(playVerifierVault.b())) {
            if (interfaceC8018dcU != null) {
                interfaceC8018dcU.onPlayVerified(true, playVerifierVault);
            } else {
                C1044Mm.a("nf_pin", "notifyCallerPinVerified RequestedBy.PLAYER callback is null");
            }
        } else if (PlayVerifierVault.RequestedBy.b.c().equals(playVerifierVault.b())) {
            if (interfaceC8018dcU != null) {
                interfaceC8018dcU.onOfflineDownloadPinAndAgeVerified(true, playVerifierVault);
            } else {
                C1044Mm.a("nf_pin", "notifyCallerPinVerified RequestedBy.OFFLINE_DOWNLOAD callback is null");
            }
        }
    }

    protected void d() {
        h();
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        C1044Mm.e("nf_pin", String.format("%s onPinCancelled vault: %s", NetflixActivity.class.getSimpleName(), this.m));
        if (this.m == null) {
            C1044Mm.e("nf_pin", "mVault is null - cannot start playback");
        } else if (PlayVerifierVault.RequestedBy.e.c().equals(this.m.b()) && getActivity() != null) {
            Intent a2 = C6575cfr.a(getActivity(), "com.netflix.mediaclient.intent.action.MDX_ACTION_PINCANCELLED", this.m.a());
            NetflixActivity netflixActivity = (NetflixActivity) C8054ddD.a(getActivity(), NetflixActivity.class);
            if (netflixActivity != null) {
                netflixActivity.sendIntentToNetflixService(a2);
            }
        } else if (PlayVerifierVault.RequestedBy.c.c().equals(this.m.b())) {
            InterfaceC8018dcU interfaceC8018dcU = this.c;
            if (interfaceC8018dcU != null) {
                interfaceC8018dcU.onPlayVerified(false, this.m);
            } else {
                C1044Mm.a("nf_pin", "notifyCallerPinCancelled RequestedBy.PLAYER callback is null");
            }
        } else if (PlayVerifierVault.RequestedBy.b.c().equals(this.m.b())) {
            InterfaceC8018dcU interfaceC8018dcU2 = this.c;
            if (interfaceC8018dcU2 != null) {
                interfaceC8018dcU2.onOfflineDownloadPinAndAgeVerified(false, this.m);
            } else {
                C1044Mm.a("nf_pin", "notifyCallerPinCancelled RequestedBy.OFFLINE_DOWNLOAD callback is null");
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public void dismiss() {
        this.c = null;
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        C1044Mm.e("nf_pin", "dismissing pin dialog");
        try {
            getDialog().dismiss();
            C8082ddf.a().d();
        } catch (Exception unused) {
            C1044Mm.e("nf_pin", "app in backgound. cannot dismiss - retry on next start");
        }
    }

    public void m() {
        if (this.g.isFocused()) {
            d(this.g);
            return;
        }
        this.g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ddb
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C8019dcV.this.b(view, z);
            }
        });
        this.g.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view, final boolean z) {
        this.g.postDelayed(new Runnable() { // from class: o.dcZ
            @Override // java.lang.Runnable
            public final void run() {
                C8019dcV.this.c(z);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(boolean z) {
        if (z) {
            d(this.g);
        }
    }

    private void d(EditText editText) {
        InputMethodManager c2 = c(getNetflixActivity());
        if (c2 != null) {
            c2.showSoftInput(editText, 1);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.g != null) {
            C8150deu.e(c(getNetflixActivity()), this.g);
        }
        super.onDismiss(dialogInterface);
    }

    public InputMethodManager c(NetflixActivity netflixActivity) {
        if (netflixActivity != null) {
            return (InputMethodManager) netflixActivity.getSystemService("input_method");
        }
        return null;
    }

    public void a(boolean z) {
        a(z, z ? getString(com.netflix.mediaclient.ui.R.o.fI) : null);
    }

    public void a(boolean z, String str) {
        this.l = z;
        this.k.setVisibility(z ? 0 : 8);
        this.g.setVisibility(z ? 4 : 0);
        d(!z);
        if (z) {
            this.j.setText(str);
        }
    }

    protected void d(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }

    public void b(boolean z) {
        this.f13827o = z;
        this.e.setVisibility(z ? 0 : 8);
    }

    private void b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        try {
            layoutParams.copyFrom(getDialog().getWindow().getAttributes());
            layoutParams.width = (int) (TypedValue.applyDimension(1, this.d, getResources().getDisplayMetrics()) + 0.5f);
            getDialog().getWindow().setAttributes(layoutParams);
        } catch (Exception e2) {
            C1044Mm.d("nf_pin", "Could not set windowSize e:" + e2);
        }
    }

    protected static void c(NetflixActivity netflixActivity, Status status) {
        int i = 2 % 2;
        AlertDialog.Builder cancelable = new AlertDialog.Builder(netflixActivity, C9834xU.o.c).setCancelable(false);
        String string = netflixActivity.getString(com.netflix.mediaclient.ui.R.o.hz);
        if (string.startsWith("'!#+")) {
            int i2 = r + 95;
            q = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            t(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        cancelable.setMessage(String.format("%s (%d)", string, Integer.valueOf(status.c().getValue()))).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.dcV.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                dialogInterface.dismiss();
            }
        }).show();
        int i4 = r + 15;
        q = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void t(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$4516);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
