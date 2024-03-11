package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionElement extends ModifierNodeElement<EnterExitTransitionModifierNode> {
    private EnterTransition enter;
    private ExitTransition exit;
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
    private final Transition<EnterExitState> transition;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnterExitTransitionElement) {
            EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
            return C8632dsu.c(this.transition, enterExitTransitionElement.transition) && C8632dsu.c(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && C8632dsu.c(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && C8632dsu.c(this.slideAnimation, enterExitTransitionElement.slideAnimation) && C8632dsu.c(this.enter, enterExitTransitionElement.enter) && C8632dsu.c(this.exit, enterExitTransitionElement.exit) && C8632dsu.c(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.transition.hashCode();
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        int hashCode2 = deferredAnimation == null ? 0 : deferredAnimation.hashCode();
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        int hashCode3 = deferredAnimation2 == null ? 0 : deferredAnimation2.hashCode();
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (deferredAnimation3 != null ? deferredAnimation3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    public EnterExitTransitionElement(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public EnterExitTransitionModifierNode create() {
        return new EnterExitTransitionModifierNode(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        enterExitTransitionModifierNode.setTransition(this.transition);
        enterExitTransitionModifierNode.setSizeAnimation(this.sizeAnimation);
        enterExitTransitionModifierNode.setOffsetAnimation(this.offsetAnimation);
        enterExitTransitionModifierNode.setSlideAnimation(this.slideAnimation);
        enterExitTransitionModifierNode.setEnter(this.enter);
        enterExitTransitionModifierNode.setExit(this.exit);
        enterExitTransitionModifierNode.setGraphicsLayerBlock(this.graphicsLayerBlock);
    }
}
