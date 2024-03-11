package androidx.compose.compiler.plugins.kotlin.k1;

import o.C8627dsp;
import org.jetbrains.kotlin.com.intellij.openapi.Disposable;
import org.jetbrains.kotlin.com.intellij.openapi.extensions.Extensions;
import org.jetbrains.kotlin.com.intellij.openapi.project.Project;
import org.jetbrains.kotlin.resolve.diagnostics.DiagnosticSuppressor;

/* loaded from: classes5.dex */
public class ComposeDiagnosticSuppressor {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final void registerExtension(Project project, DiagnosticSuppressor diagnosticSuppressor) {
            Extensions.getRootArea().getExtensionPoint(DiagnosticSuppressor.Companion.getEP_NAME()).registerExtension(diagnosticSuppressor, (Disposable) project);
        }
    }
}
