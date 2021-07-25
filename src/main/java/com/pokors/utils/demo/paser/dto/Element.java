package com.pokors.utils.demo.paser.dto;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 元素
 *
 * @author liuhp
 * @since 2021/7/24 17:55
 */
public class Element implements Serializable {

    private static final long serialVersionUID = -415448707579743012L;

    /**
     * 元素名称
     */
    private String name;
    /**
     * 元素类型名称
     */
    private String type;

}