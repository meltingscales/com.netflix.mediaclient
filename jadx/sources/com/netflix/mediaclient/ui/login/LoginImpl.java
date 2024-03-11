package com.netflix.mediaclient.ui.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.ui.login.LoginImpl;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import o.ActivityC6284caR;
import o.C5007bqd;
import o.C6309caq;
import o.C6331cbL;
import o.C6365cbt;
import o.C8632dsu;
import o.InterfaceC6276caJ;
import o.InterfaceC6280caN;
import o.bZV;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class LoginImpl implements LoginApi {
    private final RecaptchaV3Manager.c e;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface LoginApiModule {
        @Binds
        LoginApi a(LoginImpl loginImpl);
    }

    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LoginApi.Oauth2State.values().length];
            try {
                iArr[LoginApi.Oauth2State.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoginApi.Oauth2State.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr;
        }
    }

    @Inject
    public LoginImpl(RecaptchaV3Manager.c cVar) {
        C8632dsu.c((Object) cVar, "");
        this.e = cVar;
    }

    @Override // com.netflix.mediaclient.ui.login.api.LoginApi
    public Intent c(Context context) {
        C8632dsu.c((Object) context, "");
        Intent d = LoginActivity.d(context);
        C8632dsu.a(d, "");
        return d;
    }

    @Override // com.netflix.mediaclient.ui.login.api.LoginApi
    public Intent a(Context context, LoginApi.Oauth2State oauth2State) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) oauth2State, "");
        Intent d = LoginActivity.d(context);
        int i = a.b[oauth2State.ordinal()];
        if (i == 1) {
            d.putExtra(LoginApi.Oauth2State.e.e(), true);
        } else if (i == 2) {
            d.putExtra(LoginApi.Oauth2State.d.e(), true);
        }
        C8632dsu.d(d);
        return d;
    }

    @Override // com.netflix.mediaclient.ui.login.api.LoginApi
    public Intent c(Context context, C5007bqd c5007bqd, Status status) {
        C8632dsu.c((Object) context, "");
        Intent c = LoginActivity.c(context, c5007bqd, status);
        C8632dsu.a(c, "");
        return c;
    }

    @Override // com.netflix.mediaclient.ui.login.api.LoginApi
    public Intent e(Context context) {
        C8632dsu.c((Object) context, "");
        Intent d = ActivityC6284caR.d(context);
        C8632dsu.a(d, "");
        return d;
    }

    @Override // com.netflix.mediaclient.ui.login.api.LoginApi
    public boolean b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return activity instanceof ActivityC6284caR;
    }

    @Override // com.netflix.mediaclient.ui.login.api.LoginApi
    public void d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        ActivityC6284caR.e(activity);
    }

    @Override // com.netflix.mediaclient.ui.login.api.LoginApi
    public void a(Context context) {
        C8632dsu.c((Object) context, "");
        bZV.finishAllAccountActivities(context);
    }

    @Override // com.netflix.mediaclient.ui.login.api.LoginApi
    public Single<C6365cbt> a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        final RecaptchaV3Manager b = this.e.b(activity, new C6331cbL(activity, RecaptchaV3Manager.d.b(activity)));
        Single<C6365cbt> b2 = b.b(new RecaptchaAction("login"));
        final drM<C6365cbt, dpR> drm = new drM<C6365cbt, dpR>() { // from class: com.netflix.mediaclient.ui.login.LoginImpl$performRecaptchaLoginAction$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6365cbt c6365cbt) {
                d(c6365cbt);
                return dpR.c;
            }

            public final void d(C6365cbt c6365cbt) {
                RecaptchaV3Manager.this.e();
            }
        };
        Single<C6365cbt> doOnSuccess = b2.doOnSuccess(new Consumer() { // from class: o.caM
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoginImpl.a(drM.this, obj);
            }
        });
        C8632dsu.a(doOnSuccess, "");
        return doOnSuccess;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.ui.login.api.LoginApi
    public InterfaceC6280caN d(InterfaceC6276caJ interfaceC6276caJ) {
        C8632dsu.c((Object) interfaceC6276caJ, "");
        return new C6309caq(interfaceC6276caJ);
    }
}
