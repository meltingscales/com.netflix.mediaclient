package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.analysis.FqNameMatcher;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.Set;
import o.C8627dsp;
import o.dqN;
import o.drM;

/* loaded from: classes5.dex */
public final class ComposeIrGenerationExtension {
    private final boolean decoysEnabled;
    private final boolean generateFunctionKeyMetaClasses;
    private final boolean intrinsicRememberEnabled;
    private final boolean liveLiteralsEnabled;
    private final boolean liveLiteralsV2Enabled;
    private ModuleMetrics metrics;
    private final String metricsDestination;
    private final drM<Object, ModuleMetrics> moduleMetricsFactory;
    private final String reportsDestination;
    private final boolean sourceInformationEnabled;
    private final Set<FqNameMatcher> stableTypeMatchers;
    private final boolean strongSkippingEnabled;
    private final boolean traceMarkersEnabled;
    private final boolean useK2;
    private final boolean validateIr;

    public ComposeIrGenerationExtension() {
        this(false, false, false, false, false, false, false, null, null, false, false, false, null, null, 16383, null);
    }

    public ComposeIrGenerationExtension(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, String str2, boolean z8, boolean z9, boolean z10, Set<FqNameMatcher> set, drM<? super Object, ? extends ModuleMetrics> drm) {
        this.liveLiteralsEnabled = z;
        this.liveLiteralsV2Enabled = z2;
        this.generateFunctionKeyMetaClasses = z3;
        this.sourceInformationEnabled = z4;
        this.traceMarkersEnabled = z5;
        this.intrinsicRememberEnabled = z6;
        this.decoysEnabled = z7;
        this.metricsDestination = str;
        this.reportsDestination = str2;
        this.validateIr = z8;
        this.useK2 = z9;
        this.strongSkippingEnabled = z10;
        this.stableTypeMatchers = set;
        this.moduleMetricsFactory = drm;
        this.metrics = EmptyModuleMetrics.INSTANCE;
    }

    public /* synthetic */ ComposeIrGenerationExtension(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, String str2, boolean z8, boolean z9, boolean z10, Set set, drM drm, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4, (i & 16) == 0 ? z5 : true, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? null : str, (i & JSONzip.end) != 0 ? null : str2, (i & 512) != 0 ? false : z8, (i & 1024) != 0 ? false : z9, (i & 2048) == 0 ? z10 : false, (i & 4096) != 0 ? dqN.e() : set, (i & 8192) == 0 ? drm : null);
    }
}
