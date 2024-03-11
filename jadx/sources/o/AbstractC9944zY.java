package o;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.DisplayCutoutCompat;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

/* renamed from: o.zY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9944zY<UIE> implements InterfaceC9939zT<UIE> {
    private final View a;
    private final Subject<UIE> d;
    private final Observable<UIE> e;

    @Override // o.InterfaceC9939zT
    public void a() {
    }

    @Override // o.InterfaceC9939zT
    public void b() {
    }

    public void b(DisplayCutoutCompat displayCutoutCompat) {
        C8632dsu.c((Object) displayCutoutCompat, "");
    }

    @Override // o.InterfaceC9939zT
    public void c() {
    }

    @Override // o.InterfaceC9939zT
    public void d() {
    }

    public abstract View e();

    @Override // o.InterfaceC9939zT
    public Observable<UIE> v() {
        return this.e;
    }

    public AbstractC9944zY(View view) {
        C8632dsu.c((Object) view, "");
        this.a = view;
        Subject<UIE> subject = (Subject<UIE>) PublishSubject.create().toSerialized();
        C8632dsu.a(subject, "");
        this.d = subject;
        this.e = subject;
    }

    @Override // o.InterfaceC9939zT
    public void b(UIE uie) {
        C8632dsu.c((Object) uie, "");
        this.d.onNext(uie);
    }

    public void e(DisplayCutoutCompat displayCutoutCompat) {
        C8632dsu.c((Object) displayCutoutCompat, "");
        y();
        for (Rect rect : displayCutoutCompat.getBoundingRects()) {
            int[] iArr = new int[2];
            e().getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect2 = new Rect(i, i2, e().getWidth() + i, e().getHeight() + i2);
            C8632dsu.d(rect);
            if (a(rect2, rect)) {
                b(displayCutoutCompat);
                return;
            }
        }
    }

    public void y() {
        e().setTranslationX(0.0f);
        e().setTranslationY(0.0f);
    }

    private final boolean a(Rect rect, Rect rect2) {
        return Rect.intersects(rect, rect2);
    }
}
