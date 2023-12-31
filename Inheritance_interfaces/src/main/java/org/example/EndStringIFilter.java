package org.example;

public class EndStringIFilter implements IFilter {

    private final String pattern;

    public EndStringIFilter(String pattern)
    {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.endsWith(pattern);
    }
}
