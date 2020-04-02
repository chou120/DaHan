package com.banyuan.lambda2;

import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 3:27 下午
 */
@FunctionalInterface
public interface MyInterface<T> {

      List<T> getValue();

}
