package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

/* loaded from: classes3.dex */
public abstract class NE<STE> extends NetflixDialogFrag {
    public Subject<STE> c = (Subject<STE>) PublishSubject.create().toSerialized();
    public PublishSubject<dpR> e = PublishSubject.create();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = PublishSubject.create();
        this.c = (Subject<STE>) PublishSubject.create().toSerialized();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.c.onComplete();
        if (!this.e.hasComplete() && !this.e.hasThrowable()) {
            this.e.onNext(dpR.c);
        }
        this.e.onComplete();
    }
}
