package dagger.hilt.android.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import o.C8632dsu;
import o.drM;

/* loaded from: classes6.dex */
public final class HiltViewModelExtensions {
    public static final <VMF> CreationExtras withCreationCallback(CreationExtras creationExtras, drM<? super VMF, ? extends ViewModel> drm) {
        C8632dsu.c((Object) creationExtras, "");
        C8632dsu.c((Object) drm, "");
        return addCreationCallback(new MutableCreationExtras(creationExtras), drm);
    }

    public static final <VMF> CreationExtras addCreationCallback(MutableCreationExtras mutableCreationExtras, final drM<? super VMF, ? extends ViewModel> drm) {
        C8632dsu.c((Object) mutableCreationExtras, "");
        C8632dsu.c((Object) drm, "");
        CreationExtras.Key<drM<Object, ViewModel>> key = HiltViewModelFactory.CREATION_CALLBACK_KEY;
        C8632dsu.a(key, "");
        mutableCreationExtras.set(key, new drM<Object, ViewModel>() { // from class: dagger.hilt.android.lifecycle.HiltViewModelExtensions$addCreationCallback$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drM
            public final ViewModel invoke(Object obj) {
                return drm.invoke(obj);
            }
        });
        return mutableCreationExtras;
    }
}
