package com.factory.abstractFactory;

import com.factory.Sender;

public interface Provider {
    public Sender produce();
}
