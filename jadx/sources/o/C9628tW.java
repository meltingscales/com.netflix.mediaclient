package o;

import android.widget.CompoundButton;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: o.tW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C9628tW extends AbstractC9616tJ<Boolean> {
    private final CompoundButton e;

    public C9628tW(CompoundButton compoundButton) {
        C8632dsu.d(compoundButton, "");
        this.e = compoundButton;
    }

    @Override // o.AbstractC9616tJ
    public void a(Observer<? super Boolean> observer) {
        C8632dsu.d(observer, "");
        if (C9617tL.c(observer)) {
            a aVar = new a(this.e, observer);
            observer.onSubscribe(aVar);
            this.e.setOnCheckedChangeListener(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC9616tJ
    /* renamed from: e */
    public Boolean a() {
        return Boolean.valueOf(this.e.isChecked());
    }

    /* renamed from: o.tW$a */
    /* loaded from: classes2.dex */
    static final class a extends MainThreadDisposable implements CompoundButton.OnCheckedChangeListener {
        private final CompoundButton d;
        private final Observer<? super Boolean> e;

        public a(CompoundButton compoundButton, Observer<? super Boolean> observer) {
            C8632dsu.d(compoundButton, "");
            C8632dsu.d(observer, "");
            this.d = compoundButton;
            this.e = observer;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C8632dsu.d(compoundButton, "");
            if (isDisposed()) {
                return;
            }
            this.e.onNext(Boolean.valueOf(z));
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.d.setOnCheckedChangeListener(null);
        }
    }
}
