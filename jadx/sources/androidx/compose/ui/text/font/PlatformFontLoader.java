package androidx.compose.ui.text.font;

import o.InterfaceC8585dra;

/* loaded from: classes.dex */
public interface PlatformFontLoader {
    Object awaitLoad(Font font, InterfaceC8585dra<Object> interfaceC8585dra);

    Object getCacheKey();

    Object loadBlocking(Font font);
}
