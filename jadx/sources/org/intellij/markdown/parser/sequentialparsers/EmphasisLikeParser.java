package org.intellij.markdown.parser.sequentialparsers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.parser.sequentialparsers.DelimiterParser;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;

/* loaded from: classes5.dex */
public final class EmphasisLikeParser implements SequentialParser {
    private final DelimiterParser[] parsers;

    public EmphasisLikeParser(DelimiterParser... delimiterParserArr) {
        C8632dsu.c((Object) delimiterParserArr, "");
        this.parsers = delimiterParserArr;
    }

    @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser
    public SequentialParser.ParsingResult parse(TokensCache tokensCache, List<C8654dtp> list) {
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) list, "");
        SequentialParser.ParsingResultBuilder parsingResultBuilder = new SequentialParser.ParsingResultBuilder();
        TokensCache.RangesListIterator rangesListIterator = new TokensCache.RangesListIterator(tokensCache, list);
        ArrayList<DelimiterParser.Info> collectDelimiters = collectDelimiters(tokensCache, rangesListIterator);
        balanceDelimiters(collectDelimiters);
        DelimiterParser[] delimiterParserArr = this.parsers;
        int length = delimiterParserArr.length;
        int i = 0;
        while (i < length) {
            DelimiterParser delimiterParser = delimiterParserArr[i];
            i++;
            delimiterParser.process(tokensCache, rangesListIterator, collectDelimiters, parsingResultBuilder);
        }
        return parsingResultBuilder;
    }

    private final ArrayList<DelimiterParser.Info> collectDelimiters(TokensCache tokensCache, TokensCache.Iterator iterator) {
        ArrayList<DelimiterParser.Info> arrayList = new ArrayList<>();
        loop0: while (iterator.getType() != null) {
            DelimiterParser[] delimiterParserArr = this.parsers;
            int length = delimiterParserArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                DelimiterParser delimiterParser = delimiterParserArr[i];
                i++;
                int scan = delimiterParser.scan(tokensCache, iterator, arrayList);
                i2 += scan;
                if (scan > 0) {
                    int i3 = 0;
                    do {
                        i3++;
                        if (iterator.getType() == null) {
                            break loop0;
                        }
                        iterator = iterator.advance();
                    } while (i3 < scan);
                }
            }
            if (i2 == 0) {
                iterator = iterator.advance();
            }
        }
        return arrayList;
    }

    private final void balanceDelimiters(ArrayList<DelimiterParser.Info> arrayList) {
        int i;
        int i2;
        int i3;
        int i4;
        int size = arrayList.size();
        Integer[] numArr = new Integer[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            numArr[i6] = 0;
        }
        HashMap hashMap = new HashMap();
        Iterator<DelimiterParser.Info> it = arrayList.iterator();
        int i7 = 0;
        int i8 = 0;
        int i9 = -2;
        while (it.hasNext()) {
            int i10 = i7 + 1;
            DelimiterParser.Info next = it.next();
            if (arrayList.get(i8).getMarker() != next.getMarker() || i9 != next.getPosition() - 1) {
                i8 = i7;
            }
            i9 = next.getPosition();
            if (next.getCanClose()) {
                if (!hashMap.containsKey(Character.valueOf(next.getMarker()))) {
                    char marker = next.getMarker();
                    Integer[] numArr2 = new Integer[6];
                    numArr2[i5] = -1;
                    numArr2[1] = -1;
                    numArr2[2] = -1;
                    numArr2[3] = -1;
                    numArr2[4] = -1;
                    numArr2[5] = -1;
                    hashMap.put(Character.valueOf(marker), numArr2);
                }
                Object obj = hashMap.get(Character.valueOf(next.getMarker()));
                C8632dsu.d(obj);
                int intValue = ((Integer[]) obj)[(next.getCanOpen() ? 3 : i5) + (next.getLength() % 3)].intValue();
                int intValue2 = (i8 - numArr[i8].intValue()) - 1;
                int i11 = intValue2;
                while (true) {
                    if (i11 <= intValue) {
                        i = i5;
                        i2 = -1;
                        break;
                    }
                    DelimiterParser.Info info = arrayList.get(i11);
                    C8632dsu.a(info, "");
                    DelimiterParser.Info info2 = info;
                    if (info2.getMarker() != next.getMarker()) {
                        i11 -= numArr[i11].intValue() + 1;
                        i3 = 0;
                    } else {
                        if (info2.getCanOpen() && info2.getCloserIndex() < 0) {
                            if (!violatesRuleOfThree(info2, next)) {
                                if (i11 > 0) {
                                    int i12 = i11 - 1;
                                    if (!arrayList.get(i12).getCanOpen()) {
                                        i4 = numArr[i12].intValue() + 1;
                                        numArr[i11] = Integer.valueOf(i4);
                                        numArr[i7] = Integer.valueOf((i7 - i11) + i4);
                                        i = 0;
                                        next.setCanOpen(false);
                                        info2.setCloserIndex(i7);
                                        info2.setCanClose(false);
                                        i2 = -1;
                                        i9 = -2;
                                        intValue2 = -1;
                                    }
                                }
                                i4 = 0;
                                numArr[i11] = Integer.valueOf(i4);
                                numArr[i7] = Integer.valueOf((i7 - i11) + i4);
                                i = 0;
                                next.setCanOpen(false);
                                info2.setCloserIndex(i7);
                                info2.setCanClose(false);
                                i2 = -1;
                                i9 = -2;
                                intValue2 = -1;
                            }
                        }
                        i3 = 0;
                        i11 -= numArr[i11].intValue() + 1;
                    }
                    i5 = i3;
                }
                if (intValue2 != i2) {
                    Object obj2 = hashMap.get(Character.valueOf(next.getMarker()));
                    C8632dsu.d(obj2);
                    ((Integer[]) obj2)[(next.getCanOpen() ? 3 : i) + (next.getLength() % 3)] = Integer.valueOf(intValue2);
                }
                i7 = i10;
                i5 = i;
            } else {
                i7 = i10;
            }
        }
    }

    private final boolean violatesRuleOfThree(DelimiterParser.Info info, DelimiterParser.Info info2) {
        return (info.getCanClose() || info2.getCanOpen()) && (info.getLength() + info2.getLength()) % 3 == 0 && !(info.getLength() % 3 == 0 && info2.getLength() % 3 == 0);
    }
}
