package androidx.compose.compiler.plugins.kotlin;

import org.jetbrains.kotlin.config.CompilerConfigurationKey;

/* loaded from: classes5.dex */
public final class ComposeConfiguration {
    public static final ComposeConfiguration INSTANCE = new ComposeConfiguration();
    private static final CompilerConfigurationKey<Boolean> LIVE_LITERALS_ENABLED_KEY = new CompilerConfigurationKey<>("Enable Live Literals code generation");
    private static final CompilerConfigurationKey<Boolean> LIVE_LITERALS_V2_ENABLED_KEY = new CompilerConfigurationKey<>("Enable Live Literals code generation (with per-file enabled flags)");
    private static final CompilerConfigurationKey<Boolean> GENERATE_FUNCTION_KEY_META_CLASSES_KEY = new CompilerConfigurationKey<>("Generate function key meta classes");
    private static final CompilerConfigurationKey<Boolean> SOURCE_INFORMATION_ENABLED_KEY = new CompilerConfigurationKey<>("Include source information in generated code");
    private static final CompilerConfigurationKey<String> METRICS_DESTINATION_KEY = new CompilerConfigurationKey<>("Directory to save compose build metrics");
    private static final CompilerConfigurationKey<String> REPORTS_DESTINATION_KEY = new CompilerConfigurationKey<>("Directory to save compose build reports");
    private static final CompilerConfigurationKey<Boolean> INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY = new CompilerConfigurationKey<>("Enable optimization to treat remember as an intrinsic");
    private static final CompilerConfigurationKey<String> SUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK = new CompilerConfigurationKey<>("Version of Kotlin for which version compatibility check should be suppressed");
    private static final CompilerConfigurationKey<Boolean> DECOYS_ENABLED_KEY = new CompilerConfigurationKey<>("Generate decoy methods in IR transform");
    private static final CompilerConfigurationKey<Boolean> STRONG_SKIPPING_ENABLED_KEY = new CompilerConfigurationKey<>("Enable strong skipping mode");
    private static final CompilerConfigurationKey<String> STABILITY_CONFIG_PATH_KEY = new CompilerConfigurationKey<>("Path to stability configuration file");
    private static final CompilerConfigurationKey<Boolean> TRACE_MARKERS_ENABLED_KEY = new CompilerConfigurationKey<>("Include composition trace markers in generated code");

    public final CompilerConfigurationKey<Boolean> getDECOYS_ENABLED_KEY() {
        return DECOYS_ENABLED_KEY;
    }

    public final CompilerConfigurationKey<Boolean> getGENERATE_FUNCTION_KEY_META_CLASSES_KEY() {
        return GENERATE_FUNCTION_KEY_META_CLASSES_KEY;
    }

    public final CompilerConfigurationKey<Boolean> getINTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY() {
        return INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY;
    }

    public final CompilerConfigurationKey<Boolean> getLIVE_LITERALS_ENABLED_KEY() {
        return LIVE_LITERALS_ENABLED_KEY;
    }

    public final CompilerConfigurationKey<Boolean> getLIVE_LITERALS_V2_ENABLED_KEY() {
        return LIVE_LITERALS_V2_ENABLED_KEY;
    }

    public final CompilerConfigurationKey<String> getMETRICS_DESTINATION_KEY() {
        return METRICS_DESTINATION_KEY;
    }

    public final CompilerConfigurationKey<String> getREPORTS_DESTINATION_KEY() {
        return REPORTS_DESTINATION_KEY;
    }

    public final CompilerConfigurationKey<Boolean> getSOURCE_INFORMATION_ENABLED_KEY() {
        return SOURCE_INFORMATION_ENABLED_KEY;
    }

    public final CompilerConfigurationKey<String> getSTABILITY_CONFIG_PATH_KEY() {
        return STABILITY_CONFIG_PATH_KEY;
    }

    public final CompilerConfigurationKey<Boolean> getSTRONG_SKIPPING_ENABLED_KEY() {
        return STRONG_SKIPPING_ENABLED_KEY;
    }

    public final CompilerConfigurationKey<String> getSUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK() {
        return SUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK;
    }

    public final CompilerConfigurationKey<Boolean> getTRACE_MARKERS_ENABLED_KEY() {
        return TRACE_MARKERS_ENABLED_KEY;
    }

    private ComposeConfiguration() {
    }
}
