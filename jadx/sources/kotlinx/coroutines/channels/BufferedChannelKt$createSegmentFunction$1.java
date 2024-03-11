package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C8794dyu;
import o.C8796dyw;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes5.dex */
public final /* synthetic */ class BufferedChannelKt$createSegmentFunction$1<E> extends FunctionReferenceImpl implements drX<Long, C8796dyw<E>, C8796dyw<E>> {
    public static final BufferedChannelKt$createSegmentFunction$1 a = new BufferedChannelKt$createSegmentFunction$1();

    BufferedChannelKt$createSegmentFunction$1() {
        super(2, C8794dyu.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    public final C8796dyw<E> e(long j, C8796dyw<E> c8796dyw) {
        C8796dyw<E> d;
        d = C8794dyu.d(j, c8796dyw);
        return d;
    }

    @Override // o.drX
    public /* synthetic */ Object invoke(Long l, Object obj) {
        return e(l.longValue(), (C8796dyw) obj);
    }
}
