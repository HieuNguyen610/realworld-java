package com.mods.orderservice.beans;

public interface Operation {
    int apply(int lhs, int rhs);
    boolean handles(char op);
}
