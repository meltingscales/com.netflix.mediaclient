package com.netflix.mediaclient.ui.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.Navigate;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.login.LoginErrorDialogFrag;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.AbstractC6313cau;
import o.C1333Xq;
import o.C6283caQ;
import o.C6361cbp;
import o.C6363cbr;
import o.C8126deW;
import o.C8139dej;
import o.InterfaceC1640aIu;
import o.cVB;
import org.json.JSONObject;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class LoginErrorDialogFrag extends AbstractC6313cau {
    private TextView a;
    private TextView b;
    private TextView c;
    private StatusCode d;
    private TextView e;
    private TextView h;
    private String i;
    @Inject
    public C6283caQ oneTimePassCodeFlowDelegateAB54131;
    private String j = "";
    private Long g = null;

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // o.AbstractC6313cau, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public /* bridge */ /* synthetic */ ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // o.AbstractC6313cau, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // o.AbstractC6313cau, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // o.AbstractC6313cau, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    public static LoginErrorDialogFrag d(StatusCode statusCode, String str, Bundle bundle) {
        LoginErrorDialogFrag loginErrorDialogFrag = new LoginErrorDialogFrag();
        bundle.putSerializable("errorCode", statusCode);
        bundle.putSerializable("userLoginIdArg", str);
        loginErrorDialogFrag.setArguments(bundle);
        loginErrorDialogFrag.setCancelable(false);
        return loginErrorDialogFrag;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        return layoutInflater.inflate(C6363cbr.d.a, viewGroup);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.h = (TextView) view.findViewById(C6363cbr.a.j);
        this.a = (TextView) view.findViewById(C6363cbr.a.e);
        this.c = (TextView) view.findViewById(C6363cbr.a.b);
        this.e = (TextView) view.findViewById(C6363cbr.a.a);
        this.b = (TextView) view.findViewById(C6363cbr.a.d);
        this.i = requireArguments().getString("userLoginIdArg", "");
        this.d = (StatusCode) getArguments().getSerializable("errorCode");
        this.j = getArguments().getString("mode_argument", "");
        d(this.d);
        a();
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.LoginErrorDialogFrag.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.INSTANCE.logEvent(new Closed(LoginErrorDialogFrag.this.getAppView(), null, CommandValue.DismissCommand, null));
                LoginErrorDialogFrag.this.dismiss();
            }
        });
    }

    private void a() {
        this.g = Logger.INSTANCE.startSession(new Presentation(getAppView(), new TrackingInfo() { // from class: o.caH
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject e;
                e = LoginErrorDialogFrag.this.e();
                return e;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", this.d);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.login.LoginErrorDialogFrag$8  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[StatusCode.values().length];
            d = iArr;
            try {
                iArr[StatusCode.ERROR_INCORRECT_PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[StatusCode.ERROR_UNRECOGNIZED_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[StatusCode.ERROR_UNRECOGNIZED_PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[StatusCode.ERROR_ACCOUNT_PASSWORD_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[StatusCode.ERROR_UNRECOGNIZED_CONSUMPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[StatusCode.ERROR_UNRECOGNIZED_REDIRECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[StatusCode.ERROR_FORMER_MEMBER_CONSUMPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[StatusCode.ERROR_FORMER_MEMBER_REDIRECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[StatusCode.ERROR_NEVER_MEMBER_CONSUMPTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[StatusCode.ERROR_NEVER_MEMBER_REDIRECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                d[StatusCode.ERROR_DVD_MEMBER_REDIRECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                d[StatusCode.USER_SIGNIN_RETRY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                d[StatusCode.ERROR_OTP_NO_MORE_RESENDS_AB54131.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                d[StatusCode.ERROR_OTP_GENERIC_AB54131.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                d[StatusCode.ERROR_OTP_NOT_DELIVERED_AB54131.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                d[StatusCode.USER_SIGNIN_THROTTLED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    private void d(StatusCode statusCode) {
        String string;
        String string2;
        String c;
        switch (AnonymousClass8.d[statusCode.ordinal()]) {
            case 1:
                boolean isOtpFlow = b() != null ? b().isOtpFlow() : false;
                if (isOtpFlow) {
                    string = C1333Xq.d(C6361cbp.b.h).d("userLoginId", this.i).c();
                    string2 = getString(C6361cbp.b.l);
                } else {
                    string = getString(R.o.dT);
                    string2 = getString(R.o.dU);
                }
                d(string, string2, getString(R.o.fS));
                this.a.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.LoginErrorDialogFrag.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Navigate navigate = new Navigate(LoginErrorDialogFrag.this.getAppView(), null, CommandValue.ChangePasswordCommand, null);
                        Logger logger = Logger.INSTANCE;
                        logger.startSession(navigate);
                        LoginErrorDialogFrag.this.d("https://www.netflix.com/loginhelp");
                        logger.endSession(Long.valueOf(navigate.getSessionId()));
                    }
                });
                if (isOtpFlow) {
                    this.c.setVisibility(0);
                    this.c.setText(getString(C6361cbp.b.m));
                    this.c.setOnClickListener(new View.OnClickListener() { // from class: o.caG
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LoginErrorDialogFrag.this.a(view);
                        }
                    });
                    return;
                }
                return;
            case 2:
                if (!cVB.e(getContext())) {
                    d(getString(R.o.cr), getString(R.o.dV), getString(R.o.cW));
                    this.a.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.LoginErrorDialogFrag.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            Navigate navigate = new Navigate(LoginErrorDialogFrag.this.getAppView(), null, CommandValue.HomeCommand, null);
                            Logger logger = Logger.INSTANCE;
                            logger.startSession(navigate);
                            LoginErrorDialogFrag.this.dismiss();
                            LoginErrorDialogFrag loginErrorDialogFrag = LoginErrorDialogFrag.this;
                            loginErrorDialogFrag.startActivity(cVB.a(loginErrorDialogFrag.getActivity()));
                            logger.endSession(Long.valueOf(navigate.getSessionId()));
                        }
                    });
                    return;
                }
                b(getString(R.o.cw), getString(R.o.cq), null, getString(R.o.f13253fi));
                return;
            case 3:
                if (!cVB.e(getContext())) {
                    d(getString(R.o.cu), getString(R.o.mt), getString(R.o.cW));
                    this.a.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.LoginErrorDialogFrag.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            Navigate navigate = new Navigate(LoginErrorDialogFrag.this.getAppView(), null, CommandValue.HomeCommand, null);
                            Logger logger = Logger.INSTANCE;
                            logger.startSession(navigate);
                            LoginErrorDialogFrag.this.dismiss();
                            LoginErrorDialogFrag loginErrorDialogFrag = LoginErrorDialogFrag.this;
                            loginErrorDialogFrag.startActivity(cVB.a(loginErrorDialogFrag.getActivity()));
                            logger.endSession(Long.valueOf(navigate.getSessionId()));
                        }
                    });
                    return;
                }
                b(getString(R.o.cw), getString(R.o.mw), null, getString(R.o.f13253fi));
                return;
            case 4:
                d(getString(R.o.fV), getString(R.o.ez), getString(R.o.fV));
                this.a.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.LoginErrorDialogFrag.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LoginErrorDialogFrag.this.d("https://www.netflix.com/loginhelp");
                    }
                });
                return;
            case 5:
                e(getString(R.o.cr), R.g.cL, getString(R.o.dV), R.g.cX, null, -1);
                return;
            case 6:
                e(getString(R.o.gO), R.g.dd, getString(R.o.gG), R.g.dc, getString(R.o.dM), R.g.db);
                this.a.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.LoginErrorDialogFrag.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LoginErrorDialogFrag.this.d("https://www.netflix.com");
                    }
                });
                return;
            case 7:
                e(getString(R.o.dR), R.g.da, getString(R.o.fR), R.g.cZ, null, -1);
                return;
            case 8:
                e(getString(R.o.dR), R.g.da, getString(R.o.fT), R.g.df, getString(R.o.dM), R.g.db);
                this.a.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.LoginErrorDialogFrag.9
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LoginErrorDialogFrag.this.d("https://www.netflix.com");
                    }
                });
                return;
            case 9:
                e(getString(R.o.fE), R.g.cY, getString(R.o.dG), R.g.cS, null, -1);
                return;
            case 10:
                e(getString(R.o.fE), R.g.cY, getString(R.o.dK), R.g.cT, getString(R.o.dM), R.g.db);
                this.a.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.ui.login.LoginErrorDialogFrag.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LoginErrorDialogFrag.this.d("https://www.netflix.com");
                    }
                });
                return;
            case 11:
                e(getString(R.o.gO), R.g.dd, getString(R.o.dt), R.g.cW, null, -1);
                return;
            case 12:
                d(getString(R.o.dQ), getString(R.o.gZ), (String) null);
                return;
            case 13:
                d(getString(C6361cbp.b.q), getString(C6361cbp.b.t), getString(C6361cbp.b.n));
                this.a.setOnClickListener(new View.OnClickListener() { // from class: o.caE
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginErrorDialogFrag.this.e(view);
                    }
                });
                this.e.setVisibility(8);
                return;
            case 14:
                d(getString(C6361cbp.b.q), getString(C6361cbp.b.r), (String) null);
                return;
            case 15:
                if (C8126deW.b(this.i)) {
                    c = C1333Xq.d(C6361cbp.b.j).d(SignupConstants.Field.PHONE_NUMBER, this.i).c();
                } else {
                    c = C1333Xq.d(C6361cbp.b.f).d(SignupConstants.Field.EMAIL, this.i).c();
                }
                d(getString(C6361cbp.b.q), c, getString(C6361cbp.b.k));
                this.a.setOnClickListener(new View.OnClickListener() { // from class: o.caF
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginErrorDialogFrag.this.c(view);
                    }
                });
                return;
            case 16:
                d(getString(C6361cbp.b.q), getString(R.o.hk), (String) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
        this.oneTimePassCodeFlowDelegateAB54131.d(this.j, this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.oneTimePassCodeFlowDelegateAB54131.d(this.j);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.oneTimePassCodeFlowDelegateAB54131.d(this.j);
        dismiss();
    }

    private SignInConfigData b() {
        if (getServiceManager() == null || getServiceManager().g() == null || getServiceManager().g().W() == null) {
            return null;
        }
        return getServiceManager().g().W();
    }

    private void d(String str, String str2, String str3) {
        e(str, -1, str2, -1, str3, -1);
    }

    private void b(String str, String str2, String str3, String str4) {
        e(str, -1, str2, -1, str3, -1, str4, -1);
    }

    private void e(String str, int i, String str2, int i2, String str3, int i3) {
        e(str, i, str2, i2, str3, i3, null, -1);
    }

    private void e(String str, int i, String str2, int i2, String str3, int i3, String str4, int i4) {
        this.h.setText(str);
        if (-1 != i) {
            this.h.setId(i);
        }
        this.b.setText(str2);
        if (-1 != i2) {
            this.b.setId(i2);
        }
        if (str3 != null) {
            this.a.setText(str3);
            if (-1 != i3) {
                this.a.setId(i3);
            }
        } else {
            this.a.setVisibility(8);
        }
        if (str4 != null) {
            this.e.setText(str4);
            if (-1 != i4) {
                this.a.setId(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        dismiss();
        Intent data = new Intent("android.intent.action.VIEW").setData(C8139dej.b.a(getNetflixActivity(), str));
        FragmentActivity requireActivity = requireActivity();
        if (data.resolveActivity(requireActivity.getPackageManager()) != null) {
            startActivityForResult(data, 0);
        } else {
            InterfaceC1640aIu.a(requireActivity, getString(R.o.gM, str));
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public AppView getAppView() {
        return AppView.loginError;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Logger.INSTANCE.endSession(this.g);
        super.onDestroyView();
    }
}
