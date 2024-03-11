package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.lomo.CwView;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cdz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6477cdz implements MembersInjector<CwView> {
    private final Provider<PlaybackLauncher> b;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(CwView cwView) {
        a(cwView, DoubleCheck.lazy(this.b));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.lomo.CwView.playbackLauncher")
    public static void a(CwView cwView, Lazy<PlaybackLauncher> lazy) {
        cwView.playbackLauncher = lazy;
    }
}
