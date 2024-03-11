package o;

import com.netflix.mediaclient.android.activity.UiServices;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.Ns  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1074Ns implements MembersInjector<UiServices> {
    private final Provider<bMQ> b;
    private final Provider<InterfaceC5844cKl> c;
    private final Provider<LoginApi> e;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(UiServices uiServices) {
        a(uiServices, this.b.get());
        c(uiServices, this.c.get());
        b(uiServices, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.UiServices.errorHandlerApi")
    public static void a(UiServices uiServices, bMQ bmq) {
        uiServices.errorHandlerApi = bmq;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.UiServices.profile")
    public static void c(UiServices uiServices, InterfaceC5844cKl interfaceC5844cKl) {
        uiServices.profile = interfaceC5844cKl;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.activity.UiServices.loginApi")
    public static void b(UiServices uiServices, LoginApi loginApi) {
        uiServices.loginApi = loginApi;
    }
}
