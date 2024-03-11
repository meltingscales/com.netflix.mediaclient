package o;

import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.InterfaceC8991hE;

/* renamed from: o.io  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9080io {
    <R> Object a(drM<? super AbstractC9055iP, ? extends R> drm, InterfaceC8585dra<? super R> interfaceC8585dra);

    <D extends InterfaceC8991hE.b> Object a(InterfaceC8991hE<D> interfaceC8991hE, D d, UUID uuid, C9028hp c9028hp, boolean z, InterfaceC8585dra<? super Set<String>> interfaceC8585dra);

    <D extends InterfaceC8991hE.b> Map<String, C9053iN> a(InterfaceC8991hE<D> interfaceC8991hE, D d, C9028hp c9028hp);

    InterfaceC8814dzn<Set<String>> a();

    <D extends InterfaceC8991hE.b> Object b(InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, C9044iE c9044iE, InterfaceC8585dra<? super D> interfaceC8585dra);

    Object c(Set<String> set, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    Object c(UUID uuid, boolean z, InterfaceC8585dra<? super Set<String>> interfaceC8585dra);

    <D extends InterfaceC8991hE.b> Object d(InterfaceC8991hE<D> interfaceC8991hE, D d, C9028hp c9028hp, C9044iE c9044iE, boolean z, InterfaceC8585dra<? super Set<String>> interfaceC8585dra);

    boolean e();
}
