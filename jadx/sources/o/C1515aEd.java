package o;

import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import java.util.List;

/* renamed from: o.aEd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1515aEd implements InterfaceC5187bty {
    private final List<PlaybackBadge> b;

    @Override // o.InterfaceC5187bty
    public boolean ai() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1515aEd(List<? extends PlaybackBadge> list) {
        C8632dsu.c((Object) list, "");
        this.b = list;
    }

    @Override // o.InterfaceC5187bty
    public boolean ar() {
        return this.b.contains(PlaybackBadge.n);
    }

    @Override // o.InterfaceC5187bty
    public boolean aw() {
        return this.b.contains(PlaybackBadge.f13180o);
    }

    @Override // o.InterfaceC5187bty
    public boolean al() {
        return this.b.contains(PlaybackBadge.a);
    }

    @Override // o.InterfaceC5187bty
    public boolean av() {
        return this.b.contains(PlaybackBadge.k);
    }

    @Override // o.InterfaceC5187bty
    public boolean an() {
        return this.b.contains(PlaybackBadge.h);
    }

    @Override // o.InterfaceC5187bty
    public boolean aj() {
        return this.b.contains(PlaybackBadge.e);
    }

    @Override // o.InterfaceC5187bty
    public boolean ak() {
        return this.b.contains(PlaybackBadge.f);
    }
}
