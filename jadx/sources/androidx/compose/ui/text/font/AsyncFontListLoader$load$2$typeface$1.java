package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements drM<InterfaceC8585dra<? super Object>, Object> {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, InterfaceC8585dra<? super AsyncFontListLoader$load$2$typeface$1> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, interfaceC8585dra);
    }

    @Override // o.drM
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC8585dra<? super Object> interfaceC8585dra) {
        return invoke2((InterfaceC8585dra<Object>) interfaceC8585dra);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC8585dra<Object> interfaceC8585dra) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            AsyncFontListLoader asyncFontListLoader = this.this$0;
            Font font = this.$font;
            this.label = 1;
            obj = asyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(font, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
