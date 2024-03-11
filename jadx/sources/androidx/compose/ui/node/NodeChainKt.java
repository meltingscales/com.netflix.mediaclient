package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import o.C8632dsu;
import o.C8657dts;
import o.drM;

/* loaded from: classes.dex */
public final class NodeChainKt {
    private static final NodeChainKt$SentinelHead$1 SentinelHead;

    public static final /* synthetic */ MutableVector access$fillVector(Modifier modifier, MutableVector mutableVector) {
        return fillVector(modifier, mutableVector);
    }

    public static final /* synthetic */ NodeChainKt$SentinelHead$1 access$getSentinelHead$p() {
        return SentinelHead;
    }

    public static final /* synthetic */ void access$updateUnsafe(ModifierNodeElement modifierNodeElement, Modifier.Node node) {
        updateUnsafe(modifierNodeElement, node);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.NodeChainKt$SentinelHead$1] */
    static {
        ?? r0 = new Modifier.Node() { // from class: androidx.compose.ui.node.NodeChainKt$SentinelHead$1
            public String toString() {
                return "<Head>";
            }
        };
        r0.setAggregateChildKindSet$ui_release(-1);
        SentinelHead = r0;
    }

    public static final int actionForModifiers(Modifier.Element element, Modifier.Element element2) {
        if (C8632dsu.c(element, element2)) {
            return 2;
        }
        return (Actual_jvmKt.areObjectsOfSameType(element, element2) || ((element instanceof ForceUpdateElement) && Actual_jvmKt.areObjectsOfSameType(((ForceUpdateElement) element).getOriginal(), element2))) ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Modifier.Node> void updateUnsafe(ModifierNodeElement<T> modifierNodeElement, Modifier.Node node) {
        C8632dsu.d(node);
        modifierNodeElement.update(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MutableVector<Modifier.Element> fillVector(Modifier modifier, final MutableVector<Modifier.Element> mutableVector) {
        int b;
        b = C8657dts.b(mutableVector.getSize(), 16);
        MutableVector mutableVector2 = new MutableVector(new Modifier[b], 0);
        mutableVector2.add(modifier);
        drM<Modifier.Element, Boolean> drm = null;
        while (mutableVector2.isNotEmpty()) {
            Modifier modifier2 = (Modifier) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector2.add(combinedModifier.getInner$ui_release());
                mutableVector2.add(combinedModifier.getOuter$ui_release());
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector.add(modifier2);
            } else {
                if (drm == null) {
                    drm = new drM<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public final Boolean invoke(Modifier.Element element) {
                            mutableVector.add(element);
                            return Boolean.TRUE;
                        }
                    };
                }
                modifier2.all(drm);
            }
        }
        return mutableVector;
    }
}
