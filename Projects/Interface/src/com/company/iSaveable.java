package com.company;

import java.util.List;

public interface iSaveable {
    List<String> write();
    void read(List<String> list);
}
