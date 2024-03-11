package o;

import o.InterfaceC5223buh;

/* renamed from: o.bug  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5222bug<T extends InterfaceC5223buh> {
    /* renamed from: getCursor */
    String mo3080getCursor();

    /* renamed from: getEntity */
    T mo3081getEntity();

    InterfaceC5149btM getEvidence();

    int getPosition();

    T getVideo();

    /* renamed from: o.bug$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static <T extends InterfaceC5223buh> String b(InterfaceC5222bug<T> interfaceC5222bug) {
            return String.valueOf(interfaceC5222bug.getPosition());
        }

        public static <T extends InterfaceC5223buh> T d(InterfaceC5222bug<T> interfaceC5222bug) {
            return interfaceC5222bug.getVideo();
        }
    }
}
