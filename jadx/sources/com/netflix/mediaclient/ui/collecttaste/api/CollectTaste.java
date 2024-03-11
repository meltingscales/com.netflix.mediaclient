package com.netflix.mediaclient.ui.collecttaste.api;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o.C8600drp;
import o.InterfaceC2023aX;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC8585dra;
import o.InterfaceC8598drn;
import o.InterfaceC8812dzl;
import o.bAB;
import o.dpR;

/* loaded from: classes4.dex */
public interface CollectTaste {
    String a(InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug);

    InterfaceC8812dzl<bAB> a();

    void b(InterfaceC2023aX interfaceC2023aX, View.OnClickListener onClickListener, MessageType messageType);

    void b(InterfaceC2023aX interfaceC2023aX, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug);

    void c(InterfaceC2023aX interfaceC2023aX, String str, String str2, String str3, View.OnClickListener onClickListener);

    String d(InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug);

    void d(InterfaceC2023aX interfaceC2023aX, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug);

    RecyclerView.ItemDecoration e(int i);

    Object e(int i, String str, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    void e(CollectTasteData collectTasteData);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class MessageType {
        private static final /* synthetic */ InterfaceC8598drn g;
        private static final /* synthetic */ MessageType[] j;
        public static final MessageType a = new MessageType("SKIP_ALL", 0);
        public static final MessageType d = new MessageType("RATE_DOWN_ALL", 1);
        public static final MessageType b = new MessageType("NO_PAYOFF", 2);
        public static final MessageType c = new MessageType("DISMISSED", 3);
        public static final MessageType e = new MessageType("NONE", 4);

        private static final /* synthetic */ MessageType[] a() {
            return new MessageType[]{a, d, b, c, e};
        }

        public static MessageType valueOf(String str) {
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public static MessageType[] values() {
            return (MessageType[]) j.clone();
        }

        static {
            MessageType[] a2 = a();
            j = a2;
            g = C8600drp.e(a2);
        }

        private MessageType(String str, int i) {
        }
    }
}
