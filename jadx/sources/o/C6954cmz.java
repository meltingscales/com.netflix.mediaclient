package o;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: o.cmz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6954cmz {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) observableEmitter, "");
        new C6951cmw(str, observableEmitter);
    }

    public static final Observable<AbstractC6948cmt> c(final String str) {
        C8632dsu.c((Object) str, "");
        Observable<AbstractC6948cmt> create = Observable.create(new ObservableOnSubscribe() { // from class: o.cmy
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6954cmz.b(str, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }
}
