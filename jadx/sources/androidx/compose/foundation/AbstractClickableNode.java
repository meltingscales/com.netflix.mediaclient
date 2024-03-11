package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.semantics.Role;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode {
    private boolean enabled;
    private final InteractionData interactionData;
    private MutableInteractionSource interactionSource;
    private drO<dpR> onClick;
    private String onClickLabel;
    private Role role;

    /* loaded from: classes.dex */
    public static final class InteractionData {
        private PressInteraction.Press pressInteraction;
        private final Map<Key, PressInteraction.Press> currentKeyPressInteractions = new LinkedHashMap();
        private long centreOffset = Offset.Companion.m1149getZeroF1C5BW0();

        /* renamed from: getCentreOffset-F1C5BW0  reason: not valid java name */
        public final long m96getCentreOffsetF1C5BW0() {
            return this.centreOffset;
        }

        public final Map<Key, PressInteraction.Press> getCurrentKeyPressInteractions() {
            return this.currentKeyPressInteractions;
        }

        public final PressInteraction.Press getPressInteraction() {
            return this.pressInteraction;
        }

        /* renamed from: setCentreOffset-k-4lQ0M  reason: not valid java name */
        public final void m97setCentreOffsetk4lQ0M(long j) {
            this.centreOffset = j;
        }

        public final void setPressInteraction(PressInteraction.Press press) {
            this.pressInteraction = press;
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, drO dro, C8627dsp c8627dsp) {
        this(mutableInteractionSource, z, str, role, dro);
    }

    public abstract AbstractClickablePointerInputNode getClickablePointerInputNode();

    /* JADX INFO: Access modifiers changed from: protected */
    public final InteractionData getInteractionData() {
        return this.interactionData;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean mo94onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, drO<dpR> dro) {
        this.interactionSource = mutableInteractionSource;
        this.enabled = z;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = dro;
        this.interactionData = new InteractionData();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: updateCommon-XHw0xAI  reason: not valid java name */
    public final void m95updateCommonXHw0xAI(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, drO<dpR> dro) {
        if (!C8632dsu.c(this.interactionSource, mutableInteractionSource)) {
            disposeInteractionSource();
            this.interactionSource = mutableInteractionSource;
        }
        if (this.enabled != z) {
            if (!z) {
                disposeInteractionSource();
            }
            this.enabled = z;
        }
        this.onClickLabel = str;
        this.role = role;
        this.onClick = dro;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInteractionSource();
    }

    protected final void disposeInteractionSource() {
        PressInteraction.Press pressInteraction = this.interactionData.getPressInteraction();
        if (pressInteraction != null) {
            this.interactionSource.tryEmit(new PressInteraction.Cancel(pressInteraction));
        }
        for (PressInteraction.Press press : this.interactionData.getCurrentKeyPressInteractions().values()) {
            this.interactionSource.tryEmit(new PressInteraction.Cancel(press));
        }
        this.interactionData.setPressInteraction(null);
        this.interactionData.getCurrentKeyPressInteractions().clear();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY  reason: not valid java name */
    public void mo93onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        getClickablePointerInputNode().mo93onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        getClickablePointerInputNode().onCancelPointerInput();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean mo92onKeyEventZmokQxo(KeyEvent keyEvent) {
        if (this.enabled && Clickable_androidKt.m138isPressZmokQxo(keyEvent)) {
            if (!this.interactionData.getCurrentKeyPressInteractions().containsKey(Key.m1625boximpl(KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent)))) {
                PressInteraction.Press press = new PressInteraction.Press(this.interactionData.m96getCentreOffsetF1C5BW0(), null);
                this.interactionData.getCurrentKeyPressInteractions().put(Key.m1625boximpl(KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent)), press);
                C8737dwr.c(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
                return true;
            }
            return false;
        }
        if (this.enabled && Clickable_androidKt.m136isClickZmokQxo(keyEvent)) {
            PressInteraction.Press remove = this.interactionData.getCurrentKeyPressInteractions().remove(Key.m1625boximpl(KeyEvent_androidKt.m1659getKeyZmokQxo(keyEvent)));
            if (remove != null) {
                C8737dwr.c(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2$1(this, remove, null), 3, null);
            }
            this.onClick.invoke();
            return true;
        }
        return false;
    }
}
