package androidx.compose.compiler.plugins.kotlin.k1;

import androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer;
import androidx.compose.compiler.plugins.kotlin.inference.ErrorReporter;
import androidx.compose.compiler.plugins.kotlin.inference.LazySchemeStorage;
import androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter;
import androidx.compose.compiler.plugins.kotlin.inference.TypeAdapter;
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor;
import org.jetbrains.kotlin.resolve.calls.checkers.CallChecker;

/* loaded from: classes5.dex */
public final class ComposableTargetChecker implements CallChecker, StorageComponentContainerContributor {
    private final ApplierInferencer<Object, Object> infer = new ApplierInferencer<>(new TypeAdapter<Object>() { // from class: androidx.compose.compiler.plugins.kotlin.k1.ComposableTargetChecker$infer$1
    }, new NodeAdapter<Object, Object>() { // from class: androidx.compose.compiler.plugins.kotlin.k1.ComposableTargetChecker$infer$2
    }, new LazySchemeStorage<Object>() { // from class: androidx.compose.compiler.plugins.kotlin.k1.ComposableTargetChecker$infer$4
    }, new ErrorReporter<Object>() { // from class: androidx.compose.compiler.plugins.kotlin.k1.ComposableTargetChecker$infer$3
    });
}
