package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import o.C8632dsu;
import o.C8654dtp;
import o.InterfaceC8743dwx;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<ContentInViewNode.Request> requests = new MutableVector<>(new ContentInViewNode.Request[16], 0);

    public final boolean enqueue(final ContentInViewNode.Request request) {
        Rect invoke = request.getCurrentBounds().invoke();
        if (invoke == null) {
            InterfaceC8743dwx<dpR> continuation = request.getContinuation();
            Result.c cVar = Result.e;
            continuation.resumeWith(Result.e(dpR.c));
            return false;
        }
        request.getContinuation().a(new drM<Throwable, dpR>() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$enqueue$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
                invoke2(th);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                MutableVector mutableVector;
                mutableVector = BringIntoViewRequestPriorityQueue.this.requests;
                mutableVector.remove(request);
            }
        });
        C8654dtp c8654dtp = new C8654dtp(0, this.requests.getSize() - 1);
        int d = c8654dtp.d();
        int e = c8654dtp.e();
        if (d <= e) {
            while (true) {
                Rect invoke2 = this.requests.getContent()[e].getCurrentBounds().invoke();
                if (invoke2 != null) {
                    Rect intersect = invoke.intersect(invoke2);
                    if (C8632dsu.c(intersect, invoke)) {
                        this.requests.add(e + 1, request);
                        return true;
                    } else if (!C8632dsu.c(intersect, invoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= e) {
                            while (true) {
                                this.requests.getContent()[e].getContinuation().c(cancellationException);
                                if (size == e) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (e == d) {
                    break;
                }
                e--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void resumeAndRemoveAll() {
        C8654dtp c8654dtp = new C8654dtp(0, this.requests.getSize() - 1);
        int d = c8654dtp.d();
        int e = c8654dtp.e();
        if (d <= e) {
            while (true) {
                InterfaceC8743dwx<dpR> continuation = this.requests.getContent()[d].getContinuation();
                dpR dpr = dpR.c;
                Result.c cVar = Result.e;
                continuation.resumeWith(Result.e(dpr));
                if (d == e) {
                    break;
                }
                d++;
            }
        }
        this.requests.clear();
    }

    public final void cancelAndRemoveAll(Throwable th) {
        MutableVector<ContentInViewNode.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        InterfaceC8743dwx[] interfaceC8743dwxArr = new InterfaceC8743dwx[size];
        for (int i = 0; i < size; i++) {
            interfaceC8743dwxArr[i] = mutableVector.getContent()[i].getContinuation();
        }
        for (int i2 = 0; i2 < size; i2++) {
            interfaceC8743dwxArr[i2].c(th);
        }
        if (!this.requests.isEmpty()) {
            throw new IllegalStateException("uncancelled requests present".toString());
        }
    }
}
