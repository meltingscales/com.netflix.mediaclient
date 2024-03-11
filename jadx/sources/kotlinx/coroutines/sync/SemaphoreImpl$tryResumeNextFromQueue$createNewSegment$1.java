package kotlinx.coroutines.sync;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.dBR;
import o.dBS;
import o.drX;

/* loaded from: classes5.dex */
public final /* synthetic */ class SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 extends FunctionReferenceImpl implements drX<Long, dBS, dBS> {
    public static final SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 d = new SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1();

    SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, dBR.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    public final dBS b(long j, dBS dbs) {
        dBS b;
        b = dBR.b(j, dbs);
        return b;
    }

    @Override // o.drX
    public /* synthetic */ dBS invoke(Long l, dBS dbs) {
        return b(l.longValue(), dbs);
    }
}
