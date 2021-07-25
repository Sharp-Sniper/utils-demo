package com.pokors.utils.demo.paser.dto;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 属性
 *
 * @author liuhp
 * @since 2021/7/24 18:04
 */
public class Attribute implements Serializable {

    private static final long serialVersionUID = 1724003642504649829L;

    /**
     * 属性名称
     */
    private String name;
    /**
     * 属性类型名称
     */
    private String type;

    /**
     * 默认值
     */
    private String defaultValue;
    /**
     * 固定值
     */
    private String fixed;
    /**
     * 可选/必须
     */
    private boolean use;
}