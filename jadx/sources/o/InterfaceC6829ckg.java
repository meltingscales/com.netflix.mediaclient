package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import javax.inject.Provider;

@EntryPoint
@InstallIn({MoneyballDataComponent.class})
/* renamed from: o.ckg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6829ckg {
    Provider<C6803ckG> a();

    Provider<C6817ckU> b();

    Provider<C6883clh> c();

    Provider<C6846ckx> d();

    Provider<C6807ckK> g();

    Provider<C6891clp> h();

    Provider<C6851clB> j();

    SignupErrorReporter signupErrorReporter();

    SignupNetworkManager signupNetworkManager();
}
