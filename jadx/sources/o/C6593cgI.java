package o;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.ui.memberrejoin.impl.RejoinTrayMoneyballData"})
/* renamed from: o.cgI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6593cgI implements Factory<MemberRejoinImpl> {
    private final Provider<InterfaceC6590cgF> a;
    private final Provider<InterfaceC6636cgz> b;
    private final Provider<MoneyballDataSource> c;
    private final Provider<Activity> d;
    private final Provider<C8242dgg> e;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public MemberRejoinImpl get() {
        MemberRejoinImpl b = b(this.d.get(), this.c.get());
        C6594cgJ.e(b, this.b.get());
        C6594cgJ.c(b, this.a.get());
        C6594cgJ.d(b, this.e.get());
        return b;
    }

    public static MemberRejoinImpl b(Activity activity, MoneyballDataSource moneyballDataSource) {
        return new MemberRejoinImpl(activity, moneyballDataSource);
    }
}
