package androidx.lifecycle;

import o.C8632dsu;
import o.C8752dxf;
import o.dwU;
import o.dxZ;

/* loaded from: classes2.dex */
public final class ViewModelKt {
    public static final dwU getViewModelScope(ViewModel viewModel) {
        C8632dsu.c((Object) viewModel, "");
        dwU dwu = (dwU) viewModel.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (dwu != null) {
            return dwu;
        }
        Object tagIfAbsent = viewModel.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new CloseableCoroutineScope(dxZ.d(null, 1, null).plus(C8752dxf.d().c())));
        C8632dsu.a(tagIfAbsent, "");
        return (dwU) tagIfAbsent;
    }
}
