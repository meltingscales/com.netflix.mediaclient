package o;

import com.netflix.mediaclient.externalcrashreporter.bugsnag.BugsnagErrorHandler;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class XG implements MembersInjector<BugsnagErrorHandler> {
    private final Provider<XE> a;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(BugsnagErrorHandler bugsnagErrorHandler) {
        b(bugsnagErrorHandler, this.a.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.externalcrashreporter.bugsnag.BugsnagErrorHandler.encryptedUserIds")
    public static void b(BugsnagErrorHandler bugsnagErrorHandler, XE xe) {
        bugsnagErrorHandler.encryptedUserIds = xe;
    }
}
