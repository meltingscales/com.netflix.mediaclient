package o;

import com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsFrag;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cqH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7120cqH implements MembersInjector<MultiTitleNotificationsFrag> {
    private final Provider<InterfaceC1573aGh> d;
    private final Provider<InterfaceC7303ctf> e;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(MultiTitleNotificationsFrag multiTitleNotificationsFrag) {
        C1092Oj.e(multiTitleNotificationsFrag, this.d);
        c(multiTitleNotificationsFrag, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsFrag.offlineApi")
    public static void c(MultiTitleNotificationsFrag multiTitleNotificationsFrag, InterfaceC7303ctf interfaceC7303ctf) {
        multiTitleNotificationsFrag.offlineApi = interfaceC7303ctf;
    }
}
