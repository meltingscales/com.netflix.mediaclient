package o;

import android.content.Context;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.model.leafs.SearchSectionSummary;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.List;

/* renamed from: o.cTi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6086cTi {
    Observable<AbstractC6078cTd> a(InterfaceC5280bvl interfaceC5280bvl, List<? extends SearchSectionSummary> list);

    Observable<AbstractC6078cTd> b(String str, Context context, C6087cTj c6087cTj, boolean z);

    Observable<AbstractC6078cTd> b(String str, String str2, long j, TaskMode taskMode, Context context);

    Object c(InterfaceC8585dra<? super dpR> interfaceC8585dra);

    Observable<AbstractC6078cTd> d();

    Observable<AbstractC6078cTd> d(Context context, C6087cTj c6087cTj);

    Observable<AbstractC6078cTd> d(String str, Context context, C6087cTj c6087cTj);

    Completable e();

    /* renamed from: o.cTi$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static /* synthetic */ Observable d(InterfaceC6086cTi interfaceC6086cTi, String str, Context context, C6087cTj c6087cTj, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    z = false;
                }
                return interfaceC6086cTi.b(str, context, c6087cTj, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchSearchResults");
        }
    }
}
