package androidx.compose.compiler.plugins.kotlin.inference;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.drO;

/* loaded from: classes5.dex */
public final class ApplierInferencer<Type, Node> {
    private final ErrorReporter<Node> errorReporter;
    private final LazySchemeStorage<Node> lazySchemeStorage;
    private final NodeAdapter<Type, Node> nodeAdapter;
    private final TypeAdapter<Type> typeAdapter;
    private final Set<Node> inProgress = new LinkedHashSet();
    private final List<drO<Boolean>> pending = new ArrayList();

    public ApplierInferencer(TypeAdapter<Type> typeAdapter, NodeAdapter<Type, Node> nodeAdapter, LazySchemeStorage<Node> lazySchemeStorage, ErrorReporter<Node> errorReporter) {
        this.typeAdapter = typeAdapter;
        this.nodeAdapter = nodeAdapter;
        this.lazySchemeStorage = lazySchemeStorage;
        this.errorReporter = errorReporter;
    }
}
