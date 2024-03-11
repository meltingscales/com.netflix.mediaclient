package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class BackwardsCompatNodeKt {
    private static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 DetachedModifierLocalReadScope = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(ModifierLocal<T> modifierLocal) {
            return modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    };
    private static final drM<BackwardsCompatNode, dpR> onDrawCacheReadsChanged = new drM<BackwardsCompatNode, dpR>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(BackwardsCompatNode backwardsCompatNode) {
            invoke2(backwardsCompatNode);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.onDrawCacheReadsChanged$ui_release();
        }
    };
    private static final drM<BackwardsCompatNode, dpR> updateModifierLocalConsumer = new drM<BackwardsCompatNode, dpR>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(BackwardsCompatNode backwardsCompatNode) {
            invoke2(backwardsCompatNode);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.updateModifierLocalConsumer();
        }
    };

    public static final /* synthetic */ BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 access$getDetachedModifierLocalReadScope$p() {
        return DetachedModifierLocalReadScope;
    }

    public static final /* synthetic */ drM access$getOnDrawCacheReadsChanged$p() {
        return onDrawCacheReadsChanged;
    }

    public static final /* synthetic */ drM access$getUpdateModifierLocalConsumer$p() {
        return updateModifierLocalConsumer;
    }

    public static final /* synthetic */ boolean access$isChainUpdate(BackwardsCompatNode backwardsCompatNode) {
        return isChainUpdate(backwardsCompatNode);
    }

    public static final boolean isChainUpdate(BackwardsCompatNode backwardsCompatNode) {
        Modifier.Node tail$ui_release = DelegatableNodeKt.requireLayoutNode(backwardsCompatNode).getNodes$ui_release().getTail$ui_release();
        C8632dsu.d(tail$ui_release);
        return ((TailModifierNode) tail$ui_release).getAttachHasBeenRun();
    }
}
