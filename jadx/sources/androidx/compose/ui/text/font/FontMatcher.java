package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class FontMatcher {
    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public final List<Font> m2213matchFontRetOiIg(List<? extends Font> list, FontWeight fontWeight, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Font font = list.get(i3);
            Font font2 = font;
            if (C8632dsu.c(font2.getWeight(), fontWeight) && FontStyle.m2217equalsimpl0(font2.mo2199getStyle_LCdwA(), i)) {
                arrayList.add(font);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Font font3 = list.get(i4);
            if (FontStyle.m2217equalsimpl0(font3.mo2199getStyle_LCdwA(), i)) {
                arrayList2.add(font3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        FontWeight.Companion companion = FontWeight.Companion;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.getW400()) >= 0) {
            if (fontWeight.compareTo(companion.getW500()) <= 0) {
                FontWeight w500 = companion.getW500();
                int size3 = list.size();
                FontWeight fontWeight3 = null;
                FontWeight fontWeight4 = null;
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        break;
                    }
                    FontWeight weight = list.get(i5).getWeight();
                    if (w500 == null || weight.compareTo(w500) <= 0) {
                        if (weight.compareTo(fontWeight) < 0) {
                            if (fontWeight3 == null || weight.compareTo(fontWeight3) > 0) {
                                fontWeight3 = weight;
                            }
                        } else if (weight.compareTo(fontWeight) <= 0) {
                            fontWeight3 = weight;
                            fontWeight4 = fontWeight3;
                            break;
                        } else if (fontWeight4 == null || weight.compareTo(fontWeight4) < 0) {
                            fontWeight4 = weight;
                        }
                    }
                    i5++;
                }
                if (fontWeight4 != null) {
                    fontWeight3 = fontWeight4;
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    Font font4 = list.get(i6);
                    if (C8632dsu.c(font4.getWeight(), fontWeight3)) {
                        arrayList3.add(font4);
                    }
                }
                if (arrayList3.isEmpty()) {
                    FontWeight w5002 = FontWeight.Companion.getW500();
                    int size5 = list.size();
                    FontWeight fontWeight5 = null;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            break;
                        }
                        FontWeight weight2 = list.get(i7).getWeight();
                        if (w5002 == null || weight2.compareTo(w5002) >= 0) {
                            if (weight2.compareTo(fontWeight) < 0) {
                                if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                                    fontWeight2 = weight2;
                                }
                            } else if (weight2.compareTo(fontWeight) <= 0) {
                                fontWeight2 = weight2;
                                fontWeight5 = fontWeight2;
                                break;
                            } else if (fontWeight5 == null || weight2.compareTo(fontWeight5) < 0) {
                                fontWeight5 = weight2;
                            }
                        }
                        i7++;
                    }
                    if (fontWeight5 != null) {
                        fontWeight2 = fontWeight5;
                    }
                    ArrayList arrayList4 = new ArrayList(list.size());
                    int size6 = list.size();
                    while (i2 < size6) {
                        Font font5 = list.get(i2);
                        if (C8632dsu.c(font5.getWeight(), fontWeight2)) {
                            arrayList4.add(font5);
                        }
                        i2++;
                    }
                    return arrayList4;
                }
                return arrayList3;
            }
            int size7 = list.size();
            FontWeight fontWeight6 = null;
            int i8 = 0;
            while (true) {
                if (i8 >= size7) {
                    break;
                }
                FontWeight weight3 = list.get(i8).getWeight();
                if (weight3.compareTo(fontWeight) < 0) {
                    if (fontWeight6 == null || weight3.compareTo(fontWeight6) > 0) {
                        fontWeight6 = weight3;
                    }
                } else if (weight3.compareTo(fontWeight) <= 0) {
                    fontWeight6 = weight3;
                    fontWeight2 = fontWeight6;
                    break;
                } else if (fontWeight2 == null || weight3.compareTo(fontWeight2) < 0) {
                    fontWeight2 = weight3;
                }
                i8++;
            }
            if (fontWeight2 != null) {
                fontWeight6 = fontWeight2;
            }
            ArrayList arrayList5 = new ArrayList(list.size());
            int size8 = list.size();
            while (i2 < size8) {
                Font font6 = list.get(i2);
                if (C8632dsu.c(font6.getWeight(), fontWeight6)) {
                    arrayList5.add(font6);
                }
                i2++;
            }
            return arrayList5;
        }
        int size9 = list.size();
        FontWeight fontWeight7 = null;
        int i9 = 0;
        while (true) {
            if (i9 >= size9) {
                break;
            }
            FontWeight weight4 = list.get(i9).getWeight();
            if (weight4.compareTo(fontWeight) < 0) {
                if (fontWeight7 == null || weight4.compareTo(fontWeight7) > 0) {
                    fontWeight7 = weight4;
                }
            } else if (weight4.compareTo(fontWeight) <= 0) {
                fontWeight7 = weight4;
                fontWeight2 = fontWeight7;
                break;
            } else if (fontWeight2 == null || weight4.compareTo(fontWeight2) < 0) {
                fontWeight2 = weight4;
            }
            i9++;
        }
        if (fontWeight7 == null) {
            fontWeight7 = fontWeight2;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size10 = list.size();
        while (i2 < size10) {
            Font font7 = list.get(i2);
            if (C8632dsu.c(font7.getWeight(), fontWeight7)) {
                arrayList6.add(font7);
            }
            i2++;
        }
        return arrayList6;
    }
}
