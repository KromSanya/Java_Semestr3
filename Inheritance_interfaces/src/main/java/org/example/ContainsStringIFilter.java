package org.example;

public class ContainsStringIFilter implements IFilter {

    private final String pattern;

    public ContainsStringIFilter(String pattern)
    {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.contains(pattern);
    }
}
