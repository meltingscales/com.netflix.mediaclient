package o;

import com.netflix.mediaclient.android.activity.UiServices;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.Nt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1075Nt implements Factory<UiServices> {
    private final Provider<InterfaceC5844cKl> a;
    private final Provider<LoginApi> d;
    private final Provider<bMQ> e;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public UiServices get() {
        UiServices c = c();
        C1074Ns.a(c, this.e.get());
        C1074Ns.c(c, this.a.get());
        C1074Ns.b(c, this.d.get());
        return c;
    }

    public static UiServices c() {
        return new UiServices();
    }
}
