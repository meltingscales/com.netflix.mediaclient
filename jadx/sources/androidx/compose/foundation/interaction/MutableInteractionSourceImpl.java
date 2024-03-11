package androidx.compose.foundation.interaction;

import kotlinx.coroutines.channels.BufferOverflow;
import o.C8586drb;
import o.C8820dzt;
import o.InterfaceC8585dra;
import o.InterfaceC8810dzj;
import o.dpR;

/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    private final InterfaceC8810dzj<Interaction> interactions = C8820dzt.b(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public InterfaceC8810dzj<Interaction> getInteractions() {
        return this.interactions;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public Object emit(Interaction interaction, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object emit = getInteractions().emit(interaction, interfaceC8585dra);
        e = C8586drb.e();
        return emit == e ? emit : dpR.c;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(Interaction interaction) {
        return getInteractions().a(interaction);
    }
}
