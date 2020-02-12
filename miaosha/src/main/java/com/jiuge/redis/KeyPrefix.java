package com.jiuge.redis;

public interface KeyPrefix {
    public int expireSeconds();
    public String getPrefix();
}
