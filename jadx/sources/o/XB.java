package o;

import android.content.Context;
import com.netflix.mediaclient.externalcrashreporter.bugsnag.BugsnagErrorHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes3.dex */
public final class XB implements Factory<BugsnagErrorHandler> {
    private final Provider<XE> b;
    private final Provider<Context> d;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public BugsnagErrorHandler get() {
        BugsnagErrorHandler d = d(this.d.get());
        XG.b(d, this.b.get());
        return d;
    }

    public static BugsnagErrorHandler d(Context context) {
        return new BugsnagErrorHandler(context);
    }
}
