package o;

import android.widget.SeekBar;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: o.uh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C9666uh extends AbstractC9616tJ<AbstractC9662ud> {
    private final SeekBar c;

    public C9666uh(SeekBar seekBar) {
        C8632dsu.d(seekBar, "");
        this.c = seekBar;
    }

    @Override // o.AbstractC9616tJ
    public void a(Observer<? super AbstractC9662ud> observer) {
        C8632dsu.d(observer, "");
        if (C9617tL.c(observer)) {
            b bVar = new b(this.c, observer);
            this.c.setOnSeekBarChangeListener(bVar);
            observer.onSubscribe(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC9616tJ
    /* renamed from: b */
    public C9669uk a() {
        SeekBar seekBar = this.c;
        return new C9669uk(seekBar, seekBar.getProgress(), false);
    }

    /* renamed from: o.uh$b */
    /* loaded from: classes2.dex */
    static final class b extends MainThreadDisposable implements SeekBar.OnSeekBarChangeListener {
        private final Observer<? super AbstractC9662ud> b;
        private final SeekBar d;

        public b(SeekBar seekBar, Observer<? super AbstractC9662ud> observer) {
            C8632dsu.d(seekBar, "");
            C8632dsu.d(observer, "");
            this.d = seekBar;
            this.b = observer;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C8632dsu.d(seekBar, "");
            if (isDisposed()) {
                return;
            }
            this.b.onNext(new C9669uk(seekBar, i, z));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            C8632dsu.d(seekBar, "");
            if (isDisposed()) {
                return;
            }
            this.b.onNext(new C9670ul(seekBar));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            C8632dsu.d(seekBar, "");
            if (isDisposed()) {
                return;
            }
            this.b.onNext(new C9668uj(seekBar));
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.d.setOnSeekBarChangeListener(null);
        }
    }
}
