package o;

import com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.csR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7236csR implements MembersInjector<ErrorDownloadSheetFragment> {
    private final Provider<InterfaceC7303ctf> c;
    private final Provider<InterfaceC1573aGh> e;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(ErrorDownloadSheetFragment errorDownloadSheetFragment) {
        C1095Om.d(errorDownloadSheetFragment, DoubleCheck.lazy(this.e));
        e(errorDownloadSheetFragment, DoubleCheck.lazy(this.c));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment.offlineApiImpl")
    public static void e(ErrorDownloadSheetFragment errorDownloadSheetFragment, Lazy<InterfaceC7303ctf> lazy) {
        errorDownloadSheetFragment.offlineApiImpl = lazy;
    }
}
