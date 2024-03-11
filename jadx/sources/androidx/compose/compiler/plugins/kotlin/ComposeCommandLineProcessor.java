package androidx.compose.compiler.plugins.kotlin;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import org.jetbrains.kotlin.compiler.plugin.AbstractCliOption;
import org.jetbrains.kotlin.compiler.plugin.CliOption;
import org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException;
import org.jetbrains.kotlin.config.CompilerConfiguration;

/* loaded from: classes5.dex */
public final class ComposeCommandLineProcessor {
    private final String pluginId = PLUGIN_ID;
    private final List<CliOption> pluginOptions;
    public static final Companion Companion = new Companion(null);
    private static final String PLUGIN_ID = "androidx.compose.compiler.plugins.kotlin";
    private static final CliOption LIVE_LITERALS_ENABLED_OPTION = new CliOption("liveLiterals", "<true|false>", "Enable Live Literals code generation", false, false);
    private static final CliOption LIVE_LITERALS_V2_ENABLED_OPTION = new CliOption("liveLiteralsEnabled", "<true|false>", "Enable Live Literals code generation (with per-file enabled flags)", false, false);
    private static final CliOption GENERATE_FUNCTION_KEY_META_CLASSES_OPTION = new CliOption("generateFunctionKeyMetaClasses", "<true|false>", "Generate function key meta classes with annotations indicating the functions and their group keys. Generally used for tooling.", false, false);
    private static final CliOption SOURCE_INFORMATION_ENABLED_OPTION = new CliOption("sourceInformation", "<true|false>", "Include source information in generated code", false, false);
    private static final CliOption METRICS_DESTINATION_OPTION = new CliOption("metricsDestination", "<path>", "Save compose build metrics to this folder", false, false);
    private static final CliOption REPORTS_DESTINATION_OPTION = new CliOption("reportsDestination", "<path>", "Save compose build reports to this folder", false, false);
    private static final CliOption INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_OPTION = new CliOption("intrinsicRemember", "<true|false>", "Include source information in generated code", false, false);
    private static final CliOption SUPPRESS_KOTLIN_VERSION_CHECK_ENABLED_OPTION = new CliOption("suppressKotlinVersionCompatibilityCheck", "<true|false>", "Suppress Kotlin version compatibility check", false, false);
    private static final CliOption DECOYS_ENABLED_OPTION = new CliOption("generateDecoys", "<true|false>", "Generate decoy methods in IR transform", false, false);
    private static final CliOption STRONG_SKIPPING_OPTION = new CliOption("experimentalStrongSkipping", "<true|false>", "Enable experimental strong skipping mode", false, false);
    private static final CliOption STABLE_CONFIG_PATH_OPTION = new CliOption("stabilityConfigurationPath", "<path>", "Path to stability configuration file", false, true);
    private static final CliOption TRACE_MARKERS_OPTION = new CliOption("traceMarkersEnabled", "<true|false>", "Include composition trace markers in generate code", false, false);

    public String getPluginId() {
        return this.pluginId;
    }

    public List<CliOption> getPluginOptions() {
        return this.pluginOptions;
    }

    public ComposeCommandLineProcessor() {
        List<CliOption> j;
        j = C8569dql.j(LIVE_LITERALS_ENABLED_OPTION, LIVE_LITERALS_V2_ENABLED_OPTION, GENERATE_FUNCTION_KEY_META_CLASSES_OPTION, SOURCE_INFORMATION_ENABLED_OPTION, METRICS_DESTINATION_OPTION, REPORTS_DESTINATION_OPTION, INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_OPTION, SUPPRESS_KOTLIN_VERSION_CHECK_ENABLED_OPTION, DECOYS_ENABLED_OPTION, STRONG_SKIPPING_OPTION, STABLE_CONFIG_PATH_OPTION, TRACE_MARKERS_OPTION);
        this.pluginOptions = j;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public void processOption(AbstractCliOption abstractCliOption, String str, CompilerConfiguration compilerConfiguration) {
        if (C8632dsu.c(abstractCliOption, LIVE_LITERALS_ENABLED_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getLIVE_LITERALS_ENABLED_KEY(), Boolean.valueOf(C8632dsu.c((Object) str, (Object) "true")));
        } else if (C8632dsu.c(abstractCliOption, LIVE_LITERALS_V2_ENABLED_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getLIVE_LITERALS_V2_ENABLED_KEY(), Boolean.valueOf(C8632dsu.c((Object) str, (Object) "true")));
        } else if (C8632dsu.c(abstractCliOption, GENERATE_FUNCTION_KEY_META_CLASSES_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getGENERATE_FUNCTION_KEY_META_CLASSES_KEY(), Boolean.valueOf(C8632dsu.c((Object) str, (Object) "true")));
        } else if (C8632dsu.c(abstractCliOption, SOURCE_INFORMATION_ENABLED_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getSOURCE_INFORMATION_ENABLED_KEY(), Boolean.valueOf(C8632dsu.c((Object) str, (Object) "true")));
        } else if (C8632dsu.c(abstractCliOption, METRICS_DESTINATION_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getMETRICS_DESTINATION_KEY(), str);
        } else if (C8632dsu.c(abstractCliOption, REPORTS_DESTINATION_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getREPORTS_DESTINATION_KEY(), str);
        } else if (C8632dsu.c(abstractCliOption, INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getINTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY(), Boolean.valueOf(C8632dsu.c((Object) str, (Object) "true")));
        } else if (C8632dsu.c(abstractCliOption, SUPPRESS_KOTLIN_VERSION_CHECK_ENABLED_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getSUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK(), str);
        } else if (C8632dsu.c(abstractCliOption, DECOYS_ENABLED_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getDECOYS_ENABLED_KEY(), Boolean.valueOf(C8632dsu.c((Object) str, (Object) "true")));
        } else if (C8632dsu.c(abstractCliOption, STRONG_SKIPPING_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getSTRONG_SKIPPING_ENABLED_KEY(), Boolean.valueOf(C8632dsu.c((Object) str, (Object) "true")));
        } else if (C8632dsu.c(abstractCliOption, STABLE_CONFIG_PATH_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getSTABILITY_CONFIG_PATH_KEY(), str);
        } else if (C8632dsu.c(abstractCliOption, TRACE_MARKERS_OPTION)) {
            compilerConfiguration.put(ComposeConfiguration.INSTANCE.getTRACE_MARKERS_ENABLED_KEY(), Boolean.valueOf(C8632dsu.c((Object) str, (Object) "true")));
        } else {
            String optionName = abstractCliOption.getOptionName();
            throw new CliOptionProcessingException("Unknown option: " + optionName, (Throwable) null, 2, (DefaultConstructorMarker) null);
        }
    }
}
