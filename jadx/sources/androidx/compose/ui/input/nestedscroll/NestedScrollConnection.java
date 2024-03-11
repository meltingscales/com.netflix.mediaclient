package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import o.InterfaceC8585dra;

/* loaded from: classes.dex */
public interface NestedScrollConnection {
    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo199onPostFlingRZ2iAVY(long j, long j2, InterfaceC8585dra<? super Velocity> interfaceC8585dra) {
        return m1668onPostFlingRZ2iAVY$suspendImpl(this, j, j2, interfaceC8585dra);
    }

    /* renamed from: onPreFling-QWom1Mo */
    default Object mo824onPreFlingQWom1Mo(long j, InterfaceC8585dra<? super Velocity> interfaceC8585dra) {
        return m1669onPreFlingQWom1Mo$suspendImpl(this, j, interfaceC8585dra);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo201onPreScrollOzD1aCk(long j, int i) {
        return Offset.Companion.m1149getZeroF1C5BW0();
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo200onPostScrollDzOQY0M(long j, long j2, int i) {
        return Offset.Companion.m1149getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl  reason: not valid java name */
    static /* synthetic */ Object m1669onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j, InterfaceC8585dra<? super Velocity> interfaceC8585dra) {
        return Velocity.m2580boximpl(Velocity.Companion.m2594getZero9UxMQ8M());
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl  reason: not valid java name */
    static /* synthetic */ Object m1668onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j, long j2, InterfaceC8585dra<? super Velocity> interfaceC8585dra) {
        return Velocity.m2580boximpl(Velocity.Companion.m2594getZero9UxMQ8M());
    }
}
