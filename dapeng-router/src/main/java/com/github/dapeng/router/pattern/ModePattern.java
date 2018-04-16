package com.github.dapeng.router.pattern;

import java.util.Optional;

/**
 * 描述:
 *
 * @author hz.lei
 * @date 2018年04月13日 下午9:41
 */
public class ModePattern implements Pattern {

    public final long base;
    public final Optional<Long> from;
    public final long to;

    public ModePattern(long base, Optional<Long> from, long to) {
        this.base = base;
        this.from = from;
        this.to = to;
    }

}
