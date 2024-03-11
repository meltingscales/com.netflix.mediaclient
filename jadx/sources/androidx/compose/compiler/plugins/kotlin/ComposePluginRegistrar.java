package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.analysis.FqNameMatcher;
import androidx.compose.compiler.plugins.kotlin.analysis.StabilityConfigParser;
import androidx.compose.compiler.plugins.kotlin.k1.ComposableCallChecker;
import androidx.compose.compiler.plugins.kotlin.k1.ComposableDeclarationChecker;
import androidx.compose.compiler.plugins.kotlin.k1.ComposableTargetChecker;
import androidx.compose.compiler.plugins.kotlin.k1.ComposeDiagnosticSuppressor;
import androidx.compose.compiler.plugins.kotlin.k1.ComposeTypeResolutionInterceptorExtension;
import androidx.compose.compiler.plugins.kotlin.k2.ComposeFirExtensionRegistrar;
import androidx.compose.compiler.plugins.kotlin.lower.ClassStabilityFieldSerializationPlugin;
import java.util.Set;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.dqN;
import o.drM;
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension;
import org.jetbrains.kotlin.cli.common.CLIConfigurationKeys;
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity;
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSourceLocation;
import org.jetbrains.kotlin.cli.common.messages.MessageCollector;
import org.jetbrains.kotlin.com.intellij.mock.MockProject;
import org.jetbrains.kotlin.com.intellij.openapi.project.Project;
import org.jetbrains.kotlin.config.CommonConfigurationKeysKt;
import org.jetbrains.kotlin.config.CompilerConfiguration;
import org.jetbrains.kotlin.config.CompilerConfigurationKey;
import org.jetbrains.kotlin.config.JVMConfigurationKeys;
import org.jetbrains.kotlin.config.KotlinCompilerVersion;
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor;
import org.jetbrains.kotlin.extensions.internal.TypeResolutionInterceptor;
import org.jetbrains.kotlin.fir.extensions.FirExtensionRegistrarAdapter;
import org.jetbrains.kotlin.resolve.diagnostics.DiagnosticSuppressor;
import org.jetbrains.kotlin.serialization.DescriptorSerializerPlugin;

/* loaded from: classes5.dex */
public final class ComposePluginRegistrar {
    public static final Companion Companion = new Companion(null);

    public boolean getSupportsK2() {
        return true;
    }

    public void registerProjectComponents(MockProject mockProject, CompilerConfiguration compilerConfiguration) {
        Companion companion = Companion;
        if (companion.checkCompilerVersion(compilerConfiguration)) {
            Project project = (Project) mockProject;
            companion.registerCommonExtensions(project);
            IrGenerationExtension.Companion.registerExtension(project, Companion.createComposeIrExtension$default(companion, compilerConfiguration, null, 2, null));
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final boolean checkCompilerVersion(CompilerConfiguration compilerConfiguration) {
            try {
                String version = KotlinCompilerVersion.getVersion();
                if (version != null) {
                    MessageCollector messageCollector = (MessageCollector) compilerConfiguration.get(CLIConfigurationKeys.MESSAGE_COLLECTOR_KEY);
                    String str = (String) compilerConfiguration.get(ComposeConfiguration.INSTANCE.getSUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK());
                    if (str != null && !C8632dsu.c((Object) str, (Object) version)) {
                        if (C8632dsu.c((Object) str, (Object) "true")) {
                            if (messageCollector != null) {
                                CompilerMessageSeverity compilerMessageSeverity = CompilerMessageSeverity.STRONG_WARNING;
                                MessageCollector.report$default(messageCollector, compilerMessageSeverity, " `suppressKotlinVersionCompatibilityCheck` should specify the version of Kotlin for which you want the compatibility check to be disabled. For example, `suppressKotlinVersionCompatibilityCheck=" + version + "`", (CompilerMessageSourceLocation) null, 4, (Object) null);
                            }
                        } else if (messageCollector != null) {
                            CompilerMessageSeverity compilerMessageSeverity2 = CompilerMessageSeverity.STRONG_WARNING;
                            MessageCollector.report$default(messageCollector, compilerMessageSeverity2, " `suppressKotlinVersionCompatibilityCheck` is set to a version of Kotlin (" + str + ") that you are not using and should be set properly. (you are using Kotlin " + version + ")", (CompilerMessageSourceLocation) null, 4, (Object) null);
                        }
                    }
                    if (C8632dsu.c((Object) str, (Object) "1.9.22") && messageCollector != null) {
                        CompilerMessageSeverity compilerMessageSeverity3 = CompilerMessageSeverity.STRONG_WARNING;
                        MessageCollector.report$default(messageCollector, compilerMessageSeverity3, " `suppressKotlinVersionCompatibilityCheck` is set to the same version of Kotlin that the Compose Compiler was already expecting (Kotlin " + str + "), and thus has no effect and should be removed.", (CompilerMessageSourceLocation) null, 4, (Object) null);
                    }
                    if (C8632dsu.c((Object) str, (Object) "true") || C8632dsu.c((Object) version, (Object) "1.9.22") || C8632dsu.c((Object) version, (Object) str)) {
                        return true;
                    }
                    if (messageCollector != null) {
                        CompilerMessageSeverity compilerMessageSeverity4 = CompilerMessageSeverity.ERROR;
                        MessageCollector.report$default(messageCollector, compilerMessageSeverity4, "This version (1.5.8) of the Compose Compiler requires Kotlin version 1.9.22 but you appear to be using Kotlin version " + version + " which is not known to be compatible.  Please consult the Compose-Kotlin compatibility map located at https://developer.android.com/jetpack/androidx/releases/compose-kotlin to choose a compatible version pair (or `suppressKotlinVersionCompatibilityCheck` but don't say I didn't warn you!).", (CompilerMessageSourceLocation) null, 4, (Object) null);
                        return false;
                    }
                    return false;
                }
                return true;
            } catch (Throwable th) {
                throw new Error("Something went wrong while checking for version compatibility between the Compose Compiler and the Kotlin Compiler.  It is possible that the versions are incompatible.  Please verify your kotlin version  and consult the Compose-Kotlin compatibility map located at https://developer.android.com/jetpack/androidx/releases/compose-kotlin", th);
            }
        }

        public final void registerCommonExtensions(Project project) {
            StorageComponentContainerContributor.Companion.registerExtension(project, new ComposableCallChecker());
            StorageComponentContainerContributor.Companion.registerExtension(project, new ComposableDeclarationChecker());
            StorageComponentContainerContributor.Companion.registerExtension(project, new ComposableTargetChecker());
            ComposeDiagnosticSuppressor.Companion.registerExtension(project, (DiagnosticSuppressor) new ComposeDiagnosticSuppressor());
            TypeResolutionInterceptor.Companion.registerExtension(project, new ComposeTypeResolutionInterceptorExtension());
            DescriptorSerializerPlugin.Companion.registerExtension(project, new ClassStabilityFieldSerializationPlugin());
            FirExtensionRegistrarAdapter.Companion.registerExtension(project, new ComposeFirExtensionRegistrar());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComposeIrGenerationExtension createComposeIrExtension$default(Companion companion, CompilerConfiguration compilerConfiguration, drM drm, int i, Object obj) {
            if ((i & 2) != 0) {
                drm = null;
            }
            return companion.createComposeIrExtension(compilerConfiguration, drm);
        }

        public final ComposeIrGenerationExtension createComposeIrExtension(CompilerConfiguration compilerConfiguration, drM<? super Object, ? extends ModuleMetrics> drm) {
            boolean g;
            boolean g2;
            Set<FqNameMatcher> e;
            ComposeConfiguration composeConfiguration = ComposeConfiguration.INSTANCE;
            boolean z = compilerConfiguration.getBoolean(composeConfiguration.getLIVE_LITERALS_ENABLED_KEY());
            boolean z2 = compilerConfiguration.getBoolean(composeConfiguration.getLIVE_LITERALS_V2_ENABLED_KEY());
            boolean z3 = compilerConfiguration.getBoolean(composeConfiguration.getGENERATE_FUNCTION_KEY_META_CLASSES_KEY());
            boolean z4 = compilerConfiguration.getBoolean(composeConfiguration.getSOURCE_INFORMATION_ENABLED_KEY());
            CompilerConfigurationKey<Boolean> intrinsic_remember_optimization_enabled_key = composeConfiguration.getINTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY();
            Boolean bool = Boolean.TRUE;
            boolean booleanValue = ((Boolean) compilerConfiguration.get(intrinsic_remember_optimization_enabled_key, bool)).booleanValue();
            boolean z5 = compilerConfiguration.getBoolean(composeConfiguration.getDECOYS_ENABLED_KEY());
            CharSequence charSequence = (CharSequence) compilerConfiguration.get(composeConfiguration.getMETRICS_DESTINATION_KEY(), "");
            g = C8691duz.g(charSequence);
            if (g) {
                charSequence = null;
            }
            String str = (String) charSequence;
            CharSequence charSequence2 = (CharSequence) compilerConfiguration.get(composeConfiguration.getREPORTS_DESTINATION_KEY(), "");
            g2 = C8691duz.g(charSequence2);
            String str2 = g2 ? null : charSequence2;
            boolean z6 = compilerConfiguration.getBoolean(JVMConfigurationKeys.VALIDATE_IR);
            boolean usesK2 = CommonConfigurationKeysKt.getLanguageVersionSettings(compilerConfiguration).getLanguageVersion().getUsesK2();
            boolean booleanValue2 = ((Boolean) compilerConfiguration.get(composeConfiguration.getSTRONG_SKIPPING_ENABLED_KEY(), Boolean.FALSE)).booleanValue();
            String str3 = (String) compilerConfiguration.get(composeConfiguration.getSTABILITY_CONFIG_PATH_KEY(), "");
            boolean booleanValue3 = ((Boolean) compilerConfiguration.get(composeConfiguration.getTRACE_MARKERS_ENABLED_KEY(), bool)).booleanValue();
            MessageCollector messageCollector = (MessageCollector) compilerConfiguration.get(CLIConfigurationKeys.MESSAGE_COLLECTOR_KEY);
            try {
                e = StabilityConfigParser.Companion.fromFile(str3).getStableTypeMatchers();
            } catch (Exception e2) {
                if (messageCollector != null) {
                    CompilerMessageSeverity compilerMessageSeverity = CompilerMessageSeverity.ERROR;
                    String message = e2.getMessage();
                    if (message == null) {
                        message = "Error parsing stability configuration";
                    }
                    MessageCollector.report$default(messageCollector, compilerMessageSeverity, message, (CompilerMessageSourceLocation) null, 4, (Object) null);
                }
                e = dqN.e();
            }
            return new ComposeIrGenerationExtension(z, z2, z3, z4, booleanValue3, booleanValue, z5, str, str2, z6, usesK2, booleanValue2, e, drm);
        }
    }
}
