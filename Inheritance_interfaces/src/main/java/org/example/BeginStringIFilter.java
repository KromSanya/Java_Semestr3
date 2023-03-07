package org.example;

public class BeginStringIFilter implements IFilter {
    private final String pattern;

    public BeginStringIFilter(String pattern)
    {
        this.pattern = pattern;
    }


    @Override
    public boolean apply(String str) {
        return str.startsWith(pattern);
    }
}
