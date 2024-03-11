package o;

import com.netflix.mediaclient.servicemgr.AddToMyListStateListener;
import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Cancellable;
import kotlin.NoWhenBranchMatchedException;
import o.AbstractC6948cmt;

/* renamed from: o.cmw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6951cmw implements AddToMyListStateListener, Cancellable {
    private final ObservableEmitter<AbstractC6948cmt> a;
    private final String d;

    /* renamed from: o.cmw$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[AddToMyListStateListener.AddToMyListState.values().length];
            try {
                iArr[AddToMyListStateListener.AddToMyListState.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddToMyListStateListener.AddToMyListState.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddToMyListStateListener.AddToMyListState.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            c = iArr;
        }
    }

    public C6951cmw(String str, ObservableEmitter<AbstractC6948cmt> observableEmitter) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) observableEmitter, "");
        this.d = str;
        this.a = observableEmitter;
        C5114bse.b(str, this);
        observableEmitter.setCancellable(this);
    }

    @Override // io.reactivex.functions.Cancellable
    public void cancel() {
        C5114bse.e(this.d, this);
    }

    @Override // com.netflix.mediaclient.servicemgr.AddToMyListStateListener
    public void b(AddToMyListStateListener.AddToMyListState addToMyListState) {
        C8632dsu.c((Object) addToMyListState, "");
        this.a.onNext(c(addToMyListState));
    }

    private final AbstractC6948cmt c(AddToMyListStateListener.AddToMyListState addToMyListState) {
        int i = d.c[addToMyListState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return AbstractC6948cmt.c.b;
                }
                throw new NoWhenBranchMatchedException();
            }
            return AbstractC6948cmt.d.d;
        }
        return AbstractC6948cmt.e.b;
    }
}
