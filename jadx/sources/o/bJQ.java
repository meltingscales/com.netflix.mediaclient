package o;

import android.view.ViewGroup;
import android.widget.Space;

/* loaded from: classes4.dex */
public abstract class bJQ extends AbstractC3336ax<e> {

    /* loaded from: classes4.dex */
    public static final class e extends bIG {
    }

    @Override // o.AbstractC3073as
    public int a() {
        return 0;
    }

    @Override // o.AbstractC3336ax
    public /* bridge */ /* synthetic */ void a(e eVar, AbstractC3073as abstractC3073as) {
        a2(eVar, (AbstractC3073as<?>) abstractC3073as);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public /* synthetic */ void c(Object obj, AbstractC3073as abstractC3073as) {
        a2((e) obj, (AbstractC3073as<?>) abstractC3073as);
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public Space d(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new Space(viewGroup.getContext());
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.r().setVisibility(8);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(e eVar, AbstractC3073as<?> abstractC3073as) {
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) abstractC3073as, "");
        eVar.r().setVisibility(8);
    }
}
