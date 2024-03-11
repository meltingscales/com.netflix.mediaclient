package o;

import com.netflix.mediaclient.ui.profiles.MyNetflixMenuSheetFragment;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cMm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5899cMm implements MembersInjector<MyNetflixMenuSheetFragment> {
    private final Provider<C5898cMl> a;
    private final Provider<InterfaceC1573aGh> c;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(MyNetflixMenuSheetFragment myNetflixMenuSheetFragment) {
        C1095Om.d(myNetflixMenuSheetFragment, DoubleCheck.lazy(this.c));
        a(myNetflixMenuSheetFragment, DoubleCheck.lazy(this.a));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.profiles.MyNetflixMenuSheetFragment.myNetflixMenuHelper")
    public static void a(MyNetflixMenuSheetFragment myNetflixMenuSheetFragment, Lazy<C5898cMl> lazy) {
        myNetflixMenuSheetFragment.myNetflixMenuHelper = lazy;
    }
}
