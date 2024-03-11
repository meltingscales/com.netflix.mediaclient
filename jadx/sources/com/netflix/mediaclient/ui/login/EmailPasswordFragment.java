package com.netflix.mediaclient.ui.login;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.cl.model.MemberIdInputKind;
import com.netflix.cl.model.context.MemberIdInputState;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.ValidateInputRejected;
import com.netflix.cl.model.event.session.action.SignIn;
import com.netflix.cl.model.event.session.action.ValidateInput;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.ViewHelpCommand;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.service.webclient.model.leafs.OneTimePasscodeLayoutTypeAb54131;
import com.netflix.mediaclient.service.webclient.model.leafs.PhoneCode;
import com.netflix.mediaclient.service.webclient.model.leafs.PhoneCodesData;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.login.EmailPasswordFragment;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaEmailPasswordFragment;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.nio.charset.StandardCharsets;
import javax.inject.Inject;
import o.AbstractC6314cav;
import o.C1044Mm;
import o.C1163Rc;
import o.C1203Sq;
import o.C1275Vk;
import o.C1814aPf;
import o.C1907aSr;
import o.C6283caQ;
import o.C6310car;
import o.C6318caz;
import o.C6321cbB;
import o.C6371cbz;
import o.C8054ddD;
import o.C8126deW;
import o.C8139dej;
import o.C8150deu;
import o.C8168dfL;
import o.C8169dfM;
import o.C8310dhv;
import o.C9618tM;
import o.C9631tZ;
import o.InterfaceC1078Nw;
import o.InterfaceC1640aIu;
import o.InterfaceC6276caJ;
import o.InterfaceC6278caL;
import o.InterfaceC6280caN;
import o.aIB;
import o.aMU;
import o.aMX;
import o.cQQ;
import o.cVB;
import o.dpR;
import o.drM;
import o.drO;
import org.json.JSONException;
import org.json.JSONObject;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public abstract class EmailPasswordFragment extends AbstractC6314cav implements InterfaceC6276caJ {

    /* renamed from: J  reason: collision with root package name */
    private static int f13279J = 0;
    private static int K = 1;
    private static byte e$ss2$10130 = 24;
    private boolean A;
    private C1203Sq B;
    private PhoneCodesData C;
    private View D;
    private TextView E;
    private C1275Vk F;
    private TextView G;
    private View H;
    private C1275Vk L;
    protected InterfaceC6280caN b;
    private String k;
    private C6371cbz l;
    @Inject
    public LoginApi loginApi;
    @Inject
    public C6283caQ loginOtpDelegate;
    private EditText m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private String f13280o;
    private TextView p;
    private C1203Sq q;
    private View s;
    private ProgressBar t;
    private EditText u;
    private View v;
    private TextView w;
    private C1203Sq x;
    private boolean y;
    private TextView z;
    private String I = "enterMemberCredentials";
    private final Handler r = new Handler();

    private void c(Status status, String str) {
    }

    private void c(String str) {
    }

    public abstract void a(String str, String str2, String str3, String str4);

    protected abstract int e();

    @Override // o.AbstractC6314cav, o.NY, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // o.AbstractC6314cav, com.netflix.mediaclient.android.fragment.NetflixFrag, o.NY, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // o.AbstractC6314cav, o.C6318caz, o.NY, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // o.AbstractC6314cav, o.NY, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    public static EmailPasswordFragment c(Bundle bundle) {
        RecaptchaEmailPasswordFragment recaptchaEmailPasswordFragment = new RecaptchaEmailPasswordFragment();
        recaptchaEmailPasswordFragment.setArguments(bundle);
        return recaptchaEmailPasswordFragment;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        super.onManagerReady(serviceManager, status);
        C1044Mm.a("LoginBaseFragment", "EmailPasswordFragment onManagerReady");
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            e(bundle);
        }
    }

    private void M() {
        if (C8126deW.a((Context) bj_())) {
            InterfaceC6280caN d = this.loginApi.d(this);
            this.b = d;
            d.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1044Mm.a("LoginBaseFragment", "EmailPasswordFragment onCreateView");
        Logger.INSTANCE.addContext(new MemberIdInputState(MemberIdInputKind.email));
        View inflate = layoutInflater.inflate(e(), viewGroup, false);
        c(inflate);
        if (bundle != null) {
            boolean z = bundle.getBoolean("showPasswordSelected");
            this.A = z;
            if (z) {
                R();
            }
        }
        if (getArguments() != null) {
            a(getArguments());
            b(getArguments());
            b(getArguments(), inflate);
            this.I = getArguments().getString("mode_argument", "enterMemberCredentials");
            String string = getArguments().getString("OtpLayoutArgument");
            if (string != null) {
                try {
                    b((OneTimePasscodeLayoutTypeAb54131) Enum.valueOf(OneTimePasscodeLayoutTypeAb54131.class, string), inflate);
                } catch (IllegalArgumentException e) {
                    C1044Mm.e("LoginBaseFragment", "provided otpLayoutVariant not valid", e);
                }
            }
        }
        M();
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0162, code lost:
        if ((r3 instanceof android.text.Spanned) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x017c, code lost:
        if ((r3 instanceof android.text.Spanned) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x017e, code lost:
        r10 = new android.text.SpannableString(r2);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r3, 0, r2.length(), java.lang.Object.class, r10, 0);
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0197, code lost:
        r5 = r2;
     */
    @android.annotation.SuppressLint({"AutoDispose"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.netflix.mediaclient.service.webclient.model.leafs.OneTimePasscodeLayoutTypeAb54131 r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.login.EmailPasswordFragment.b(com.netflix.mediaclient.service.webclient.model.leafs.OneTimePasscodeLayoutTypeAb54131, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.L.d();
        this.F.d();
        this.loginOtpDelegate.c(this.m.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.L.d();
        this.F.d();
        this.loginOtpDelegate.b(this.I, this.m.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.L.d();
        this.F.d();
        if (b(bl_(), this.m.getText().toString())) {
            this.m.requestFocus();
            return;
        }
        this.x.setEnabled(false);
        this.f.add(this.loginOtpDelegate.e(this.I, this.m.getText().toString(), this.n, this.k).subscribe(new Action() { // from class: o.caj
            @Override // io.reactivex.functions.Action
            public final void run() {
                EmailPasswordFragment.this.F();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.x.setEnabled(true);
    }

    private void S() {
        this.B.setOnClickListener(new View.OnClickListener() { // from class: o.bZZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailPasswordFragment.this.g(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        this.L.d();
        this.F.d();
        String obj = this.m.getText().toString();
        if (b(bl_(), obj)) {
            this.m.requestFocus();
            return;
        }
        this.B.setEnabled(false);
        this.loginOtpDelegate.a(this.I, obj, this.n, this.k, new drM() { // from class: o.cad
            @Override // o.drM
            public final Object invoke(Object obj2) {
                dpR e;
                e = EmailPasswordFragment.this.e((StatusCode) obj2);
                return e;
            }
        }, new drO() { // from class: o.cab
            @Override // o.drO
            public final Object invoke() {
                dpR L;
                L = EmailPasswordFragment.this.L();
                return L;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR e(StatusCode statusCode) {
        this.B.setEnabled(true);
        if (statusCode != StatusCode.OK) {
            c(statusCode);
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dpR L() {
        this.B.setEnabled(true);
        return null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((C6318caz) this).j.c();
    }

    @Override // o.C6318caz
    public void c(final View view) {
        super.c(view);
        this.m = (EditText) view.findViewById(R.g.f29do);
        if (C8150deu.f()) {
            this.m.setHint(R.o.bH);
        }
        this.m.requestFocus();
        this.u = (EditText) view.findViewById(R.g.dv);
        if (C8150deu.f()) {
            this.u.setHint(R.o.js);
        }
        this.v = view.findViewById(R.g.dm);
        this.q = (C1203Sq) view.findViewById(R.g.di);
        this.B = (C1203Sq) view.findViewById(R.g.fE);
        this.x = (C1203Sq) view.findViewById(R.g.dU);
        this.w = (TextView) view.findViewById(R.g.ef);
        this.p = (TextView) view.findViewById(R.g.bq);
        this.s = view.findViewById(R.g.bu);
        this.D = view.findViewById(R.g.ei);
        this.H = view.findViewById(R.g.dr);
        this.t = (ProgressBar) view.findViewById(R.g.dk);
        this.E = (TextView) view.findViewById(R.g.ds);
        this.z = (TextView) view.findViewById(R.g.fJ);
        aIB.b(by_(), new aIB.e() { // from class: o.cac
            @Override // o.aIB.e
            public final void run(ServiceManager serviceManager) {
                EmailPasswordFragment.this.d(view, serviceManager);
            }
        });
        if (cVB.e(view.getContext())) {
            view.findViewById(R.g.dn).setVisibility(8);
        }
        if (C8310dhv.a()) {
            this.u.setGravity(5);
            this.m.setGravity(5);
        }
        this.s.setSelected(this.m.hasFocus());
        this.m.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.netflix.mediaclient.ui.login.EmailPasswordFragment.5
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                EmailPasswordFragment.this.s.setSelected(z);
            }
        });
        this.D.setSelected(this.u.hasFocus());
        this.u.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.netflix.mediaclient.ui.login.EmailPasswordFragment.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                EmailPasswordFragment.this.D.setSelected(EmailPasswordFragment.this.u.hasFocus());
            }
        });
        C1275Vk c1275Vk = new C1275Vk(AppView.memberIdInput, false) { // from class: com.netflix.mediaclient.ui.login.EmailPasswordFragment.2
            @Override // o.C1275Vk, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // o.C1275Vk, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                super.beforeTextChanged(charSequence, i, i2, i3);
            }

            @Override // o.C1275Vk, android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EmailPasswordFragment.this.p.setVisibility(8);
            }
        };
        this.L = c1275Vk;
        this.m.addTextChangedListener(c1275Vk);
        this.u.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.netflix.mediaclient.ui.login.EmailPasswordFragment.7
            private boolean e(int i) {
                return i == R.f.b || i == 0 || i == 6;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (e(i)) {
                    EmailPasswordFragment.this.G();
                    return true;
                }
                return false;
            }
        });
        C1275Vk c1275Vk2 = new C1275Vk(AppView.passwordInput, false) { // from class: com.netflix.mediaclient.ui.login.EmailPasswordFragment.6
            @Override // o.C1275Vk, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // o.C1275Vk, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                super.beforeTextChanged(charSequence, i, i2, i3);
            }

            @Override // o.C1275Vk, android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (EmailPasswordFragment.this.u.length() == 0 || EmailPasswordFragment.this.u.getText().length() >= 4) {
                    EmailPasswordFragment.this.w.setVisibility(8);
                }
                if (EmailPasswordFragment.this.u.getText().toString().length() > 0) {
                    EmailPasswordFragment.this.z.setVisibility(0);
                } else {
                    EmailPasswordFragment.this.z.setVisibility(8);
                }
            }
        };
        this.F = c1275Vk2;
        this.u.addTextChangedListener(c1275Vk2);
        this.z.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.EmailPasswordFragment.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (!EmailPasswordFragment.this.A) {
                    EmailPasswordFragment.this.R();
                } else {
                    EmailPasswordFragment.this.I();
                }
            }
        });
        view.findViewById(R.g.di).setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.EmailPasswordFragment.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (EmailPasswordFragment.this.u.getText().toString().length() < 4) {
                    EmailPasswordFragment.this.w.setVisibility(0);
                    EmailPasswordFragment.this.D.setBackgroundResource(R.e.az);
                    EmailPasswordFragment.this.u.requestFocus();
                }
                EmailPasswordFragment.this.G();
            }
        });
        view.findViewById(R.g.dq).setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.EmailPasswordFragment.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                CLv2Utils.d(new ViewHelpCommand());
                EmailPasswordFragment.this.J();
            }
        });
        view.findViewById(R.g.dn).setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.EmailPasswordFragment.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                EmailPasswordFragment.this.K();
            }
        });
        this.G = (TextView) view.findViewById(R.g.ej);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view, ServiceManager serviceManager) {
        aMU r = serviceManager.r();
        if (r != null) {
            r.c(new aMX() { // from class: o.caa
                @Override // o.aMX
                public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                    EmailPasswordFragment.this.d(moneyballData, status, i);
                }
            });
        }
        this.l = (C6371cbz) view.findViewById(R.g.aD);
        a(new C1814aPf(getContext()).j());
        this.l.setOnClickListener(new View.OnClickListener() { // from class: o.cae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EmailPasswordFragment.this.h(view2);
            }
        });
        O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MoneyballData moneyballData, Status status, int i) {
        if (moneyballData == null || moneyballData.getPhoneCodesData() == null) {
            return;
        }
        PhoneCodesData phoneCodesData = moneyballData.getPhoneCodesData();
        this.C = phoneCodesData;
        for (PhoneCode phoneCode : phoneCodesData.getPhoneCodes()) {
            if (phoneCode.getId().equalsIgnoreCase(this.k)) {
                this.n = phoneCode.getFormattedCountryCode();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        P();
    }

    private static ValidateInputRejected b(Long l) {
        if (l == null) {
            return null;
        }
        Session session = Logger.INSTANCE.getSession(l);
        if (session instanceof ValidateInput) {
            return new ValidateInputRejected((ValidateInput) session, null);
        }
        return null;
    }

    private void b(InputKind inputKind, boolean z) {
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new ValidateInput(null, inputKind, null, null, null));
        if (z) {
            logger.endSession(startSession);
        } else {
            logger.endSession(b(startSession));
        }
    }

    @SuppressLint({"AutoDispose"})
    private void O() {
        Observable<R> map = C9631tZ.b(this.m).map(new Function() { // from class: o.cal
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean b;
                b = EmailPasswordFragment.this.b((CharSequence) obj);
                return b;
            }
        });
        ObservableSource map2 = C9631tZ.b(this.u).map(new Function() { // from class: o.can
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean a;
                a = EmailPasswordFragment.this.a((CharSequence) obj);
                return a;
            }
        });
        this.f.add(map.takeUntil(C9618tM.d(this.B)).distinctUntilChanged().subscribe(new Consumer() { // from class: o.cak
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EmailPasswordFragment.this.e((Boolean) obj);
            }
        }));
        this.f.add(Observable.combineLatest(map, map2, new BiFunction() { // from class: o.cam
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Boolean d;
                d = EmailPasswordFragment.this.d((Boolean) obj, (Boolean) obj2);
                return d;
            }
        }).takeUntil(C9618tM.d(this.q)).distinctUntilChanged().subscribe(new Consumer() { // from class: o.bZY
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EmailPasswordFragment.this.d((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean b(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        if (C8126deW.b(charSequence2)) {
            T();
        } else {
            V();
        }
        boolean z = !b(bl_(), charSequence2);
        b(InputKind.email, z);
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean a(CharSequence charSequence) {
        boolean z = !e(bl_(), charSequence.toString());
        b(InputKind.password, z);
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Boolean bool) {
        this.B.setActivated(bool.booleanValue());
        this.x.setActivated(bool.booleanValue());
        C6310car.d(this.B, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean d(Boolean bool, Boolean bool2) {
        if (bool.booleanValue() || TextUtils.isEmpty(this.m.getText())) {
            this.s.setBackgroundResource(R.e.ay);
        }
        if (bool2.booleanValue() || TextUtils.isEmpty(this.u.getText())) {
            this.D.setBackgroundResource(R.e.ay);
        }
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Boolean bool) {
        this.q.setActivated(bool.booleanValue());
        C6310car.d(this.q, bool.booleanValue());
    }

    private void T() {
        if (this.l.getVisibility() == 8) {
            Logger.INSTANCE.addContext(new MemberIdInputState(MemberIdInputKind.phoneNumber));
        }
        this.l.setVisibility(0);
    }

    private void V() {
        if (this.l.getVisibility() == 0) {
            Logger.INSTANCE.addContext(new MemberIdInputState(MemberIdInputKind.email));
        }
        this.l.setVisibility(8);
    }

    private void P() {
        PhoneCodesData phoneCodesData = this.C;
        if (phoneCodesData != null) {
            C6321cbB b = C6321cbB.b(phoneCodesData, this.k);
            b.onManagerReady(bl_(), InterfaceC1078Nw.aJ);
            by_().showDialog(b);
        }
    }

    public void c(PhoneCode phoneCode) {
        this.n = phoneCode.getFormattedCountryCode();
        a(phoneCode.getId());
        d(phoneCode.getId());
        by_().removeDialogFrag();
    }

    private void d(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("selectedCountry", str);
            CLv2Utils.d(new ChangeValueCommand(jSONObject.toString()));
        } catch (JSONException unused) {
        }
    }

    private void a(String str) {
        this.k = str;
        C6371cbz c6371cbz = this.l;
        if (str == null) {
            str = "US";
        }
        c6371cbz.b(str);
    }

    private void a(StatusCode statusCode) {
        FragmentManager fragmentManager = getFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putString("mode_argument", this.I);
        LoginErrorDialogFrag.d(statusCode, this.m.getText().toString(), bundle).show(fragmentManager, "fragment_alert");
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("showPasswordSelected", this.A);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        c(true);
        this.u.setTransformationMethod(null);
        EditText editText = this.u;
        editText.setSelection(editText.getText().length());
        this.z.setText(getString(R.o.bZ));
        this.A = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        c(false);
        this.u.setTransformationMethod(new PasswordTransformationMethod());
        EditText editText = this.u;
        editText.setSelection(editText.getText().length());
        this.z.setText(getString(R.o.lx));
        this.A = false;
    }

    private void c(boolean z) {
        try {
            Logger logger = Logger.INSTANCE;
            Long startSession = logger.startSession(new Focus(AppView.passwordVisibilityButton, null));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("showPassword", z);
            CLv2Utils.d(new ChangeValueCommand(jSONObject.toString()));
            logger.endSession(startSession);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        Intent data = new Intent("android.intent.action.VIEW").setData(C8139dej.b.a(getOwnerActivity(), "https://www.netflix.com/loginhelp"));
        FragmentActivity requireActivity = requireActivity();
        if (data.resolveActivity(requireActivity.getPackageManager()) != null) {
            startActivityForResult(data, 0);
        } else {
            InterfaceC1640aIu.a(requireActivity, getString(R.o.gM, "https://www.netflix.com/loginhelp"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        C1044Mm.e("LoginBaseFragment", "going to signup activity");
        startActivity(cVB.d(requireActivity()));
    }

    private void e(boolean z) {
        this.H.setVisibility(z ? 0 : 8);
        this.t.setVisibility(z ? 0 : 8);
        this.v.setVisibility(z ? 8 : 0);
        boolean z2 = !z;
        this.q.setActivated(z2);
        C6310car.d(this.q, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        EditText editText;
        boolean z;
        int i = 2 % 2;
        int i2 = K + 47;
        f13279J = i2 % 128;
        int i3 = i2 % 2;
        this.m.setError(null);
        this.u.setError(null);
        this.L.d();
        this.F.d();
        this.f13280o = this.m.getText().toString();
        final String obj = this.u.getText().toString();
        if (e(bl_(), obj)) {
            int i4 = K + 95;
            f13279J = i4 % 128;
            c(getString(i4 % 2 != 0 ? R.o.cx : R.o.cx));
            editText = this.u;
            z = true;
        } else {
            editText = null;
            z = false;
        }
        if (b(bl_(), this.f13280o)) {
            int i5 = K + 9;
            f13279J = i5 % 128;
            int i6 = i5 % 2;
            c(getString(R.o.cr));
            editText = this.m;
            z = true;
        }
        if (z) {
            C1044Mm.a("LoginBaseFragment", "There was an error - skipping login and showing error msg");
            editText.requestFocus();
            return;
        }
        ServiceManager bl_ = bl_();
        if (!ConnectivityUtils.n(getActivity()) || bl_ == null || !bl_.c()) {
            N();
            return;
        }
        C8150deu.d((Activity) getActivity());
        TextView textView = this.E;
        int i7 = R.o.hi;
        Context context = textView.getContext();
        String string = context.getString(i7);
        if (!(!string.startsWith("'!#+"))) {
            Object[] objArr = new Object[1];
            U(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i7);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                int i8 = f13279J + 95;
                K = i8 % 128;
                int i9 = i8 % 2;
                string = spannableString;
            }
        }
        textView.setText(string);
        C8150deu.b(getActivity(), this.u);
        e(true);
        Logger.INSTANCE.startSession(new SignIn(null, null, null, null));
        this.f.add(new cQQ().i().subscribe(new Consumer() { // from class: o.cah
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                EmailPasswordFragment.this.c(obj, (Boolean) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, Boolean bool) {
        if (bool.booleanValue()) {
            Q();
        } else {
            a(this.f13280o, str, this.n, this.k);
        }
    }

    private void N() {
        if (C8054ddD.l(getActivity())) {
            return;
        }
        getActivity().runOnUiThread(new Runnable() { // from class: com.netflix.mediaclient.ui.login.EmailPasswordFragment.3
            @Override // java.lang.Runnable
            public void run() {
                EmailPasswordFragment.this.by_().displayDialog(C1163Rc.e(EmailPasswordFragment.this.by_(), EmailPasswordFragment.this.r, new C1907aSr(null, EmailPasswordFragment.this.getString(R.o.eH), EmailPasswordFragment.this.getString(R.o.f13253fi), null)));
            }
        });
    }

    private boolean b(ServiceManager serviceManager, String str) {
        SignInConfigData W;
        return C8168dfL.g(str) || ((serviceManager == null || serviceManager.g() == null || (W = serviceManager.g().W()) == null) ? false : W.isUserLoginIdValid(str) ^ true);
    }

    private boolean e(ServiceManager serviceManager, String str) {
        SignInConfigData W;
        return (C8168dfL.g(str) || str.length() < 4) || ((serviceManager == null || serviceManager.g() == null || (W = serviceManager.g().W()) == null) ? false : W.isPasswordValid(str) ^ true);
    }

    public void e(Status status) {
        if (C8150deu.h()) {
            by_().setRequestedOrientation(-1);
        }
        if (status.j() || status.c() == StatusCode.NRD_REGISTRATION_EXISTS) {
            ExtLogger.INSTANCE.endExclusiveAction("SignIn");
            by_().showDebugToast(getString(R.o.gp));
            InterfaceC6280caN interfaceC6280caN = this.b;
            if (interfaceC6280caN != null) {
                interfaceC6280caN.a(this.m.getText().toString(), this.u.getText().toString());
                return;
            }
            return;
        }
        ExtLogger.INSTANCE.failedExclusiveAction("SignIn", C8169dfM.d(status));
        a(status);
        e(false);
    }

    private String a(Status status) {
        String string;
        StatusCode c = status.c();
        FragmentActivity requireActivity = requireActivity();
        if (status.g()) {
            String str = getString(R.o.hf) + " (" + c.getValue() + ")";
            InterfaceC1640aIu.e(requireActivity, str, null, true);
            c(status, str);
            return str;
        }
        switch (AnonymousClass4.b[c.ordinal()]) {
            case 1:
                string = getString(R.o.cr);
                c(StatusCode.ERROR_UNRECOGNIZED_EMAIL);
                break;
            case 2:
                string = getString(R.o.hh);
                c(StatusCode.ERROR_UNRECOGNIZED_PHONE);
                break;
            case 3:
                string = getString(R.o.dT);
                c(StatusCode.ERROR_INCORRECT_PASSWORD);
                break;
            case 4:
                string = getString(R.o.jr);
                c(StatusCode.ERROR_ACCOUNT_PASSWORD_NOT_SET);
                break;
            case 5:
                string = getString(R.o.hk) + " (" + c.getValue() + ")";
                InterfaceC1640aIu.a(requireActivity, string);
                break;
            case 6:
                string = getString(R.o.gZ) + " (" + c.getValue() + ")";
                InterfaceC1640aIu.a(requireActivity, string);
                break;
            case 7:
                string = getString(R.o.dQ);
                c(StatusCode.USER_SIGNIN_RETRY);
                break;
            case 8:
                string = getString(R.o.dQ);
                c(StatusCode.USER_SIGNIN_RETRY);
                break;
            case 9:
                string = getString(R.o.gZ);
                c(StatusCode.USER_SIGNIN_RETRY);
                break;
            case 10:
                string = getString(R.o.gA);
                c(StatusCode.ERROR_FORMER_MEMBER_CONSUMPTION);
                break;
            case 11:
                string = getString(R.o.gG);
                c(StatusCode.ERROR_FORMER_MEMBER_REDIRECT);
                break;
            case 12:
                string = getString(R.o.mx);
                c(StatusCode.ERROR_NEVER_MEMBER_CONSUMPTION);
                break;
            case 13:
                string = getString(R.o.mx);
                c(StatusCode.ERROR_NEVER_MEMBER_REDIRECT);
                break;
            case 14:
                string = getString(R.o.mx);
                c(StatusCode.ERROR_DVD_MEMBER_REDIRECT);
                break;
            case 15:
                string = getString(R.o.gA);
                c(StatusCode.ERROR_UNRECOGNIZED_CONSUMPTION);
                break;
            case 16:
                string = getString(R.o.gG);
                c(StatusCode.ERROR_UNRECOGNIZED_REDIRECT);
                break;
            default:
                InterfaceC1640aIu.a(requireActivity, status);
                string = "";
                break;
        }
        c(status, string);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.login.EmailPasswordFragment$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[StatusCode.values().length];
            b = iArr;
            try {
                iArr[StatusCode.ERROR_UNRECOGNIZED_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[StatusCode.ERROR_UNRECOGNIZED_PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[StatusCode.ERROR_INCORRECT_PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[StatusCode.ERROR_ACCOUNT_PASSWORD_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[StatusCode.USER_SIGNIN_THROTTLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[StatusCode.NRD_LOGIN_ACTIONID_2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[StatusCode.NRD_LOGIN_ACTIONID_4.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[StatusCode.NRD_LOGIN_ACTIONID_8.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[StatusCode.USER_SIGNIN_RETRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[StatusCode.ERROR_FORMER_MEMBER_CONSUMPTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[StatusCode.ERROR_FORMER_MEMBER_REDIRECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[StatusCode.ERROR_NEVER_MEMBER_CONSUMPTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[StatusCode.ERROR_NEVER_MEMBER_REDIRECT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[StatusCode.ERROR_DVD_MEMBER_REDIRECT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[StatusCode.ERROR_UNRECOGNIZED_CONSUMPTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[StatusCode.ERROR_UNRECOGNIZED_REDIRECT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[OneTimePasscodeLayoutTypeAb54131.values().length];
            c = iArr2;
            try {
                iArr2[OneTimePasscodeLayoutTypeAb54131.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                c[OneTimePasscodeLayoutTypeAb54131.SHOW_OTP_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                c[OneTimePasscodeLayoutTypeAb54131.SHOW_OTP_SHOW_PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                c[OneTimePasscodeLayoutTypeAb54131.SHOW_OTP_HIDE_PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                c[OneTimePasscodeLayoutTypeAb54131.SHOW_NEXT_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r2 != 16) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(com.netflix.mediaclient.StatusCode r18) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.login.EmailPasswordFragment.c(com.netflix.mediaclient.StatusCode):void");
    }

    private void e(Bundle bundle) {
        String string = bundle.getString(SignupConstants.Field.EMAIL);
        String string2 = bundle.getString(SignupConstants.Field.PASSWORD);
        if (C8168dfL.h(string)) {
            C1044Mm.j("LoginBaseFragment", "We received credential");
            this.m.setText(string);
            if (C8168dfL.h(string2)) {
                this.u.setText(string2);
            }
        }
    }

    private void a(Bundle bundle) {
        String string = bundle.getString(SignupConstants.Field.EMAIL);
        if (C8168dfL.h(string)) {
            this.m.setText(string);
            this.u.requestFocus();
        }
    }

    private void b(Bundle bundle) {
        String string = bundle.getString(SignupConstants.Field.PASSWORD);
        if (C8168dfL.h(string)) {
            this.u.setText(string);
        }
    }

    private void b(Bundle bundle, View view) {
        String string = bundle.getString("header");
        TextView textView = (TextView) view.findViewById(R.g.co);
        if (C8168dfL.h(string)) {
            textView.setText(string);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        ((C6318caz) this).j = null;
        InterfaceC6280caN interfaceC6280caN = this.b;
        if (interfaceC6280caN != null) {
            interfaceC6280caN.a();
            this.b = null;
        }
    }

    public void c(Status status) {
        if (status.j()) {
            a(this.m.getText().toString(), this.u.getText().toString(), this.n, this.k);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.y = true;
        C1044Mm.e("LoginBaseFragment", "Login is paused" + this.y);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.y = false;
        this.L.b(true);
        this.F.b(true);
    }

    private void Q() {
        this.f.add(new cQQ().k().observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: o.bZX
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EmailPasswordFragment.this.c((Status) obj);
            }
        }));
    }

    @Override // o.InterfaceC6276caJ
    /* renamed from: a */
    public NetflixActivity getOwnerActivity() {
        return bj_();
    }

    @Override // o.InterfaceC6276caJ
    public void handleBackToRegularWorkflow() {
        InterfaceC6278caL interfaceC6278caL = ((C6318caz) this).j;
        if (interfaceC6278caL != null) {
            interfaceC6278caL.b();
        }
    }

    public void e(int i, int i2, Intent intent) {
        InterfaceC6280caN interfaceC6280caN = this.b;
        if (interfaceC6280caN != null) {
            interfaceC6280caN.e(i, i2, intent);
        }
    }

    private void U(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$10130);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
