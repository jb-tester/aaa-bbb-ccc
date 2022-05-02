package com.example.aaabbbccc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 5/2/2022.</p>
 * <p>Project: aaa-bbb-ccc</p>
 * *
 */
@Component
public class Bar {


    @Autowired
    private Foo foo;
}
