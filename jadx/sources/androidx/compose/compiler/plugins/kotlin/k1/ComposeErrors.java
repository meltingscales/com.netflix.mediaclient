package androidx.compose.compiler.plugins.kotlin.k1;

import java.util.Collection;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory0;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory1;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory2;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory3;
import org.jetbrains.kotlin.diagnostics.Errors;
import org.jetbrains.kotlin.diagnostics.PositioningStrategies;
import org.jetbrains.kotlin.diagnostics.Severity;
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression;
import org.jetbrains.kotlin.psi.KtExpression;
import org.jetbrains.kotlin.types.KotlinType;

/* loaded from: classes5.dex */
public final class ComposeErrors {
    public static final ComposeErrors INSTANCE = new ComposeErrors();
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_INVOCATION = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_EXPECTED = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory0<KtCallableReferenceExpression> COMPOSABLE_FUNCTION_REFERENCE = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_PROPERTY_BACKING_FIELD = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_VAR = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_SUSPEND_FUN = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory0<PsiElement> ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_FUN_MAIN = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory2<PsiElement, DeclarationDescriptor, DeclarationDescriptor> CAPTURED_COMPOSABLE_INVOCATION = DiagnosticFactory2.create(Severity.ERROR);
    public static final DiagnosticFactory1<PsiElement, String> CALLED_IN_INCORRECT_CONTEXT = DiagnosticFactory1.create(Severity.ERROR);
    public static final DiagnosticFactory3<PsiElement, ValueParameterDescriptor, ValueParameterDescriptor, CallableDescriptor> MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION = DiagnosticFactory3.create(Severity.ERROR);
    public static final DiagnosticFactory0<PsiElement> NONREADONLY_CALL_IN_READONLY_COMPOSABLE = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory1<PsiElement, Collection<DeclarationDescriptor>> CONFLICTING_OVERLOADS = DiagnosticFactory1.create(Severity.ERROR, PositioningStrategies.DECLARATION_SIGNATURE_OR_DEFAULT);
    public static final DiagnosticFactory0<PsiElement> ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory2<KtExpression, KotlinType, KotlinType> TYPE_MISMATCH = DiagnosticFactory2.create(Severity.ERROR);
    public static final DiagnosticFactory2<PsiElement, String, String> COMPOSE_APPLIER_CALL_MISMATCH = DiagnosticFactory2.create(Severity.WARNING);
    public static final DiagnosticFactory2<PsiElement, String, String> COMPOSE_APPLIER_PARAMETER_MISMATCH = DiagnosticFactory2.create(Severity.WARNING);
    public static final DiagnosticFactory0<PsiElement> COMPOSE_APPLIER_DECLARATION_MISMATCH = DiagnosticFactory0.create(Severity.WARNING);
    public static final DiagnosticFactory0<PsiElement> COMPOSE_INVALID_DELEGATE = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory0<PsiElement> NAMED_ARGUMENTS_NOT_ALLOWED = DiagnosticFactory0.create(Severity.WARNING);
    public static final DiagnosticFactory0<PsiElement> MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL = DiagnosticFactory0.create(Severity.ERROR);
    public static final DiagnosticFactory0<PsiElement> REDUNDANT_COMPOSABLE_ANNOTATION = DiagnosticFactory0.create(Severity.WARNING);

    private ComposeErrors() {
    }

    static {
        Errors.Initializer.initializeFactoryNamesAndDefaultErrorMessages(ComposeErrors.class, new ComposeErrorMessages());
    }
}
