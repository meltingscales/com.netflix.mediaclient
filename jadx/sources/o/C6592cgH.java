package o;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinMoneyballModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.ui.memberrejoin.impl.RejoinTrayMoneyballData"})
/* renamed from: o.cgH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6592cgH implements Factory<InterfaceC6590cgF> {
    private final MemberRejoinMoneyballModule a;
    private final Provider<MoneyballDataComponent.Builder> b;
    private final Provider<Activity> c;
    private final Provider<MoneyballDataSource> d;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public InterfaceC6590cgF get() {
        return a(this.a, this.b, this.d.get(), this.c.get());
    }

    public static InterfaceC6590cgF a(MemberRejoinMoneyballModule memberRejoinMoneyballModule, Provider<MoneyballDataComponent.Builder> provider, MoneyballDataSource moneyballDataSource, Activity activity) {
        return (InterfaceC6590cgF) Preconditions.checkNotNullFromProvides(memberRejoinMoneyballModule.d(provider, moneyballDataSource, activity));
    }
}
