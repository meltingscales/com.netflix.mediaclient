package o;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import androidx.compose.ui.Modifier;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.CheckUserId;
import com.netflix.cl.model.event.session.action.Navigate;
import com.netflix.cl.model.event.session.action.RequestOtp;
import com.netflix.cl.model.event.session.action.SignIn;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.api.sms.SMSRetriever;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballCallData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.service.webclient.model.leafs.OneTimePasscodeLayoutTypeAb54131;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInData;
import com.netflix.mediaclient.ui.login.EmailPasswordFragment;
import com.netflix.mediaclient.ui.login.LoginErrorDialogFrag;
import com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131;
import com.netflix.mediaclient.ui.login.OneTimePasscodeChoiceFragmentAb54131;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager;
import dagger.hilt.android.scopes.ActivityScoped;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import o.AbstractC1017Lk;
import o.C5015bql;
import o.C6283caQ;
import o.C6361cbp;
import o.C6365cbt;
import o.C8632dsu;
import o.aMU;
import o.aMX;
import o.cNT;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import org.json.JSONObject;

@ActivityScoped
/* renamed from: o.caQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6283caQ {
    public static final int b;
    public static final a d;
    private static byte e$ss2$5814 = 0;
    private static int n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static int f13714o = 1;
    private String a;
    private final NetflixActivity c;
    private String e;
    private final int f;
    private final ExtLogger g;
    private CompositeDisposable h;
    private String i;
    private final FragmentManager j;
    private final Logger k;
    private final RecaptchaV3Manager l;
    private final cQL m;

    static {
        d();
        d = new a(null);
        b = 8;
    }

    static void d() {
        e$ss2$5814 = (byte) 24;
    }

    public final void b(String str, String str2) {
        C8632dsu.c((Object) str, "");
        c(this, str, str2, null, 4, null);
    }

    public final void d(String str) {
        C8632dsu.c((Object) str, "");
        c(this, str, null, null, 6, null);
    }

    public final void d(String str, String str2) {
        C8632dsu.c((Object) str, "");
        e(this, str, str2, null, null, null, null, 60, null);
    }

    public C6283caQ(int i, NetflixActivity netflixActivity, RecaptchaV3Manager recaptchaV3Manager, cQL cql, Logger logger, ExtLogger extLogger) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) recaptchaV3Manager, "");
        C8632dsu.c((Object) cql, "");
        C8632dsu.c((Object) logger, "");
        C8632dsu.c((Object) extLogger, "");
        this.f = i;
        this.c = netflixActivity;
        this.l = recaptchaV3Manager;
        this.m = cql;
        this.k = logger;
        this.g = extLogger;
        this.i = "";
        this.h = new CompositeDisposable();
        FragmentManager supportFragmentManager = netflixActivity.getSupportFragmentManager();
        C8632dsu.a(supportFragmentManager, "");
        this.j = supportFragmentManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(C6283caQ c6283caQ, String str, String str2, String str3, String str4, drM drm, drO dro, int i, Object obj) {
        c6283caQ.a(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : drm, (i & 32) == 0 ? dro : null);
    }

    public final void a(final String str, String str2, String str3, String str4, final drM<? super StatusCode, dpR> drm, final drO<dpR> dro) {
        C8632dsu.c((Object) str, "");
        final RequestOtp requestOtp = new RequestOtp(C8632dsu.c((Object) str, (Object) SignInData.MODE_LOGIN_OPTIONS) ? AppView.loginOptions : AppView.login, null, null, null);
        CompositeDisposable compositeDisposable = this.h;
        Single<Map<String, Object>> d2 = d(str2, str3, str4);
        final drM<Map<String, Object>, SingleSource<? extends MoneyballData>> drm2 = new drM<Map<String, Object>, SingleSource<? extends MoneyballData>>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$sendASignInCode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final SingleSource<? extends MoneyballData> invoke(Map<String, Object> map) {
                C8632dsu.c((Object) map, "");
                return C6283caQ.this.d(str, "sendLoginOtpAction", map, requestOtp);
            }
        };
        Single<R> flatMap = d2.flatMap(new Function() { // from class: o.caX
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource t;
                t = C6283caQ.t(drM.this, obj);
                return t;
            }
        });
        C8632dsu.a(flatMap, "");
        DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy(flatMap, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$sendASignInCode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                drM<StatusCode, dpR> drm3 = drm;
                if (drm3 != null) {
                    drm3.invoke(StatusCode.ERROR_OTP_NOT_DELIVERED_AB54131);
                } else {
                    C6283caQ.e(this, StatusCode.ERROR_OTP_NOT_DELIVERED_AB54131, null, 2, null);
                }
            }
        }, new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$sendASignInCode$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                c(moneyballData);
                return dpR.c;
            }

            public final void c(MoneyballData moneyballData) {
                StatusCode e;
                if (moneyballData.getErrorCode() != null) {
                    drM<StatusCode, dpR> drm3 = drm;
                    if (drm3 != null) {
                        e = C6283caQ.this.e(moneyballData.getErrorCode());
                        drm3.invoke(e);
                        return;
                    }
                    C6283caQ.this.a(StatusCode.ERROR_OTP_NOT_DELIVERED_AB54131, moneyballData.getMode());
                    return;
                }
                C6283caQ c6283caQ = C6283caQ.this;
                C8632dsu.d(moneyballData);
                c6283caQ.e(moneyballData);
                drO<dpR> dro2 = dro;
                if (dro2 != null) {
                    dro2.invoke();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource t(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        this.i = str;
        c(OneTimePasscodeLayoutTypeAb54131.SHOW_OTP_ONLY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(C6283caQ c6283caQ, String str, String str2, drO dro, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$typePasswordInstead$1
                public final void d() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }
            };
        }
        c6283caQ.a(str, str2, dro);
    }

    public final void a(String str, String str2, final drO<dpR> dro) {
        AppView appView;
        boolean d2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        if (C8632dsu.c((Object) str, (Object) SignInData.MODE_LOGIN_OPTIONS)) {
            appView = AppView.loginOptions;
        } else {
            appView = C8632dsu.c((Object) str, (Object) SignInData.MODE_LOGIN_OTP_ENTRY) ? AppView.loginOtpEntry : AppView.login;
        }
        Navigate navigate = new Navigate(appView, null, CommandValue.ProvidePasswordCommand, null);
        if (str2 != null) {
            this.i = str2;
        }
        d2 = duD.d((CharSequence) str, (CharSequence) "enterMemberCredentials", false, 2, (Object) null);
        if (d2) {
            this.k.startSession(navigate);
            c(OneTimePasscodeLayoutTypeAb54131.NONE);
            this.k.endSession(Long.valueOf(navigate.getId()));
            dro.invoke();
            return;
        }
        CompositeDisposable compositeDisposable = this.h;
        Single doFinally = b(this, str, "usePasswordAction", null, navigate, 4, null).doFinally(new Action() { // from class: o.caV
            @Override // io.reactivex.functions.Action
            public final void run() {
                C6283caQ.a(drO.this);
            }
        });
        C8632dsu.a(doFinally, "");
        DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy(doFinally, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$typePasswordInstead$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
                C6283caQ.e(C6283caQ.this, StatusCode.ERROR_OTP_GENERIC_AB54131, null, 2, null);
            }
        }, new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$typePasswordInstead$4
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                c(moneyballData);
                return dpR.c;
            }

            public final void c(MoneyballData moneyballData) {
                StatusCode e;
                if (moneyballData.getErrorCode() != null) {
                    C6283caQ c6283caQ = C6283caQ.this;
                    e = c6283caQ.e(moneyballData.getErrorCode());
                    c6283caQ.a(e, moneyballData.getMode());
                    return;
                }
                C6283caQ c6283caQ2 = C6283caQ.this;
                C8632dsu.d(moneyballData);
                c6283caQ2.e(moneyballData);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drO dro) {
        C8632dsu.c((Object) dro, "");
        dro.invoke();
    }

    public final Completable e(final String str, String str2, String str3, String str4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        final CheckUserId checkUserId = new CheckUserId(AppView.loginOtpEntry, null, null, null);
        Single<Map<String, Object>> d2 = d(str2, str3, str4);
        final drM<Map<String, Object>, SingleSource<? extends MoneyballData>> drm = new drM<Map<String, Object>, SingleSource<? extends MoneyballData>>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$nextPressed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final SingleSource<? extends MoneyballData> invoke(Map<String, Object> map) {
                C8632dsu.c((Object) map, "");
                return C6283caQ.this.d(str, SignupConstants.Action.NEXT_ACTION, map, checkUserId);
            }
        };
        Single<R> flatMap = d2.flatMap(new Function() { // from class: o.cbb
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m;
                m = C6283caQ.m(drM.this, obj);
                return m;
            }
        });
        final drM<MoneyballData, dpR> drm2 = new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$nextPressed$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                a(moneyballData);
                return dpR.c;
            }

            public final void a(MoneyballData moneyballData) {
                StatusCode e;
                if (moneyballData.getErrorCode() != null) {
                    C6283caQ c6283caQ = C6283caQ.this;
                    e = c6283caQ.e(moneyballData.getErrorCode());
                    c6283caQ.a(e, moneyballData.getMode());
                    return;
                }
                C6283caQ c6283caQ2 = C6283caQ.this;
                C8632dsu.d(moneyballData);
                c6283caQ2.e(moneyballData);
            }
        };
        Single doOnSuccess = flatMap.doOnSuccess(new Consumer() { // from class: o.cba
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6283caQ.o(drM.this, obj);
            }
        });
        final drM<Throwable, dpR> drm3 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$nextPressed$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                ExtLogger extLogger;
                extLogger = C6283caQ.this.g;
                extLogger.failedAction(Long.valueOf(checkUserId.getId()), th.toString());
            }
        };
        Completable ignoreElement = doOnSuccess.doOnError(new Consumer() { // from class: o.cbc
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6283caQ.l(drM.this, obj);
            }
        }).ignoreElement();
        C8632dsu.a(ignoreElement, "");
        return ignoreElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource m(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final Single<d> c(String str, String str2) {
        Map<String, Object> i;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        final SignIn signIn = new SignIn(AppView.loginOtpEntry, null, null, null);
        i = dqE.i(dpD.a(SignupConstants.Field.CHALLENGE_OTP, str2));
        Single<MoneyballData> d2 = d(str, SignupConstants.Action.NEXT_ACTION, i, signIn);
        final drM<MoneyballData, d> drm = new drM<MoneyballData, d>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$submitPin$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C6283caQ.d invoke(final MoneyballData moneyballData) {
                NetflixActivity netflixActivity;
                StatusCode e;
                C8632dsu.c((Object) moneyballData, "");
                String errorCode = moneyballData.getErrorCode();
                if (errorCode != null) {
                    int hashCode = errorCode.hashCode();
                    if (hashCode != -1498627220) {
                        if (hashCode == 1770393150 && errorCode.equals(SignupConstants.Error.OTP_INVALID)) {
                            return C6283caQ.d.e.d;
                        }
                    } else if (errorCode.equals(SignupConstants.Error.OTP_EXPIRED)) {
                        return C6283caQ.d.b.a;
                    }
                    C6283caQ c6283caQ = C6283caQ.this;
                    e = c6283caQ.e(moneyballData.getErrorCode());
                    c6283caQ.a(e, moneyballData.getMode());
                    return C6283caQ.d.a.e;
                }
                netflixActivity = C6283caQ.this.c;
                UserAgent userAgent = netflixActivity.getUserAgent();
                if (userAgent != null) {
                    final C6283caQ c6283caQ2 = C6283caQ.this;
                    final SignIn signIn2 = signIn;
                    userAgent.c(new C5015bql() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$submitPin$1.1
                        @Override // o.C5015bql, o.InterfaceC5018bqo
                        public void c(Status status) {
                            ExtLogger extLogger;
                            Logger logger;
                            NetflixActivity netflixActivity2;
                            NetflixActivity netflixActivity3;
                            NetflixActivity netflixActivity4;
                            C8632dsu.c((Object) status, "");
                            if (status.j()) {
                                logger = C6283caQ.this.k;
                                logger.endSession(Long.valueOf(signIn2.getId()));
                                cNT.c cVar = cNT.a;
                                netflixActivity2 = C6283caQ.this.c;
                                cNT d3 = cVar.d(netflixActivity2);
                                netflixActivity3 = C6283caQ.this.c;
                                Intent addFlags = d3.c((NetflixActivityBase) netflixActivity3, AppView.loginOtpEntry, false).addFlags(268468224);
                                C8632dsu.a(addFlags, "");
                                netflixActivity4 = C6283caQ.this.c;
                                netflixActivity4.startActivity(addFlags);
                                return;
                            }
                            extLogger = C6283caQ.this.g;
                            extLogger.failedAction(Long.valueOf(signIn2.getId()), "can't login after successful otp submission");
                            C6283caQ.this.a(StatusCode.ERROR_OTP_GENERIC_AB54131, moneyballData.getMode());
                        }
                    });
                }
                return C6283caQ.d.c.b;
            }
        };
        Single<d> onErrorReturn = d2.map(new Function() { // from class: o.cbd
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C6283caQ.d q;
                q = C6283caQ.q(drM.this, obj);
                return q;
            }
        }).onErrorReturn(new Function() { // from class: o.cbg
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C6283caQ.d a2;
                a2 = C6283caQ.a(C6283caQ.this, (Throwable) obj);
                return a2;
            }
        });
        C8632dsu.a(onErrorReturn, "");
        return onErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d q(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (d) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d a(C6283caQ c6283caQ, Throwable th) {
        C8632dsu.c((Object) c6283caQ, "");
        C8632dsu.c((Object) th, "");
        e(c6283caQ, StatusCode.ERROR_OTP_GENERIC_AB54131, null, 2, null);
        return d.a.e;
    }

    public final Completable b(String str) {
        Map<String, Object> i;
        C8632dsu.c((Object) str, "");
        RequestOtp requestOtp = new RequestOtp(AppView.loginOtpEntry, null, CommandValue.ResendCommand, null);
        i = dqE.i(dpD.a(SignupConstants.Field.ANDROID_APP_HASH, SMSRetriever.Companion.getAPP_HASH()));
        Single<MoneyballData> d2 = d(str, SignupConstants.Action.RESEND_CODE_ACTION, i, requestOtp);
        final drM<MoneyballData, dpR> drm = new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$resendCode$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                e(moneyballData);
                return dpR.c;
            }

            public final void e(MoneyballData moneyballData) {
                StatusCode e;
                if (moneyballData.getErrorCode() != null) {
                    C6283caQ c6283caQ = C6283caQ.this;
                    e = c6283caQ.e(moneyballData.getErrorCode());
                    c6283caQ.a(e, moneyballData.getMode());
                    return;
                }
                C6283caQ.this.a();
            }
        };
        Single<MoneyballData> doOnSuccess = d2.doOnSuccess(new Consumer() { // from class: o.caU
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6283caQ.n(drM.this, obj);
            }
        });
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$resendCode$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                C6283caQ.e(C6283caQ.this, StatusCode.ERROR_OTP_GENERIC_AB54131, null, 2, null);
            }
        };
        Completable ignoreElement = doOnSuccess.doOnError(new Consumer() { // from class: o.caT
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6283caQ.r(drM.this, obj);
            }
        }).ignoreElement();
        C8632dsu.a(ignoreElement, "");
        return ignoreElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void c() {
        this.h.clear();
    }

    public final Single<Map<String, Object>> d(final String str, final String str2, final String str3) {
        if (str != null) {
            this.i = str;
        }
        if (str2 != null) {
            this.e = str2;
        }
        if (str3 != null) {
            this.a = str3;
        }
        Single<C6365cbt> b2 = this.l.b(new RecaptchaAction("login"));
        final drM<C6365cbt, Map<String, Object>> drm = new drM<C6365cbt, Map<String, Object>>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$createPinRequestActionFields$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final Map<String, Object> invoke(C6365cbt c6365cbt) {
                Map<String, Object> i;
                C8632dsu.c((Object) c6365cbt, "");
                Pair[] pairArr = new Pair[2];
                String str4 = str;
                if (str4 == null) {
                    str4 = this.i;
                }
                pairArr[0] = dpD.a("userLoginId", str4);
                pairArr[1] = dpD.a("recaptchaResponseToken", c6365cbt.a());
                i = dqE.i(pairArr);
                String str5 = str2;
                if (str5 != null) {
                    i.put(SignupConstants.Field.COUNTRY_CODE, str5);
                }
                String str6 = str3;
                if (str6 != null) {
                    i.put("countryIsoCode", str6);
                }
                i.put(SignupConstants.Field.ANDROID_APP_HASH, SMSRetriever.Companion.getAPP_HASH());
                return i;
            }
        };
        Single map = b2.map(new Function() { // from class: o.caZ
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Map k;
                k = C6283caQ.k(drM.this, obj);
                return k;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map k(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Map) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r2.equals(com.netflix.mediaclient.acquisition.lib.SignupConstants.Error.OTP_CHALLENGE_ALL_ATTEMPTS_EXHAUSTED) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r2.equals(com.netflix.mediaclient.acquisition.lib.SignupConstants.Error.OTP_CHALLENGE_VERIFICATION_EXHAUSTED) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r2.equals(com.netflix.mediaclient.acquisition.lib.SignupConstants.Error.RESEND_ATTEMPTS_EXHASTED) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return com.netflix.mediaclient.StatusCode.ERROR_OTP_NO_MORE_RESENDS_AB54131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.StatusCode e(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L73
            int r0 = r2.hashCode()
            switch(r0) {
                case -1498627220: goto L67;
                case -466805902: goto L5b;
                case -407566670: goto L4f;
                case -336657698: goto L43;
                case -173409142: goto L37;
                case 893455553: goto L2e;
                case 1037565889: goto L25;
                case 1692625996: goto L19;
                case 1770393150: goto Lb;
                default: goto L9;
            }
        L9:
            goto L73
        Lb:
            java.lang.String r0 = "mfa_factor_invalid"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L15
            goto L73
        L15:
            com.netflix.mediaclient.StatusCode r2 = com.netflix.mediaclient.StatusCode.ERROR_OTP_INVALID_PIN_AB54131
            goto L75
        L19:
            java.lang.String r0 = "unrecognized_email"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L22
            goto L73
        L22:
            com.netflix.mediaclient.StatusCode r2 = com.netflix.mediaclient.StatusCode.ERROR_UNRECOGNIZED_EMAIL
            goto L75
        L25:
            java.lang.String r0 = "mfa_challenge_all_attempts_exhausted"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4c
            goto L73
        L2e:
            java.lang.String r0 = "mfa_challenge_verification_attempts_exhausted"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4c
            goto L73
        L37:
            java.lang.String r0 = "unrecognized_phone_number"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L40
            goto L73
        L40:
            com.netflix.mediaclient.StatusCode r2 = com.netflix.mediaclient.StatusCode.ERROR_UNRECOGNIZED_PHONE
            goto L75
        L43:
            java.lang.String r0 = "resend_code_attempts_exceeded"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4c
            goto L73
        L4c:
            com.netflix.mediaclient.StatusCode r2 = com.netflix.mediaclient.StatusCode.ERROR_OTP_NO_MORE_RESENDS_AB54131
            goto L75
        L4f:
            java.lang.String r0 = "throttling_failure"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L58
            goto L73
        L58:
            com.netflix.mediaclient.StatusCode r2 = com.netflix.mediaclient.StatusCode.USER_SIGNIN_THROTTLED
            goto L75
        L5b:
            java.lang.String r0 = "ineligible_for_otp"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L64
            goto L73
        L64:
            com.netflix.mediaclient.StatusCode r2 = com.netflix.mediaclient.StatusCode.ERROR_OTP_NOT_DELIVERED_AB54131
            goto L75
        L67:
            java.lang.String r0 = "mfa_factor_expired"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L70
            goto L73
        L70:
            com.netflix.mediaclient.StatusCode r2 = com.netflix.mediaclient.StatusCode.ERROR_OTP_EXPIRED_AB54131
            goto L75
        L73:
            com.netflix.mediaclient.StatusCode r2 = com.netflix.mediaclient.StatusCode.ERROR_OTP_GENERIC_AB54131
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6283caQ.e(java.lang.String):com.netflix.mediaclient.StatusCode");
    }

    public static /* synthetic */ void e(C6283caQ c6283caQ, StatusCode statusCode, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = SignupConstants.Mode.MONEYBALL_EXCEPTION;
        }
        c6283caQ.a(statusCode, str);
    }

    public final void a(final StatusCode statusCode, String str) {
        C8632dsu.c((Object) statusCode, "");
        Long startSession = this.k.startSession(new Presentation(AppView.loginError, new TrackingInfo() { // from class: o.cbh
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject c;
                c = C6283caQ.c(StatusCode.this);
                return c;
            }
        }));
        LoginErrorDialogFrag.d(statusCode, this.i, BundleKt.bundleOf(dpD.a("mode_argument", str))).show(this.j, "otp_alert");
        this.k.endSession(startSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject c(StatusCode statusCode) {
        C8632dsu.c((Object) statusCode, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", statusCode);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Single b(C6283caQ c6283caQ, String str, String str2, Map map, com.netflix.cl.model.event.session.action.Action action, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        return c6283caQ.d(str, str2, map, action);
    }

    public final Single<MoneyballData> d(String str, String str2, Map<String, Object> map, final com.netflix.cl.model.event.session.action.Action action) {
        Map i;
        String d2;
        Map i2;
        Map i3;
        Map i4;
        Map i5;
        Map i6;
        Map i7;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) action, "");
        this.k.startSession(action);
        i = dqE.i(dpD.a("mode", str), dpD.a("flow", SignupConstants.Flow.ANDROID_MEMBER));
        FlowMode flowMode = new FlowMode(i);
        d2 = C8576dqs.d(map.keySet(), ",", null, null, 0, null, null, 62, null);
        map.put("withFields", d2);
        map.put("mode", str);
        map.put("flow", SignupConstants.Flow.ANDROID_MEMBER);
        Map<String, Field> fields = flowMode.getFields();
        if (!dsH.f(fields)) {
            fields = null;
        }
        if (fields != null) {
            Object obj = map.get("userLoginId");
            if (obj != null) {
                i7 = dqE.i(dpD.a("value", obj));
                fields.put("userLoginId", new StringField("userLoginId", i7, flowMode));
            }
            Object obj2 = map.get(SignupConstants.Field.COUNTRY_CODE);
            if (obj2 != null) {
                i6 = dqE.i(dpD.a("value", obj2));
                fields.put(SignupConstants.Field.COUNTRY_CODE, new StringField(SignupConstants.Field.COUNTRY_CODE, i6, flowMode));
            }
            Object obj3 = map.get("countryIsoCode");
            if (obj3 != null) {
                i5 = dqE.i(dpD.a("value", obj3));
                fields.put("countryIsoCode", new StringField("countryIsoCode", i5, flowMode));
            }
            Object obj4 = map.get("recaptchaResponseToken");
            if (obj4 != null) {
                i4 = dqE.i(dpD.a("value", obj4));
                fields.put("recaptchaResponseToken", new StringField("recaptchaResponseToken", i4, flowMode));
            }
            Object obj5 = map.get(SignupConstants.Field.CHALLENGE_OTP);
            if (obj5 != null) {
                i3 = dqE.i(dpD.a("value", obj5));
                fields.put(SignupConstants.Field.CHALLENGE_OTP, new StringField(SignupConstants.Field.CHALLENGE_OTP, i3, flowMode));
            }
            Object obj6 = map.get(SignupConstants.Field.ANDROID_APP_HASH);
            if (obj6 != null) {
                i2 = dqE.i(dpD.a("value", obj6));
                fields.put(SignupConstants.Field.ANDROID_APP_HASH, new StringField(SignupConstants.Field.ANDROID_APP_HASH, i2, flowMode));
            }
        }
        final MoneyballCallData moneyballCallData = new MoneyballCallData(flowMode, (String) null, new ActionField(str2, map, flowMode));
        Single e = cQL.e(this.m, false, new drX<aMU, aMX, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$submitAction$3
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(aMU amu, aMX amx) {
                e(amu, amx);
                return dpR.c;
            }

            public final void e(aMU amu, aMX amx) {
                C8632dsu.c((Object) amu, "");
                C8632dsu.c((Object) amx, "");
                amu.a(MoneyballCallData.this, amx);
            }
        }, 1, null);
        final drM<MoneyballData, dpR> drm = new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$submitAction$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                a(moneyballData);
                return dpR.c;
            }

            public final void a(MoneyballData moneyballData) {
                ExtLogger extLogger;
                Logger logger;
                if (moneyballData.getErrorCode() == null) {
                    logger = C6283caQ.this.k;
                    logger.endSession(Long.valueOf(action.getId()));
                    return;
                }
                extLogger = C6283caQ.this.g;
                extLogger.failedAction(Long.valueOf(action.getId()), moneyballData.getErrorCode());
            }
        };
        Single doOnSuccess = e.doOnSuccess(new Consumer() { // from class: o.caW
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj7) {
                C6283caQ.p(drM.this, obj7);
            }
        });
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$submitAction$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                ExtLogger extLogger;
                extLogger = C6283caQ.this.g;
                extLogger.failedAction(Long.valueOf(action.getId()), th.toString());
            }
        };
        Single<MoneyballData> doOnError = doOnSuccess.doOnError(new Consumer() { // from class: o.caY
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj7) {
                C6283caQ.s(drM.this, obj7);
            }
        });
        C8632dsu.a(doOnError, "");
        return doOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void e(MoneyballData moneyballData) {
        C8632dsu.c((Object) moneyballData, "");
        String mode = moneyballData.getMode();
        if (mode != null) {
            switch (mode.hashCode()) {
                case -1899559280:
                    if (mode.equals(SignInData.MODE_LOGIN_OTP_ENTRY)) {
                        a(moneyballData);
                        return;
                    }
                    return;
                case -1556498699:
                    if (mode.equals(SignInData.MODE_LOGIN_OPTIONS)) {
                        d(moneyballData);
                        return;
                    }
                    return;
                case -1249357744:
                    if (mode.equals(SignupConstants.Mode.MONEYBALL_EXCEPTION)) {
                        e(this, StatusCode.ERROR_OTP_GENERIC_AB54131, null, 2, null);
                        return;
                    }
                    return;
                case 359153674:
                    if (mode.equals("enterMemberCredentials")) {
                        d(this, (OneTimePasscodeLayoutTypeAb54131) null, 1, (Object) null);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void a(MoneyballData moneyballData) {
        Object value;
        C8632dsu.c((Object) moneyballData, "");
        Field field = moneyballData.getFlowMode().getField(SignupConstants.Field.EXPIRY_IN_MINUTES);
        Object value2 = field != null ? field.getValue() : null;
        Field field2 = moneyballData.getFlowMode().getField(SignupConstants.Field.CURRENT_EMAIL);
        if (field2 == null || (value = field2.getValue()) == null) {
            Field field3 = moneyballData.getFlowMode().getField(SignupConstants.Field.FORMATTED_PHONE_NUMBER);
            value = field3 != null ? field3.getValue() : null;
        }
        Bundle bundleOf = BundleKt.bundleOf(dpD.a("userLoginIdKey", value), dpD.a("pinLength", 4), dpD.a("expiryTime", value2), dpD.a("modeArgumentKey", moneyballData.getMode()));
        OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131 = new OneTimePassCodeFragmentAb54131();
        oneTimePassCodeFragmentAb54131.setArguments(bundleOf);
        FragmentTransaction beginTransaction = this.j.beginTransaction();
        beginTransaction.replace(this.f, oneTimePassCodeFragmentAb54131);
        beginTransaction.addToBackStack(null);
        beginTransaction.setTransition(4097);
        beginTransaction.commitAllowingStateLoss();
    }

    public static /* synthetic */ void d(C6283caQ c6283caQ, OneTimePasscodeLayoutTypeAb54131 oneTimePasscodeLayoutTypeAb54131, int i, Object obj) {
        if ((i & 1) != 0) {
            oneTimePasscodeLayoutTypeAb54131 = OneTimePasscodeLayoutTypeAb54131.NONE;
        }
        c6283caQ.c(oneTimePasscodeLayoutTypeAb54131);
    }

    public final void c(OneTimePasscodeLayoutTypeAb54131 oneTimePasscodeLayoutTypeAb54131) {
        C8632dsu.c((Object) oneTimePasscodeLayoutTypeAb54131, "");
        EmailPasswordFragment c = EmailPasswordFragment.c(BundleKt.bundleOf(dpD.a(SignupConstants.Field.EMAIL, this.i), dpD.a("OtpLayoutArgument", oneTimePasscodeLayoutTypeAb54131.name()), dpD.a("mode_argument", "enterMemberCredentials")));
        FragmentTransaction beginTransaction = this.j.beginTransaction();
        beginTransaction.replace(this.f, c);
        beginTransaction.addToBackStack(null);
        beginTransaction.setTransition(4097);
        beginTransaction.commitAllowingStateLoss();
    }

    public final void d(MoneyballData moneyballData) {
        C8632dsu.c((Object) moneyballData, "");
        Bundle bundleOf = BundleKt.bundleOf(dpD.a("userLoginIdKey", this.i), dpD.a("pinLength", 4), dpD.a("modeArgumentKey", moneyballData.getMode()));
        OneTimePasscodeChoiceFragmentAb54131 oneTimePasscodeChoiceFragmentAb54131 = new OneTimePasscodeChoiceFragmentAb54131();
        oneTimePasscodeChoiceFragmentAb54131.setArguments(bundleOf);
        oneTimePasscodeChoiceFragmentAb54131.show(this.j, NetflixActivity.FRAG_DIALOG_TAG);
    }

    public final void a() {
        int i = 2 % 2;
        int i2 = n + 97;
        f13714o = i2 % 128;
        if (i2 % 2 == 0) {
            NetflixActivity netflixActivity = this.c;
            C9872yF c9872yF = netflixActivity.composeViewOverlayManager;
            netflixActivity.getString(C6361cbp.b.i).startsWith("'!#+");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        NetflixActivity netflixActivity2 = this.c;
        C9872yF c9872yF2 = netflixActivity2.composeViewOverlayManager;
        String string = netflixActivity2.getString(C6361cbp.b.i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            u(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        String str = string;
        String string2 = netflixActivity2.getString(C6361cbp.b.g);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            u(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
            int i3 = f13714o + 71;
            n = i3 % 128;
            int i4 = i3 % 2;
        }
        C8632dsu.a(string2, "");
        AbstractC1017Lk.a aVar = new AbstractC1017Lk.a(string2, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFlowDelegateAb54131$showCodeSentToast$1$1
            public final void e() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }
        });
        HawkinsIcon.aY aYVar = HawkinsIcon.aY.e;
        Theme theme = Theme.a;
        C8632dsu.d(c9872yF2);
        C8632dsu.d((Object) str);
        C9878yL.d(c9872yF2, (r22 & 1) != 0 ? Modifier.Companion : null, str, (r22 & 4) != 0 ? null : aYVar, (r22 & 8) != 0 ? null : null, (r22 & 16) != 0 ? new AbstractC1017Lk.d(null, 1, null) : aVar, (r22 & 32) != 0 ? Theme.b : theme, (r22 & 64) != 0 ? 3000 : 7000, (r22 & 128) != 0, (r22 & JSONzip.end) != 0 ? null : null);
    }

    /* renamed from: o.caQ$d */
    /* loaded from: classes4.dex */
    public static abstract class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.caQ$d$c */
        /* loaded from: classes4.dex */
        public static final class c extends d {
            public static final c b = new c();

            private c() {
                super(null);
            }
        }

        private d() {
        }

        /* renamed from: o.caQ$d$e */
        /* loaded from: classes4.dex */
        public static final class e extends d {
            public static final e d = new e();

            private e() {
                super(null);
            }
        }

        /* renamed from: o.caQ$d$b */
        /* loaded from: classes4.dex */
        public static final class b extends d {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: o.caQ$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends d {
            public static final a e = new a();

            private a() {
                super(null);
            }
        }
    }

    /* renamed from: o.caQ$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$5814);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
