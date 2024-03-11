package o;

import com.netflix.mediaclient.ui.cfouracquisition.impl.CfourStringMappingModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.acquisition.lib.CfourStringMapping"})
/* renamed from: o.byY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5426byY implements Factory<Map<String, Integer>> {
    private final CfourStringMappingModule a;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public Map<String, Integer> get() {
        return e(this.a);
    }

    public static Map<String, Integer> e(CfourStringMappingModule cfourStringMappingModule) {
        return (Map) Preconditions.checkNotNullFromProvides(cfourStringMappingModule.e());
    }
}
