package o;

import com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeApplicationStartupListener;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cjH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6751cjH implements MembersInjector<MultihouseholdNudgeApplicationStartupListener> {
    private final Provider<InterfaceC6748cjE> d;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(MultihouseholdNudgeApplicationStartupListener multihouseholdNudgeApplicationStartupListener) {
        d(multihouseholdNudgeApplicationStartupListener, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdNudgeApplicationStartupListener.multihouseholdNudgeApplicationApi")
    public static void d(MultihouseholdNudgeApplicationStartupListener multihouseholdNudgeApplicationStartupListener, InterfaceC6748cjE interfaceC6748cjE) {
        multihouseholdNudgeApplicationStartupListener.multihouseholdNudgeApplicationApi = interfaceC6748cjE;
    }
}
