package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ State<Boolean> $writeable$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2(TextFieldState textFieldState, State<Boolean> state, TextInputService textInputService, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, OffsetMapping offsetMapping, InterfaceC8585dra<? super CoreTextFieldKt$CoreTextField$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$state = textFieldState;
        this.$writeable$delegate = state;
        this.$textInputService = textInputService;
        this.$manager = textFieldSelectionManager;
        this.$imeOptions = imeOptions;
        this.$offsetMapping = offsetMapping;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CoreTextFieldKt$CoreTextField$2(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, this.$offsetMapping, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CoreTextFieldKt$CoreTextField$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                final State<Boolean> state = this.$writeable$delegate;
                dyS snapshotFlow = SnapshotStateKt.snapshotFlow(new drO<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // o.drO
                    public final Boolean invoke() {
                        boolean CoreTextField$lambda$8;
                        CoreTextField$lambda$8 = CoreTextFieldKt.CoreTextField$lambda$8(state);
                        return Boolean.valueOf(CoreTextField$lambda$8);
                    }
                });
                final TextFieldState textFieldState = this.$state;
                final TextInputService textInputService = this.$textInputService;
                final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                final ImeOptions imeOptions = this.$imeOptions;
                final OffsetMapping offsetMapping = this.$offsetMapping;
                dyQ dyq = new dyQ() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2.2
                    @Override // o.dyQ
                    public /* synthetic */ Object emit(Object obj2, InterfaceC8585dra interfaceC8585dra) {
                        return emit(((Boolean) obj2).booleanValue(), interfaceC8585dra);
                    }

                    public final Object emit(boolean z, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        if (!z || !TextFieldState.this.getHasFocus()) {
                            CoreTextFieldKt.endInputSession(TextFieldState.this);
                        } else {
                            CoreTextFieldKt.startInputSession(textInputService, TextFieldState.this, textFieldSelectionManager.getValue$foundation_release(), imeOptions, offsetMapping);
                        }
                        return dpR.c;
                    }
                };
                this.label = 1;
                if (snapshotFlow.collect(dyq, this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            CoreTextFieldKt.endInputSession(this.$state);
            return dpR.c;
        } catch (Throwable th) {
            CoreTextFieldKt.endInputSession(this.$state);
            throw th;
        }
    }
}
