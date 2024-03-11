package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: o.ui  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C9667ui extends AbstractC9616tJ<CharSequence> {
    private final TextView d;

    public C9667ui(TextView textView) {
        C8632dsu.d(textView, "");
        this.d = textView;
    }

    @Override // o.AbstractC9616tJ
    public void a(Observer<? super CharSequence> observer) {
        C8632dsu.d(observer, "");
        a aVar = new a(this.d, observer);
        observer.onSubscribe(aVar);
        this.d.addTextChangedListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC9616tJ
    /* renamed from: e */
    public CharSequence a() {
        return this.d.getText();
    }

    /* renamed from: o.ui$a */
    /* loaded from: classes2.dex */
    static final class a extends MainThreadDisposable implements TextWatcher {
        private final Observer<? super CharSequence> b;
        private final TextView c;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C8632dsu.d(editable, "");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C8632dsu.d(charSequence, "");
        }

        public a(TextView textView, Observer<? super CharSequence> observer) {
            C8632dsu.d(textView, "");
            C8632dsu.d(observer, "");
            this.c = textView;
            this.b = observer;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C8632dsu.d(charSequence, "");
            if (isDisposed()) {
                return;
            }
            this.b.onNext(charSequence);
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.c.removeTextChangedListener(this);
        }
    }
}
