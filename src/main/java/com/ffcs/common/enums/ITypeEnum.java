package com.ffcs.common.enums;

/**
 * Created by Administrator on 2016/10/03.
 */
public  interface ITypeEnum<T, V>
{
    StatusEnum getEnumInstance(V paramV);
}
