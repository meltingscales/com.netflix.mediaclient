package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Object>, Object> {
    final /* synthetic */ Font $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, Font font, InterfaceC8585dra<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = font;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, interfaceC8585dra);
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(dwU dwu, InterfaceC8585dra<? super Object> interfaceC8585dra) {
        return invoke2(dwu, (InterfaceC8585dra<Object>) interfaceC8585dra);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(dwU dwu, InterfaceC8585dra<Object> interfaceC8585dra) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        PlatformFontLoader platformFontLoader;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            platformFontLoader = this.this$0.platformFontLoader;
            Font font = this.$this_loadWithTimeoutOrNull;
            this.label = 1;
            obj = platformFontLoader.awaitLoad(font, this);
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
