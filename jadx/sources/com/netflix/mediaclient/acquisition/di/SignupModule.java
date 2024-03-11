package com.netflix.mediaclient.acquisition.di;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.screens.creditDebit.EmvcoDataService;
import com.netflix.mediaclient.acquisition.services.logging.TtrEventListener;
import com.netflix.mediaclient.acquisition.services.networking.SignupMoneyballData;
import com.netflix.mediaclient.acquisition.services.sms.SMSRetrieverManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.Locale;
import javax.inject.Named;
import javax.inject.Provider;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.cVB;
import o.dpB;
import o.drO;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class SignupModule {
    public static final int $stable = 0;

    @Provides
    public final SMSRetrieverManager providesSMSRetrieverManager(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return new SMSRetrieverManager((NetflixActivity) activity);
    }

    @Provides
    public final EmvcoDataService providesEmvcoDataService(final Activity activity, @Named("webViewBaseUrl") String str) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        b = dpB.b(new drO<Locale>() { // from class: com.netflix.mediaclient.acquisition.di.SignupModule$providesEmvcoDataService$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public final Locale invoke() {
                return cVB.b(activity);
            }
        });
        return new EmvcoDataService(str, b);
    }

    @Provides
    public final TtrEventListener providesTtrEventListener(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return (TtrEventListener) activity;
    }

    @Provides
    @ActivityScoped
    public final SignupMoneyballEntryPoint providesMoneyballEntrypoint(Provider<MoneyballDataComponent.Builder> provider, @SignupMoneyballData MoneyballDataSource moneyballDataSource, Activity activity) {
        C8632dsu.c((Object) provider, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) activity, "");
        Object obj = EntryPoints.get(provider.get().moneyballDataSource(moneyballDataSource).moneyballUpdater((NetworkRequestResponseListener) activity).build(), SignupMoneyballEntryPoint.class);
        C8632dsu.a(obj, "");
        return (SignupMoneyballEntryPoint) obj;
    }
}
