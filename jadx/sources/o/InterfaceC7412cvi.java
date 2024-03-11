package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import io.reactivex.Single;
import java.util.List;
import o.C6004cQk;

/* renamed from: o.cvi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7412cvi {
    Single<C6004cQk.b<InterfaceC5227bul>> b(String str, String str2, boolean z, TaskMode taskMode, String str3);

    Single<List<String>> b(InterfaceC5283bvo interfaceC5283bvo, int i);

    Single<C6004cQk.b<InterfaceC5238buw>> c(String str, String str2, boolean z, TaskMode taskMode, String str3);

    Single<List<InterfaceC5184btv>> d(InterfaceC5283bvo interfaceC5283bvo, int i);

    Single<C6004cQk.c<InterfaceC5194buE, InterfaceC5195buF>> e(String str, String str2, boolean z, TaskMode taskMode, String str3);
}
